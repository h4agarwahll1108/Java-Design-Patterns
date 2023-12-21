package com.harshit1108.Factory_Method;
//concrete product
public class MysteryBook implements Book{

    @Override
    public void displayInfo() {
        System.out.println("MysteryBook created Book...");
    }
}
