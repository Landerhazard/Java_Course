package ejercicios2;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        int precioLlanta;
        int precioHastaCincoLlantas = 30000;
        int precioHastaDiezLlantas = 25000;
        int precioMasDiezLlantas = 20000;

        Scanner sc = new Scanner(System.in);

        // Pide al usuario el número de llantas
        System.out.println("Selecciona un número de llantas:");
        int llantas = sc.nextInt();

        // Determina el precio de la llanta
        switch (llantas) {
            case 1:
            case 2:
            case 3:
            case 4:
                precioLlanta = precioHastaCincoLlantas;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                precioLlanta = precioHastaDiezLlantas;
                break;
            default:
                precioLlanta = precioMasDiezLlantas;
                break;
        }

        // Calcula el precio total de las llantas
        int precioTotal = precioLlanta * llantas;
        System.out.println("Cada llanta ha costado " + precioLlanta + "$ y el precio total por " + llantas
                + " llantas es de " + precioTotal + "$.");

        sc.close();
    }
}