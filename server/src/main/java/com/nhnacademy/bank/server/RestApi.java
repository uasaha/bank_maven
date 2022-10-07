package com.nhnacademy.bank.server;

import com.nhnacademy.bank.domain.Account;
import com.nhnacademy.bank.domain.Money;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class RestApi {
    public boolean postAmount(Action action, Long accountNumber, BigDecimal amount ){
        System.out.println("Post amount: " + action + ", " + accountNumber + ", " + amount);

        Account account = new Account();

        if(Action.DEPOSIT == action){
            account.deposit(new Money(amount, Currency.getInstance(Locale.US)));
        } else if (Action.WITHDRAW == action) {
            account.withDraw(new Money(amount, Currency.getInstance(Locale.US)));
        }

        return true;
    }
}