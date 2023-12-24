package com.harshit1108.State;

/**
 * The state pattern is one of the behavioral design patterns.
 * A state design pattern is used when an Object changes its behavior based on its internal state.
 * If we have to change the behavior of an object based on its state,
 * we can have a state variable in the Object and use the if-else condition block to perform different actions based on the state.
 * The state pattern is used to provide a systematic and lose-coupled way to achieve this through Context and State implementations.
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
