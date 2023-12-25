package com.harshit1108.Template;

public class Football extends Game{

    @Override
    void initialize() {
        System.out.println("Football Game initialize...");
    }

    @Override
    void startPlay() {
        System.out.println("Game Started...");
    }

    @Override
    void stopPlay() {
        System.out.println("Game Stopped...");
    }
}
