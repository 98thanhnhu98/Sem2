package codeToTay02.part7;
import java.util.Scanner;
public class bai67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}
