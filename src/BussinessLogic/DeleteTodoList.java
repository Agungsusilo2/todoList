package BussinessLogic;

import Model.TodoList;

public class DeleteTodoList {
    public static boolean deleteTodoList(Integer number) {
        if (number >= TodoList.todolist.length || number < 0) {
            return false;
        }

        for (int i = number-1; i < TodoList.todolist.length - 1; i++) {
            TodoList.todolist[i] = TodoList.todolist[i + 1];
        }
        TodoList.todolist[TodoList.todolist.length - 1] = null;

        return true;
    }
}
