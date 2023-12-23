package com.harshit1108.Decorator;
// Concrete Component
import java.math.BigDecimal;

public class BasePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Base Pizza";
    }

    @Override
    public BigDecimal getCost() {
        return BigDecimal.valueOf(25);
    }
}
