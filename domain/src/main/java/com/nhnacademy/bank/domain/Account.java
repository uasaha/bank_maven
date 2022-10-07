package com.nhnacademy.bank.domain;

public class Account {
    public boolean deposit(Money money){
        System.out.println("Deposit: " + money.toString());
        return true;
    }

    public boolean withDraw(Money money){
        System.out.println("WithDraw: " + money.toString());

        return true;
    }
}