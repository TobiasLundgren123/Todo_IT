package org.example.dao;

import org.example.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDAO {

    TodoItemTask persist(TodoItemTask todoItemTask);
    TodoItemTask findById(int id);
    Collection<TodoItemTask> findAll();
    Collection<TodoItemTask> findByAssignedStatus(boolean status);
    Collection<TodoItemTask> findByPersonId(int id);
    void remove(int id);

}
