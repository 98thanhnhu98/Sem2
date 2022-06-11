package JPL0Lab10.part3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
public class InvalidTriangleException {
    private ArrayList<String> catchError = new ArrayList<String>();
    private String Error;
    public InvalidTriangleException(String error){
        catchError.add(error);
    }
    public InvalidTriangleException(){
    }
    public void showError (){
        for (String a : catchError) {
            System.out.println(a);
        if (a == null) {
            System.out.println("Chưa có lỗi nào");
        }
        }
    }
    public void menu(){
        System.out.println("1. Thêm cạnh");
        System.out.println("2. tính diện tích");
        System.out.println("3. Xem lỗi đã bị");
        System.out.println("4. thoát");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        InvalidTriangleException in = new InvalidTriangleException();
        Client client = new Client();
        while (true){
            in.menu();
            int chosse = sc.nextInt();
            switch (chosse){
                case 1:
                    triangle.addCanh();
                    break;
                case 2:
                    triangle.showList();
                    int chon = sc.nextInt();
                    triangle.showArea(chon);
                    break;
                case 3:
                    in.showError();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
