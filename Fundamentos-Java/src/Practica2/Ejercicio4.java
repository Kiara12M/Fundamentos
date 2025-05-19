package Practica2;

import java.util.Scanner;

//4. Capturamos palabras por teclado y queremos saber si son infinitivos (acaban en
//ar-er-ir). ( endsWith( String ))

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        if (palabra.endsWith("ar") || palabra.endsWith("er") || palabra.endsWith("ir")){
            System.out.println("Esta palabra: " + palabra + " infinitivo");
        }
        else{
            System.out.println("No es infinitivo");
        }
    }
}
