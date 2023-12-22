package com.harshit1108.Bridge;
// Refined Abstraction Class
public class PortableMusicPlayer extends MusicPlayer {

    public PortableMusicPlayer(AudioOutput audioOutput) {
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
