package com.harshit1108.Simple_Factory;

//productB
public class InstagramPost implements Post{

    @Override
    public void perform() {
        System.out.println("Instagram Post Created....");
    }
}
