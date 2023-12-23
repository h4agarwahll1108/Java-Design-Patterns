package com.harshit1108.Flyweight.good;

public class CounterTerrorist implements Player{

    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "DEFUSE BOMB";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon " + weapon + "|" + " Task is " + TASK);
    }
}
