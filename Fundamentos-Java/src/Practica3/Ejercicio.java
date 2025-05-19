package Practica3;

import java.util.ArrayList;
import java.util.Scanner;

//1. Capturamos números enteros por teclado. Si el usuario teclea un
//número negativo lo convertimos en positivo. Deseamos saber
//cuántos números han sido introducidos y cuántos de ellos han tenido
//que ser convertidos a positivos.

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los números: ");

        //int num = sc.nextInt();
        //int[] arr = new int[num];

        int numerosConvertidos = 0;
        int numerosIntroducidos = 0;

        for (int i = 0; i < 4; i++) {
            int numero = sc.nextInt();
            numerosIntroducidos++;
            if(numero < 0){
                numero = -numero;
                numerosConvertidos++;
            }
        }

        System.out.println("Han sido introducidos: " + numerosIntroducidos + "numeros");
        System.out.println("Han sido convertidos: " + numerosConvertidos + "numeros");

    }
}
