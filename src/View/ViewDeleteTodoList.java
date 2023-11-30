package View;

import BussinessLogic.DeleteTodoList;
import BussinessLogic.ShowTodoList;

import java.util.Objects;
import java.util.Scanner;

public class ViewDeleteTodoList {
    public static void viewDeleteTodoList(){
        System.out.println("Menghapus TODO");

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Todo (x untuk membatalkan) :");
        String input = inputUser.nextLine();

        if(Objects.equals(input, "x")){
            System.out.println("Batal Menghapus TODO");
        }else {
             boolean success =  DeleteTodoList.deleteTodoList(Integer.parseInt(input));
             if (success){
                 System.out.println("Berhasil Menghapus TODO "+input);
             }else {
                 System.out.println("Gagal Menghapus TODO " + input);
             }
        }
    }
}
