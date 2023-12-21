package com.harshit1108.Simple_Factory;

public class SimpleFactory {

    public Post createPost(String type){
        return switch (type.toLowerCase()) {
            case "instagram" -> new InstagramPost();
            case "facebook" -> new FacebookPost();
            default -> throw new IllegalArgumentException("Invalid task name :" + type);
        };
    }
}
