public class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        if (firstName.length()==0) {
            System.out.println("First name not allowed to be empty");
        } else {
            this.firstName = firstName;
        }
        if (lastName.length()==0) {
            System.out.println("Last name not allowed to be empty");
                    } else {
            this.lastName = lastName; }
        if (email.length()==0) {
            System.out.println("Email not allowed to be empty");
        } else {
            this.email = email;
        }
    }

    public int getId() {
        return id;
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

    public void getSummary() {

        System.out.println("Id: " + this.id + ". Name: " + this.firstName + " " + this.lastName + " email: " + this.email);

    }
}
