package ejercicios1;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        
        // Diseñar un programa que lea el valor correspondiente a una distancia en millas marinas y las escriba expresadas en metros.
        // Sabiendo que 1 milla marina equivale a 1852 metros.
        
        System.out.println("Introduce distancia en millas nauticas:");
        Scanner distancia = new Scanner(System.in);
        double millas = distancia.nextDouble();

        double metros = millas * 1852;
        System.out.println(millas + " millas nauticas son " + metros + " metros.");
        distancia.close();
    }
}