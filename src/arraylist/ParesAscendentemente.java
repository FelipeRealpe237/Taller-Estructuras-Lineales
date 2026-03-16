package arraylist;

// 7. Inicializar un ArrayList con los 20 primeros números pares ascendentemente y realice lo siguiente:
// Imprima el ArrayList leído.

// Lea un numero cualquiera e insértelo en la posición correcta de acuerdo con el orden del ArrayList. 
// Imprima de nuevo el ArrayList para verificar que el valor se insertó en la posición correcta.

// Borre un valor dentro del ArrayList solicitándolo al usuario. Imprima de nuevo el arreglo para verificar 
// que el valor se retiró.

import java.util.ArrayList;
import java.util.Scanner;

public class ParesAscendentemente {
    private static final int CANTIDAD_NUMEROS_PARES = 20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = generarNumerosPares();

        imprimirArrayList("ArrayList inicial:", numeros);

        System.out.print("Ingrese un número para insertar: ");
        int numeroInsertar = scanner.nextInt();

        insertarNumeroOrdenado(numeros, numeroInsertar);

        imprimirArrayList("ArrayList después de insertar:", numeros);

        solicitarYEliminarNumero(scanner, numeros);

        imprimirArrayList("ArrayList después de eliminar:", numeros);

        scanner.close();
    }

    private static ArrayList<Integer> generarNumerosPares() {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= CANTIDAD_NUMEROS_PARES; i++) {
            numeros.add(i * 2);
        }

        return numeros;
    }

    private static void insertarNumeroOrdenado(ArrayList<Integer> lista, int numero) {

        int posicion = 0;

        while (posicion < lista.size() && lista.get(posicion) < numero) {
            posicion++;
        }

        lista.add(posicion, numero);
    }

    private static void solicitarYEliminarNumero(Scanner scanner, ArrayList<Integer> lista) {

        boolean numeroEliminado = false;

        while (!numeroEliminado) {

            System.out.print("Ingrese el número que desea eliminar: ");
            int numeroEliminar = scanner.nextInt();

            numeroEliminado = eliminarNumero(lista, numeroEliminar);

            if (!numeroEliminado) {
                System.out.println("El número no se encuentra en el ArrayList. Intente nuevamente.");
            }
        }
    }

    private static boolean eliminarNumero(ArrayList<Integer> lista, int numero) {

        return lista.remove(Integer.valueOf(numero));
    }

    private static void imprimirArrayList(String titulo, ArrayList<Integer> lista) {

        System.out.println("\n" + titulo);

        for (int numero : lista) {
            System.out.print(numero + " ");
        }

        System.out.println("\n");
    }
}
