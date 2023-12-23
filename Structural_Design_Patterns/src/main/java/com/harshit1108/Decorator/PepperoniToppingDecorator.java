package com.harshit1108.Decorator;
// Concrete Decorator
import java.math.BigDecimal;

public class PepperoniToppingDecorator extends PizzaDecorator{

    public PepperoniToppingDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Pepperoni";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(BigDecimal.valueOf(5));
    }
}
