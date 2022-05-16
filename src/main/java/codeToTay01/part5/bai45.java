package codeToTay01.part5;
import java.util.Scanner;
public class bai45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = 0;
        for(i = a ;i <= b;i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
