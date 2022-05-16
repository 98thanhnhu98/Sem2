package codeToTay01.part6;
import java.util.Scanner;
public class bai53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a,b,c,sum;
        i = 1;
        sum = 1;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a;
        while(i < b){
            a *= c;
            sum = a;
            i++;
        }
        System.out.print(sum);
    }
}
