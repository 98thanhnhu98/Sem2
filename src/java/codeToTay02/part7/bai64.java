package codeToTay02.part7;
import java.util.Scanner;
public class bai64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0;i<n;i++){
            if(a[i] % 2 != 0 && a[i] > 0){
                sum += a[i];
            }
        }
        System.out.print(sum);
    }
}
