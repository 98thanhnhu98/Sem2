package codeToTay01.part5;
import java.util.Scanner;
public class bai46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a;
        a = sc.nextInt();
        int sum = 0;
        for(i = 1;i<=a;i=i+2){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
