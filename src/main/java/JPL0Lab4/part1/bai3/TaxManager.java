package JPL0Lab4.part1.bai3;

public class TaxManager {
    private static final int MAX = 100;
    private Taxplayer[] list = new Taxplayer[MAX];
    private int count = 0;
    public boolean addTaxpayer (Taxplayer taxplayer){
        if (count >= MAX){
            return false;
        }
        list[count++] = taxplayer;
        return true;
    }
    public double getTax(){
        double sum = 0;
        for (int i = 0;i< count ; i++){
            sum += list[i].pay();
        }
        for (int i = 0;i< count ; i++){
            System.out.println(list[i].pay());
        }
        System.out.println("-------------");
        System.out.println(sum);
        return sum;
    }

}
