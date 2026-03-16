package arreglos;

// 4. Lea 25 números enteros aleatorios entre -50 y 50, almacénese en un arreglo y encuentre:
// El número menor del arreglo.
// El número mayor del arreglo.

import java.util.Random;

public class MinimoMaximo {
    private static final int CANTIDAD_NUMEROS = 25;
    private static final int MINIMO = -50;
    private static final int MAXIMO = 50;

    public static void main(String[] args) {

        int[] numeros = generarNumeros();
        int menor = encontrarMenor(numeros);
        int mayor = encontrarMayor(numeros);

        imprimirArreglo(numeros);
        imprimirResultado(menor, mayor);
    }

    private static int[] generarNumeros() {
        Random random = new Random();
        int[] numeros = new int[CANTIDAD_NUMEROS];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
        }

        return numeros;
    }

    private static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    private static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }

    private static void imprimirArreglo(int[] numeros) {
        System.out.println("Números generados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println("\n");
    }

    private static void imprimirResultado(int menor, int mayor) {
        System.out.println("Número menor: " + menor);
        System.out.println("Número mayor: " + mayor);
    }
}
