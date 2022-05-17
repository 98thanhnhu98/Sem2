package JPL0Lab2.phan3DoItYourSelf.part2;

import java.util.Scanner;

public class Tempurature {
    private double cTemp;

    public Tempurature(){
        this.cTemp = 25d;
    }

    public Tempurature(double cTemp){
        this.cTemp = cTemp;
    }
    public void getcTemp(double cTemp){
        this.cTemp = cTemp;
    }
    public double getcTemp(){
        return this.cTemp;
    }
    public double getFTemp(){
        double F;
        F = (this.cTemp - 32) * (5/9d);
        return F;
    }
    public double getKTemp(){
        double K;
        K = this.cTemp + 275.15;
        return K;
    }

    public static void main(String[] args) {
        Tempurature temp1 = new Tempurature();
        Tempurature temp2 = new Tempurature(30d);
        double i = 25d;
        temp1.getcTemp(i);
        System.out.println("Nhiet do C = " + temp1.getcTemp());
        System.out.println("Nhiet do K = " + temp1.getFTemp());
        System.out.println("Nhiet do F = " + temp1.getKTemp());
    }
}
