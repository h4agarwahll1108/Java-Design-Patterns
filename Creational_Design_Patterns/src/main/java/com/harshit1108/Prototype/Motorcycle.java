package com.harshit1108.Prototype;

import java.util.ArrayList;
import java.util.List;

class Motorcycle extends Vehicle {

    public Motorcycle(String brand, List<String> features) {
        super(brand, features);
    }

    @Override
    public Vehicle shallowClone() {
        return (Vehicle) super.clone();
    }

    @Override
    public Vehicle deepClone() {
        List<String> clonedFeatures = List.copyOf(features);
        return new Motorcycle(new String(brand), clonedFeatures);
    }
}
