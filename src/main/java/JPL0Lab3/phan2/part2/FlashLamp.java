package JPL0Lab3.phan2.part2;

public class FlashLamp {
    private boolean status = false;
    private Battery battery;


    public FlashLamp(){
        status = false;
    }
    public int getBatteryInfo(){
        return battery.getEnergy();
    }
    public void setBattery(Battery battery){
        this.battery = battery;
    }
    public void light(){
        if( status &&  battery != null && battery.getEnergy() > 0){
            battery.decreaseEnergy();
        }
    }
    public void turnOn() {
        if(battery!= null && battery.getEnergy()>0){
            this.status = true;
        }
    }
    public void turnOff(){
        this.status = false;
    }

    public static void main(String[] args) {
        FlashLamp flashLamp = new FlashLamp();
        Battery battery1 = new Battery();
        int i = 0;
        while (i < 10) {
            flashLamp.setBattery(battery1);
            flashLamp.turnOn();
            flashLamp.light();
            i++;
        }
        while (i < 10) {
            flashLamp.setBattery(battery1);
            flashLamp.turnOff();
            flashLamp.light();
            i++;
        }
        System.out.println(flashLamp.getBatteryInfo());
    }






//        Scanner sc = new Scanner(System.in);
//        Battery battery1 = new Battery();
//        FlashLamp flashLamp1 = new FlashLamp();
//        battery1.setEnergy(100);
//        int pin = 1;
//        int i = 1;
//        while(i <= 2){
//            System.out.println("----------------------------------");
//            System.out.println("Nhap 1 so de tiep tuc\nNhap 2 de tam dung va hien thi pin");
//            i = sc.nextInt();
//            if(i == 2){
//                break;
//            }
//            System.out.print("Press 1 to turnOn the light\nPress 2 to turnOff the light");
//            int chosse = sc.nextInt();
//            switch(chosse){
//                case  1:
//                    System.out.println("-------------flashLamp-------------");
//                    System.out.print("Your Light was turned on\n");
//                    flashLamp1.setBattery(battery1);
//                    flashLamp1.turnOn();
//                    flashLamp1.light();
//                    break;
//                case 2:
//                    System.out.println("-------------flashLamp-------------");
//                    System.out.print("Your Light was turned off\n");
//                    flashLamp1.setBattery(battery1);
//                    flashLamp1.turnOff();
//                    flashLamp1.light();
//                    break;
//                default:
//                    System.out.println("Your char is wrong , plss press again .");
//                    break;
//            }
//            flashLamp1.getBatteryInfo();
//            pin = battery1.getEnergy();
//        }
//        System.out.println("\n\n|-----------------|");
//        System.out.println("Tinh Trang Pin Hien Tai La :" + pin);
//    }
}
