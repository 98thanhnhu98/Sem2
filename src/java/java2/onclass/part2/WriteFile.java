package java2.onclass.part2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WriteFile {
    public static Employee employee = new Employee(1, "Quan", "quan@gmail.com", new String[]{"Admin", "Manager"}, true);
    public static void writeFileWithFormat() throws IOException {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        Writer writer = Files.newBufferedWriter(Paths.get("employee.json"));

        gson.toJson(employee, writer);

        writer.close();
    }
    public static void deleteStudent() throws IOException {
        Gson gson = new Gson();
        Writer writer = Files.newBufferedWriter(Paths.get("employee.json"));
//        gson.fromJson(employee,writer);
    }

    public static void menu(){
        System.out.println("1. Add a new student to the list");
        System.out.println("2. Delete a student from the list");
        System.out.println("3. Search by name");
        System.out.println("4. Search by id");
        System.out.println("5. Print student info in descending order or mark");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        menu();
        while (true){
            int choice;
            System.out.println("#: ");
            choice = sc.nextInt();
            if (choice == 1){
                writeFileWithFormat();
            } else if (choice == 2){
            } else if (choice == 3) {
            } else if (choice == 4) {
            } else if (choice == 5) {
                deleteStudent();
            } else if (choice == 6) {
                System.exit(0);
            }
        }
    }
}