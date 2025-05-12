import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numericos = {1, 5, 2, 4, 7, 3};
        int[] numeros = {1, 6, 5, 2, 7, 3};
        int[] orden = {3, 2, 6, 8, 3, 5};
        System.out.println(Arrays.toString(numericos));
        //numericos = burbuja(numericos);
        burbujaMejorada(numeros);
        System.out.println(Arrays.toString(numericos));
        //System.out.println(Arrays.toString(lN));
    }

    public static int[] burbuja(int[] lista) {      //modifica la lista que estaba antes.
        for (int i = 1; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    //Arrays.toString(l[])
                }
            }
        }
        return lista;
    }


    public static int[] burbujaMejorada(int[] lista) {
        int i = 1;
        int aux;
        boolean ordenado = false;
        while (i < lista.length && !ordenado) {
            i++;
            ordenado = true;
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    ordenado = false;
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                }
            }
        }
        return lista;
    }

    public static int[] ordenarNuevaLista(int[] lista) {
        int[] listaNueva = lista.clone();
        return burbuja(listaNueva);
    }
}