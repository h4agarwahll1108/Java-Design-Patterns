package com.harshit1108.Open_Closed_Principle;

public class Main {

    public static void main(String[] args) {

        Subscriber user1 =  new Amazon(100);
        user1.setId(1);
        user1.setName("Harshit");
        user1.setBaseRate(25d);
        user1.calulateBill();

        Subscriber user2 =  new Netflix(200);
        user2.setId(2);
        user2.setName("Shivangi");
        user2.setBaseRate(50d);
        user2.calulateBill();

    }
}