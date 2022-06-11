package outSideInWeb.extend1;
public class Truck extends Car {
    public void m1() {
        System.out.print("truck 1 / ");
    }
    public void m2() {
        super.m1();
    }
    public String toString() {
        return super.toString1() + super.toString1();
    }
}