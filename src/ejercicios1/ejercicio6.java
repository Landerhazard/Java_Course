package ejercicios1;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        // Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.

        System.out.println("Introduce un número");
        Scanner mensaje = new Scanner(System.in);
        int numero = mensaje.nextInt();
        int numeroDoble = 2 * numero, numeroTriple = 3 * numero;
        System.out.println("El doble de " + numero + " es " + numeroDoble + " y el triple es " + numeroTriple + ".");
        mensaje.close();
    }
}
