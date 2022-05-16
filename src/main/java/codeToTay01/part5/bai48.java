package codeToTay01.part5;
import java.util.Scanner;
public class bai48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a;
        a = sc.nextInt();
        int sum = 1;
        for(i = 1;i<= a;i++){
            sum = sum * i;
        }
        System.out.print(sum);
    }
}
