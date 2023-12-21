package com.harshit1108.Dependency_Inversion_Principle.Problem;
//Low-level-Module
public class Database {

    public void saveUser(String username, String password){
        System.out.println("User is saved to database");
    }
}
