package org.example.dao;

import org.example.TodoItemTask;

import java.util.Collection;
import java.util.HashSet;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {

    private HashSet<TodoItemTask> todoItemTasks;

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return todoItemTasks.add(todoItemTask) ? todoItemTask : null;
    }

    @Override
    public TodoItemTask findById(int id) {

        for (TodoItemTask todoitemtask : todoItemTasks) {
            if (todoitemtask.getId() == (id)){
                return todoitemtask;
            }
        }

        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return new HashSet<>(todoItemTasks);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {

        Collection<TodoItemTask> found = new HashSet<>();


        for (TodoItemTask items : todoItemTasks) {
            if (items.isAssigned()) {                         //fel? (items.done)
                found.add(items);
            }
        }

        return found;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int id) {
        Collection<TodoItemTask> foundMatches = new HashSet<>();

        for (TodoItemTask items : todoItemTasks) {

            if (items.getAssignee().equals(id)) {
                foundMatches.add(items);
            }
        }

        return foundMatches;
    }

    @Override
    public void remove(int id) {

        todoItemTasks.remove(id);

    }
}
