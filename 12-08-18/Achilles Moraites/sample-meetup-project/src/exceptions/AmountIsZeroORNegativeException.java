package exceptions;

public class AmountIsZeroORNegativeException extends Exception {
    public AmountIsZeroORNegativeException(String name){
        super("User "+name+" has selected an amount that is 0 or a negative");
    }
}
