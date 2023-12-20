package com.harshit1108.Single_Responsibility_Principle;

import java.math.BigDecimal;

public class TransactionOperation {

    public void deposit(BigDecimal amount, Long accountNumber){
        AccountOperation accountList = new AccountOperation();
        Account account=  accountList.getAccount(accountNumber);
        account.setAmount(account.getAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, Long accountNumber){
        AccountOperation accountList = new AccountOperation();
        Account account=  accountList.getAccount(accountNumber);
        account.setAmount(account.getAmount().subtract(amount));
    }
}
