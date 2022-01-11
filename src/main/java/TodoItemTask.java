public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        this.id = id;
        if (assignee == null) {
            this.assigned = false;
        } else {
            this.assigned = true;
        }
        if (todoItem==null) {
            System.out.println("TodoItem not allowed to be empty");
        } else {
            this.todoItem = todoItem; }
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void getSummary() {

        System.out.println("Id: " + this.id + ". TodoItemTask: " + this.todoItem + " has been assigned? " + this.assigned + " by: " + this.assignee);

    }
}
