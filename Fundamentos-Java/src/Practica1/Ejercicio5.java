package Practica1;

import java.util.Scanner;

//5. Capturamos una frase por teclado y queremos visualizarla carácter a carácter.
//Deben estar separados las letras por un guion. ( charAt(int))

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if( i == frase.length()-1){
                System.out.println(frase.charAt(i));
            }else {
                System.out.println(frase.charAt(i) + "-");
            }
        }
    }


}
