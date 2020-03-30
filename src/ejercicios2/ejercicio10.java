package ejercicios2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el primer dado
        System.out.println("Dado 1: Introduce un número del 1 al 6:");
        int dado1 = sc.nextInt();

        if (dado1 < 1 || dado1 > 6) {
            System.out.println("El número introducido no es válido");
        } else {

            // Pide al usuario el segundo dado
            System.out.println("Dado 2: Introduce un número del 1 al 6:");
            int dado2 = sc.nextInt();
            if (dado2 < 1 || dado2 > 6) {
                System.out.println("El número introducido no es válido");
            } else {

                // Pide al usuario el tercer dado
                System.out.println("Dado 3: Introduce un número del 1 al 6:");
                int dado3 = sc.nextInt();

                if (dado3 < 1 || dado3 > 6) {
                    System.out.println("El número introducido no es válido");
                } else {

                    if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
                        System.out.println("Excelente");
                    } else {
                        if ((dado1 == 6 && dado2 == 6) || (dado1 == 6 && dado3 == 6) || (dado2 == 6 && dado3 == 6)) {
                            System.out.println("Muy bien");
                        } else {
                            if (dado1 == 6 || dado2 == 6 || dado3 == 6) {
                                System.out.println("Regular");
                            } else {
                                System.out.println("Pésimo");
                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
}