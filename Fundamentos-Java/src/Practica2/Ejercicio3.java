package Practica2;

//3. Capturamos por teclado y por separado el nombre del alumno de clase y sus
//apellidos (3 identificadores). Queremos como resultado final que todo esté en
//una única cadena. ( concat(String))

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Ingrese el segundo apellido: ");
        String apellido2 = sc.nextLine();

        String DatosAlumno = nombre.concat(" ").concat(apellido).concat(" ").concat(apellido2);

        System.out.println(DatosAlumno);
    }
}
