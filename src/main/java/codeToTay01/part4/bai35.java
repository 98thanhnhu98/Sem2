package codeToTay01.part4;
import java.util.Scanner;
public class bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if(a.equals(b)){
            System.out.print("two people have the same name");
        }else {
            System.out.print("two people don't have the same name");
        }
    }
}
