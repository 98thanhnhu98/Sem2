package JPL0Lab4.part2.bai1;

public abstract class Shape { // trả về một hình cần gọi
    private String color = "yellow";
    public abstract int getArea(); // Diện tích
    public String toString(){
        return color;
    }
}



