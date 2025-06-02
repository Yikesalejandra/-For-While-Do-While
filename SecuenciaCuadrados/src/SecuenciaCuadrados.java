/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class SecuenciaCuadrados {
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

        // Imprimir los cuadrados de los números desde 1 hasta el número ingresado
        System.out.println("Los cuadrados de los números desde 1 hasta " + numero + " son:");
        int i = 1; // Contador inicial

        do {
            int cuadrado = i * i; // Calcular el cuadrado
            System.out.println("El cuadrado de " + i + " es: " + cuadrado);
            i++; // Incrementar el contador
        } while (i <= numero); // Continuar mientras el contador sea menor o igual al número ingresado

        // Cerrar el escáner
        scanner.close();
    }
}