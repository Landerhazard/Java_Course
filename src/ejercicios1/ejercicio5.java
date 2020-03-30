package ejercicios1;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        // Programa Java que lea dos números enteros por teclado y los muestre por
        // pantalla.

        System.out.println("Introduce un número");
        Scanner mensaje = new Scanner(System.in);
        int numero1 = mensaje.nextInt();
        System.out.println("Introduce otro número");
        int numero2 = mensaje.nextInt();
        System.out.println("Tus números han sido " + numero1 + " y " + numero2 + ".");
        mensaje.close();
    }
}
