package com.harshit1108.Builder.GOF;

// Builder interface
interface PizzaBuilder {
    PizzaBuilder crust(String crust);
    PizzaBuilder sauce(String sauce);
    PizzaBuilder toppings(String toppings);
    Pizza build();
}
