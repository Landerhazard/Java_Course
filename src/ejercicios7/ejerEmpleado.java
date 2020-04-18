package ejercicios7;

import java.time.LocalDate;

public class ejerEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        LocalDate fechaInicioVacaciones = LocalDate.now();
        LocalDate fechaFinal = empleado.calcularVacaciones(fechaInicioVacaciones, 4);
        empleado.sueldo(40000);
        empleado.setCategoria("Técnico");
        empleado.setNombre("Eusebio");
        double incentivos = empleado.calcularIncentivos();
        System.err.println(empleado.verDatos());

        String nombreAdmin = "Paco";
        Administrativo admin = new Administrativo(LocalDate.parse("2020-07-04"), nombreAdmin);
        admin.sueldo(30000);
        double incentivosAdmin = admin.calcularIncentivos(15);
    }
}

class Empleado {
    protected String nombre;
    protected String categoria;
    protected LocalDate fechaDeAlta;
    protected double sueldo;

    Empleado() {
        this.fechaDeAlta = LocalDate.now();
    }

    Empleado(LocalDate fechaAlta) {
        this.fechaDeAlta = fechaAlta;
    }

    public LocalDate calcularVacaciones(LocalDate fechaInicio, int diasVacaciones) {
        return fechaInicio.plusDays(diasVacaciones);
    }

    public void sueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double sueldo() {
        return this.sueldo;
    }

    public double sueldo(double sueldo, double impuestos) {
        return sueldo * (1 + impuestos);
    }

    public double calcularIncentivos() {
        return this.sueldo / 10;
    }
    public String verDatos() {
        String mensaje = "Nombre:\t\t" + this.nombre + "\nCategoría:\t" + this.categoria;
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

class Administrativo extends Empleado {

    Administrativo(LocalDate fecha, String nombre) {
        super(fecha);
        this.nombre = nombre;        
    }

    public double calcularIncentivos(int ratio) {
        return this.sueldo / ratio;
    }

    @Override
    public String verDatos() {
        String mensaje = "Nombre:\t\t" + this.nombre + "\nCategoría:\t" + this.sueldo;
        return mensaje;
    }
}