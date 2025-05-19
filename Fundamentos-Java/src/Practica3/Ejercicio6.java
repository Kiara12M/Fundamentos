package Practica3;

//6. Deseamos capturar valores por teclado que se corresponde a un
//número y un radical. Calcular la raíz correspondiente

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        double numero = sc.nextDouble();

        System.out.print("Ingrese el primer numero: ");
        int indice = sc.nextInt();

        if (indice == 0){
            System.out.println("El primer numero no puede ser 0");
        }else{
            double resultado = Math.pow(numero, 1.0 / indice);
            System.out.println("La raiz " + indice + " de: " + numero + " es: " + resultado);
        }

    }
}
