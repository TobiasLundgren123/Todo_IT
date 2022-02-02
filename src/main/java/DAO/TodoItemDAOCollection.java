package DAO;

import java.time.LocalDate;
import java.util.HashSet;

public class TodoItemDAOCollection implements TodoItemDAO{

    private Collection<TodoItem> todoItems;

    @Override
    public TodoItem persist(TodoItem todoItem) {
        return null;                                     //TODO
    }

    @Override
    public TodoItem findById(int id) {

        for (TodoItem todoitem : todoItems) {
            if (TodoItem.getId().equals(id)){
                return todoitem;
            }
        }

        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return Collection<TodoItem>(todoItems);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {

        Collection<TodoItem> found = new HashSet<>();


        for (TodoItem items : todoItems) {
            if (items.isDone) {                         //fel? (items.done)
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
            if (items.getCreator().matches(id)) {
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
            if (items.deadLine().isAfter(date)){
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
            if (items.deadLine().isBefore(date)){
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
