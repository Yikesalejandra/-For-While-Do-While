/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Random;
import java.util.Scanner;

public class AdivinarElNumero {
    public static void main(String[] args) {
        // Crear un generador de números aleatorios
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // número aleatorio entre 1 y 100
        
        Scanner scanner = new Scanner(System.in);
        int intento = 0;
        boolean adivinado = false;

        System.out.println("¡Bienvenido al juego de Adivinar el Número!");
        System.out.println("He generado un número entre 1 y 100. ¡Intenta adivinarlo!");

        // Bucle para permitir múltiples intentos
        while (!adivinado) {
            System.out.print("Ingresa tu suposición: ");
            intento = scanner.nextInt();
            
            // Verificar la suposición del usuario
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                adivinado = true; // El usuario adivinó correctamente
                System.out.println("¡Felicidades! Has adivinado el número correcto: " + numeroAleatorio);
            }
        }

        // Cerrar el escáner
        scanner.close();
    }
}