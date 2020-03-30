package ejercicios3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double promedio = 0;

        // Itera sobre los 10 números
        for (int i = 1; i <= 10; i++){
            System.out.println("Introduce un número:");
            double numero = sc.nextDouble();
            total += numero;
            promedio = total / i;
            System.out.println("El promedio es " + promedio);
        }
        sc.close();
    }
}