package arreglos;

// 3. Leer n números enteros aleatorios, almacenarlos en un arreglo 
// y calcular la factorial de cada número leído, el cual se debe guardar en otro arreglo. 
// Imprima el arreglo de los números iniciales y el de las factoriales.

import java.util.Random;

public class CalcularFactorial {
    private static final int CANTIDAD_NUMEROS = 10;
    private static final int LIMITE_ALEATORIO = 10;

    public static void main(String[] args) {

        int[] numeros = generarNumeros(CANTIDAD_NUMEROS);
        long[] factoriales = calcularFactoriales(numeros);

        imprimirArreglo("Números generados:", numeros);
        imprimirArreglo("Factoriales:", factoriales);
    }

    private static int[] generarNumeros(int cantidad) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(LIMITE_ALEATORIO) + 1;
        }

        return numeros;
    }

    private static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }

        return factoriales;
    }

    private static long factorial(int numero) {
        long resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    private static void imprimirArreglo(String titulo, int[] arreglo) {
        System.out.println(titulo);
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println("\n");
    }

    private static void imprimirArreglo(String titulo, long[] arreglo) {
        System.out.println(titulo);
        for (long valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
