package Practica2;

//6. Capturamos una palabra y una silaba por teclado, queremos saber si la palabra
//capturada empieza por la silaba indicada. ( startsWith(String ))

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.println("Ingrese uan silaba de la palabra: ");
        String silaba = sc.nextLine();

        if (palabra.startsWith(silaba)){  // MAL-->(palabra.equals(silaba.startsWith(silaba)){

            System.out.println("La frase SI empieza por esa silaba");
        }
        else {
            System.out.println("No empieza por esa silaba");
        }

        //System.out.println("En esta palabra : " + palabra + "la silaba " + silaba + );

    }
}
