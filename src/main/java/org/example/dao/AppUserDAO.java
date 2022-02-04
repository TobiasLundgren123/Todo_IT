package org.example.dao;

import org.example.AppUser;

import java.util.Collection;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);
    AppUser findByUsername(AppUser username);
    Collection<AppUser> findAll();
    void remove(AppUser username);

}
