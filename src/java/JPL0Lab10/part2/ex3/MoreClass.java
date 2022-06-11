package JPL0Lab10.part2.ex3;

/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoreClass{  // DONE

    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println("1 - " + obj1);
        // obj 1 là ko có method

        Object obj2 = new Object(){
            public String toString(){
                return "this is obj2";
            }
        };
        // obj 2 là có method toString
        System.out.println("2 - " + obj2);
    }
}
/*
 - Compile and run the test class.
 - Why System.out.println(obj1); be displayed?
 - What's the difference between two objects obj1 and obj2?
*/