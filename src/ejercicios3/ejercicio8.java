package ejercicios3;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroDeEmpleados = 10;
        int sueldo = 0, total = 0;
        int sueldoMenos300 = 0, sueldoMas300 = 0;
        for (int i = 1; i <= numeroDeEmpleados; i++){
            System.out.println("Introduce el sueldo:");
            sueldo = sc.nextInt();
            if (sueldo < 100 || sueldo > 500){
                System.out.println("El sueldo introducido no es válido, vuelve a probar.");
                i--;
                continue;
            } else if (sueldo >= 100 && sueldo <= 300){
                sueldoMenos300++;
            } else {
                sueldoMas300++;
            }
            total += sueldo;
        }
        System.out.println("La empresa paga " + total + "$, " + sueldoMenos300 + " de los sueldos entán entre 100$ y 300$ y " 
        + sueldoMas300 + " de los sueldos están entre 300$ y 500$.");
        sc.close(); 
    }
}