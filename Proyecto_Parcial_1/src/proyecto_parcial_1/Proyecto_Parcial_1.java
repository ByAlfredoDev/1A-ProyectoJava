/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_parcial_1;

import java.util.Scanner;

/**
 *
 * @author Alfredo_EC
 */
public class Proyecto_Parcial_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String opt;

        Menu menu = new Menu();
        do {
            menu.pantallaString();
            System.out.print("Ingresa una opción: ");
            opt = scan.nextLine();
            switch (opt) {
                case "1" -> {
                    menu.opcion1();
                }
                case "2" -> {
                    menu.opcion2();
                }
                case "3" -> {
                    menu.opcion3();
                }
                case "4" -> {
                    menu.opcion4();
                }
                case "5" -> {
                    System.out.println("Adios!");
                }
                default -> {
                    System.out.println("Opción no válida");
                }
            }
        } while (!"5".equals(opt));
    }
}
