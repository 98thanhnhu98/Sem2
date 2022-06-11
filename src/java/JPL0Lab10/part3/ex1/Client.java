package JPL0Lab10.part3.ex1;


public class Client {
    private int id;
    private int canhhuyen;
    private int  canhvuong;
    public Client(int id,int canhhuyen, int canhvuong){
        this.id = id;
        this.canhhuyen = canhhuyen;
        this.canhvuong = canhvuong;
    }
    public Client() {
    }
    public int getId(){
        return id;
    }
    public int getCanhhuyen() {
        return canhhuyen;
    }
    public int getCanhvuong() {
        return canhvuong;
    }
    public void printfCanh(){
        System.out.printf("%2d | %10d | %10d ",id,canhvuong,canhhuyen);
        System.out.println();
    }
    public void printArea(){
        int area = canhhuyen*canhvuong/2;
        System.out.println("diện tích bằng : " + area);
    }
}
