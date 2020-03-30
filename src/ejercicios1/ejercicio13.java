package ejercicios1;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {

        // Programa lea la longitud de los catetos de un triángulo rectángulo y calcule
        // la longitud de la hipotenusa según el teorema de Pitágoras.

        System.out.println("Introduce el valor del primer cateto:");
        Scanner triangulo = new Scanner(System.in);
        double cateto1 = triangulo.nextDouble();
        System.out.println("Introduce el valor del segundo cateto:");
        double cateto2 = triangulo.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("El valor de la hipotenusa del triángulo cuyos catetos valen " + cateto1 + " y " + cateto2
                + " es " + hipotenusa + ".");
        triangulo.close();
    }
}