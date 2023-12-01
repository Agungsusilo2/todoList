package Service;

import Domain.Categories;
import Entity.TodoList;

public interface TodoListService {
    void ShowTodoListService();
    public void AddTodoListService(TodoList todoList);
    boolean RemoveTodoListService(Integer number);

}
