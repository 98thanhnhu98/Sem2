package codeToTay01.part6;
import java.util.Scanner;
public class bai52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,j,i;
        i = 0;
        j = 0;
        a = sc.nextInt();
        while(i <= a){
            i++;
            if(a % i == 0) {
                j++;
            }
        }
        System.out.print(j);
    }
}
