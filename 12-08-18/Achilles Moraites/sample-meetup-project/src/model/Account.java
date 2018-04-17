package model;

import exceptions.AmountIsZeroORNegativeException;
import exceptions.NotEnoughMoneyException;

import java.util.ArrayList;
import java.util.Collection;

public class Account implements Transactions {



    double balance;

    String name;
    Collection<Transactions> transactions;

    public Account(String name, double balance){
        this.balance = balance;
        this.name = name;
        transactions = new ArrayList<>();

    }


    // MODIFIES : this, transactions
    // EFFECTS : adds given amount to the accounts balance
    public void deposit(double amount) throws AmountIsZeroORNegativeException {
        checkAmount(amount);
        balance += amount;
        transactions.add(new Transaction(TransactionTypes.DEPOSIT, amount));

    }




    // MODIFIES : this, transactions
    // EFFECTS : withdraw given amount from the accounts balance
    public void withdraw(double amount) throws NotEnoughMoneyException, AmountIsZeroORNegativeException {
        checkBalance(amount);
        balance -= amount;
        transactions.add(new Transaction(TransactionTypes.WITHDRAW, amount));




    }




    public void print() {
        System.out.println("\t Statement for "+ name +" has "+balance);
        transactions.forEach(Transactions::print);

    }


// HELPERS
    private void checkAmount(double amount) throws AmountIsZeroORNegativeException {
        if(amount <= 0)throw new AmountIsZeroORNegativeException(name);
    }

    private void checkBalance(double amount) throws NotEnoughMoneyException, AmountIsZeroORNegativeException {
        checkAmount(amount);
        if(balance <= amount) throw new NotEnoughMoneyException(name,balance,amount);
    }
}
