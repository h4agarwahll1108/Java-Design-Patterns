package com.harshit1108.Factory_Method;

//concrete creator
public class MysteryBookCreator implements BookCreator  {

    @Override
    public Book createBook() {
        return new MysteryBook();
    }
}
