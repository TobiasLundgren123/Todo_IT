package org.example.dao;

import org.example.AppUser;

import java.util.Collection;
import java.util.HashSet;

public class AppUserDAOCollection implements AppUserDAO{

    private HashSet<AppUser> appUsers;
    @Override
    public AppUser persist(AppUser appUser) {

        return appUsers.add(appUser) ? appUser : null;

    }

    @Override
    public AppUser findByUsername(AppUser username) {

        for (AppUser appuser : appUsers) {
            if (appuser.getUsername().equals(username)){
                return appuser;
            }
        }

        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return new HashSet<>(appUsers);
    }

    @Override
    public void remove(AppUser username) {
        appUsers.remove(username);
    }
}
