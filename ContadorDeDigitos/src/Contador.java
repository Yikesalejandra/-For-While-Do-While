/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Crear un escáner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        // Inicializar el contador de dígitos
        int contadorDigitos = 0;
        
        // Tomar el valor absoluto del número para evitar problemas con números negativos
        int numeroAbsoluto = Math.abs(numero);
        
        // Contar dígitos
        if (numeroAbsoluto == 0) {
            contadorDigitos = 1; // el número 0 tiene 1 dígito
        } else {
            while (numeroAbsoluto > 0) {
                numeroAbsoluto /= 10; // dividir por 10 para eliminar un dígito
                contadorDigitos++; // incrementar el contador de dígitos
            }
        }
        
        // Imprimir el resultado
        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");
        
        // Cerrar el escáner
        scanner.close();
    }
}
