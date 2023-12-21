package com.harshit1108.Factory_Method;
//concrete product
public class GamingBook implements Book{

    @Override
    public void displayInfo() {
        System.out.println("Gaming book based on game...");
    }
}
