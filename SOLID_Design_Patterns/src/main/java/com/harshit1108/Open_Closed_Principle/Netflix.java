package com.harshit1108.Open_Closed_Principle;

public class Netflix extends Subscriber{

    private double rate;

    public Netflix(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    double calulateBill() {
        double result= rate+baseRate;
        System.out.println("Total amount : "+ result);
        return result;

    }
}
