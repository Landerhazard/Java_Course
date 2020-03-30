package ejercicios3;

public class ejercicio1 {
    public static void main(String[] args) {

        // Bucle con While
        int numeroWhile = 1;
        while (numeroWhile <= 100) {
            System.out.print(numeroWhile);
            numeroWhile++;
        }

        System.out.print("\n");

        // Bucle con Do While
        int numeroDoWhile = 1;
        do {
            System.out.print(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile <= 100);

        System.out.print("\n");

        // Bucle con for
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
        }
    }
}