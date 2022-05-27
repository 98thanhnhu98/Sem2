package codeToTay01.part6;
import java.util.Scanner;
public class bai53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        sum = 1;
        a = sc.nextInt();
        b = sc.nextInt();
        for(;b>0;b--){
            sum *= a;
        }
        System.out.print(sum);
    }
}
