package arreglos;

// 5. Inicializa un arreglo con 20 números aleatorios, 
// enteros e invierta cada uno de los números del arreglo 
// y guarde los números invertidos en otro arreglo. Imprima ambos arreglos.

import java.util.Random;

public class InvertirNumeros {

    private static final int CANTIDAD_NUMEROS = 20;
    private static final int LIMITE = 1000;

    public static void main(String[] args) {

        int[] numeros = generarNumeros();
        int[] numerosInvertidos = invertirNumeros(numeros);

        imprimirArreglo("Números originales:", numeros);
        imprimirArreglo("Números invertidos:", numerosInvertidos);
    }

    private static int[] generarNumeros() {
        Random random = new Random();
        int[] numeros = new int[CANTIDAD_NUMEROS];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(LIMITE);
        }

        return numeros;
    }

    private static int[] invertirNumeros(int[] numeros) {
        int[] invertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = invertirNumero(numeros[i]);
        }

        return invertidos;
    }

    private static int invertirNumero(int numero) {

        int invertido = 0;

        while (numero > 0) {
            invertido = invertido * 10 + (numero % 10);
            numero /= 10;
        }

        return invertido;
    }

    private static void imprimirArreglo(String titulo, int[] arreglo) {
        System.out.println(titulo);

        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }

        System.out.println("\n");
    }
}
