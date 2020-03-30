package ejercicios1;

public class ejercicio8 {

    public static void main(String[] args) {
        // Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una. A continuación realiza las instrucciones
        // necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
        
        int numero_A = -75;
        int numero_B = 35;
        int numero_C = 21;
        int numero_D = -50;

        String texto_inicial = "Inicialmente los valores de A, B, C y D eran " + numero_A + ", " + numero_B + ", " + numero_C + " y " + numero_D + " consecutivamente.\n";
        int numero_auxiliar = numero_B;
        numero_B = numero_C;
        numero_C = numero_A;
        numero_A = numero_D;
        numero_D = numero_auxiliar;
        String texto_final = "Ahora los valores de A, B, C y D son " + numero_A + ", " + numero_B + ", " + numero_C + " y " + numero_D + " consecutivamente.";
        System.out.println(texto_inicial);
        System.out.println(texto_final);
    }
}