package com.harshit1108.Single_Responsibility_Principle;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(101L,"Harshit", BigDecimal.valueOf(3000));
        AccountOperation accountList =  new AccountOperation();
        accountList.addAccount(account);
        System.out.println(account);
        System.out.println(accountList);
        TransactionOperation transaction = new TransactionOperation();
        transaction.deposit(BigDecimal.valueOf(1500),101L);

        System.out.println(account);
    }
}