package com.harshit1108.Command;
/**
 * Command is a behavioral design pattern that turns a request into a stand-alone object that contains all
 * information about the request. This transformation lets you pass requests as a method arguments, delay
 * or queue a request’s execution, and support undoable operations.
 *
 * Reference: https://refactoring.guru/design-patterns/command
 * 			  https://www.baeldung.com/java-command-pattern
 * Problem is when remote button is pressed it will on/off the device it is good in case of light
 * but in case of fridge with on/off have to do other things also like set temp, voltage;
 * so client use the invoker to set the command and when the invoker button pressed
 * based on the type of object command it will execute
 */
public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Light light =  new Light();

        invoker.setCommand(new LightOnCommand(light));

        invoker.buttonPressed();

        invoker.setCommand(new LightOffCommand(light));

        invoker.buttonPressed();

        System.out.println("*****************************************************");

        //Now if we have fridge but for operating fridge commands are different.

        Fridge fridge = new Fridge();

        invoker.setCommand(new FridgeOnCommand(fridge));
        invoker.buttonPressed();

    }
}
