/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        // Crear un escáner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la cantidad de números
        System.out.print("¿Cuántos números desea ingresar? ");
        int cantidad = scanner.nextInt();
        
        // Inicializar contadores
        int conteoMayoresQueCero = 0;
        int conteoMenoresQueCero = 0;
        int conteoIgualesACero = 0;
        
        // Ingresar los números y contar
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                conteoMayoresQueCero++;
            } else if (numero < 0) {
                conteoMenoresQueCero++;
            } else {
                conteoIgualesACero++;
            }
        }
        
        // Imprimir los resultados
        System.out.println("Números mayores que 0: " + conteoMayoresQueCero);
        System.out.println("Números menores que 0: " + conteoMenoresQueCero);
        System.out.println("Números iguales a 0: " + conteoIgualesACero);
        
        // Cerrar el escáner
        scanner.close();
    }
}