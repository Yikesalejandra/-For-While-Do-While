/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ContadorNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Solicitar un número entero positivo al usuario
        do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Por favor, ingrese un número que sea positivo.");
            }
        } while (numero <= 0); // Repetir mientras el número no sea positivo

        // Imprimir los números impares desde 1 hasta el número ingresado
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1; // Contador inicial para los impares

        do {
            System.out.print(i + " ");
            i += 2; // Incrementar en 2 para obtener el siguiente impar
        } while (i <= numero); // Continuar mientras el contador sea menor o igual al número ingresado

        // Cerrar el escáner
        scanner.close();
    }
}