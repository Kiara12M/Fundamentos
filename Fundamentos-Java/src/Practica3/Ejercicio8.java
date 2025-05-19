package Practica3;

import java.util.Random;
import java.util.Scanner;

//8.- Genera 10 número aleatorios comprendidos entre 0 y 999.

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        System.out.println("Aquí tienes 10 nº aleatorios entre 0 y 999: ");

        for (int i = 0; i < 10; i++){
            int num = rand.nextInt(1000); //--> Aquí los genera
            System.out.println(num);
        }


    }
}
