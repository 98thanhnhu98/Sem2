package outSideInWeb.extend2;

public class Janitor extends Employee {
    @Override
    public double getSalary() {
        return super.getSalary() - 10000;
    }

}
