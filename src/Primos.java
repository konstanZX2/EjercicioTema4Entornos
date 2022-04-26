import java.util.Scanner;

/**
 *
 * @author konstan, me apropio el codigo
 * @version alpha male
 */
public class Primos { 
 
    // Generar números primos de 1 a max

    /**
     * genera numeros primos del 1 al final.
     * @param max el tamaño maximo del array
     * @return
     */
    public static int[] generarPrimos (int max) { 
        int i,j; 
        if (max >= 2) { 
            // Declaraciones 
            int dim = max + 1; // Tamaño del array 
            boolean[] esPrimo = new boolean[dim]; 
            // Inicializar el array 
            inicializaArray(dim, esPrimo);
            // Eliminar el 0 y el 1, que no son primos 
            esPrimo[0] = esPrimo[1] = false; 
            // Criba 
            criba(dim, esPrimo);
            // ¿Cuántos primos hay? 
            int cuenta = cuantosPrimosHay(dim, esPrimo);
            // Rellenar el vector de números primos 
            int[] primos = rellenaVectorDeNumerosPrimos(dim, esPrimo, cuenta);
            return primos; 
        } 
        else { // max < 2 
            return new int[0]; 
            // Vector vacío 
        } 
    }

    /**
     * Rellena el vector de numeros primos
     * @param dim tamaño del array
     * @param esPrimo boolean que dice si el numero es primo o no
     * @param cuenta cuenta los numeros que hay
     * @return
     */
    private static int[] rellenaVectorDeNumerosPrimos(int dim, boolean[] esPrimo, int cuenta) {
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
     * Calcula cuantos primos hay
     * @param dim tamaño del array
     * @param esPrimo boolean que dice si el numero es primo o no
     * @return
     */
    private static int cuantosPrimosHay(int dim, boolean[] esPrimo) {
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
     * Sorteo de numeros
     * @param dim tamaño del array
     * @param esPrimo boolean que dice si el numero es primo o no
     */
    private static void criba(int dim, boolean[] esPrimo) {
        int i;
        int j;
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
     * Inicializa el array para sacar los numeros primos
     * @param dim tamaño del array
     * @param esPrimo boolean que dice si el numero es primo o no
     */
    private static void inicializaArray(int dim, boolean[] esPrimo) {
        int i;
        for (i=0; i< dim; i++) {
            esPrimo[i] = true;
        }
    }
}