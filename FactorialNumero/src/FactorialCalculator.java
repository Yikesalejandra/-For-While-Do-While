/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Crear un escáner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es negativo
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            // Calcular el factorial
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i; // factorial = factorial * i
            }
            // Imprimir el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        
        // Cerrar el escáner
        scanner.close();
    }
}