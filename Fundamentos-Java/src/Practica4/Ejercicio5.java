package Practica4;

//Realizar un programa que simule el funcionamiento de un reloj digital. Se
//visualizará en todo momento las horas, minutos y segundos con el
//formato “hh:mm:ss”.

public class Ejercicio5 {
    public static void main(String[] args) {
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        while (true) {
            System.out.println(hora + ":" + minutos + ":" + segundos);
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            segundos++;



        }
    }
}