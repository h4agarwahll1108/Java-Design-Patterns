package com.harshit1108.Bridge;
// Refined Abstraction Class
public class HomeMusicPlayer extends MusicPlayer {


    public HomeMusicPlayer(AudioOutput audioOutput) {
        super(audioOutput);
    }

    @Override
    void playMusic() {
        audioOutput.configureAudio();
        audioOutput.playAudio();
    }

    @Override
    void stopMusic() {
        audioOutput.stopAudio();
    }
}
