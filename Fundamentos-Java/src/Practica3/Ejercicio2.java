package Practica3;

//2. Capturamos un número por teclado y queremos saber el valor de e
//elevado a ese número. ( enúmero)


//representa el número de Euler, una constante matemática irracional

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        double num = sc.nextDouble();

        double resultado = Math.exp(num);  //--> exp(x) = e^x (Aquí se calcula e elevado al nº)
        System.out.println("e elevado a : " + num + " es: " + resultado);
    }
}
