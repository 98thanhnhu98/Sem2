public class ttt {
    int num1 = 20;
    int num2 = 30;

    public int tru() {
        return num2-num1;
    }

    public int nhan() {
        return num1*num2;
    }

    public float Chia() {
        return (float) num2/num1;
    }

    public int chiaLayDu() {
        return num2 % num1;
    }

    public static void main (String[] args) {
        ttt ttt = new ttt();
        System.out.println(" 30 - 20 = " + ttt.tru());
        System.out.println(" 30 * 20 = " + ttt.nhan());
        System.out.println(" 30 / 20 = " + ttt.Chia());
        System.out.println(" 30 % 20 = " + ttt.chiaLayDu());
    }
}
