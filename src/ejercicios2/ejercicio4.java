package ejercicios2;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el primer número
        System.out.println("Selecciona un número entero:");
        int numero1 = sc.nextInt();

        // Pide al usuario el segundo número
        System.out.println("Selecciona otro número entero:");
        int numero2 = sc.nextInt();

        // Pide al usuario el tercer número
        System.out.println("Selecciona otro número entero:");
        int numero3 = sc.nextInt();

        int maxNum = numero1;

        // Evalúa cuál es el mayor de los números
        if ((numero2 > maxNum) || (numero3 > maxNum)) {
            maxNum = numero2;
            if (numero3 > maxNum) {
                maxNum = numero3;
            }
        }

        System.out.println("El número más alto es el " + maxNum + ".");
        sc.close();
    }
}