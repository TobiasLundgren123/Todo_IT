import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class TodoItemTest {

    @Test
    public void getSummary() {
    }

    @Test
    public void isOverdue() {
        Person personTest = new Person(4, "Bos", "AAA", "bosse.larsson@mail.se");
        TodoItem todoItemOne = new TodoItem(8,"Clean", "Use soap", LocalDate.of(2020, 1,11), false, personTest);
        assertEquals(false, false);

    }

    @Test
    public void getId() {
    }

    @Test
    public void getTitle() {
    }

    @Test
    public void getTaskDescription() {
    }

    @Test
    public void getDeadLine() {
    }

    @Test
    public void isDone() {
    }

    @Test
    public void getCreator() {
    }
}