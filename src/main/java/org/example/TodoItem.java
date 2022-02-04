package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {

    private int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        if (title.length()==0) throw new IllegalArgumentException("Title was empty");

        else {
            this.title = title;
        }
        this.taskDescription = taskDescription;
        if (deadLine==null) throw new IllegalArgumentException("Deadline was empty");
        else {
            this.deadLine = deadLine;
        }
        this.done = done;
        this.creator = creator;
         }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && title.equals(todoItem.title) && Objects.equals(taskDescription, todoItem.taskDescription) && deadLine.equals(todoItem.deadLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, taskDescription, deadLine, done);
    }

    @Override
    public String toString() {
        return "org.example.TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                '}';
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

