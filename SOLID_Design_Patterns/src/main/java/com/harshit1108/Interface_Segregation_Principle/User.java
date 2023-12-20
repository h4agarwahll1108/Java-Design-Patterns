package com.harshit1108.Interface_Segregation_Principle;

import java.time.LocalDateTime;

public class User extends Entity {

    private String username;

    private LocalDateTime lastLogin;

    public User(String username, LocalDateTime lastLogin) {
        this.username = username;
        this.lastLogin = lastLogin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "User{" +
                "username=" + username +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
