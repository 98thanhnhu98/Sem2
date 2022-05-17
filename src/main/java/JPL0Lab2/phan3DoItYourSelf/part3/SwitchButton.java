package JPL0Lab2.phan3DoItYourSelf.part3;

import java.util.Scanner;

public class SwitchButton {

    private boolean status;  // Tình Trạng của công tắc
    private ElectricLamp lamp; //Tình Trạng của Pin

    public SwitchButton() {
        this.status = false;
    }
    public void connectToLamp(ElectricLamp lamp) {
        this.lamp = lamp;
    }
    public void switchOff() {
        this.status = false;
    }
    public void switchOn() {
        if(lamp != null){
            this.status = true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricLamp lamp1 = new ElectricLamp();
        SwitchButton switch1 = new SwitchButton();
        boolean t;
        int i = 1;
        int x;
        while (i < 2) {
            System.out.println("\n--------MENU--------\nPick 1 to star\nPick 2 to out\n----------------");
            i = sc.nextInt();
            if(i == 2){
                break;
            }
            System.out.println("Pick 1 to turnOn Button .");
            System.out.println("Pick 2 to turnOff Button .");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    lamp1.turnOn();
                    switch1.connectToLamp(lamp1);
                    switch1.switchOn();
                    t = switch1.status;
                    System.out.println("The Button is TurnOn (" + t + ") \n-----\n");
                    break;
                case 2:
                    lamp1.turnOn();
                    switch1.connectToLamp(lamp1);
                    switch1.switchOff();
                    t = switch1.status;
                    System.out.println("The Button is TurnOff (" + t + ") \n-----\n");
                    break;
            }
        }
    }
}
