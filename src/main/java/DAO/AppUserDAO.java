package DAO;

public interface AppUserDAO {

    AppUser persist(AppUser appUser);
    AppUser findByUsername(AppUser username);
    Collection<AppUser> findAll();
    void remove(AppUser username);

}
