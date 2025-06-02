/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = 0;
        int contador = 0;

        System.out.println("Ingrese números positivos. Ingrese un número negativo para terminar.");

        while (true) {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();
            
            // Verificar si el número es negativo para terminar el bucle
            if (numero < 0) {
                break;
            }
            
            // Sumar el número y aumentar el contador
            suma += numero;
            contador++;
        }

        // Calcular y mostrar la media
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}