package com.harshit1108.Strategy;

public class SubtractOperation implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1-num2;
    }
}
