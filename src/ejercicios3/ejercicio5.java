package ejercicios3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lote = 10;
        int piezasAptas = 0;
        double medida;
        for (int i = 1; i <= lote; i++){
            System.out.println("Introduce la medida de la pieza:");
            medida = sc.nextDouble();
            if (medida < 1.20 || medida > 1.30){
                System.out.println("La pieza no es apta.");
            } else {
                System.out.println("La pieza es apta.");
                piezasAptas++;
            }
        }
        System.out.println("En el lote de " + lote + " piezas, hay " + piezasAptas + " piezas aptas.");
        sc.close();
    }
}