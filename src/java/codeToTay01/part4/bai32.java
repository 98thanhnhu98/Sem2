package codeToTay01.part4;
import java.util.Scanner;
public class bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( n % 2 == 0){
            System.out.print("n is an even number");
        }else {
            System.out.print("n is an odd number");
        }
    }
}
