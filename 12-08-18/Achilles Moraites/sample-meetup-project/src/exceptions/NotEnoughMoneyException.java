package exceptions;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String name, double balance, double amount){
        super(name+" tried to withdraw "+amount+", but has only "+balance+" in their account!");
    }
}
