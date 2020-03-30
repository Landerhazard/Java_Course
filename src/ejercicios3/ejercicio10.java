package ejercicios3;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalLista1 = 0, totalLista2 = 0;
        for (int i = 1; i <= 15; i++){
            System.out.println("Introduce un numero para la lista 1:");
            totalLista1 += sc.nextInt();
        }
        for (int j = 1; j <= 15; j++){
            System.out.println("Introduce un numero para la lista 2:");
            totalLista2 += sc.nextInt();
        }

        if (totalLista1 > totalLista2){
            System.out.println("Lista 1 mayor");
        } else if (totalLista1 < totalLista1){
            System.out.println("Losta 2 mayor");
        } else {
            System.out.println("Listas iguales");
        }
        sc.close();
    }
}