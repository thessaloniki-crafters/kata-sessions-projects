package model;

import java.util.Collection;
import java.util.HashSet;

public class Bank   {

    private Collection<Account> accounts;

    public Bank(){
        accounts = new HashSet<>();
    }

    public void addUser(Account account){
        accounts.add(account);
    }

    public void print(){
    accounts.forEach(Account::print);
    }

}
