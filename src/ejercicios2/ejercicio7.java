package ejercicios2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario un número
        System.out.println("Intoduce un número entero positivo:");
        int numero = sc.nextInt();

        // Determina el número de dígitos del número
        if (numero / 1000 > 0) {
            System.out.println("En número " + numero + " tiene 4 o más cifras.");
        } else {
            if (numero / 100 > 0) {
                System.out.println("En número " + numero + " tiene 3 cifras.");
            } else {
                if (numero / 10 > 0) {
                    System.out.println("En número " + numero + " tiene 2 cifras.");
                } else {
                    System.out.println("En número " + numero + " tiene 1 cifra.");
                }
            }
        }
        sc.close();
    }
}