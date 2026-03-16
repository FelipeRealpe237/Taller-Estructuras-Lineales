package matrices;

// 12. Inicializar una matriz de tamaño n por n rellenar con números aleatorios entre -50 y 50 
// y calcular la sumatoria de los elementos de la diagonal opuesta a la principal.

import java.util.Random;

public class DiagonalSecundaria {
    private static final int N = 3;
    private static final int MINIMO = -50;
    private static final int MAXIMO = 50;

    public static void main(String[] args) {

        int[][] matriz = generarMatriz();

        imprimirMatriz(matriz);

        int suma = sumarDiagonalSecundaria(matriz);

        System.out.println("\nSuma de la diagonal secundaria: " + suma);
    }

    private static int[][] generarMatriz() {

        Random random = new Random();
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = random.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
            }
        }

        return matriz;
    }

    private static void imprimirMatriz(int[][] matriz) {

        System.out.println("Matriz generada:\n");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    private static int sumarDiagonalSecundaria(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < N; i++) {
            suma += matriz[i][N - 1 - i];
        }

        return suma;
    }
}
