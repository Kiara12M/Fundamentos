package Practica2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime una palabra o una frase");
        String text = teclado.nextLine();

        text = text.replace("a", "A");
        text = text.replace("e", "E");
        text = text.replace("i", "I");
        text = text.replace("o", "O");
        text = text.replace("u", "U");

        System.out.println("El formato se ha hecho --> " + text);

    }


}
