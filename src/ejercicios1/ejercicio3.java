package ejercicios1;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        // Realizar un programa que pida al usuario su nombre y le muestre un saludo.
        
        System.out.println("Dime tu nombre");
        Scanner mensaje = new Scanner(System.in);
        String nombre = mensaje.nextLine();
        System.out.println("Hola " + nombre + "!");
        mensaje.close();

    }
}
