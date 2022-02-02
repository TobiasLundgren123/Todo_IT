package DAO;

import java.util.HashSet;

public class TodoItemTaskDAOCollection implements TodoItemTaskDAO {

    private Collection<TodoItemTask> todoItemTasks;

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;                                            //ToDO
    }

    @Override
    public TodoItemTask findById(int id) {

        for (TodoItemTask todoitems : todoItemTasks) {
            if (TodoItemTask.getId().equals(id)){
                return todoitems;
            }
        }

        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return Collection<TodoItemTask>(todoItemTasks);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {

        Collection<TodoItemTask> found = new HashSet<>();


        for (TodoItemTask items : todoItemTasks) {
            if (items.isAssigned) {                         //fel? (items.done)
                found.add(items);
            }
        }

        return found;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int id) {
        Collection<TodoItemTask> foundMatches = new HashSet<>();

        for (TodoItemTask items : todoItemTasks) {

            if (items.getAssignee().matches(id)) {
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
