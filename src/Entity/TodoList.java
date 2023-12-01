package Entity;

import Domain.Categories;

import java.time.LocalDate;

public class TodoList {
    private String addTask;
    private String description;
    private LocalDate dueDate;
    private Categories categories;

    public TodoList() {
    }

    public TodoList(String addTask, String description, LocalDate dueDate , Categories categories) {
        this.addTask = addTask;
        this.description = description;
        this.dueDate = dueDate;
        this.categories = categories;
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

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
