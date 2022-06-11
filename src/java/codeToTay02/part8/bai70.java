package codeToTay02.part8;
import java.util.Scanner;
public class bai70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int dem = 0;
        for(int i = 0;i< s.length();i++){
            // System.out.print(s.charAt(i));
            if(s.charAt(i) == c){
                dem++;
            }
        }
        System.out.print(dem);
    }
}
