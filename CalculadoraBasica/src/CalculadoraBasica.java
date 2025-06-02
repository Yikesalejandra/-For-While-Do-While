/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido a la Calculadora Básica");
            System.out.println("Seleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            
            int opcion = scanner.nextInt();
            double num1, num2;
            
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();
            } else if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo de la calculadora. ¡Hasta luego!");
                break;
            } else {
                System.out.println("Opción no válida, por favor seleccione de nuevo.");
                continue; // Volver al inicio del bucle
            }

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
            }

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            char respuesta = scanner.next().charAt(0);
            continuar = (respuesta == 's' || respuesta == 'S');
        }

        // Cerrar el escáner
        scanner.close();
    }
}