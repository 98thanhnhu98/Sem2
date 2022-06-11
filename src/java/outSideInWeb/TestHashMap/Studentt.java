package outSideInWeb.TestHashMap;

public class Studentt {
    private int umber = 1231;
    private String name = "Thanh";
    public Studentt(){
    }
    public Studentt(int umber , String name){ //Dùng để in dữ liệu mẫu
        this.umber = umber;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getUmber(){
        return umber;
    }

    public void printSTT(){
        System.out.printf("%3d | %10s",this.umber,this.name);
    }
}
