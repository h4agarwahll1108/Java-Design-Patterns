package com.harshit1108.Open_Closed_Principle;

//Open for extension closed for modification.
public abstract class Subscriber {

    protected int id;
    protected String name;
    protected double baseRate;

    abstract double calulateBill(); //open for extension

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }
}
