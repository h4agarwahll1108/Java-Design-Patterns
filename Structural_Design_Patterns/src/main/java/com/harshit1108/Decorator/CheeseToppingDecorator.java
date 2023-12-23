package com.harshit1108.Decorator;
// Concrete Decorator
import java.math.BigDecimal;

public class CheeseToppingDecorator extends PizzaDecorator {

    public CheeseToppingDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"cheese";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(BigDecimal.valueOf(10));
    }
}
