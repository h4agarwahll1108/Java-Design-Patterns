package com.harshit1108.Prototype;
// Abstract Prototype class

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle implements Cloneable {
    protected String brand;
    protected List<String> features;

    public Vehicle(String brand, List<String> features) {
        this.brand = brand;
        this.features = new ArrayList<>(features); // Initialize with a mutable collection
    }

    public abstract Vehicle shallowClone();
    public abstract Vehicle deepClone();

    public void displayInfo() {
        System.out.println("Vehicle: " + brand);
        System.out.println("Features: " + features);
    }

    public List<String> getFeatures() {
        return features;
    }

    @Override
    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
