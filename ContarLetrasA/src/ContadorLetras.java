/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ContadorLetras {
    public static void main(String[] args) {
        // Crear un escáner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese una palabra
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        
        // Contador para la letra 'a'
        int contadorA = 0;
        
        // Recorrer cada letra de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            // Verificar si la letra actual es 'a' o 'A'
            char letraActual = palabra.charAt(i);
            if (letraActual == 'a' || letraActual == 'A') {
                contadorA++;
            }
        }
        
        // Imprimir el resultado
        System.out.println("La letra 'a' aparece " + contadorA + " veces en la palabra: " + palabra);
        
        // Cerrar el escáner
        scanner.close();
    }
}