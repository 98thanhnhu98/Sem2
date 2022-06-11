package outSideInWeb.TestHashMap;

import java.util.ArrayList;

public class ObjectArray {

    public ObjectArray(){
    }
     private ArrayList<Studentt> arrayList = new ArrayList<>();

    public void add(Studentt s){
        arrayList.add(s);
    }
    public void showList(){
        for (Studentt s : arrayList){
            s.printSTT();
        }
    }

}
