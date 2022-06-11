package JPL0Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList {  // DONE
    private ArrayList<Student> list = new ArrayList<>();
    private int length;

    public StudentList(){
        list.add(new Student(0,"minh","thành",9.5d));
        list.add(new Student(1,"cao","thắng",8d));
        list.add(new Student(2,"minh","quân",10d));
        list.add(new Student(3,"lê","vũ",7.3d));
    }
    public ArrayList<Student> findByName(String name){
        boolean found = false;
        ArrayList<Student> matches = new ArrayList<>();
        for (Student s : list){
            String fullName = (s.getFirstName() + " " + s.getLastName()).toLowerCase();
            if (fullName.matches("(.*)" + name.toLowerCase() + "(.*)")){
                matches.add(s);
                found = true;
            }
        }
        if (!found){
            System.out.println("Not Found");
        }
        return matches;
    }

    public Student findById (int id){
        for (Student s : list){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public void add(Student s){
        list.add(s);
    }

    public void remove(int id){
        boolean found = false;
        for (Student s :list){
            if (s.getId() == id){
                int choice;
                System.out.println("Are u sure deleting this student ? (1.Yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1){
                    list.remove(s);
                }
            }
            if (!found){
                System.out.println("Can not find student with id " + id);
            }
        }
    }

    public void sortByMark(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getMark(), o1.getMark());
            }
        });
    }

    public void showList(){
        for (Student s : list){
            s.printInfo();
        }
    }

    public void showList(ArrayList<Student> list){
        for (Student s : list){
            s.printInfo();
        }
    }
}
