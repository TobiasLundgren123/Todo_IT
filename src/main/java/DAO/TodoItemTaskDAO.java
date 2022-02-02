package DAO;

import java.time.LocalDate;

public interface TodoItemTaskDAO {

    private Collection<TodoItemTask> todoItemTasks;
    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    Collection<TodoItemTask> findAll();
    Collection<TodoItemTask> findByAssignedStatus(boolean status);
    Collection<TodoItemTask> findByPersonId(int id);
    void remove(int id);

}
