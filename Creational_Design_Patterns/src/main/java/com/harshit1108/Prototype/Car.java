package com.harshit1108.Prototype;

import java.util.ArrayList;
import java.util.List;

// Concrete Prototype classes
public class Car extends Vehicle {

    public Car(String brand, List<String> features) {
        super(brand, features);
    }

    @Override
    public Vehicle shallowClone() {
        return (Vehicle) super.clone();
    }

    @Override
    public Vehicle deepClone() {
        List<String> clonedFeatures = List.copyOf(features);
        return new Car(brand, clonedFeatures);
    }
}

