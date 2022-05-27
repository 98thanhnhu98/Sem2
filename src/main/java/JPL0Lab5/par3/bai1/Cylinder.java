package JPL0Lab5.par3.bai1;

public class Cylinder extends Circle {
    private double height;
    public  Cylinder(){
        super();
        height = 1.0;
    }
    public Cylinder(double height){
        super();
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public double setHeight(double height){
        this.height = height;
        return this.height;
    }
    public double getVolume(){
        return  super.getArea()*height;
    }

}
