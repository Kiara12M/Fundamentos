package Practica3;

import java.util.Scanner;

//7. Capturamos números reales por teclado y queremos redondear al
//entero más próximo.

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        float numeros = sc.nextFloat();

        float redondear = Math.round(numeros);
        System.out.println("El redondeo de este numero: " + numeros + " es" + redondear);
    }
}
