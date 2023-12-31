package Repository;

import Entity.TodoList;

import java.util.UUID;

public interface TodoListRepository {
    void save(TodoList todoList);
    boolean delete(Integer number);
    TodoList[] findAll();
    boolean update(UUID number, TodoList updateTodoList);
}

