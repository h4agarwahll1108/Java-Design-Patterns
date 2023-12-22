package com.harshit1108.Bridge;
// Concrete Implementor Class
public class Speaker implements AudioOutput{
    @Override
    public void configureAudio() {
        System.out.println("Configure Audio for Speaker...");
    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio through Speaker...");
    }

    @Override
    public void stopAudio() {
        System.out.println("Stopping audio from Speaker...");
    }
}
