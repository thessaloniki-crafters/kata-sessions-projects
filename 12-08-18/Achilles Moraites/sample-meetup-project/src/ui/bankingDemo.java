package ui;

import exceptions.AmountIsZeroORNegativeException;
import exceptions.NotEnoughMoneyException;
import model.Account;
import model.Bank;

public class bankingDemo {

    public static void main(String[] args) {
        Account account1 = new Account("User1",120.7);
        Account account2 = new Account("User2",10.79);

        Bank bank = new Bank();

        try {
        // add accounts
        bank.addUser(account1);
        bank.addUser(account2);

        // deposit
        account1.deposit(10);
        account2.deposit(100);


        // withdraw
         account1.withdraw(5.7);
         account2.withdraw(54.7);
         account2.withdraw(15.7);

         // bad input...
        // account1.withdraw(1000);
        // account1.deposit(0);
        }catch (NotEnoughMoneyException | AmountIsZeroORNegativeException e){
            System.out.println(e.getMessage());
        } finally {
            // print
            bank.print();
        }




    }
}
