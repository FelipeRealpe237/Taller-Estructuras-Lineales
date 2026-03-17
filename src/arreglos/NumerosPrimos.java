package arreglos;

// 1. Inicializar directamente un arreglo con los primeros 10 números primos e imprimir el arreglo.

public class NumerosPrimos {
    public static void main(String[] args) {

        int[] primos = inicializarPrimos();

        imprimirArreglo(primos);
    }

    public static int[] inicializarPrimos() {
        return new int[] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.println("Primeros 10 números primos:");

        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
    }
}
