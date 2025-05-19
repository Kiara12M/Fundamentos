package Practica4;

//Generamos un número aleatorio que tenga 6 cifras (obligatoriamente
//tiene que tener ese número de cifras). Además, se captura un dígito con
//valor entre 0 a 9. Queremos eliminar dicho dígito del número de 6 cifras,
//suprimiendo del número la posición correspondiente. Visualizar el nuevo
//número.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i++){
            int numRandom = r.nextInt(100000,999999);
            System.out.println("Numero: "+ numRandom);

            System.out.println("Introduce un numero entre 0 a 9: ");
            int digito = sc.nextInt();

            System.out.println("Digito: " + digito);

            String randomTexto = String.valueOf(numRandom); //para pasar los numeros a texto
            String TextoFinal = "";

            for (char c_random : randomTexto.toCharArray()){
                if (Character.getNumericValue(c_random) != digito){
                    TextoFinal += c_random;
                }
            }

            System.out.println("Resultado Final: " + TextoFinal);

        }



    }
}
