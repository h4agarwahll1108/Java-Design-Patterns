package com.harshit1108.Command;

public class Invoker {
    protected Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed(){
        command.execute();
    }
}
