package codeToTay01.part5;
import java.util.Scanner;
public class bai47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        for(i = a;i <= b;i++){
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
