package com.harshit1108.Proxy;
//Proxy
public class Proxy implements Image{
    private RealImage realImage;
    private  final String fileName;

    public Proxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}
