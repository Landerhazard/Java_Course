package ejercicios7;

import java.util.Scanner;

public class ejercicioPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[4];
        for (Persona persona : personas) {

            System.out.println("Introduce el nombre:");
            String nombre = sc.nextLine();
            persona = new Persona(nombre);
            System.out.println("Introduce el sexo ('H'/'M'):");
            char sexo = sc.nextLine().charAt(0);
            persona.setSexo(sexo);
            System.out.println("Introduce la edad:");
            int edad = sc.nextInt();
            sc.nextLine();
            persona.setEdad(edad);
            System.out.println("Introduce la altura:");
            double altura = sc.nextDouble();
            persona.setAltura(altura);
            System.out.println("Introduce el peso:");
            int peso = sc.nextInt();
            sc.nextLine();
            persona.setPeso(peso);

            persona.devolver();

            System.out.println("\n****************************\n");
        }
        sc.close();
    }
}

class Persona {
    private String nombre;
    private int edad;
    private char sexo;
    private int DNI;
    private double altura;
    private int peso;

    Persona() {
    }

    Persona(String nombre) {
        this.nombre = nombre;
        this.DNI = this.generaDNI();
    }

    /**
     * GETTER
     */

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public int getDNI() {
        return DNI;
    }

    public double getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            try {
                throw new Exception("El sexo introducido no es válido.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * SETTER
     */

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean esMayorDeEdad(Persona persona) {
        int edad = persona.edad;
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    private int generaDNI() {
        return (int) (100000001 * (Math.random()));
    }

    public int calcularIMC() {
        double IMC = this.peso / (Math.pow(this.altura, 2));
        int valor;

        if (IMC < 20) {
            valor = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            valor = 0;
        } else {
            valor = 1;
        }
        return valor;
    }

    public void devolver() {
        System.out.println("Nombre:\t" + this.getNombre());
        System.out.println("DNI:\t" + this.getDNI());
        System.out.println("Sexo:\t" + this.getSexo());
        System.out.println("Edad:\t" + this.getEdad());
        System.out.println("Altura:\t" + this.getAltura());
        System.out.println("Peso:\t" + this.getPeso());
        int IMC = this.calcularIMC();
        if (IMC == -1){
            System.out.println("IMC:\t" + "Infrapeso");
        } else if(IMC == 0) {
            System.out.println("IMC:\t" + "Peso ideal");
        } else {
            System.out.println("IMC:\t" + "Sobrepeso");
        }
    }
}