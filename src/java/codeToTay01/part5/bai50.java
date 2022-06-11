package codeToTay01.part5;
import java.util.Scanner;
public class bai50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i < 25; i++) {
            if(i % 5 == 0){
                System.out.print("\n");
            }
            System.out.print(i + " ");
        }
    }
}
