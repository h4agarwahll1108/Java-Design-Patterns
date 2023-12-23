package com.harshit1108.Flyweight.simple;

// Concrete Flyweight
class ConcreteCharacter implements Character {
    private  char intrinsicState; // Intrinsic state

    public ConcreteCharacter(char intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void display(int position) {
        System.out.println("Character " + intrinsicState + " at position " + position);
    }
}