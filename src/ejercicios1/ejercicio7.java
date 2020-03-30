package ejercicios1;

public class ejercicio7 {

    public static void main(String[] args) {
        
        // Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
       
        double numero1 = 200;
        double numero2 = 51;
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = Math.round(numero1 / numero2);
        double resto = numero1 % numero2;
        System.out.println("Los números seleccionados eran " + numero1 + " y " + numero2 + ". \n" + 
        "La suma de " + numero1 + " y " + numero2 + " es " + suma + ".\n" + 
        "La resta de " + numero1 + " menos " + numero2 + " es " + resta + ".\n" + 
        "La multiplicacion de " + numero1 + " por " + numero2 + " es " + multiplicacion + ".\n" + 
        "La division de " + numero1 + " entre " + numero2 + " es " + division + ".\n" + 
        "El resto de dividir " + numero1 + " entre " + numero2 + " es " + resto + ".");
    }
}