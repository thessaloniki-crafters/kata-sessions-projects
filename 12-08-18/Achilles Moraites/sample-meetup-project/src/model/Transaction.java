package model;

import java.time.LocalDateTime;

public class Transaction implements Transactions {

    private String current;
    private String date;

    public Transaction(TransactionTypes type, double amount){
        date = LocalDateTime.now().toLocalDate().toString();
        current = date+" "+type.toString()+"\t "+amount;
    }





    public void print(){
        System.out.println("\t\t"+current);
    }




}
