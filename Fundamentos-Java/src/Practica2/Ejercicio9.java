package Practica2;

//9. Haz un programa que, a partir de una frase introducida por teclado, elimine la
//última palabra y nos muestre el resultado.

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        int ultimaPalabra = frase.lastIndexOf(" ");

        System.out.println(frase.substring(0,ultimaPalabra));

        //if (ultimaPalabra == -1) {
        //    String resultado = (frase.substring(0, ultimaPalabra));
        //    System.out.println("Frase sin la última palabra: " + resultado);
        //}
        //else {
        //    System.out.println("Solo hay una palabra o está vacío");
        //w}
    }
}
