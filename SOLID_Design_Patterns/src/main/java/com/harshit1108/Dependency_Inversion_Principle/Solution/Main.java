package com.harshit1108.Dependency_Inversion_Principle.Solution;

public class Main {

    public static void main(String[] args) {
        //Create Object for low level modules
        UserRepository typeOfDatabaseUsing = new MYSQLDatabase();
        //UserRepository typeOfDatabaseUsing = new H2Database();
        //create object for high level module
        RegisterUser user = new RegisterUser(typeOfDatabaseUsing);
        user.registerUser("h4agarwahll@gmail.com", "password");
    }
}
