package com.harshit1108.Factory_Method;

//concrete creater
public class GamingBookCreator implements BookCreator{

    @Override
    public Book createBook() {
        return new GamingBook();
    }
}
