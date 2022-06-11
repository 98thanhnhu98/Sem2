package JPL0Lab10.part2.ex1;
/**
     * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client {  // DONE
    public Client() {
        String test = "1234";
        doUnchecked(test);
        doChecked();
    }

    public void doUnchecked(String value) {
        int result = canThrowUncheckedException(value);
        System.out.println("result = " + result);
    }

    private  int canThrowUncheckedException(String value) {
        return Integer.parseInt(value);
    }

    public void doChecked() {
        try {
            // Buoc phai check exceptions o day! Khong cach nao khac
            canThrowCheckedException();
            System.out.println("OK");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private int canThrowCheckedException() throws Exception {
        throw new Exception("Failure");
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
