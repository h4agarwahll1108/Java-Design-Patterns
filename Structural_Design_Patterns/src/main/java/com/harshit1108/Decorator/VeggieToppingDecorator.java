package com.harshit1108.Decorator;
// Concrete Decorator
import java.math.BigDecimal;

public class VeggieToppingDecorator extends PizzaDecorator{

    public VeggieToppingDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"Veggie";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(BigDecimal.valueOf(15));
    }
}
