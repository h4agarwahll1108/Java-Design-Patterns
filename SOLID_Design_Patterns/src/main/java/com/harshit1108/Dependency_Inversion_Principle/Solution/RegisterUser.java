package com.harshit1108.Dependency_Inversion_Principle.Solution;

public class RegisterUser {

    private UserRepository userRepository;

    public RegisterUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username, String password){
        userRepository.saveUser(username, password);
    }
}
