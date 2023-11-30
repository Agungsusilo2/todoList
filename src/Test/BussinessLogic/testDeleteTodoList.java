package Test.BussinessLogic;

import BussinessLogic.AddTodoList;
import BussinessLogic.DeleteTodoList;
import BussinessLogic.ShowTodoList;

public class testDeleteTodoList {
    public static void main(String[] args) {
        AddTodoList.addTodoList("Belajar JavaScript");
        AddTodoList.addTodoList("Belajar Node Js");
        AddTodoList.addTodoList("Belajar PHP");

        ShowTodoList.showTodoList();
        DeleteTodoList.deleteTodoList(2);

        ShowTodoList.showTodoList();
    }
}
