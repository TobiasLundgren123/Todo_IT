package DAO;


import Sequencers.PersonIdSequencer;

import java.util.Collection;

public class PersonDAOCollection implements PersonDAO{

    private Collection<Person> persons;

    @Override
    public Person persist(Person person) {
        int id = PersonIdSequencer.nextId();

        Person person = new Person(id, )        //TODO
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
        return Collection<Person>(persons);
    }

    @Override
    public void remove(int id) {

        persons.remove(id);

    }
}
