package ejercicios2;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el número
        System.out.println("Selecciona un número entero:");
        int numero = sc.nextInt();

        // Evalúa si el número es negativo, positivo o cero
        if (numero < 0) {
            System.out.println("El número es negativo.");
        } else if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es cero.");
        }
        sc.close();
    }
}