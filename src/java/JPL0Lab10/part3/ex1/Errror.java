package JPL0Lab10.part3.ex1;

public class Errror { //DONE
    private String error;

    public  Errror(String error){
        this.error = error;
    }
    public Errror(){
    }

    public String getError() {
        return error;
    }

    public void printError(){
        System.out.printf("%10s" , error);
    }
}
