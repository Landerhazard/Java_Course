package ejercicios5;

import java.util.Scanner;

public class ejercicio5DeCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.length() < 5){
            System.out.print("La cadena tiene menos de 5 caracteres ");
        } else if (input.length() >= 5 && input.length() < 15){
            System.out.print("La cadena tiene entre 5 y 15 caracteres ");
        } else {
            System.out.print("La cadena tiene 15 o más caracteres ");
        }

        String primera_letra = input.substring(0, 1);
        if (primera_letra.equals("a")){
            System.out.print("y comienza por 'a'.");
        } else {
            System.out.print("y no comienza por 'a'.");
        }
        sc.close();
    }
}