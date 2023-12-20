package com.harshit1108.Single_Responsibility_Principle;

import java.math.BigDecimal;

public class Account {

    private Long accountNumber;
    private String name;
    private BigDecimal amount;


    public Account(Long accountNumber, String name, BigDecimal amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}