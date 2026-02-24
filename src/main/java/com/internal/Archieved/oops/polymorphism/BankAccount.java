package com.internal.Archieved.oops.polymorphism;

public class BankAccount {

    private int balance  = 0;

    public void deposit(int intialBalance){
        this.balance = intialBalance;
    }
    public int withdraw(){
            return balance;
    }
}
