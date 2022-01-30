package DAO;

import java.util.Collection;

public interface PersonDAO<Person> {

Person persist(Person person);
Person findById(int id);
Person findByEmail(String email);
Collection<Person> findAll();
void remove(int id);
}
