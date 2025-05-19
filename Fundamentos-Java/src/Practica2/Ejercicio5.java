package Practica2;

//5. Escribimos una frase y una palabra por teclado y deseamos saber en qué posición
//se encuentra la palabra (subcadena) dentro de la frase. ( lastIndexOf(String )

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.println("En esta frase: " + frase + " la palabra: "
                + palabra + " se encuentra en la posicion: "
                + frase.lastIndexOf(palabra));
    }
}
