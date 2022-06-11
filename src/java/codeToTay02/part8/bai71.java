package codeToTay02.part8;
import java.util.Scanner;
public class bai71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int d = -1;
        for(int i = 0;i< s.length();i++){
            if(s.charAt(i) == c){
                d = i;
                break;
            }
        }
        System.out.print(d);
    }
}
