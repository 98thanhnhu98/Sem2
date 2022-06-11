package codeToTay01.part5;
import java.util.Scanner;
public class bai49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n;
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
