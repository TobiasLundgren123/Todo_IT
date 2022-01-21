import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    Person personOne = new Person(1, "Bo", "asd", "bosse.larsson@mail.se");
    Person personTwo = new Person(2, "Kurt", "Johansson", "coola_kurt@hotmail.com");


        TodoItem todoItemOne = new TodoItem(3,"Clean", "Use soap", LocalDate.of(2020, 1,11), false, personOne);


        todoItemOne.isOverdue();

        TodoItemTask todoItemTask1 = new TodoItemTask(6,false, todoItemOne, personOne);
        todoItemTask1.getSummary();
        AppUser appuser = new AppUser("Test", "1234", AppUser.AppRole.ROLE_APP_ADMIN);
        System.out.println(appuser.getRole());
        System.out.println(appuser.getPassword());
        System.out.println(appuser.getUsername());
        System.out.println(personOne.toString());

        personOne.setCredentials(personOne.getCredentials());
        System.out.println(personOne.getCredentials());


    }

}
