package com.harshit1108.Liskov_Substitution_Principle.Solution;

public class Rectangle implements Shape{

    private int height;

    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int computeArea() {
        return height*width;
    }
}
