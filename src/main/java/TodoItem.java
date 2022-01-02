import java.time.LocalDate;

public class TodoItem extends Person {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;

    public TodoItem(int id1, String title, String taskDescription, LocalDate deadLine, boolean done) {
        super(id, );
        this.id = id1;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
    }
}
