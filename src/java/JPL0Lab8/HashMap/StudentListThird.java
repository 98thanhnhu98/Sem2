//package JPL0Lab8.HashMap;
//
//
//import java.util.HashMap;
//import java.util.Set;
//import java.util.Scanner;
//
//public class StudentListThird {
//    private HashMap<Integer,StudentThird> list = new HashMap<>();
//    private int length;
//
//    public StudentListThird(){
//        list.put(1,(new StudentThird(0,"minh","thành",9.5d)));
//        list.put(2,(new StudentThird(1,"cao","thắng",8d)));
//        list.put(3,(new StudentThird(2,"minh","quân",10d)));
//        list.put(4,(new StudentThird(3,"lê","vũ",7.3d)));
//    }
//    public HashMap<Integer,StudentThird> findByName(String name){
//        boolean found = false;
//        HashMap<Integer,StudentThird> matches = new HashMap<Integer,StudentThird>();
//
//        Set<Integer> mat
//        for (StudentThird s : list){
//            String fullName = (s.getFirstName() + " " + s.getLastName()).toLowerCase();
//            if (fullName.matches("(.*)" + name.toLowerCase() + "(.*)")){
//                matches.put(s);
//                found = true;
//            }
//        }
//        if (!found){
//            System.out.println("Not Found");
//        }
//        return matches;
//    }
//
//    public StudentThird findById (int id){
//        for (StudentThird s : list){
//            if (s.getId() == id){
//                return s;
//            }
//        }
//        return null;
//    }
//
//    public void add(StudentThird s){
//        list.put(i,s);
//    }
//
//    public void remove(int id){
//        boolean found = false;
//        for (StudentThird s :list){
//            if (s.getId() == id){
//                int choice;
//                System.out.println("Are u sure deleting this student ? (1.Yes 2.No");
//                choice = new Scanner(System.in).nextInt();
//                if (choice == 1){
//                    list.remove(s);
//                }
//            }
//            if (!found){
//                System.out.println("Can not find student with id " + id);
//            }
//        }
//    }
//
//    public void sortByMark(){
//    }
//
//    public void showList(){
//        for (StudentThird s : list){
//            s.printInfo();
//        }
//    }
//
//    public void showList(HashMap<StudentThird> hashMap){
//        for (StudentThird s : hashMap){
//            s.printInfo();
//        }
//    }
//}
