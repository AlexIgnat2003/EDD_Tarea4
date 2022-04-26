import java.util.Scanner;

public class Primos {

    /**
     *
     * @param max es el numero maximo al que contara
     * @return devuelve un array de enteros con todos los numeros primos
     * comprimdos entre el rango establecido por el parametro max
     */
    // Generar números primos de 1 a max
    public static int[] generarPrimos (int max) {
        int i,j;
        if (max >= 2) {

            // Declaraciones
            int dim = max + 1;

            // Tamaño del array
            boolean[] esPrimo = new boolean[dim];

            // Inicializar el array
            for (i=0; i<dim; i++) {
                esPrimo[i] = true;
            }

            // Eliminar el 0 y el 1, que no son primos
            eliminarNoPrimos(esPrimo);

            // Criba
            criba(dim, esPrimo);

            // ¿Cuántos primos hay?
            int cuenta = contadorPrimos(dim, esPrimo);

            // Rellenar el vector de números primos
            int[] primos = rellenaVector(dim, esPrimo, cuenta);

            return primos;
        }
        else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }

    /**
     *
     * @param dim  las dimensiones del array
     * @param esPrimo evalua cada numero para que solo seleccione los primos
     * @param cuenta  numero total de primos del array
     * @return devuelve un array de enteros primos
     */
    private static int[] rellenaVector(int dim, boolean[] esPrimo, int cuenta) {
        int i;
        int j;
        int[] primos = new int[cuenta];
        for (i=0, j=0; i< dim; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

    /**
     *
     * @param dim  las dimensiones del array
     * @param esPrimo evalua cada numero para que solo seleccione los primos
     * @return develve el numero total de primos
     */
    private static int contadorPrimos(int dim, boolean[] esPrimo) {
        int i;
        int cuenta = 0;
        for (i=0; i< dim; i++) {
            if (esPrimo[i]) {
                cuenta++;
            }
        }
        return cuenta;
    }

    /**
     *
     *  @param dim  las dimensiones del array
     *  @param esPrimo evalua cada numero para que solo seleccione los primos
     */

    private static void criba(int dim, boolean[] esPrimo) {
        int j;
        int i;
        for (i=2; i<Math.sqrt(dim)+1; i++) {
            if (esPrimo[i]) {
                // Eliminar los múltiplos de i
                for (j = 2 * i; j < dim; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
    }

    /**
     * Elimina los numeros 0 y 1
     * @param esPrimo evalua cada numero para que solo seleccione los primos
     */
    private static void eliminarNoPrimos(boolean[] esPrimo) {
        esPrimo[0] = esPrimo[1] = false;
    }
}