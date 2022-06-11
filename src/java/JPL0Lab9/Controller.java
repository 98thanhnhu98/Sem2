package JPL0Lab9;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {  // DONE
    private static long balanceNumber = 10000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();

    public Controller(){
        listHistory.add(new TransactionHistory("tiền lưong","thanhnh123",20000));
        listHistory.add(new TransactionHistory("tiền hoa hồng","minh21231",10000));
        listHistory.add(new TransactionHistory("tiền nhà","hoamynho13",50000));
    }

    public static long transfer (long money){
        if (balanceNumber > 50000 && money > 50000){
            balanceNumber -= money;
            System.out.println("Chuyển thành công");
        } else {
            System.out.println("Số tiền chuyển phải lớn hơn 50 000\nSố tiền hiện có trong tài khoản phải lớn hơn 50 000");
        }
        return balanceNumber;
    }
    public void actionTransfer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp số tài khoản thụ hưởng :");
        String beneficiary = sc.next();
        System.out.println("Nhập số tiền cần chuyển");
        long money = sc.nextInt();
        System.out.println("Nhập thông tin , lời nhắn thêm");
        String description = sc.next();
        transfer(money);
        listHistory.add( new TransactionHistory(description,beneficiary,money));
    }

    public void getHistory(){
        System.out.println(listHistory);
    }
    public long getBalanceNumber(){
        return balanceNumber;
    }

    public static String formatMoney(long money){
        DecimalFormat formatter = new DecimalFormat("###,###,##00");
        return formatter.format(money);
    }
}
