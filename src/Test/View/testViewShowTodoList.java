package Test.View;

import BussinessLogic.AddTodoList;
import View.ViewShowTodoList;

public class testViewShowTodoList {
    public static void main(String[] args) {
        AddTodoList.addTodoList("Belajar PHP");
        AddTodoList.addTodoList("Belajar nodeJS");
        AddTodoList.addTodoList("Belajar JavaScript");

        ViewShowTodoList.viewShowTodoList();
    }
}
