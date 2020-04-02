package ejercicios5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicios5 {

    public static void main(String[] args) {
        // ejercicio1();
        ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5);
        // ejercicio6();
        // ejercicio7();
        // ejercicio8();
    }

    private static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int numEmpleados = 3;
        String[] trabajadores = new String[numEmpleados];
        int[] diasTrabajados = new int[numEmpleados];
        int[][] fechasTrabajadas = new int[numEmpleados][];
        int[][] horasTrabajadas = new int[numEmpleados][];
        int[] horasTotales = new int[numEmpleados];
        String trabajadorMasHorasTrabajadas = "";
        String trabajadorMenosDiasTrabajados = "";
        Arrays.fill(horasTotales, 0);

        // Pide por pantalla los nombres de los trabajadores.
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Introduce el nombre del trabajador " + i + ":");
            trabajadores[i] = sc.nextLine();
        }

        // Pide por pantalla el numero de veces que cada empleado ha ido a trabajar.
        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Introduce el número de días que trabajó " + trabajadores[i] + ":");
            diasTrabajados[i] = sc.nextInt();
            fechasTrabajadas[i] = new int[diasTrabajados[i]];
            horasTrabajadas[i] = new int[diasTrabajados[i]];

            // Pide por pantalla los días y horas que trabaja cada empleado.
            for (int j = 0; j < diasTrabajados[i]; j++) {
                System.out.println("Intoduce el dia " + j + " de trabajo de " + trabajadores[i]);
                fechasTrabajadas[i][j] = sc.nextInt();
                System.out.println("Introduce las horas que ha trabajado " + trabajadores[i] + " el día "
                        + fechasTrabajadas[i][j] + ":");
                horasTrabajadas[i][j] = sc.nextInt();
                horasTotales[i] += horasTrabajadas[i][j];
            }
        }

        // Evalúa el trabajador que más horas ha trabajado
        trabajadorMasHorasTrabajadas = trabajadores[0];
        for (int i = 1; i < numEmpleados; i++) {
            if (horasTotales[i] > horasTotales[Arrays.binarySearch(trabajadores, trabajadorMasHorasTrabajadas)]) {
                trabajadorMasHorasTrabajadas = trabajadores[i];
            }
        }

        // Evalúa el trabajador que ha trabajado menos días
        trabajadorMenosDiasTrabajados = trabajadores[0];
        for (int i = 1; i < numEmpleados; i++) {
            if (diasTrabajados[i] > diasTrabajados[Arrays.binarySearch(trabajadores, trabajadorMenosDiasTrabajados)]) {
                trabajadorMenosDiasTrabajados = trabajadores[i];
            }
        }
        sc.close();

        System.out.println("El trabajador que más horas ha trabajado ha sido " + trabajadorMasHorasTrabajadas
                + " y el trabajador que menos dias ha trabajado es " + trabajadorMenosDiasTrabajados + ".");
    }

    private static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de calles que hay:");
        int numeroCalles = sc.nextInt();
        String[] calles = new String[numeroCalles];
        int[] portales = new int[numeroCalles];
        int[][] habitantesPortal = new int[numeroCalles][];

        // Pide los nombres de las calles.
        for (int i = 0; i < numeroCalles; i++) {
            System.out.println("Introduce el nombre de la calle " + i + ":");
            calles[i] = sc.nextLine();
        }

        // Pide el numero de portales por calle
        for (int i = 0; i < numeroCalles; i++) {
            System.out.println("Introduce el numero de portales que hay en la calle " + calles[i] + ":");
            portales[i] = sc.nextInt();
            habitantesPortal[i] = new int[portales[i]];

            // Pide el numero de habitantes por portal
            for (int j = 0; j < portales[i]; j++) {
                System.out.println("Introduce el numero de habitantes que hay en el portal en la posicion " + j + ":");
                habitantesPortal[i][j] = sc.nextInt();
            }
        }

        // Muestra resultados
        for (int i = 0; i < numeroCalles; i++) {
            System.out.println("Los portales que están en la calle " + calles[i] + " tienen los siguientes habitantes: "
                    + Arrays.toString(habitantesPortal[i]));
        }

        sc.close();
    }
}