package ejercicios4;

import java.util.Scanner;

public class ejercicios4 {

    public static void main(String[] args) {
        ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
    }
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        int[] sueldo = new int[5];
        int totalSueldos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el sueldo del operario número " + (i + 1) + ":");
            sueldo[i] = sc.nextInt();
            totalSueldos += sueldo[i];
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println("El sueldo del operario número " + (i + 1) + " es " + sueldo[i] + ".");
        }

        System.out.println("\n" + "La suma de todos los sueldos es " + totalSueldos);

        sc.close();
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        int[][] valores = new int[3][4];

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                System.out.println("Introduce el número de la fila " + (i + 1) + " y la columna " + (j + 1) + ":");
                valores[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n");

        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                System.out.println(
                        "El número en la fila " + (i + 1) + " y en la columna " + (j + 1) + " es el " + valores[i][j]);
            }
        }
        sc.close();
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        int[] sueldoManana = new int[4];
        int[] sueldoTarde = new int[4];
        int totalMañana = 0, totalTarde = 0;

        for (int i = 0; i < sueldoManana.length; i++) {
            System.out.println("Introduce el sueldo del trabajador " + (i + 1) + " del turno de la mañana:");
            sueldoManana[i] = sc.nextInt();
            totalMañana += sueldoManana[i];
        }
        for (int i = 0; i < sueldoTarde.length; i++) {
            System.out.println("Introduce el sueldo del trabajador " + (i + 1) + " del turno de la tarde:");
            sueldoTarde[i] = sc.nextInt();
            totalTarde += sueldoTarde[i];
        }

        System.out.println("El sueldo total de los trabajadores de la mañana es: " + totalMañana);
        System.out.println("El sueldo total de los trabajadores de la tarde es: " + totalTarde);

        sc.close();
    }

    public static void ejercicio4() {
        double[] mates = new double[5];
        double[] fisica = new double[5];
        double totalMates = 0, totalFisica = 0, promMates = 0, promFisica = 0;

        for (int i = 0; i < mates.length; i++) {
            mates[i] = Math.random() * 10;
            totalMates += mates[i];
            promMates = totalMates / mates.length;
        }
        for (int i = 0; i < fisica.length; i++) {
            fisica[i] = Math.random() * 10;
            totalFisica += fisica[i];
            promFisica = totalFisica / fisica.length;
        }

        if (promFisica > promMates) {
            System.out
                    .println("La clase que ha obtenido un mejor promedio de notas es la de física, con un promedio de "
                            + promFisica + ".");
        } else if (promFisica < promMates) {
            System.out.println(
                    "La clase que ha obtenido un mejor promedio de notas es la de matemáticas con un promedio de "
                            + promMates + ".");
        } else {
            System.out.println("Ambas clases han obtenido el mismo promedio");
        }
    }

    public static void ejercicio5() {
        float[] alturas = new float[5];
        float totalAltura = 0, promedio = 0;
        int masAltos = 0, masBajos = 0;
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = (float) (Math.random() + 1.2);
            totalAltura += alturas[i];
        }

        promedio = totalAltura / alturas.length;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > promedio) {
                masAltos++;
            } else if (alturas[i] < promedio) {
                masBajos++;
            }
        }
        System.out.println("El promedio de altura es " + promedio + ".\nHay " + masAltos + " personas más altas que la media y " + masBajos + " personas más bajas que la media.");
    }

    public static void ejercicio6() {
        Scanner sc = new Scanner (System.in);
        int filas = 0;

        System.out.println("Introduce el número de filas de la matriz:");
        filas = sc.nextInt();
        int columnas = 0;

        char[][] matriz = new char [filas][];
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce el número de columnas para la fila " + i);
            columnas = sc.nextInt();
            matriz[i] = new char[columnas];
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '*';
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }

        sc.close();
    }

}