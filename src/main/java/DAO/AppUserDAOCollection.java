package DAO;

import java.util.Collection;

public class AppUserDAOCollection implements AppUserDAO{

    private Collection<AppUser> appUsers;
    @Override
    public AppUser persist(AppUser appUser) {

        return null;         //TODO
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
        return Collection<AppUser>(appUsers);
    }

    @Override
    public void remove(AppUser username) {
        appUsers.remove(username);
    }
}
