package JPL0Lab5.par1.bai5;

public class LuxuryCar extends Car {
    public void service(){
        System.out.println("LuxuryCar is in service!");
    }

    public static void main(String[] args) {
        Car c = new LuxuryCar();
        ((LuxuryCar)c).service();
    }
}
