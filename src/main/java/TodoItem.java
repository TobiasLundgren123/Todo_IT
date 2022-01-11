import java.time.LocalDate;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        if (title.length() == 0) {
            System.out.println("Title not allowed to be empty");
        } else {
            this.title = title;
        }
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
         }

    public void getSummary() {

        System.out.println("Id: " + this.id + ". Title: " + this.title + " - " + this.taskDescription + ". Deadline: " + this.deadLine + ". Completed: " + done + ". Created by : " + creator);

    }

    public boolean isOverdue() {

        if (this.deadLine.isAfter(LocalDate.now())) {
            System.out.println("Deadline for " + this.title + " has passed.");
            return true;
        } else {
            System.out.println("Deadline for " + this.title + " has not passed.");
            return false;
        }

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public Person getCreator() {
        return creator;
    }
}

