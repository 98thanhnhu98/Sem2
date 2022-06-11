package JPL0Lab9;

import java.util.Objects;

public class ValidationAccount {  // DONE
    private final String MOBILE ="1";
    private final String PASSWORLD = "2";
    public boolean checkAccount(String mobile , String pass){
        if (Objects.equals(mobile, MOBILE)){
            if (Objects.equals(pass, PASSWORLD)){
                System.out.println("Đăng Nhập THành CÔng");
                return true;
            } else {
                System.out.println("Mật Khẩu Sai");
                return false;
            }
        } else {
            System.out.println("Sai Tài Khoản và Mật Khẩu");
            return false;
        }
    }
}
