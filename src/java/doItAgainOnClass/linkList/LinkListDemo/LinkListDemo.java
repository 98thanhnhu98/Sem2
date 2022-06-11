package doItAgainOnClass.linkList.LinkListDemo;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        list.add(1010010);
        list.add(10);
        list.add(6);
        list.add(1);
        for (int arr : list) {
            System.out.print(arr);
        }
        System.out.println("\n");
        Collections.sort(list);
        for (int arr : list) {
            System.out.print(arr);
        }
        System.out.println("\n");
        Collections.sort(list,(a,b)->(b-a));
        for (int arr : list) {
            System.out.print(arr);
        }
        System.out.println("\n");

        Iterator<Integer> stringIterator = list.iterator();
        while (stringIterator.hasNext()){
            Integer emp1 = stringIterator.next();
            System.out.println(emp1);
        }
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        System.out.println("\n");

        for (int i =0;i<list.size();i++){
            if (list.get(i).equals(1)){
                System.out.println("Tim thay o vi tri :" + i);
            }
        }
    }
}
