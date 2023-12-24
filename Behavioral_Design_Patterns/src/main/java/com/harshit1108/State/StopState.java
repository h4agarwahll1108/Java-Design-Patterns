package com.harshit1108.State;

public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is Stopped...");
        context.setState(this);
    }
    @Override
    public String toString() {
        return "Stop State";
    }
}
