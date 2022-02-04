package org.example.dao;


import org.example.Person;
import org.example.sequencers.PersonIdSequencer;


import java.util.Collection;
import java.util.HashSet;

public class PersonDAOCollection implements PersonDAO{

    private HashSet<Person> persons;

    @Override
    public Person persist(Person person) {
        return persons.add(person) ? person : null;
    }



    @Override
    public Person findById(int id) {

        for (Person person : persons) {
            if (person.getId() == (id)){
                return person;
            }
        }


        return null;
    }

    @Override
    public Person findByEmail(String email) {

        for (Person person : persons) {
            if (person.getEmail().equals(email)){
                return person;
            }
        }

        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return new HashSet<>(persons);
    }

    @Override
    public void remove(int id) {

        persons.remove(id);

    }
}
