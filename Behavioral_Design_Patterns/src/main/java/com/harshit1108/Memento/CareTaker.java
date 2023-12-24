package com.harshit1108.Memento;

import java.util.ArrayList;
import java.util.List;

//Func: to store the state of the memento.
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
