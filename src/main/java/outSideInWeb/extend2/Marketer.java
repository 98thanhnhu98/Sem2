package outSideInWeb.extend2;

public class Marketer extends Employee {
    public String advertise(){
        return "Act now, while supplies last!";
    }
    @Override
    public double getSalary() {
        return super.getSalary() + 10000;
    }

    @Override
    public int getHours() {
        return super.getHours();
    }
}
