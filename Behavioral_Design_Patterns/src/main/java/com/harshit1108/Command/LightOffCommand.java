package com.harshit1108.Command;

public class LightOffCommand implements Command {

    protected Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.OFF();

    }
}
