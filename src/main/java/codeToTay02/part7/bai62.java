package codeToTay02.part7;
import java.util.Scanner;
public class bai62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            if(a[i] % 2== 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}
