package View;

import Domain.Categories;
import Entity.TodoList;
import Service.TodoListServiceImp;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ViewTodoList {
    private TodoListServiceImp todoListServiceImp;

    public ViewTodoList(TodoListServiceImp todoListServiceImp) {
        this.todoListServiceImp = todoListServiceImp;
    }


    private  void addTodoList(){
        System.out.println("MENAMBAH TODO");
        Scanner input = new Scanner(System.in);
        System.out.println("===========================++++++++===========");
        System.out.println("Silahkan Anda ketik todo (x untuk keluar)");
        System.out.println("Task | Description | dueDate | Categories");
        System.out.println("===========================++++++++===========");
        System.out.print("Task : ");
        String inputTask = input.nextLine();

        System.out.print("Description : ");
        String inputDescription = input.nextLine();

        System.out.print("dueDate (yyyy-MM-dd) : ");
        String inputDueDate = input.nextLine();

        Categories[] categories = Categories.values();

        Integer i = 1;
        for (var category : categories){
            System.out.println(i+". "+category);
            i++;
        }

        System.out.print("Categories : ");
        String inputCategory = input.nextLine();

        if (Objects.equals(inputTask, "x")) {
            System.out.println("Batal membuat TODO");
        } else {

            LocalDate dueDate = LocalDate.parse(inputDueDate);

            Categories category = Categories.valueOf(inputCategory.toUpperCase());

            this.todoListServiceImp.AddTodoListService(new TodoList(inputTask, inputDescription, dueDate, category));
        }

    }


    private void deleteTodoList(){
        System.out.println("Menghapus TODO");

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Todo (x untuk membatalkan) :");
        String input = inputUser.nextLine();

        if(Objects.equals(input, "x")){
            System.out.println("Batal Menghapus TODO");
        }else {
            boolean success =  this.todoListServiceImp.RemoveTodoListService(Integer.parseInt(input));
            if (success){
                System.out.println("Berhasil Menghapus TODO "+input);
            }else {
                System.out.println("Gagal Menghapus TODO " + input);
            }
        }
    }
    public void viewTodoList() {
        Scanner input = new Scanner(System.in);
            while (true) {
                try {
                    this.todoListServiceImp.ShowTodoListService();

                    System.out.println("Menu ");
                    System.out.println("1. Tambah Todo");
                    System.out.println("2. Hapus Todo");
                    System.out.println("x. Keluar Todo");

                    System.out.print("Silahkan Masukkan Pilihan : ");
                    String inputUser = input.nextLine();

                    if (Objects.equals(inputUser, "1")) {
                        this.addTodoList();
                    } else if (Objects.equals(inputUser, "2")) {
                        this.deleteTodoList();
                    } else if (Objects.equals(inputUser, "x")) {
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                } catch (InputMismatchException inputMismatchException) {
                    throw new RuntimeException(inputMismatchException.getMessage());
                }
                input.nextLine();
            }

            input.close();
            System.out.println("Terima kasih!");
    }
}
