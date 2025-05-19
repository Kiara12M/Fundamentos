package Practica3;

//3. Capturamos números por teclado y deseamos calcular la raíz
//cuadrada de cada uno de esos números.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los números: ");

        for(int i = 1; i <= 4; i++){
            double numeros = sc.nextDouble();

            double raizCuadrada = Math.sqrt(numeros);
            System.out.println("La raíz cuadrada de: " + numeros + " es: "+raizCuadrada);
        }


    }
}
