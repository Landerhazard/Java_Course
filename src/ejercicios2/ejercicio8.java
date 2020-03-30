package ejercicios2;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        String mesString;
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el día
        System.out.println("Introduce el día:");
        int dia = sc.nextInt();

        if (dia < 1 || dia > 30) {
            System.out.println("El día introducido no es correcto.");
        } else {
            // Pide al usuario el mes
            System.out.println("Introduce el número de mes:");
            int mes = sc.nextInt();

            switch (mes) {
                case 1:
                    mesString = "Enero";
                    break;
                case 2:
                    mesString = "Febrero";
                    break;
                case 3:
                    mesString = "Marzo";
                    break;
                case 4:
                    mesString = "Abril";
                    break;
                case 5:
                    mesString = "Mayo";
                    break;
                case 6:
                    mesString = "Junio";
                    break;
                case 7:
                    mesString = "Julio";
                    break;
                case 8:
                    mesString = "Agosto";
                    break;
                case 9:
                    mesString = "Septiembre";
                    break;
                case 10:
                    mesString = "Octubre";
                    break;
                case 11:
                    mesString = "Noviembre";
                    break;
                case 12:
                    mesString = "Diciembre";
                    break;
                default:
                    mesString = "";
                    break;
            }
            if (mesString == "") {
                System.out.println("El mes introducido no es correcto.");
            } else {

                // Pide el año al usuario
                System.out.println("Introduce el año:");
                int ano = sc.nextInt();

                System.out.println("La fecha introducida es el " + dia + " de " + mesString + " de " + ano + ".");
            }
        }
        sc.close();
    }
}