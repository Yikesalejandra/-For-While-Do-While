/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
public class NumerosDivisibles {
        public static void main(String[] args) {
        System.out.println("Números divisibles por 3 y 5 entre 1 y 100:");
        
        // Recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificar si el número es divisible por 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
