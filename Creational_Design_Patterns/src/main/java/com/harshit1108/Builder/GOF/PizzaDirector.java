package com.harshit1108.Builder.GOF;

// Director class
class PizzaDirector {
    public Pizza createPizza(PizzaBuilder builder) {
        return builder.build();
    }
}
