package Practica1;

//1. Vamos a capturar los nombres completos de los alumnos de clase y queremos
//saber: ¿Cuál es el alumno que tiene el nombre más largo y el más corto?
//Debemos visualizar en pantalla cuantos caracteres tiene el nombre más largo y
//el del más corto. ( length( ) )

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        for(int i = 0; i< 4; i++){
            System.out.print("Ingrese el nombre" + (i+1)+ ":");
            nombres.add(sc.nextLine());
        }

        String nombreCorto = "", nombreLargo = "";
        int max = 0;
        int min = 1000;
        for (String nombre : nombres) {
            if(nombre.length() > max){
                nombreLargo = nombre;
                max = nombre.length();
            }
            if(nombre.length() < min){
                nombreCorto = nombre;
                min = nombre.length();
            }
        }

        System.out.println("El nombre más corto: " + nombreCorto);
        System.out.println("El nombre más largo es: " + nombreLargo);
    }
}
