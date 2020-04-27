import java.util.HashMap;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); 
        map.put("Hola", "Hello");
        map.put("Cosa", "Thing");
        map.put("Cubo", "Cube");
        map.put("Reloj", "Watch");
        map.put("Ratón", "Mouse");
        map.put("Teclado", "Keyboard");
        map.put("Pantalla", "Screen");
        map.put("Móvil", "Cell phone");
        map.put("Ordenador", "Computer");
        map.put("Sal", "Salt");
        map.put("Arma", "Gun");
        map.put("Zapato", "Shoe");
        map.put("Portátil", "Laptop");
        map.put("Mesa", "Table");
        map.put("Papel", "Paper");
        map.put("Esfera", "Sphere");
        map.put("Vaca", "Cow");
        map.put("Entalpía", "Enthalpy");
        map.put("Ventana", "Window");
        map.put("Bolígrafo", "Pen");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra (en español) que quieras buscar en el diccionario:");
        String palabraEspanol = sc.nextLine();
        String palabraIngles = map.get(palabraEspanol);
        if ((palabraIngles != null && !palabraIngles.isEmpty())){
            System.out.println("La palabra " + palabraEspanol + " se dice: " + palabraIngles);
        } else {
            System.out.println("La palabra " + palabraEspanol + " no figura en el diccionario.");
        }
        sc.close();
    }
}