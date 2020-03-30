package ejercicios1;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        
        // Programa para pasar euros a pesetas.
        
        System.out.println("Introduce pesetas:");
        Scanner moneda = new Scanner(System.in);
        double pesetas = moneda.nextDouble();

        double euros = pesetas / 166.386;
        System.out.println(pesetas + " pesetas son " + euros + "€.");
        moneda.close();
    }
}