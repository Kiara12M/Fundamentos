package Practica2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce el primer apellido: ");
        String apellido1 = sc.nextLine();

        System.out.println("Introduce el segundo apellido: ");
        String apellido2 = sc.nextLine();

        String DatosCompletos = nombre.concat(" ").concat(apellido1).concat(" ").concat(apellido2);

        System.out.println(DatosCompletos);
    }

}
