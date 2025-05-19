package Practica4;

//Capturamos un carácter y debemos indicar si está en mayúscula, en
//minúscula, es un dígito o cualquier otro carácter.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char caracter=sc.next().charAt(0);

        if (Character.isUpperCase(caracter)){
            System.out.println(caracter + " esta en mayuscula.");

        } else if (Character.isLowerCase(caracter)) {
            System.out.println(caracter + " esta en minuscula.");

        } else if (Character.isDigit(caracter)) {
            System.out.println(caracter + " es un digito.");

        } else{
            System.out.println(caracter + " es un caracter.");
        }
    }
}
