package JPL0Lab10.part2.ex2;
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UncheckedException{  // DONE
    public UncheckedException () {
    }

    public static void main(String[] args) {
        int i, n = 2;
        int a[] = new int[n];
        try {
            java.util.Scanner input = new java.util.Scanner(System.in);
            for (i = 0; i <= n; i++) {
                System.out.printf("a[%d] = ", i);
                a[i] = input.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("nhap qua 2 cai roi ban");
        }
        finally {
            System.out.println("rest!");
        }
    }
}
