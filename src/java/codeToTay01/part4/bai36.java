package codeToTay01.part4;
import java.util.Scanner;
public class bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( a != 0 && b != 0){
            System.out.print("a is not equal to 0 and b is not equal to 0");
        }
        if (a == 0 || b == 0) {
            System.out.print("a is equal to 0 or b is equal to 0");
        }
    }
}
