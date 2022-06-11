package JPL0Lab10.part3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
public class Triangle { //list //DONE

    private ArrayList<Errror> loi = new ArrayList<>();
    private ArrayList<Client> test = new ArrayList<>();

    // của CLien
    public Triangle() {
        loi.add(new Errror("Lỗi Exception1"));
        test.add(new Client(0,12,5));
        test.add(new Client(1,19,16));
        test.add(new Client(2,8,20));
    }
    public Client findById(int id){
        int dientich = 0;
        for (Client s : test){
            if (s.getId() == id){
                s.printfCanh();
                dientich = s.printArea();
                System.out.println("diện tích bằng : " + dientich);
                return s;
            }
        }
        return null;
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
            System.out.println("lỗi exception :" + a.getMessage());
            String error = "lỗi exception :" + a.getMessage();
            loi.add(new Errror(error));
        }
    }
    public void showList(){
        for (Client a1 : test){
            a1.printfCanh();
        }
    }
    public void showArea(int vitri){
        int dientich = 0;
            for (Client a1 : test) {
                a1.printfCanh();
                if (a1.getId() == vitri) {
                    dientich = a1.printArea();
                    System.out.println("diện tích bằng : " + dientich);
                    break;
                }
            }
        if (dientich == 0) {
            System.out.println("lỗi ko chạy tính diện tích");
        }
    }


    // của Error
    public void showError (){
        for (Errror a : loi) {
            a.printError();
            System.out.println();
        }
    }
}
