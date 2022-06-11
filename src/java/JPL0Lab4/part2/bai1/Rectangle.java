package JPL0Lab4.part2.bai1;
public class Rectangle extends  Shape{ // hình chữ nhât
    private int length = 20;
    private int with =2;
    @Override
    public int getArea(){
        return length * with;
    }
    public String toString(){
        return super.toString();
    }
}
