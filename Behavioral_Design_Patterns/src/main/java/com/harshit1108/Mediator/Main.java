package com.harshit1108.Mediator;
/**
 * Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects.
 * The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.
 *
 * References: https://refactoring.guru/design-patterns/mediator
 *             https://www.digitalocean.com/community/tutorials/mediator-design-pattern-java
 * for our example
 * Colleague -> User
 * ConcreteColleague -> ConcreteUser
 * Mediator -> ChatMediator
 * ConcreteMediator -> concreteChatMediator (have list of all user)
 */
public class Main {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ConcreteChatMediator();
        User user1 = new ConcreteUser(chatMediator,"Harshit");
        User user2 = new ConcreteUser(chatMediator,"Aman");
        User user3 = new ConcreteUser(chatMediator,"Sagar");
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        user1.send("Hi Good Morning :)");

    }
}
