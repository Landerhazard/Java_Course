package ejercicios2;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int descuento = 0;

        // Pide al usuario el valor obtenido en el dado
        System.out.println("Introduce el monto de la compra:");
        int monto = sc.nextInt();

        // Determina el 
        if (monto < 500) {
            descuento = 0;
        } else if (monto >= 500 && monto <= 1000) {
            descuento = 5;
        } else if (monto > 1000 && monto <= 7000) {
            descuento = 11;
        } else if (monto > 7000 && monto <= 15000) {
            descuento = 18;
        } else if (monto > 15000) {
            descuento = 25;
        }

        double precio = monto * (1 - 0.01 * descuento);

        System.out.println("El precio final es: " + precio + ", con un descuento del " + descuento + "%.");
        sc.close();
    }
}