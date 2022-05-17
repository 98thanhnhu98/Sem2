package JPL0Lab2.phan2.part1;
//import java.util.Scanner;
public class index {
    private int id;
    private String name;
    private String gender;

    public index(){
        this.id=-1;
        this.name="noname";
        this.gender="boy";
    }

    public index (int id,String name,String gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int value){
        this.id=value;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name=value;
    }
    public String isMale(){
        return this.gender;
    }
    public void setMale (String value){
        this.gender=value;
    }
    public void printInfo(){
        System.out.println("-----------------------------");
        System.out.println("| ID |           Name         |     Male    |");
        System.out.printf("|  %d  |  %s   |   %s    |\n",this.id,this.name,this.gender);
/* %d = int
*  %s = String
*  %b = boolean
* */
    }

    public static void main (String[] args){
        index studentA;
        index studentB;

        studentA = new index();

        studentB=new index(1,"Cao Minh Quan","boy");

        studentB.printInfo();
        studentB.setName("Do Minh Thanh");
        studentB.setMale("girl");
        studentB.setId(2);
        studentB.printInfo();
    }
}
