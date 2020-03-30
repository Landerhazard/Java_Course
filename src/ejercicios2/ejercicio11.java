package ejercicios2;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el valor obtenido en el dado
        System.out.println("Introduce un número del 1 al 6:");
        int dado = sc.nextInt();

        switch (dado) {
            case 1:
                System.out.println("El número opuesto al 1 es el seis");
                break;
            case 6:
                System.out.println("El número opuesto al 6 es el uno");
                break;
            case 2:
                System.out.println("El número opuesto al 2 es el cinco");
                break;
            case 5:
                System.out.println("El número opuesto al 5 es el dos");
                break;
            case 3:
                System.out.println("El número opuesto al 3 es el cuatro");
                break;
            case 4:
                System.out.println("El número opuesto al 4 es el tres");
                break;
            default:
                System.out.println("ERROR, número incorrecto");
                break;
        }
        sc.close();
    }
}