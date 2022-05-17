package codeToTay02.part7;
import java.util.Scanner;
public class bai65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(a[i] > 0 && a[i] <= 10){
                System.out.print(a[i] + " ");
            }
        }
    }
}
