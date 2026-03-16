package matrices;

// 15. Inicializar una matriz de m filas * n columnas 
// (cargar n y m por teclado y rellenar con aleatorios) 
// Intercambiar la primera fila con la segunda. Imprimir luego la matriz.

import java.util.Random;
import java.util.Scanner;

public class IntercambiarFilas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese número de filas (m): ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese número de columnas (n): ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        if (filas >= 2) {
            for (int j = 0; j < columnas; j++) {
                int temporal = matriz[0][j];
                matriz[0][j] = matriz[1][j];
                matriz[1][j] = temporal;
            }
        }

        System.out.println("\nMatriz después de intercambiar filas:");
        imprimirMatriz(matriz);

    }

    private static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
