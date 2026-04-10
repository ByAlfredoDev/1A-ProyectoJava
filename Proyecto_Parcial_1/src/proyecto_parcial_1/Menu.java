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
        int pos;
        int pos1, pos2;
        String palabra, posStr, patron = "\\d+";
        
        // Método .length();
        do {
            System.out.print("Ingrese una palabra: ");
            palabra = scan.nextLine().trim();
        } while (palabra.length() < 2);
        
        titulo("Método .length()");
        System.out.printf("En el metodo .length() ha devuelto: %d\n", palabra.length());
        
        // Método .charAt();
        titulo("Método .charAt(int index)");
        do {
            System.out.print("Ingrese una posición de la letra a buscar: ");
            posStr = scan.nextLine().trim();
            if (posStr.matches(patron)){
                pos = Integer.parseInt(posStr);
                if (pos > 0 && pos <= palabra.length()){
                    System.out.printf("La letra buscada es: %s\n", palabra.charAt(pos - 1));
                    break;
                } else {
                    error("La posición está fuera de rango");
                }
            } else {
                error("Ingrese solo números enteros positivos");
            }
        } while(true);
        
        // Método substring();
        titulo("Método .substring(int begin, int end)");
        do {
            pos1 = validarEntero("Ingrese la posición inicial: ", scan);
            pos2 = validarEntero("Ingrese la posición final: ", scan);
            if (pos1 < pos2){
                if (pos1 > 0 && pos2 <= palabra.length()){
                    System.out.println(palabra.substring(pos1 - 1, pos2));
                    break;
                } else {
                    error("La posición está fuera de rango");
                }
            } else {
                error("La posición inicial debe ser menor a la posición final");
            }
        } while (true);
        
        // Método equals
        titulo("Método .equals(String str)");
        System.out.print("Ingrese una cadena: ");
        String cad = scan.nextLine().trim();
        if (cad.equals(palabra)){
            System.out.printf("\u001B[32mLa cadena %s coincide con %s\u001B[0m", cad, palabra);
        } else {
            System.err.println("No coincide la cadena");
        }
        
        // Método equalsIgnoreCase
        titulo("Método .equalsIgnoreCase(String str)");
        String cad2 = scan.nextLine().trim();
        if (cad2.equalsIgnoreCase(palabra)){
            System.out.printf("\u001B[32mLa cadena %s coincide con %s\u001B[0m (Ignorando mayúsculas y minúsculas)", cad, palabra);
        } else {
            System.err.println("No coincide la cadena");
        }
        
        // Método contains()
        titulo("Método .contains(CharSequence s)");
        do {
            System.out.print("Ingrese la cadena de texto: ");
            String cont = scan.nextLine().trim();
            if (palabra.contains(cont)){
                System.out.printf("\u001B[32mLa cadena %s si contiene a %s\u001B[0m", palabra, cont);
                break;
            } else {
                System.err.println("No contiene " + cont + " la palabra " + palabra);
                break;
            }
        } while(true);
        
        // Método indexOf(String str)
        titulo("Método .indexOf(String str)");
        // 11/04/2026
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
    
    public static int validarEntero(String mensaje, Scanner scan){
        String var, patron = "\\d+";
        do {
            System.out.print(mensaje);
            var = scan.nextLine().trim();
            if (!var.matches(patron)){
                System.err.println("Error: Ingrese un número entero válido.");
            }
        } while (!var.matches(patron));
        
        return Integer.parseInt(var);
    }
    
    public static void error(String err){
        System.err.println("Error: " + err);
    }
    
    public static void titulo(String msg){
        System.out.printf("\n\n\n\u001B[35m%s\u001B[0m\n", msg);
    }
}