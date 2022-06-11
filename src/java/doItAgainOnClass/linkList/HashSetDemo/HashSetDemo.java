package doItAgainOnClass.linkList.HashSetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public void hashSetDemo(){
        HashSet<String> hashSet = new HashSet<>();

//Them pt vao ds
        hashSet.add("Ha Noi");
        hashSet.add("Vinh");
        hashSet.add("Pho Chau");
        hashSet.add("Nghe An");
        hashSet.add("Dien Chau");
        hashSet.add("Ba Vi");
        hashSet.add("Bac Ninh");
        hashSet.add("Sapa");
        hashSet.add("Sapa");

        System.out.println(hashSet);

        hashSet.add("Mexico");
        hashSet.add("London");
        System.out.println(hashSet);
        System.out.println("\nDose it contains HCM city: " + hashSet.contains("Ho Chi Minh city"));

        hashSet.remove("Dien Chau");

//use foreach
        System.out.println("\nUse for each :");
        for (String s : hashSet){
            System.out.println(hashSet + ", ");
        }
//iterating over hashset items
        System.out.println("\nUse iterating over hash");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ ", ");
        }
    }
}
