package matrices;

// 13. Inicializar una matriz de n por n, rellenar con números aleatorios 
// y determinar si es simétrica o no, imprima los números de las esquinas.

import java.util.Random;

public class Simetrica {
    private static final int N = 3;
    private static final int MINIMO = 0;
    private static final int MAXIMO = 50;

    public static void main(String[] args) {

        int[][] matriz = generarMatriz();

        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("\nLa matriz es simétrica");
        } else {
            System.out.println("\nLa matriz NO es simétrica");
        }

        imprimirEsquinas(matriz);
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

        System.out.println("Matriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean esSimetrica(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void imprimirEsquinas(int[][] matriz) {

        int n = matriz.length;

        System.out.println("\nEsquinas de la matriz:");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][n - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha: " + matriz[n - 1][n - 1]);
    }
}
