package DAO;

import java.time.LocalDate;

public interface TodoItemDAO {

    private Collection<TodoItem> toDoItems;
    TodoItem persist(TodoItem todoItem);
    TodoItem findById(int id);
    Collection<TodoItem> findAll();
    Collection<TodoItem> findAllByDoneStatus(boolean done);
    Collection<TodoItem> findByTitleContains(String title);
    Collection<TodoItem> findByPersonId(int id);
    Collection<TodoItem> findByDeadlineBefore(LocalDate date);
    Collection<TodoItem> findByDeadlineAfter(LocalDate date);

    void remove(int id);

}
