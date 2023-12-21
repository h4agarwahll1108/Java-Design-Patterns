package com.harshit1108.Builder.GOF;

// Concrete builder for Non-Veg Pizza
class NonVegPizzaBuilder implements PizzaBuilder {
    private String crust;
    private String sauce;
    private String toppings;

    @Override
    public PizzaBuilder crust(String crust) {
        this.crust = crust;
        return this;
    }

    @Override
    public PizzaBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder toppings(String toppings) {
        this.toppings = toppings + " (with chicken)";
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(crust, sauce, toppings);
    }
}