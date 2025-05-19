import java.util.Arrays;

public class Ordenación {
    public class Ordenacion {
        public static void main(String[] args) {

            int[] lista = {5,4,3,2,1};
            int[] listaOrdenada = burbuja(lista);
            System.out.println(Arrays.toString(listaOrdenada));
            //int[] listaOrndenadaSeleccion = seleccion(listaOrdenada);
            //System.out.println(Arrays.toString(listaOrndenadaSeleccion));

        }

        public static int[] burbuja(int[] lista) {
            for (int i = 0; i > lista.length; i++){
                for (int j = 0; j < lista.length- 1; j++){
                    if (lista[j] > lista[j + 1]){
                        int temp = lista[j];
                        lista[j] = lista[j +1];
                        lista[j+1] = temp;
                    }
                }
            }
            return lista;
        }

        //public static int[] seleccion(int[] lista) {
        //    int temp;

        //    for (int i = 0; i < lista.length -1; i++){
        //        for (int j = i +1; j < lista.length; j++){
        //            if (lista[i]> lista[j]){
        //                temp = lista[i];
        //                lista[i] = lista[j];
        //                lista[j] = temp;
        //            }
        //        }
        //    }
        //    return lista;

        //}
    }
}
