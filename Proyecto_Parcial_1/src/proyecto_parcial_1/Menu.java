/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_parcial_1;

import java.util.Scanner;

/**
 *
 * @author Alfredo_EC
 */
public class Menu {
    Scanner scan = new Scanner(System.in);
    public void pantallaString() {
        System.out.println();
        System.out.println("=== Menú ===");
        System.out.println("1. Metodos String");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Opción 4");
        System.out.println();
    }
    
    public void opcion1() {
        int pos = 0;
        String pos1, pos2;
        String palabra, posStr, patron = "\\d+";
        
        // Metodo .length();
        do {
            System.out.print("Ingrese una palabra: ");
            palabra = scan.nextLine();
        } while (palabra.length() < 2);
        
        System.out.printf("En el metodo .length() ha devuelto: %d\n", palabra.length());
        
        // Metodo .charAt();
        do {
            System.out.print("Ingrese una posicion de la letra a buscar: ");
            posStr = scan.next();
            if (posStr.matches(patron)){
                pos = Integer.parseInt(posStr);
            }
        } while(!posStr.matches(patron) && (pos < 0 || pos > palabra.length() - 1));
        
        System.out.printf("La letra buscada es: %s\n", palabra.charAt(pos - 1));
        
        // Metodo substring();
        do {
            System.out.println("Ingrese la posicion inicial: ");
            pos1 = scan.nextInt();
            System.out.println("Ingrese la posicion final: ");
            pos2 = scan.nextInt();
            if (pos1 < pos2 && pos2 <= palabra.length()){
                System.out.println(palabra.substring(pos1, pos2));
            } else {
                System.out.println("Error");
            }
        } while (!(pos1 < pos2 && pos2 <= palabra.length()));
    }
    
    public void opcion2() {
        System.out.println("Elegiste opción 2");
    }
    
    public void opcion3() {
        System.out.println("Elegiste opción 3");
    }
    
    public void opcion4() {
        System.out.println("Elegiste opción 4");
    }
}