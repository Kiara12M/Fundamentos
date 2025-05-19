package Practica2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//2. Capturamos una frase por teclado y queremos que todas las vocales aparezcan
//en mayúsculas. ( replace(char viejo, char nuevo))

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dime una palabra o frase: ");
        String text = sc.nextLine();

        text = text.replace("a", "A");
        text = text.replace("e", "E");
        text = text.replace("i", "I");
        text = text.replace("o", "O");
        text = text.replace("u", "U");

        System.out.println("Palabra: " + text);



        //Scanner sc = new Scanner(System.in);
        //ArrayList<String> vocales = new ArrayList<>();
        //vocales.add("a");
        //vocales.add("e");
        //vocales.add("i");
        //vocales.add("o");
        //vocales.add("u");

        //System.out.println("Introduce una frase: ");
        //String frase = sc.nextLine();

        //for (int i = 0; i < frase.length(); i++) {
        //    for (int j = 0; j < vocales.size(); j++) {
        //        if (frase.charAt(i) == vocales[j]){   //--> El charAt para que vaya leyendo letra a letra
        //            vocales.remove(j);
        //        }
        //    }
        //}
    }
}
