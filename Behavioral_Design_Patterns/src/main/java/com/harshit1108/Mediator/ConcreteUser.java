package com.harshit1108.Mediator;
//ConcreteColleagueA Mediator
public class ConcreteUser extends User{

    public ConcreteUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    void send(String msg) {
        System.out.println(this.name + " Send message " + msg);
        chatMediator.sendMessage(msg,this);

    }

    @Override
    void receive(String msg) {
        System.out.println(this.name + " received message " + msg);
    }
}
