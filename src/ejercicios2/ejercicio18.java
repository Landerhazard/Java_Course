package ejercicios2;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifa = 0;
        int precio = 0, precioEuros, precioCentimos;
        int precioMenosUnaHora = 8;
        int precioHastaDosHoras = 6;
        int precioHastaCuatroHoras = 4;
        int precioMasDeCuatroHoras = 1200;

        // Pide al usuario la hora de entrada
        System.out.println("Intoduce la hora de entrada:");
        int horaEntrada = sc.nextInt();

        if (horaEntrada > 24 || horaEntrada < 0) {
            System.out.println("La hora de entrada no es válida");
        } else {
            // Pide al usuario el minuto de entrada
            System.out.println("Intoduce el minuto de entrada:");
            int minutoEntrada = sc.nextInt();

            // Chequea valores válidos
            if (minutoEntrada > 60 || minutoEntrada < 0) {
                System.out.println("El minuto de entrada no es válido");
            } else {
                // Pide al usuario la hora de salida
                System.out.println("Intoduce la hora de salida:");
                int horaSalida = sc.nextInt();

                // Chequea valores válidos
                if (horaSalida > 24 || horaSalida < 0) {
                    System.out.println("La hora de salida no es válida");
                } else {
                    // Pide al usuario el minuto de salida
                    System.out.println("Intoduce el minuto de salida:");
                    int minutoSalida = sc.nextInt();

                    // Chequea valores válidos
                    if (minutoSalida > 60 || minutoSalida < 0) {
                        System.out.println("El minuto de salida no es válido");
                    } else {
                        // Si todo es correcto evalua el tiempo de permanencia en minutos
                        int entrada = 60 * horaEntrada + minutoEntrada;
                        int salida = 60 * horaSalida + minutoSalida;
                        int tiempoEnParque = salida - entrada;

                        // Evalua la tarifa por minuto en funcion de la permanencia
                        if (tiempoEnParque < 0) {
                            System.out.println("La hora de salida es anterior a la de entrada.");
                        } else {
                            if (tiempoEnParque < 60) {
                                tarifa = precioMenosUnaHora;
                            } else {
                                if (tiempoEnParque >= 60 && tiempoEnParque < 120) {
                                    tarifa = precioHastaDosHoras;
                                } else {
                                    if (tiempoEnParque >= 120 && tiempoEnParque < 240) {
                                        tarifa = precioHastaCuatroHoras;
                                    } else {
                                        // En caso de estar más de 4 horas se aplica un precio fijo
                                        precio = precioMasDeCuatroHoras;
                                    }
                                }
                            }

                            // En caso de de que no se haya aplicado el precio fijo directamente, se calcula
                            // el precio total
                            if (tiempoEnParque < 240) {
                                precio = tarifa * tiempoEnParque;
                            }

                            // Separacion del precio en euros y centimos
                            precioEuros = precio / 100;
                            precioCentimos = precio % 100;

                            System.out.println("El importe a pagar por un tiempo de " + tiempoEnParque
                                    + " minutos es de " + precioEuros + " euros y " + precioCentimos + " céntimos.");
                        }
                    }
                }
            }
        }
        sc.close();
    }
}