package com.harshit1108.Single_Responsibility_Principle;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountOperation{

    private static Map<Long,Account> accountlist = new HashMap<>();

    public void addAccount(Account account){
        accountlist.put(account.getAccountNumber(),account);
        System.out.println(accountlist);
    }

    public void updateAccount(Long accountNumber, Account account) {
        if (accountNumber.equals(account.getAccountNumber())) {
            accountlist.put(accountNumber, account);
        } else {
            System.out.println("No Account found with this account number");
        }
    }

        public void removeAccount(Long accountNumber){
            accountlist.remove(accountNumber);
        }

        public Account getAccount(Long accountNumber){
        return accountlist.get(accountNumber);
        }

        //public void deposite(BigDecimal amount, Long accountNumber){}
        //This is something related to transacton management system so it will not come in account operation class
}