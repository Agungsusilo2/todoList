package Test.BussinessLogic;

import BussinessLogic.AddTodoList;
import BussinessLogic.ShowTodoList;
import Model.TodoList;

public class testAddTodoList {
    private TodoList todoList;
    public static void main(String[] args) {
        AddTodoList.addTodoList(new TodoList()));

        ShowTodoList.showTodoList();
    }
}
