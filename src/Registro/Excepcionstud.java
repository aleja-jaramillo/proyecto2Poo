package Registro;

public class Excepcionstud extends NumberFormatException {

    private String message;

    public Excepcionstud(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage(){
        return this.message;
    }
}
