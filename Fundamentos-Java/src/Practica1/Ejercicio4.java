package Practica1;

import java.util.ArrayList;
import java.util.Scanner;

//4. Captura tres palabras por teclado y ordénalas de menor a mayor según el
//diccionario. ( compareTo(String))

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese tres palabras: ");
        String palabras = sc.nextLine();

        for(int i = 0; i < 3; i++){
            lista.add(palabras);   //--> Para añadir las palabras a la lista
            System.out.println(lista);
        }

        lista.sort(String.CASE_INSENSITIVE_ORDER);
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
