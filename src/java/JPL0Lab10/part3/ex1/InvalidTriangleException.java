package JPL0Lab10.part3.ex1;

import java.util.Scanner;
public class InvalidTriangleException { //DONE
    private static Triangle list = new Triangle();
    public InvalidTriangleException(){
    }
    public static void menu(){
        System.out.println("1. Thêm cạnh");
        System.out.println("2. tính diện tích");
        System.out.println("3. Xem lỗi đã bị");
        System.out.println("4. thoát");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            menu();
            int chosse = sc.nextInt();
            switch (chosse){
                case 1:
                    list.addCanh();
                    break;
                case 2:
                    list.showList();
                    System.out.println("Nhập vị trí cần tính diện tích : ");
                    int chon = sc.nextInt();
                    Client i = list.findById(chon);
                    if (i == null){
                        System.out.println("Không tìm thấy vị trí");
                    }
                    break;
                case 3:
                    list.showError();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
