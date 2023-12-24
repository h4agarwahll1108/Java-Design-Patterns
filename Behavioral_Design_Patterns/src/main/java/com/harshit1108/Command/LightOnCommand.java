package com.harshit1108.Command;

public class LightOnCommand implements Command{

    protected Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.ON();

    }
}
