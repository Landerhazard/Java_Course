package ejercicios1;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

        // Programa que lea una cantidad de grados centígrados y la pase a grados
        // Fahrenheit.
        // La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
        // F = 32 + ( 9 * C / 5).

        System.out.println("Dime los grados centígrados:");
        Scanner grados = new Scanner(System.in);
        double centigrados = grados.nextDouble();
        double farenheit = 32 + 1.8 * centigrados;
        System.out.println(centigrados + " grados centígrados son " + farenheit + " grados Farenheit.");
        grados.close();
    }
}
