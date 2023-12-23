package com.harshit1108.Proxy;
//Real Subject
public class RealImage implements Image{

    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Image is loaded...");
    }

    @Override
    public void displayImage() {
        System.out.println("Display Image : " + fileName);

    }
}
