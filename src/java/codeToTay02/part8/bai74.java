package codeToTay02.part8;
import java.util.Scanner;
public class bai74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                count++;
            }
        }
        System.out.print(count);
    }
}
