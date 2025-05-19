package Practica4;

//Modificación del anterior para saber dentro de mayúscula y minúscula si
//es una vocal o consonante.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter: ");
        char caracter=sc.next().charAt(0);

        if (Character.isUpperCase(caracter)){
            System.out.println(caracter + " esta en mayuscula.");
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){ // los caracteres se ponen con comillas simples
                System.out.println("El caracter " + caracter + " es una vocal");
            } else {
                System.out.println("El caracter " + caracter + " es una consonante");
            }

        } else if (Character.isLowerCase(caracter)) {
            System.out.println(caracter + " esta en minuscula.");

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                System.out.println("El caracter " + caracter + " es una vocal");
            } else {
                System.out.println("El caracter " + caracter + " es una consonante.");
            }

        } else if (Character.isDigit(caracter)) {
            System.out.println(caracter + " es un digito.");

        } else{
            System.out.println(caracter + " es un caracter.");
        }

    }
}
