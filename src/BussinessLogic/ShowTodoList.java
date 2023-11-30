package BussinessLogic;

import Model.TodoList;

import java.time.LocalDate;

public class ShowTodoList {
   public static void showTodoList(){

       System.out.println("TODOLIST ");

       Integer i = 0;
       for (var todo : TodoList.todoLists){
           if(todo != null){
               String dueDateString = todo.getDueDate().toString();
               System.out.println(i+1 +". "+todo.getAddTask() + " : " +todo.getDescription()+ " - Due Date : " +dueDateString);
               i++;
           }
       }
   }
}
