package ejercicios2;

public class ejercicio15 {
    public static void main(String[] args) {
        String sensacion = "";
        // Genera una temperatura aleatoria
        double temperatura = (Math.random() * 55) - 10;

        // Devuelve la sensación térmica
        if (temperatura >= -10 && temperatura < 10) {
            sensacion = "Mucho frío";
        } else if (temperatura >= 10 && temperatura < 15) {
            sensacion = "Poco frío";
        } else if (temperatura >= 15 && temperatura < 25) {
            sensacion = "Temperatura normal";
        } else if (temperatura >= 25 && temperatura < 30) {
            sensacion = "Poco calor";
        } else if (temperatura >= 30 && temperatura <= 45) {
            sensacion = "Mucho calor";
        }

        // Muestra la temperatura generada y la sensacion
        System.out.println("Con la temperatura de " + temperatura + " hay una sensación térmica de " + sensacion + ".");
    }
}