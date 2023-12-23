package com.harshit1108.Decorator;
// Decorator
import java.math.BigDecimal;

public class PizzaDecorator implements Pizza{

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost();
    }
}
