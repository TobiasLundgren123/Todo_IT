import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    Person personOne = new Person(1, "Bosse", "", "bosse.larsson@mail.se");
    Person personTwo = new Person(2, "Kurt", "Johansson", "coola_kurt@hotmail.com");

        personOne.getSummary();
        personTwo.getSummary();

        TodoItem todoItemOne = new TodoItem(3,"Clean", "Use soap", LocalDate.of(2020,01,11), false, personOne);


        todoItemOne.isOverdue();
    }

}
