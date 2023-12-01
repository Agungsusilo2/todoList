package Repository;

import Entity.TodoList;

public interface TodoListRepository {
    void save(TodoList todoList);
    boolean delete(Integer number);
    TodoList[] findAll();
}

