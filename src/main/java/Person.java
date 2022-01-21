import java.util.Objects;

public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

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

    public void setFirstName(String firstName) {
        if (firstName.length()==0) throw new IllegalArgumentException("First name was empty");
        else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length()==0) throw new IllegalArgumentException("Last name was empty");
        else {
            this.lastName = lastName;
        }
    }

    public void setEmail(String email) {
        if (email.length()==0) throw new IllegalArgumentException("Last name was empty");
        else {
            this.email = email;
        }
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
        return "Person{" +
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
