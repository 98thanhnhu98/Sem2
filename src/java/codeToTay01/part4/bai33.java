package codeToTay01.part4;
import java.util.Scanner;

public class bai33 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if ( n > 0 ){
        System.out.print("n is a positive number");
    }
    if ( n < 0 ){
        System.out.print("n is a negative number");
    }
    if ( n == 0){
        System.out.print("n is equal to 0");
    }
}
}
