package doItAgainOnClass.linkList.TryCatch;

import java.io.IOException;
import java.util.Scanner;

public class tryCatchDemo {

    public static void trycatchDemo(){
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (NumberFormatException d){
            System.out.println("catch 1. " + d.getMessage());
        }
        catch (ArithmeticException d1){
            System.out.println("catch 2. "+d1.getMessage());
        }
        catch (IndexOutOfBoundsException d2){
            System.out.println("catch 3. "+d2.getMessage());
        }
        catch (NullPointerException d3){
            System.out.println("catch 4. "+d3.getMessage());
        }
        catch (Exception d4){
            System.out.println("catch 5. "+d4.getMessage());
        }
        finally {
            System.out.println("rest chương trình");
        }
    }
    public static void createArrayDemo(){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while (size <= 0){

            boolean check = false;
            while (!check){
                try {
                    System.out.println("nhập số : ");
                    size = Integer.parseInt(sc.nextLine());
                    check = true;
                }catch (NumberFormatException e){
                    System.out.println("Ban đã nhập sai , vui lòng nhập số nguyên" + e.getMessage());

                }
            }
        }
    }
    public static int checkInputAge() throws IOException    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi :");
        int age = sc.nextInt();
        if (age <= 0 ) throw new IOException("Tuoi ko dc nho hon 0 ");
        return age;
    }
    public static double inputData(){
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        double number = 0;

        while (!check){
            try {
                number = Double.parseDouble(sc.nextLine());
                if (number <= 0) throw new ArithmeticException();
                check = true;
            }catch (ArithmeticException e){
                System.out.println("number do not smaller or equal 0");
            }
            catch (NumberFormatException e1){
                System.out.println("number do not smaller or equal 0.1");
            }
        }
        return number;
    }
    public static void main(String[] args) throws IOException {
//        trycatchDemo();
//        createArrayDemo();
//        int a = checkInputAge();
//        System.out.println(a);
        System.out.println("Nhâp chieu cao(m)");
        double height = inputData();
        System.out.println("Nhâp chieu can nang(kg)");
        double weight = inputData();

        double bmi = weight/(height*weight);
        System.out.printf("Chi so BMI cua ban la : %2f",bmi);
    }
}
