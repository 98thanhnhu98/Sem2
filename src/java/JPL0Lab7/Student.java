package JPL0Lab7;

import java.util.Scanner;

public class Student {  // DONE
    private int id;
    private String firstName;
    private String lastName;
    private double mark;

    public Student(){
    }
    public Student(int id,String firstName,String lastName,double mark){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public void scanInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id: ");
        this.id = sc.nextInt();
        System.out.println("Enter firstName : ");
        this.firstName = sc.next();
        System.out.println("Enter lastName : ");
        this.lastName = sc.next();
        System.out.println("Enter mark : ");
        this.mark = sc.nextDouble();
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getId(){
        return id;
    }

    public double getMark(){
        return mark;
    }

    public void printInfo (){
        System.out.printf("%3d | %10s | %10s | %5f\n", getId(),getFirstName(),getLastName(),getMark());
    }
}
