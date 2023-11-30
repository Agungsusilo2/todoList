package View;

import BussinessLogic.AddTodoList;

import java.util.Objects;
import java.util.Scanner;

public class ViewAddTodoList {
    public static void viewAddTodoList(){
        System.out.println("Menambah TODO");

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Todo (x untuk membatalkan) :");
        String input = inputUser.nextLine();

        if(Objects.equals(input, "x")){
            System.out.println("Batal menambah TODO");
        }else {
            AddTodoList.addTodoList(input);
        }
    }
}
