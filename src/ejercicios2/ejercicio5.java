package ejercicios2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el número
        System.out.println("Selecciona un número entero:");
        int numero = sc.nextInt();

        // Evalúa si el número es igual, menor o mayor que cero
        if (numero < 0) {
            System.out.println("El número introducido es menor que cero.");
        } else if (numero > 0) {
            System.out.println("El número introducido es mayor que cero.");
        } else {
            System.out.println("El número introducido es cero.");
        }

        // Evalúa si el número es par
        if (numero % 2 == 0) {
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido es impar.");
        }

        // Evalúa si el número es múltiplo de 5
        if (numero % 5 == 0) {
            System.out.println("El número introducido es múltiplo de 5.");
        } else {
            System.out.println("El número introducido no es múltiplo de 5.");
        }

        // Evalúa si el número es múltiplo de 10
        if (numero % 10 == 0) {
            System.out.println("El número introducido es múltiplo de 10.");
        } else {
            System.out.println("El número introducido no es múltiplo de 10.");
        }

        sc.close();
    }
}