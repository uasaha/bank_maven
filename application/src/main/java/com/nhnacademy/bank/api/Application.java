package com.nhnacademy.bank.api;

import com.nhnacademy.bank.client.Atm;

import java.math.BigDecimal;

public class Application {

    private static final Long ACCOUNT_NUMBER = 123L;

    public static void main(String[] args) {
        System.out.println("##########################\n" + "${여운석}\n"+ "##########################");

        Atm atm = new Atm();
        boolean rt = atm.deposit(BigDecimal.valueOf(100.1), ACCOUNT_NUMBER);
        System.out.println(rt);
    }
}