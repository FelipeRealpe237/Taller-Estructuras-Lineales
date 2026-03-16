package matrices;

//14. Inicializa una matriz de m por n y encuentre su transpuesta. 
// Imprima la matriz inicial y la transpuesta. Ingresar los valores de manera predeterminada

public class Transpuesta {

    public static void main(String[] args) {

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int m = matriz.length;
        int n = matriz[0].length;

        int[][] transpuesta = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);
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
