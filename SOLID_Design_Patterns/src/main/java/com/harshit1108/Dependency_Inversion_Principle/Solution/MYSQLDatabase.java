package com.harshit1108.Dependency_Inversion_Principle.Solution;

public class MYSQLDatabase implements UserRepository {

    @Override
    public void saveUser(String username, String password) {
        System.out.println("MYSQL saved the user data");
    }
}
