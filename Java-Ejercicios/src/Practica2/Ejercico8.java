package Practica2;

import java.util.Scanner;

public class Ejercico8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");

        int numeroDePalabras = 0;

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                numeroDePalabras++;
            }
        }

        System.out.println("La frase contiene " + numeroDePalabras + " palabras.");
    }
}