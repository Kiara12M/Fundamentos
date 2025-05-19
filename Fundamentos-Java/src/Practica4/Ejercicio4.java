package Practica4;

//Queremos sacar 6 números de forma aleatoria para la bonoloto. Los
//números validos son del 1 al 49.

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 6; i++){
            int numeroRandom = r.nextInt(1,49);

            System.out.println("Numero " + (i+1)+ ": " + numeroRandom);
        }

    }
}
