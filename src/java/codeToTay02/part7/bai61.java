package codeToTay02.part7;
import java.util.Scanner;
public class bai61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i< n;i++){
            a[i] = sc.nextInt();
        }
        int sum = a[0] + a[n-1];
        System.out.print(sum);
    }
}
