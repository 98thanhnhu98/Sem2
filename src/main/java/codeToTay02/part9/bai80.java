package codeToTay02.part9;
import java.util.Scanner;
public class bai80 {
    public static double circumference (double a){
        double sum = 2 * a * 3.14d;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.print(circumference(r));
    }
}
