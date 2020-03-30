package ejercicios2;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        double impuestos = 0.21;
        double precioMin = 0.09;
        double precioSegundo = precioMin / 60;
        double precioSinImpuestos, precioFinal;
        int minutos;
        int segundos;

        Scanner sc = new Scanner(System.in);

        // Pide al usuario el tiempo en segundos
        System.out.println("Introduce el tiempo en segundos:");
        int tiempo = sc.nextInt();

        // Calcula el precio antes de impuestos
        if (tiempo < 60) {
            precioSinImpuestos = precioMin;
        } else {
            precioSinImpuestos = tiempo * precioSegundo;
        }

        // Calcuala el precio final
        precioFinal = precioSinImpuestos * (1 + impuestos);

        // Determina los minutos y segundos del tiempo
        minutos = tiempo / 60;
        segundos = tiempo % 60;

        System.out.println(
                "El precio por " + minutos + " minutos y " + segundos + " segundos es de " + precioFinal + "€.");
        sc.close();
    }
}