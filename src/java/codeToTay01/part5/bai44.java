package codeToTay01.part5;
import java.util.Scanner;
public class bai44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i = n ; i >= -n;i--){
            System.out.print(i + " ");
        }
    }
}
