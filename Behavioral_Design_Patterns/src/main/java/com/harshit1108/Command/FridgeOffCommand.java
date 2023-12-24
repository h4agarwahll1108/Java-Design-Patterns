package com.harshit1108.Command;

public class FridgeOffCommand implements Command {

    protected Fridge fridge;

    public FridgeOffCommand(Fridge fridge) {
        this.fridge = fridge;
    }

    @Override
    public void execute() {
        fridge.OFF();

    }
}
