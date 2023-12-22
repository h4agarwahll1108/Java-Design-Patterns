package com.harshit1108.Bridge;
// Concrete Implementor Class
public class Headphones implements AudioOutput {
    @Override
    public void configureAudio() {
        System.out.println("Configure Audio for headphone...");

    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio through headphone...");

    }

    @Override
    public void stopAudio() {
        System.out.println("Stopping audio from headphone...");

    }
}
