package ejercicios2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario un número
        System.out.println("Intoduce las horas semanales trabajadas:");
        int horas = sc.nextInt();
        int horasExtra = horas - 40;
        int precioHoras = 16, precioHorasExtra = 20;
        int salario;

        // Determina el salario semanal
        if (horasExtra > 0) {
            salario = 40 * precioHoras + horasExtra * precioHorasExtra;
        } else {
            salario = horas * precioHoras;
        }
        System.out.println("El salario semanal correspondiente es de " + salario + ".");
        sc.close();
    }
}