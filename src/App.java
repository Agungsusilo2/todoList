import Repository.TodoListRepositoryImp;
import Service.TodoListServiceImp;
import View.ViewTodoList;

public class App {
    public static void main(String[] args) {
        System.out.println("APLIKASI TODO");
        ViewTodoList viewTodoList = new ViewTodoList(new TodoListServiceImp(new TodoListRepositoryImp()));
        viewTodoList.viewTodoList();
    }
}