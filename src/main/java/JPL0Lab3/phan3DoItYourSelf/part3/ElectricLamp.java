package JPL0Lab3.phan3DoItYourSelf.part3;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp(){
        status = false;
    }
    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }
}
