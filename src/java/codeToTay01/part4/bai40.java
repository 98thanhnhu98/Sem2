package codeToTay01.part4;
import java.util.Scanner;
public class bai40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if ( a <= b && b <= c){
            System.out.print("increasing");
        }else if (a >= b && b >= c){
            System.out.print("decreasing");
        }else {
            System.out.print("neither increasing nor decreasing order");
        }
    }
}
