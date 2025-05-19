public class Prueba {
    public class prueba {
        public static void main(String[] args) {

            int[] numeros = {5, 1, 4, 2, 8};
            int cantidadN = numeros.length;

            System.out.println("Original: ");
            for (int numero : numeros) System.out.print(numero + " ");

            for (int i = 0; i < cantidadN - 1; i++) {
                for (int j = 0; j < cantidadN - i - 1; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        int temp = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = temp;
                    }
                }
            }
            System.out.println("\nOrdenado: ");
            for (int numero : numeros) System.out.print(numero + " ");
        }
    }
}
