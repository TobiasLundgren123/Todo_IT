package DAO;

import java.time.LocalDate;

public class TodoItemDAOCollection implements TodoItemDAO{


    @Override
    public TodoItem persist(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItem findById(int id) {
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return null;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int id) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
