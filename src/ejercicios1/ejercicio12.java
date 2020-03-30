package ejercicios1;

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        
    // Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia.
    // Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2.

    System.out.println("Introduce el radio de la circunferencia:");
    Scanner circunferencia = new Scanner(System.in);
    double radio = circunferencia.nextDouble();

    double longitud = 2 * radio * Math.PI;
    double area = Math.PI * Math.pow(radio, 2);
    System.out.println("La longitud del perímetro de una circunferencia de radio " + radio + " es " + longitud + " su area es " + area + ".");
    circunferencia.close();
    }
}