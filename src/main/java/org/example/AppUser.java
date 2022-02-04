package org.example;

import java.util.Objects;

public class AppUser {



    private String username;
    private String password;
    private AppRole role;

    public AppUser(String username, String password, AppRole role) {
        if (username.length()==0) throw new IllegalArgumentException("Username name was empty");
        else {
            this.username = username;
        }
        if (password.length()==0) throw new IllegalArgumentException("Password name was empty");
        else {
            this.password = password;
        }
//role not allowed to be null
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()==0) throw new IllegalArgumentException("Password name was empty");
        else {
            this.password = password;
        }
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return username.equals(appUser.username) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    @Override
    public String toString() {
        return "org.example.AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}
