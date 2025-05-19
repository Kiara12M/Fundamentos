package Practica2;

import java.util.Scanner;

//1. Capturamos por teclado una palabra y una sílaba, y queremos saber en qué
//posición empieza la silaba en la palabra. Tras cada solicitud de entrada de datos
//preguntar si quiere continuar S o N. ( indexOf(string) )

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar = "";

        do{
            System.out.println("Dime una palabra: ");
            String palabra = sc.nextLine();

            System.out.println("Dime una silaba: ");
            String silaba = sc.nextLine();

            int posicion = palabra.indexOf(silaba);
            if(posicion != -1){
                System.out.println(" la silaba : " + silaba + " la posicion es " + posicion);
            }else{
                System.out.println(" la silaba : " + silaba + " no se encunetra la posicion");
            }
            System.out.println("¿Desea continuar? (s/n)");
            continuar = sc.nextLine();

        }while (continuar.equalsIgnoreCase("s"));  //--> Recibe minúscula y mayúscula

    }
}
