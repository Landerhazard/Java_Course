import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {       
        ArrayList<Persona> arrayPersona = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);
        
        boolean continuar = true;

        while(continuar) {
            try {
                System.out.println("\n****************************************\nIntroduce el ID:");
                int id = Integer.parseInt(sc.nextLine());
                System.out.println("Introduce el nombre:");
                String nombre = sc.nextLine();
                System.out.println("Introduce el apellido:");
                String apellidos = sc.nextLine();
                arrayPersona.add(new Persona(id, nombre, apellidos));
            } catch (Exception e) {
                System.err.println("El valor introducido no es válido, vuelve a intentarlo");
            } finally {
                System.out.println("Deseas introducir más personas? 'yes/no'");
                String input = sc.nextLine();
                input = input.toLowerCase();
                if (input.equals("no")){
                    continuar = false;
                }
            }
        }
        sc.close();
    }
}

class Persona {
    private int id;
    private String nombre;
    private String apellidos;

    Persona(int id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}