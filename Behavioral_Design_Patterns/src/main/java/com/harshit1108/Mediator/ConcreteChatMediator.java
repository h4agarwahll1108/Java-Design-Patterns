package com.harshit1108.Mediator;
//Concrete Mediator
import java.util.ArrayList;
import java.util.List;

public class ConcreteChatMediator  implements ChatMediator{

    private final List<User> users;

    public ConcreteChatMediator() {
        this.users =  new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            //Message will not receive by the user who s sending it.
             if(u != user) {
                 u.receive(msg);
             }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
