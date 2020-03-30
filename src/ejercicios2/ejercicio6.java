package ejercicios2;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pide al usuario el peso en kilos
        System.out.println("Intoduce el peso en kilos:");
        Double peso = sc.nextDouble();

        // Pide al usuario la altura en metros
        System.out.println("Introduce la altura en metros:");
        Double altura = sc.nextDouble();

        // Calcula el IMC
        Double imc = peso / Math.pow(altura, 2);

        // Devuelve tu estado en función del IMC
        if (imc < 16) {
            System.out.println("Tienes un IMC de " + imc + ", deberías consultar con un profesional.");
        } else {
            if (imc >= 16 && imc < 17) {
                System.out.println("Tienes un IMC de " + imc + ", tienes infrapeso.");
            } else {
                if (imc >= 17 && imc < 18) {
                    System.out.println("Tienes un IMC de " + imc + ", tienes bajo peso.");
                } else {
                    if (imc >= 18 && imc < 25) {
                        System.out.println("Tienes un IMC de " + imc + ", tienes peso normal.");
                    } else {
                        if (imc >= 25 && imc < 30) {
                            System.out.println("Tienes un IMC de " + imc + ", tienes sobrepeso.");
                        } else {
                            if (imc >= 30 && imc < 35) {
                                System.out.println("Tienes un IMC de " + imc + ", tienes sobrepeso crónico.");
                            } else {
                                if (imc >= 35 && imc < 40) {
                                    System.out.println("Tienes un IMC de " + imc + ", tienes obesidad premórbida.");
                                } else {
                                    if (imc >= 40) {
                                        System.out.println("Tienes un IMC de " + imc + ", tienes obesidad mórbida.");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        sc.close();
    }
}