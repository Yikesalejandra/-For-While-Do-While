/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class VocalesONoVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese letras (Ingrese un espacio para terminar):");
        
        while (true) {
            String letra = scanner.nextLine(); // Leer la entrada del usuario
            
            // Si el usuario ingresa un espacio, se termina el programa
            if (letra.equals(" ")) {
                System.out.println("Programa terminado.");
                break;
            }
            
            // Validar que la entrada tenga solo un carácter
            if (letra.length() == 1) {
                char caracter = letra.charAt(0); // Obtener el primer carácter ingresado
                
                // Comprobar si es una vocal o consonante
                if (Character.isLetter(caracter)) { // Verificar si es una letra
                    if ("aeiouAEIOU".indexOf(caracter) != -1) {
                        System.out.println(caracter + " es una vocal.");
                    } else {
                        System.out.println(caracter + " es una consonante.");
                    }
                } else {
                    System.out.println(caracter + " no es una letra válida.");
                }
            } else {
                System.out.println("Por favor, ingrese solo un carácter.");
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}