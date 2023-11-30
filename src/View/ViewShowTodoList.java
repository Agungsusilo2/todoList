package View;

import BussinessLogic.ShowTodoList;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class ViewShowTodoList {
    public static void viewShowTodoList(){
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                ShowTodoList.showTodoList();

                System.out.println("Menu ");
                System.out.println("1. Tambah Todo");
                System.out.println("2. Hapus Todo");
                System.out.println("x. Keluar Todo");

                System.out.print("Silahkan Masukkan Pilihan : ");
                String inputUser = input.nextLine();

                if (Objects.equals(inputUser, "1")) {
                    ViewAddTodoList.viewAddTodoList();
                } else if (Objects.equals(inputUser, "2")) {
                    ViewDeleteTodoList.viewDeleteTodoList();
                } else if (Objects.equals(inputUser, "x")) {
                    break;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Input tidak valid, harap masukkan pilihan yang benar.");
                input.nextLine(); 
            }
        }

        input.close();
        System.out.println("Terima kasih!");
    }
}
