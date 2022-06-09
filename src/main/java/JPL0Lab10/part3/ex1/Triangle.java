package JPL0Lab10.part3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
public class Triangle {
    private ArrayList<Client> test = new ArrayList<>();
    public Triangle() {
        test.add(new Client(0,12,5));
        test.add(new Client(1,19,16));
        test.add(new Client(2,8,20));
    }
    public void addCanh(){
        Scanner sc = new Scanner(System.in);
        showList();
        try {
            System.out.println("Nhập vị trí thêm");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập cạnh huyền");
            int nhapCH = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập cạnh góc vuông");
            int nhapCV = Integer.parseInt(sc.nextLine());
            test.add( new Client(id,nhapCH , nhapCV));
        }
        catch (Exception a){
            System.out.println("lỗi exception " + a.getMessage());
            InvalidTriangleException invalidTriangleException = new InvalidTriangleException("lỗi Exception");
        }
    }
    public void showList(){
        for (Client a1 : test){
            a1.printfCanh();
        }
    }
    public void showArea(int vitri){
        Client client = new Client();
       for (Client a1 : test){
           a1.printfCanh();
           if (client.getId() == vitri){
               a1.printArea();
               break;
           }
       }
    }
}
