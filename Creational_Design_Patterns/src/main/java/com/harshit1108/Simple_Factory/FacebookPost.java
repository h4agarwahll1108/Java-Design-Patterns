package com.harshit1108.Simple_Factory;
//productA
public class FacebookPost implements Post{

    @Override
    public void perform() {
        System.out.println("Facebook post created....");
    }
}
