/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primerNumero;
        int diferencia;
        int numeroMaximo;

        // Solicitar el primer número de la secuencia
        System.out.print("Ingrese el primer número de la secuencia: ");
        primerNumero = scanner.nextInt();

        // Solicitar la diferencia
        System.out.print("Ingrese la diferencia: ");
        diferencia = scanner.nextInt();

        // Solicitar el número máximo
        System.out.print("Ingrese el número máximo de la secuencia: ");
        numeroMaximo = scanner.nextInt();

        // Verificar el número máximo
        if (numeroMaximo <= primerNumero) {
            System.out.println("El número máximo debe ser mayor que el primer número.");
        } else {
            int numeroActual = primerNumero; // Inicializamos el número actual

            System.out.println("La secuencia aritmética es:");
            do {
                System.out.print(numeroActual + " ");
                numeroActual += diferencia; // Sumar la diferencia al número actual
            } while (numeroActual <= numeroMaximo); // Continuar hasta que el número actual supere el máximo
        }

        // Cerrar el escáner
        scanner.close();
    }
}