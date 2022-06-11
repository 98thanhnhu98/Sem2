package JPL0Lab3.phan3DoItYourSelf.outSidePart3;

public class SwitchButton {
    private boolean status;  // Tình Trạng của công tắc
    private ElectricLamp lamp; //Tình Trạng của Pin
    public SwitchButton(){
        this.status = false;
    }
    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }
    public void switchOff(){
        connectToLamp(this.lamp);
        this.lamp.turnOff();
        if (lamp != null) {
            this.status = false;
        }
        System.out.println("Tinh Trang Cua Pin La " + status);
    }
    public void switchOn(){
        connectToLamp(this.lamp);
        this.lamp.turnOn();
        if (lamp != null) {
            this.status = true;
        }
        System.out.println("Tinh Trang Cua Pin La " + status);
    }

    public static void main(String[] args) {
        SwitchButton switchButton1 = new SwitchButton();
        ElectricLamp lamp1 = new ElectricLamp();
        switchButton1.connectToLamp(lamp1);
        switchButton1.switchOn();
        switchButton1.switchOff();
        }

//        Scanner sc = new Scanner(System.in);
//        ElectricLamp lamp1 = new ElectricLamp();
//        SwitchButton switch1 = new SwitchButton();
//        boolean t;
//        int i = 1;
//        int x;
//        while (i < 2) {
//            System.out.println("\n--------MENU--------\nPick 1 to star\nPick 2 to out\n----------------");
//            i = sc.nextInt();
//            if(i == 2){
//                break;
//            }
//            System.out.println("Pick 1 to turnOn Button .");
//            System.out.println("Pick 2 to turnOff Button .");
//            x = sc.nextInt();
//            switch (x) {
//                case 1:
//                    lamp1.turnOn();
//                    switch1.connectToLamp(lamp1);
//                    switch1.switchOn();
//                    t = switch1.status;
//                    System.out.println("The Button is TurnOn (" + t + ") \n-----\n");
//                    break;
//                case 2:
//                    lamp1.turnOff();
//                    switch1.connectToLamp(lamp1);
//                    switch1.switchOff();
//                    t = switch1.status;
//                    System.out.println("The Button is TurnOff (" + t + ") \n-----\n");
//                    break;
//            }
//        }
//    }
}
