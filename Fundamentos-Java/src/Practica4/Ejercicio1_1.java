package Practica4;

//1. Generamos un número aleatorio que tenga 6 cifras (obligatoriamente tiene
//que tener ese número de cifras). Además, se captura un dígito con
//valor entre 0 a 9. Queremos eliminar dicho dígito del número de 6 cifras,
//suprimiendo del número la posición correspondiente. Visualizar el nuevo
//número.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        for(int i = 0; i < 1; i++){
            float numero = rand.nextFloat(100000);
            System.out.println(numero);
        }

        System.out.println("Elige un número entre 0 y 9 que quieras eliminar");
        int num = sc.nextInt();
    }
}
