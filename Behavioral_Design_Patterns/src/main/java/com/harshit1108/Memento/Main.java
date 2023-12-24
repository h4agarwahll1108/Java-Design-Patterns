package com.harshit1108.Memento;

/**
 * Memento pattern is a behavioral design pattern.
 * Memento pattern is used to restore state of an object to a previous state.
 * As your application is progressing, you may want to save checkpoints in your application and
 * restore back to those checkpoints later.
 * Intent of Memento Design pattern is without violating encapsulation, capture and
 * externalize an object’s internal state so that the object can be restored to this state later.
 */
public class Main {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1"); //this state not saved to memento.

        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4"); //this state not saved to memento.
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
