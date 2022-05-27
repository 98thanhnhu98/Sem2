package outSideInWeb.extend2;

public class Employee{
    public int getHours() {
        return 40;           // works 40 hours / week
    }
    public double getSalary() {
        return 40000.0;      // $40,000.00 / year
    }
    public int getVacationDays() {
        return 10;           // 2 weeks' paid vacation
    }
    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }

//    public static void main(String[] args) {
//        Employee employee = new Employee();
//        System.out.println("Work :"+employee.getHours());
//        System.out.println("Salary :"+employee.getSalary());
//        System.out.println("Vacation Days :"+employee.getVacationDays());
//        System.out.println("Vacation Form :"+employee.getVacationForm());
//    }
}