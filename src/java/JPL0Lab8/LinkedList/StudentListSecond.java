package JPL0Lab8.LinkedList;

import java.util.*;

public class StudentListSecond {
    private LinkedList<StudentSecond> list = new LinkedList<>();
    private int length;

    public StudentListSecond(){
        list.add(new StudentSecond(0,"minh","thành",9.5d));
        list.add(new StudentSecond(1,"cao","thắng",8d));
        list.add(new StudentSecond(2,"minh","quân",10d));
        list.add(new StudentSecond(3,"lê","vũ",7.3d));
    }
    public LinkedList<StudentSecond> findByName(String name){
        boolean found = false;
        LinkedList<StudentSecond> matches = new LinkedList<>();
        for (StudentSecond s : list){
            String fullName = new String(s.getFirstName() + " " + s.getLastName()).toLowerCase();
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

    public StudentSecond findById (int id){
        for (StudentSecond s : list){
            if (s.getId() == id){
                return s;
            }
        }
        return null;
    }

    public void add(StudentSecond s){
        list.add(s);
    }

    public void remove(int id){
        boolean found = false;
        for (StudentSecond s :list){
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
        Collections.sort(list, new Comparator<StudentSecond>() {
            @Override
            public int compare(StudentSecond o1, StudentSecond o2) {
                return Double.compare(o2.getMark(), o1.getMark());
            }
        });
    }

    public void showList(){
        for (StudentSecond s : list){
            s.printInfo();
        }
    }

    public void showList(LinkedList<StudentSecond> list){
        for (StudentSecond s : list){
            s.printInfo();
        }
    }
}

