package codeToTay02.part7;
import java.util.Scanner;
public class bai63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int alike =0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == k){
                alike++;
            }
        }
        System.out.print(alike);
    }
}
