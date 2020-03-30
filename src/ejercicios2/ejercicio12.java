package ejercicios2;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el valor obtenido en el dado
        System.out.println("Introduce una nota del 0 al 10:");
        int nota = sc.nextInt();

        switch (nota) {
            case 0:
                System.out.println("La nota es cero");
                break;
            case 1:
                System.out.println("La nota es uno");
                break;
            case 2:
                System.out.println("La nota es dos");
                break;
            case 3:
                System.out.println("La nota es tres");
                break;
            case 4:
                System.out.println("La nota es cuatro");
                break;
            case 5:
                System.out.println("La nota es cinco");
                break;
            case 6:
                System.out.println("La nota es seis");
                break;
            case 7:
                System.out.println("La nota es siete");
                break;
            case 8:
                System.out.println("La nota es ocho");
                break;
            case 9:
                System.out.println("La nota es nueve");
                break;
            case 10:
                System.out.println("La nota es diez");
                break;
            default:
                System.out.println("ERROR, número incorrecto");
                break;
        }
        sc.close();
    }
}