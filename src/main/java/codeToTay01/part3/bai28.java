package codeToTay01.part3;

import java.util.Scanner;

public class bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping, a = " + a + ", b = " + b);
    }
}
