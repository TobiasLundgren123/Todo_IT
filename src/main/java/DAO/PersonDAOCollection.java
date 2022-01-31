package DAO;


import Sequencers.PersonIdSequencer;

import java.util.Collection;

public class PersonDAOCollection implements PersonDAO{

    private Collection<Person> Person;

    @Override
    public Person persist(Person person) {
        int id = PersonIdSequencer.nextId();
        return null;
    }

    @Override
    public Person findById(int id) {

        for (Person person : persons) {
            if (Person.getId().equals(id)){
                return person;
            }
        }


        return null;
    }

    @Override
    public Person findByEmail(String email) {

        for (Person person : persons) {
            if (Person.getEmail().equals(email)){
                return person;
            }
        }

        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return Collection<Person>;
    }

    @Override
    public void remove(int id) {

        Person.remove(id);

    }
}
