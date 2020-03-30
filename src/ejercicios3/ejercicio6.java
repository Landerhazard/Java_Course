package ejercicios3;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, notasMayoresASiete = 0, notasMenoresASiente = 0;
        for (int i = 1; i <= 10; i++){
            System.out.println("Introducir nota del alumno:");
            nota = sc.nextInt();
            if (nota >= 7 && nota <= 10) {
                notasMayoresASiete++;
            } else if (nota < 7 && nota >=0){
                notasMenoresASiente++;
            }
        }
        System.out.println("Hay " + notasMayoresASiete + " notas iguales o mayores a 7 y hay " + notasMenoresASiente + " notas menores a 7.");
        sc.close();
    }
}