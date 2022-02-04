package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;
    private Collection<Person> persons;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;

            if (firstName.length()==0) throw new IllegalArgumentException("First name was empty");
         else {
            this.firstName = firstName;
        }
         if (lastName.length()==0) throw new IllegalArgumentException("Last name was empty");
         else {
            this.lastName = lastName; }
        if (email.length()==0) throw new IllegalArgumentException("Last name was empty");
        else {
            this.email = email;
        }
        persons = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }




    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }




    @Override
    public String toString() {
        return "org.example.Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && firstName.equals(person.firstName) && lastName.equals(person.lastName) && email.equals(person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}
