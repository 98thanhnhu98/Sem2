package codeToTay01.part4;
import java.util.Scanner;
public class bai39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 0 || a > 10) {
            System.out.println("The score is not valid");
        } else {
            System.out.println("The score is valid");
        }
    }
}
