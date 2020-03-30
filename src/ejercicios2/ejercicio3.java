package ejercicios2;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el primer número
        System.out.println("Selecciona un número entero:");
        int numero1 = sc.nextInt();

        // Pide al usuario el segundo número
        System.out.println("Selecciona otro número entero:");
        int numero2 = sc.nextInt();

        // Evalúa cuál de los 2 números es mayor y lo mete en la variable numero1
        if (numero1 < numero2) {
            int auxVar = numero1;
            numero1 = numero2;
            numero2 = auxVar;
        }
        System.out.println("Los números introducidos, de mayor a menor, son: " + numero1 + " y " + numero2 + ".");
        sc.close();
    }
}