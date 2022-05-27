package JPL0Lab5.par3.bai1;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1.0d;
        this.color = "yellow";
    }
    public  Circle (double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color) {
        this.radius = radius;
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String setColor(String color) {
        this.color = color;
        return this.color;
    }
    public double getRadius(){
        return radius;
    }
    public double setRadius(double radius){
        this.radius = radius;
        return this.radius;
    }
    public double getArea(){
        return radius*radius * 3.14d;
    }
    public String toString(){
        return color;
    }
}
