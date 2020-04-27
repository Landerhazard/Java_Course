import java.util.Collections;
import java.util.Vector;

public class ejercicio1 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();

        ejer1(v);
        ejer2(v);
        ejer3(v);
        ejer4(v);
        int resultado = ejer5(v, "Vaca");
        System.out.println(resultado);
        ejer6(v);
        ejer7(v);
        ejer8(v);
        ejer9(v);
    }

    public static void ejer1(Vector<String> vector) {
        vector.add("Vaca");
        vector.add("Cosa");
        vector.add("Otra cosa");
        vector.add("Aun mas cosas");
    }

    public static void ejer2(Vector<String> vector) {
        for (String texto : vector) {
            System.out.println(texto);
        }

        // Explicacion de las expresiones lambda
        vector.forEach((n) -> System.out.println(n));
    }

    public static void ejer3(Vector<String> vector) {
        String mensaje = vector.get(2);
        System.out.println(mensaje);
    }

    public static void ejer4(Vector<String> vector) {
        vector.insertElementAt("Hellooo!", 1);
    }

    public static int ejer5(Vector<String> vector, String input) {
        return vector.indexOf(input);
    }

    public static void ejer6(Vector<String> vector) {
        Collections.sort(vector);
        System.out.println(vector);
    }

    public static void ejer7(Vector<String> vector) {
        vector.remove(1);
        System.out.println(vector);
    }

    public static void ejer8(Vector<String> vector) {
        System.out.println("El tamaño del vector es de " + vector.size());
    }

    public static void ejer9(Vector<String> vector) {
        System.out.println(vector.capacity());
        vector.trimToSize();
        System.out.println(vector.capacity());
    }
}
