package ejercicios3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDigitos = 10;
        System.out.println("Introduce un número entero de hasta " + maxDigitos + " dígitos:");
        int numero = sc.nextInt();

        for (int i = maxDigitos; i > 0; i--){
            if (numero / (int) Math.pow(10, i - 1) == 0){
                continue;
            } else {
                String digitoText = "";
                if (i == 1){digitoText = "dígito";} else {digitoText = "dígitos";}
                System.out.println("El número tiene " + i + " " + digitoText + ".");
                break;
            }
        }
        sc.close(); 
    }
}