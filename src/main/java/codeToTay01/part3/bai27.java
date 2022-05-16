package codeToTay01.part3;

import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int year = sc.nextInt();
        System.out.println("In 15 years, age of " + name +" will be " + (15+ year) );
    }
}
