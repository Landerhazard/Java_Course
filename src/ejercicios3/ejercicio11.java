package ejercicios3;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo:");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}