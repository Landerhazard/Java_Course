package ejercicios2;

import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario la temperatura
        System.out.println("Intoduce la temperatura:");
        int temperatura = sc.nextInt();

        // Devuelve la sensación térmica
        if (temperatura < -10) {
            System.out.println("Demasiado frío");
        } else if (temperatura >= -10 && temperatura < 10) {
            System.out.println("Mucho frío");
        } else if (temperatura >= 10 && temperatura < 15) {
            System.out.println("Poco frío");
        } else if (temperatura >= 15 && temperatura < 25) {
            System.out.println("Temperatura normal");
        } else if (temperatura >= 25 && temperatura < 30) {
            System.out.println("Poco calor");
        } else if (temperatura >= 30 && temperatura < 45) {
            System.out.println("Mucho calor");
        } else {
            System.out.println("Me torro!!!");
        }
        sc.close();
    }
}