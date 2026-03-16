package matrices;

//11. Inicializar una matriz de m filas por n columnas rellenar con números aleatorios, 
// además lea un entero y determine si se encuentra la matriz y en qué posición. 
// Si no se encuentra imprima el mensaje correspondiente. 
// Solo se debe imprimir la primera ocurrencia del  número si se  encuentra.

import java.util.Random;
import java.util.Scanner;

public class BuscarNumero {
    private static final int FILAS = 3;
    private static final int COLUMNAS = 3;
    private static final int MINIMO = 1;
    private static final int MAXIMO = 50;

    public static void main(String[] args) {

        int[][] matriz = generarMatriz();

        imprimirMatriz(matriz);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el número a buscar: ");
        int numero = scanner.nextInt();

        buscarNumero(matriz, numero);
    }

    private static int[][] generarMatriz() {

        Random random = new Random();
        int[][] matriz = new int[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = random.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
            }
        }

        return matriz;
    }

    private static void imprimirMatriz(int[][] matriz) {

        System.out.println("Matriz generada:\n");

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    private static void buscarNumero(int[][] matriz, int numero) {

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {

                if (matriz[i][j] == numero) {
                    System.out.println("\nEl número se encontró en la posición:");
                    System.out.println("Fila: " + (i + 1) + "  Columna: " + (j + 1));
                    return;
                }
            }
        }

        System.out.println("\nEl número no se encuentra en la matriz.");
    }
}
