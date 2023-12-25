package com.harshit1108.Template;

public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void stopPlay();

    public void play(){
        initialize();
        startPlay();
        stopPlay();
    }
}
