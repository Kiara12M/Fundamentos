package Practica3;

//4. Se capturan números reales por teclado y queremos truncar el
//número introducido. Vamos a realizarlo con método existente y sin
//método. Ver si tenemos alguna diferencia.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numeros = sc.nextDouble();

        double truncarNumeros = Math.floor(numeros); //Con metodo
        System.out.println(truncarNumeros);


        //////////////----SIN MÉTODO----/////////////////
        System.out.print("Ingrese un numero: ");
        double numero = sc.nextDouble();
        int truncadoSin = (int) numero; //--> Te lo pasa a entero

        System.out.println(truncadoSin);

    }
}
