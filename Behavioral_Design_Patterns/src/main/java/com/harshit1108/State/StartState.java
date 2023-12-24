package com.harshit1108.State;

public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is Started...");
        context.setState(this);
    }
    @Override
    public String toString() {
        return "StartState";
    }
}
