package com.harshit1108.Strategy;

public class Content {

    private Strategy strategy;

    public Content(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return  strategy.doOperation(num1, num2);
    }
}
