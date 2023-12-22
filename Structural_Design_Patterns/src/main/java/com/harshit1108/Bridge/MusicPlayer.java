package com.harshit1108.Bridge;
// Abstraction Layer
public abstract class MusicPlayer {

    protected AudioOutput audioOutput;

    public MusicPlayer(AudioOutput audioOutput) {
        this.audioOutput = audioOutput;
    }

    abstract void playMusic();
    abstract void stopMusic();

}
