package ejercicios1;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        
        // Realizar un programa que pida al usuario su nombre y edad y lo muestre por pantalla.
       
        System.out.println("Dime tu nombre");
        Scanner mensaje = new Scanner(System.in);
        String nombre = mensaje.nextLine();
        System.out.println("Dime tu edad");
        int edad = mensaje.nextInt();
        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años.");
        mensaje.close();
    }
}