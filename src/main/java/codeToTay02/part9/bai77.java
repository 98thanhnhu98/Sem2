package codeToTay02.part9;
import java.util.Scanner;
public class bai77 {
    public static void show(int[] arr){
        for(int i = 0;i< arr.length;i++){
            if(arr[i] % 3 == 0 && arr[i] % 5 != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tra mang");
            arr[i] = sc.nextInt();
        }
        show(arr);
    }
}
