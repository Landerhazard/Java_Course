package ejercicios5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicios5 {

    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
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
        Arrays.sort(horasTotales);
        trabajadorMasHorasTrabajadas = trabajadores[Arrays.binarySearch(trabajadores,
                horasTotales[horasTotales.length - 1])];

        // Evalúa el trabajador que ha trabajado menos días
        Arrays.sort(diasTrabajados);
        trabajadorMenosDiasTrabajados = trabajadores[Arrays.binarySearch(trabajadores, diasTrabajados[0])];

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

    private static void ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Crear Matriz de M x N." + "\n*************************************");

        // Crea la matriz
        System.out.println("Introduce el número de filas:");
        int filas = sc.nextInt();
        System.out.println("Introduce el número de columnas:");
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        System.out.println("Se ha creado una matriz de " + filas + " filas y " + columnas + " columnas."
                + "\n*************************************");

        System.out.println("2 - Rellenar datos de la matriz." + "\n*************************************");

        // Rellena la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Introduce el valor de la posición " + i + ", " + j + ":");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Se han rellenado de la matriz." + "\n*************************************");

        // Devuelve el tamaño de la matriz
        System.out.println("3 - Saber el tamaño de la matriz." + "\n*************************************");
        System.out.println("La matriz es de " + matriz.length + " filas y " + matriz[0].length + " columnas."
                + "\n*************************************");

        // Clona el array inicial y muestra el clonado
        System.out.println("4 - Clonar el array y muesta el clonado." + "\n*************************************");
        int[][] matriz2 = matriz.clone();
        System.out.println("El array clonado es " + Arrays.deepToString(matriz2));

        // Copia parte del primer array en otro
        System.out.println("5 - Copiar parte del primer array en otro." + "\n*************************************");
        int inicio = 0, ultimo = 0;
        System.out.println("introduce el primer valor");
        inicio = sc.nextInt();
        System.out.println("introduce el ultimo valor");
        ultimo = sc.nextInt();
        int[][] matriz3 = Arrays.copyOfRange(matriz2, inicio, ultimo);
        System.out.println("El array copiado es " + Arrays.deepToString(matriz3));

        // Ordena el array
        System.out.println("6 - Ordenar array." + "\n*************************************");
        Arrays.sort(matriz);
        System.out.println("El array ordenado es " + Arrays.deepToString(matriz));

        // Busca un elemento
        System.out.println("7 - Buscar elemento." + "\n*************************************");
        System.out.println("introduce el valor que quieres buscar:");
        int valor = sc.nextInt();
        for (int i = 0; i < matriz.length;i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == valor){
                    System.out.println("El primer valor " + valor + " se encuentra en la posicion " + i + ", " + j +".");
                }
            }
        }

        sc.close();
    }

    private static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        String[] nombre = new String[3];
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Introduce el nombre");
                    break;
                case 1:
                    System.out.println("Introduce el primer apellido");
                    break;
                case 2:
                    System.out.println("Introduce el segundo apellido");
                    break;
                default:
                    break;
            }
            nombre[i] = sc.nextLine();
        }
        sc.close();

        String outNombre = nombre[0] + " " + nombre[1] + " " + nombre[2];
        System.out.println("El nombre es " + outNombre + " y el nombre con los apellidos tienen una longitud de "
                + (outNombre.length() - 2));
    }

    private static void ejercicio5() {
        String cad = "La vaca de la payasa campa a nada más que a la nada.";
        String cad2 = cad;
        char car = 'a';
        int contador = 0;
        int indice = 0;

        while (indice >= 0) {
            indice = cad2.indexOf(car);
            cad2 = cad2.substring(indice + 1);
            if (indice >= 0) {
                contador++;
            } else {
                break;
            }
        }
        System.out.println("La cadena " + cad + " tiene " + contador + " " + car + ".");

    }

    private static void ejercicio6() {
        String cadena = "AuedDeSoESsefGrfEsdsfieDadaoeSAfsEiO";
        String cadenaOut = cadena;
        int longitud = cadenaOut.length();
        for (int i = 0; i < longitud; i++) {
            char eval = cadenaOut.charAt(i);
            if (eval == 'a' || eval == 'e' || eval == 'i' || eval == 'o' || eval == 'u') {
                eval = 'o';
                cadenaOut = cadenaOut.substring(0, i) + eval + cadenaOut.substring(i + 1, cadenaOut.length());
            }
        }
        System.out.println(cadenaOut);
    }

    private static void ejercicio7() {
        String cadena = "Hola, me llamo Pepito";
        int longitud = cadena.length();
        int longitud2 = longitud / 2;
        String cadenaOut = cadena.substring(0, longitud2);
        System.out.println(cadenaOut);
    }
}
