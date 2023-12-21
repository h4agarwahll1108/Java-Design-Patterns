package com.harshit1108.Builder.GOF;

// So to achieve GOF we have following components as part builder pattern.
// Product - Which we are building
// AbstractBuilder - Which is helpful to provide the product
// Concrete builder : It is actual builder which helps us to provide specific representation of the object.
// Director : Which uses this concrete builder and provides the result.
public class Main {

    public static void main(String[] args) {

        //Director object created
        PizzaDirector director = new PizzaDirector();

        // Create Veg Pizza
        //Builder reference use to create concrete builder object
        PizzaBuilder vegPizzaBuilder = new VegPizzaBuilder();
        //creating Pizza using director(pizzabuilder)--return build.
        Pizza vegPizza = director.createPizza(vegPizzaBuilder.crust("Thin").sauce("Tomato").toppings("Cheese, veggies"));
        System.out.println("Veg Pizza: " + vegPizza);

        // Create Non-Veg Pizza
        //Builder reference use to create concrete builder object
        PizzaBuilder nonVegPizzaBuilder = new NonVegPizzaBuilder();
        //creating Pizza using director(pizzabuilder)--return build.
        Pizza nonVegPizza = director.createPizza(nonVegPizzaBuilder.crust("Thick").sauce("BBQ").toppings("Cheese"));
        System.out.println("Non-Veg Pizza: " + nonVegPizza);
    }
}
