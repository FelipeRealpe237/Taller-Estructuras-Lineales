package arraylist;

// 9. Genere un ArrayList con 20 números aleatorios entre 1 y 100. 
// ¿Cómo puede ordenar los elementos de la lista de menor a mayor y posteriormente de mayor a menor? 
// Además, ¿cómo puede separar los números de la lista en dos nuevas 
// listas que contengan únicamente números pares y números impares? Muestra todas las listas generadas.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrdenarSepararLista {
    private static final int CANTIDAD = 20;
    private static final int MINIMO = 1;
    private static final int MAXIMO = 100;

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        ArrayList<Integer> ascendente = new ArrayList<>(numeros);
        ArrayList<Integer> descendente = new ArrayList<>(numeros);

        ordenarAscendente(ascendente);
        ordenarDescendente(descendente);

        ArrayList<Integer> pares = obtenerPares(numeros);
        ArrayList<Integer> impares = obtenerImpares(numeros);

        imprimirLista("Lista original:", numeros);
        imprimirLista("Ordenada de menor a mayor:", ascendente);
        imprimirLista("Ordenada de mayor a menor:", descendente);
        imprimirLista("Números pares:", pares);
        imprimirLista("Números impares:", impares);
    }

    private static ArrayList<Integer> generarNumeros() {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < CANTIDAD; i++) {
            numeros.add(random.nextInt(MAXIMO - MINIMO + 1) + MINIMO);
        }

        return numeros;
    }

    private static void ordenarAscendente(ArrayList<Integer> lista) {
        Collections.sort(lista);
    }

    private static void ordenarDescendente(ArrayList<Integer> lista) {
        Collections.sort(lista, Collections.reverseOrder());
    }

    private static ArrayList<Integer> obtenerPares(ArrayList<Integer> numeros) {

        ArrayList<Integer> pares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        return pares;
    }

    private static ArrayList<Integer> obtenerImpares(ArrayList<Integer> numeros) {

        ArrayList<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        return impares;
    }

    private static void imprimirLista(String titulo, ArrayList<Integer> lista) {

        System.out.println(titulo);

        for (int numero : lista) {
            System.out.print(numero + " ");
        }

        System.out.println("\n");
    }
}
