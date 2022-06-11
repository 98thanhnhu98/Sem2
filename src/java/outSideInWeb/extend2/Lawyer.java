package outSideInWeb.extend2;

public class Lawyer extends Employee {
    public int getVacationDays() {
        return super.getVacationDays() + 5;           // 3 weeks vacation
    }
    public String getVacationForm() {
        return "pink";
    }
    public void sue() {
        System.out.print("I'll see you in court!\n");
    }

//    public static void main(String[] args) {
//        Lawyer lawyer = new Lawyer();
//        System.out.println("Vacation Days :"+lawyer.getVacationDays());
//        System.out.println("Vacation Form :"+lawyer.getVacationForm());
//        System.out.print("Slogan :");
//        lawyer.sue();
//    }
}
