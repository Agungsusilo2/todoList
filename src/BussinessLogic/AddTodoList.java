package BussinessLogic;

import Model.TodoList;

public class AddTodoList {
    public static void addTodoList(TodoList todo){
        int currentIndex = 0;
        boolean added = false;
        while (currentIndex < TodoList.todoLists.length && !added) {
            if (TodoList.todoLists[currentIndex] == null) {
                TodoList.todoLists[currentIndex] = todo;
                added = true;
            }
            currentIndex++;
        }
        if (!added) {
            throw new RuntimeException("Tidak Bisa Ditambahkan lagi karena sudah penuh kapasitasnya!!");
        }
    }
}
