package com.harshit1108.Command;

public class FridgeOnCommand implements Command{

    protected Fridge fridge;

    public FridgeOnCommand(Fridge fridge) {
        this.fridge = fridge;
    }

    @Override
    public void execute() {
      fridge.ON();
      fridge.Temp();
      fridge.Voltage();
    }
}
