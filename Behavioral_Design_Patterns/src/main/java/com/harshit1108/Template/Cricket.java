package com.harshit1108.Template;

public class Cricket extends Game {

    @Override
    void initialize() {
        System.out.println("Cricket Game initialize...");
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
