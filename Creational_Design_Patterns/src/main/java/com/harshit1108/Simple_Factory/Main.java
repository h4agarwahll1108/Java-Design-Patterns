package com.harshit1108.Simple_Factory;

public class Main {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();

        Post instagram = simpleFactory.createPost("instagram");
        Post facebook = simpleFactory.createPost("facebook");
        instagram.perform();
        facebook.perform();
    }
}
