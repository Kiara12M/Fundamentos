package Practica2;

//7. Capturamos una frase por teclado y deseamos saber si es un palíndromo. Un
//palíndromo es una palabra, número o frase que se lee igual hacia adelante que
//hacia atrás. Si se trata de un número, se llama capicúa. (charAt)
//Ejemplos: La ruta natural, Se van sus naves. Dábale arroz a la zorra el abad,
//Amo la pacífica paloma, ¿Son mulas o cívicos alumnos? Oirás orar a Rosario
//Nada, yo soy Adán.

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p1 = " ";
        String p2 = " ";
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        String tipo;

        try{
            Integer.parseInt(frase);
            tipo = "capicúa";
        }catch(NumberFormatException e){
            tipo = "Palindromo";
        }

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                p1 += frase.charAt(i);
            }
        }

        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' '){
                p2 += frase.charAt(i);
            }
        }

        if(p1.equals(p2)){
            System.out.println("Es un " + tipo);
        }else {
            System.out.println("No es un " + tipo);
        }
    }
}
