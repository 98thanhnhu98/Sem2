package codeToTay01.part4;
import java.util.Scanner;
public class bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if ( a >= b ){
            System.out.print("a is greater than or equal to b");
        }else {
            System.out.print("a is smaller than b");
        }
    }
}
