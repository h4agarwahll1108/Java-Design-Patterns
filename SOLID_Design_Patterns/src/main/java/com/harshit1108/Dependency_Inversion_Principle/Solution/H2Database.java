package com.harshit1108.Dependency_Inversion_Principle.Solution;

public class H2Database implements UserRepository{

    @Override
    public void saveUser(String username, String password) {
        System.out.println("H2Database save the User data");

    }
}
