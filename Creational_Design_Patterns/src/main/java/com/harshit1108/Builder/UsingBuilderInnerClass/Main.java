package com.harshit1108.Builder.UsingBuilderInnerClass;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder()
                .tamato(true)
                .capsicum(true)
                .size("LARGE")
                .extraCheese(true)
                .onion(true)
                .mayonese(true)
                .build();

        System.out.println(pizza.toString());
    }
}
