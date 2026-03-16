package arreglos;

// 2. Inicializar por programa un arreglo con los 100 primeros números pares e imprimirlo:
// En una sola línea.
// En 10 líneas indicando el número de línea

public class NumerosPares {

    private static final int CANTIDAD_NUMEROS = 100;
    private static final int NUMEROS_POR_LINEA = 10;

    public static void main(String[] args) {

        int[] pares = generarPares(CANTIDAD_NUMEROS);

        imprimirUnaLinea(pares);

        System.out.println();

        imprimirEnLineas(pares);
    }

    public static int[] generarPares(int cantidad) {

        int[] pares = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            pares[i] = (i + 1) * 2;
        }

        return pares;
    }

    public static void imprimirUnaLinea(int[] arreglo) {

        System.out.println("Números pares en una sola línea:");

        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
    }

    public static void imprimirEnLineas(int[] arreglo) {

        System.out.println("\nNúmeros pares en 10 líneas:");

        int indice = 0;

        for (int linea = 1; linea <= arreglo.length / NUMEROS_POR_LINEA; linea++) {

            System.out.print("Línea " + linea + ": ");

            for (int j = 0; j < NUMEROS_POR_LINEA; j++) {
                System.out.print(arreglo[indice] + " ");
                indice++;
            }

            System.out.println();
        }
    }
}