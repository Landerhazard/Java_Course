package ejercicios6;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class ejercicios6 {
    public static void main(String[] args) {
        // ejercicio1();
        // ejercicio2();
        // ejercicio3();
        // ejercicio4();
        // ejercicio5();
        // ejercicio6();
        // ejercicio7();
        ejercicio8();
    }

    /**
     *************************************
     * * EJERCICIOS DE FECHAS * *
     *************************************
     */

    private static void ejercicio1() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        System.out.println("Año: " + year);
        System.out.println("Mes: " + month);
        System.out.println("Día: " + day);
        System.out.println("Hora: " + hour);
        System.out.println("Minuto: " + minute);
    }

    private static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera fecha con formato 'dd/mm/yy':");
        String fecha1 = sc.nextLine();
        System.out.println("Introduce la segunda fecha con formato 'dd/mm/yy':");
        String fecha2 = sc.nextLine();

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setLenient(false);
        cal2.setLenient(false);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        sdf.setLenient(false);

        try {
            cal1.setTime(sdf.parse(fecha1));
            cal2.setTime(sdf.parse(fecha2));
        } catch (Exception e) {
            System.out.println("Los formatos de las fechas introducidas son erroneos.");
            sc.close();
            return;
        }

        long diferencia = cal1.getTimeInMillis() - cal2.getTimeInMillis();
        int diasdiferencia = (int) (long) Math.abs(diferencia / (1000 * 3600 * 24));
        System.out.println(
                "Entre el día " + fecha1 + " y el día " + fecha2 + " hay " + diasdiferencia + " días de diferencia.");

        sc.close();
    }

    private static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEE, dd 'de' MMMMM 'de' yyyy");
        sdf.setLenient(false);
        System.out.println("Introduce el día con el formato numérico 'dd':");
        int day = sc.nextInt();
        System.out.println("Introduce el mes con el formato numérico 'mm':");
        int month = sc.nextInt();
        System.out.println("Introduce el ano con el formato numérico 'yyyy':");
        int year = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);

        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.YEAR, year);
        try {
            cal.getTime();
        } catch (Exception e) {
            System.out.println("Al menos uno de los parámetros de entrada tiene un formato erroneo.");
            sc.close();
            return;
        }
        cal.add(Calendar.DAY_OF_MONTH, 100);
        System.out.println(sdf.format(cal.getTime()));

        sc.close();
    }

    private static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        String input = "YES";
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        while (input.equals("YES")) {
            System.out.println("Introduce la fecha con formato 'DD/MM/YYYY':");
            String fecha = sc.nextLine();
            try {
                LocalDate fechaDate = LocalDate.parse(fecha, formatter);
                Period periodo = Period.between(fechaDate, today);
                System.out.println("Han pasado " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y "
                        + periodo.getDays() + " días.");
            } catch (Exception e) {
                System.out.println("El formato de la fecha de entrada es incorrecto.");
                sc.close();
            }
            System.out.println("¿Quieres comprobar otra fecha? 'yes'/'no'");
            input = sc.nextLine();
            input = input.toUpperCase();
        }
        sc.close();
    }

    private static void ejercicio5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now();
        int monthtoday = today.getMonthValue();
        int nextmonth = monthtoday + 1;
        LocalDate lastday = LocalDate.of(today.getYear(), nextmonth, 1);
        lastday = lastday.plusDays(-1);
        System.out.println("El último día de este mes es el " + formatter.format(lastday));
    }

    /**
     *****************************************
     * * EJERCICIOS DE EXCEPCIONES * *
     *****************************************
     */

    private static void ejercicio6() {
        Scanner sc = new Scanner(System.in);
        try {
            double numero = sc.nextDouble();
            double logaritmo = Math.log(numero);
            System.out.println(logaritmo);
        } catch (Exception e) {
            System.out.println("El valor introducido no es un número.");
        }

        sc.close();
    }

    private static void ejercicio7() {
        int[] vector = { 1, 2, 3 };
        try {
            System.out.println(vector[4]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El índice está fuera de rango.");
        }
    }

    private static void ejercicio8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();
        System.out.println("Introduce un numero entero:");
        int valor = sc.nextInt();
        String salida = exepObj.caracterEn(palabra, valor);
        System.out.println(salida);
        sc.close();
    }
}

class exepObj {
    protected static String caracterEn(String cadena, int entero) {
        try {
            return ("El caracter de la cadena " + cadena + " en la posición " + entero + " es el "
                    + cadena.charAt(entero) + ".");

        } catch (Exception e) {
            return ("El caracter no se encuentra en el rango de la cadena de entrada.");
        }
    }
}