package arraylist;

// 6. Escribe un programa que lea números enteros aleatorios entre -10 y 10 
// y los guarde en un ArrayList hasta que se lea el número 10 y muestra los números leídos, su suma y su media. 

import java.util.ArrayList;
import java.util.Random;

public class SumaMedia {

    private static final int MINIMO = -10;
    private static final int MAXIMO = 10;

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros);

        imprimirResultados(numeros, suma, media);
    }

    private static ArrayList<Integer> generarNumeros() {
        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;

        do {
            numero = random.nextInt(MAXIMO - MINIMO + 1) + MINIMO;
            numeros.add(numero);
        } while (numero != 10);

        return numeros;
    }

    private static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    private static double calcularMedia(ArrayList<Integer> numeros) {
        return (double) calcularSuma(numeros) / numeros.size();
    }

    private static void imprimirResultados(ArrayList<Integer> numeros, int suma, double media) {

        System.out.println("Números leídos:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n");
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}
