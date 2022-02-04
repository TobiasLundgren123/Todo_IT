package org.example.dao;

import org.example.TodoItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

public class TodoItemDAOCollection implements TodoItemDAO{

    private HashSet<TodoItem> todoItems;

    @Override
    public TodoItem persist(TodoItem todoItem) {
        return todoItems.add(todoItem) ? todoItem : null;
    }

    @Override
    public TodoItem findById(int id) {

        for (TodoItem todoitem : todoItems) {
            if (todoitem.getId() == (id)){
                return todoitem;
            }
        }

        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new HashSet<>(todoItems);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {

        Collection<TodoItem> found = new HashSet<>();


        for (TodoItem items : todoItems) {
            if (items.isDone()) {
                found.add(items);
            }
        }

        return found;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {

        Collection<TodoItem> foundMatches = new HashSet<>();

        for (TodoItem items : todoItems) {
            if (items.getTitle().trim().toLowerCase().contains(title.trim().toLowerCase())) {
                foundMatches.add(items);
            }
        }

        return foundMatches;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int id) {

        Collection<TodoItem> foundMatches = new HashSet<>();

        for (TodoItem items : todoItems
        ) {
            if (items.getCreator().equals(id)) {
                foundMatches.add(items);
            }
        }

        return foundMatches;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {

        Collection<TodoItem> found = new HashSet<>();

        for (TodoItem items :
                todoItems) {
            if (items.getDeadLine().isAfter(date)){
                found.add(items);
            }
        }
        return found;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {

        Collection<TodoItem> found = new HashSet<>();

        for (TodoItem items :
                todoItems) {
            if (items.getDeadLine().isBefore(date)){
                found.add(items);
            }
        }
        return found;
    }

    @Override
    public void remove(int id) {

        todoItems.remove(id);

    }
}
