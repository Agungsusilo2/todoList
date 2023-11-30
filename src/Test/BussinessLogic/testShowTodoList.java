package Test.BussinessLogic;

import BussinessLogic.AddTodoList;
import BussinessLogic.ShowTodoList;
import Model.TodoList;

public class testShowTodoList {
    public static void main(String[] args) {
        TodoList.todolist[0] = "Belajar PHP";
        TodoList.todolist[1] = "Belajar JavaScript";
        ShowTodoList.showTodoList();
    }
}
