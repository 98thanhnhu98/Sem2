package JPL0Lab4.part1.bai3;
public abstract class Taxplayer {
    private String id;
    public String getId(){
        return id;
    }
    public abstract double pay();

    public static class Company extends Taxplayer {
        @Override
        public double pay() {
            return 1000;
        }
    }
    public static class FreeLand extends Taxplayer{
        @Override
        public double pay() {
            return 10;
        }
    }
    public static class Employee extends Taxplayer{
        @Override
        public double pay() {
            return 100;
        }
    }

    public static void main(String[] args) {
        Taxplayer taxplayer =   new Taxplayer() {
            @Override
            public double pay() {
                return 0;
            }
        };
        Taxplayer.Employee employee = new Taxplayer.Employee();
        TaxManager taxManager = new TaxManager();
        Taxplayer.Company company = new Taxplayer.Company();
        Taxplayer.FreeLand freeLand = new Taxplayer.FreeLand();
        System.out.println(taxManager.addTaxpayer(taxplayer)); //0
        System.out.println(taxManager.addTaxpayer(freeLand)); //10
        System.out.println(taxManager.addTaxpayer(employee)); //100
        System.out.println(taxManager.addTaxpayer(company)); //1000
        taxManager.getTax();
    }
}
