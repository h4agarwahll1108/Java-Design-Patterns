package com.harshit1108.Observer;
/**
 * Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple
 * objects about any events that happen to the object they’re observing.
 *
 * Reference: https://refactoring.guru/design-patterns/observer
 *            https://www.baeldung.com/java-observer-pattern
 *
 */
public class Main {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency(); //Observable
        ABPNewsChannel abpNewsChannel = new ABPNewsChannel(); //Observer

        newsAgency.addObserver(abpNewsChannel);
        newsAgency.setNews("NEWS1");

        System.out.println(abpNewsChannel.getNews());

    }

}
