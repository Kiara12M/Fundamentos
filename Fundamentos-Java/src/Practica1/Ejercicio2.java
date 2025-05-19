package Practica1;

import java.util.Scanner;

//2. Capturamos los nombres de los alumnos de clase y queremos visualizarlos en
//mayúsculas independientemente de cómo han sido introducidos por el usuario
//inicialmente. ( toUpperCase( ) )

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos: ");
        int alumnos = sc.nextInt();

        String[] nombres = new String[alumnos];
        for(int i = 0; i < alumnos; i++){
            System.out.println("Ingrese el nombre: " + (i+1) + ":");
            nombres[i] = sc.next();
        }
    }
}
