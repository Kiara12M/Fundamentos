package Practica2;

//8. Haz un programa que a partir de una frase introducida por teclado nos diga
//cuántas palabras contiene.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" "); //--> Los separa

        int numPalabras = palabras.length;

        System.out.println("El numero de palabras es: " + numPalabras);

        //int numeroDePalabras = 0;
        //for (String palabra : palabras) {
        //    if (!palabra.isEmpty()) {  //--> Evita contar espacios vacios
        //        numeroDePalabras++;
        //    }
        //}

        //System.out.println("La frase contiene: " + numeroDePalabras + " palabras");
    }
}
