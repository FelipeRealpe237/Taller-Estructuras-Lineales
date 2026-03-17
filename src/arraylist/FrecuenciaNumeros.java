package arraylist;

// 8. Genere un ArrayList con 100 números enteros aleatorios entre 1 y 20. 
// ¿Cómo puede recorrer la lista para determinar cuántas veces aparece cada número dentro de ella? 
// Construya una tabla que muestre cada número y su frecuencia de aparición, 
// e identifique cuál es el número que se repite con mayor frecuencia en la lista.

import java.util.ArrayList;
import java.util.Random;

public class FrecuenciaNumeros {
    private static final int CANTIDAD_NUMEROS = 100;
    private static final int MINIMO = 1;
    private static final int MAXIMO = 20;

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();
        int[] frecuencias = calcularFrecuencias(numeros);

        imprimirLista(numeros);
        imprimirTablaFrecuencias(frecuencias);
        imprimirNumeroMasFrecuente(frecuencias);
    }

    private static ArrayList<Integer> generarNumeros() {
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < CANTIDAD_NUMEROS; i++) {
            numeros.add(random.nextInt(MAXIMO - MINIMO + 1) + MINIMO);
        }

        return numeros;
    }

    private static int[] calcularFrecuencias(ArrayList<Integer> numeros) {

        int[] frecuencias = new int[MAXIMO + 1];

        for (int numero : numeros) {
            frecuencias[numero]++;
        }

        return frecuencias;
    }

    private static void imprimirLista(ArrayList<Integer> numeros) {

        System.out.println("Lista de números generados:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n");
    }

    private static void imprimirTablaFrecuencias(int[] frecuencias) {

        System.out.println("Número | Frecuencia");
        System.out.println("-------------------");

        for (int i = MINIMO; i <= MAXIMO; i++) {
            System.out.printf("%6d | %9d\n", i, frecuencias[i]);
        }

        System.out.println();
    }

    private static void imprimirNumeroMasFrecuente(int[] frecuencias) {

        int maxFrecuencia = 0;

        for (int i = MINIMO; i <= MAXIMO; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
            }
        }

        System.out.print("Número(s) con mayor frecuencia: ");

        for (int i = MINIMO; i <= MAXIMO; i++) {
            if (frecuencias[i] == maxFrecuencia) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nFrecuencia: " + maxFrecuencia);
    }
}
