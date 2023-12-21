package com.harshit1108.Dependency_Inversion_Principle.Problem;
//High-Level-Module
public class RegisterUser {
    // In future if database is change than it will create a problem.
    public Database database;

    public RegisterUser() {
        this.database = new Database();
    }

    public void registerUser(String username, String password){
        database.saveUser(username,password);
    }
}
