package Model;

import java.time.LocalDate;

public class TodoList {
    private String addTask;
    private String description;
    private LocalDate dueDate;

    public TodoList() {
    }

    public TodoList(String addTask, String description, LocalDate dueDate) {
        this.addTask = addTask;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getAddTask() {
        return addTask;
    }

    public void setAddTask(String addTask) {
        this.addTask = addTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
    public static TodoList[] todoLists = new TodoList[10];
}
