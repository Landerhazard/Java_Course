import java.util.HashSet;

public class ejercicio3 {
    public static void main(String[] args) {
        HashSet<Alumno> h = new HashSet<Alumno>();
        Alumno Lander = new Alumno(2354566, "Lander");
        Alumno Vaca = new Alumno(2354566, "Vaca");
        h.add(Lander);
        h.add(Vaca);
        System.out.println(h.size());
    }
}

class Alumno {
    private int id;
    private String nombre;

    Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (nombre == null) {
            if (other.id != 0)
                return false;
        } else if (!(id==other.id))
            return false;
        return true;
    }
}