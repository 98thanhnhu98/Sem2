package JPL0Lab8.HashSet;

import JPL0Lab7.Student;

import java.util.Scanner;

import java.util.*;

public class StudentListFirst {
    private HashSet<StudentFirst> list = new HashSet<>();
    private int length;

    public StudentListFirst(){
        list.add(new StudentFirst(0,"minh","thành",9.5d));
        list.add(new StudentFirst(1,"cao","thắng",8d));
        list.add(new StudentFirst(2,"minh","quân",10d));
        list.add(new StudentFirst(3,"lê","vũ",7.3d));
    }
    public HashSet<StudentFirst> findByName(String name){
        boolean found = false;
        HashSet<StudentFirst> matches = new HashSet<>();
        for (StudentFirst s : list){
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

    public StudentFirst findById (int id){
        for (StudentFirst s : list){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public void add(StudentFirst s){
        list.add(s);
    }

    public void remove(int id){
        boolean found = false;
        for (StudentFirst s :list){
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
//    public static List<StudentFirst> convertToList(Set<StudentFirst> set) {
//        List<StudentFirst> list = new LinkedList<>();
//        for(StudentFirst element: set) {
//            list.add(element);
//        }
//        return list;
//    }

    public void showList(){
        for (StudentFirst s : list){
            s.printInfo();
        }
    }

    public void showList(HashSet<StudentFirst> hashSet){
        for (StudentFirst s : hashSet){
            s.printInfo();
        }
    }
}
