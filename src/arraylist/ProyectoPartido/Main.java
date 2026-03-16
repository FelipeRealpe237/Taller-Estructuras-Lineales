package arraylist.ProyectoPartido;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    private static final String ficheroPartido = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\ProyectoPartido\\src\\PartidoLiga.txt";

    public static void main(String[] args) {
        System.out.println("--Se crea un Arraylist para trabajar en el main");
        ArrayList<PartidoFutbol> partidos = new ArrayList<PartidoFutbol>();

        File fichero = new File(ficheroPartido);
        Scanner leerLinea = null;

        try {
            System.out.println("..leemos el contenido del fichero");
            leerLinea = new Scanner(fichero);
            while (leerLinea.hasNextLine()) {
                String linea = leerLinea.nextLine();
                PartidoFutbol partidoJugado = new PartidoFutbol();
                String[] cortarString = linea.split("::");

                partidoJugado.setEquipoLocal(cortarString[0]);
                partidoJugado.setEquipoVisitante(cortarString[1]);
                partidoJugado.setGolLocal(Integer.parseInt(cortarString[2]));
                partidoJugado.setGolVisitante(Integer.parseInt(cortarString[3]));
                // se agrega cada linea de objeto a un ArrayList
                partidos.add(partidoJugado);

            }

        } catch (Exception e) {
            System.out.println("Archivo no leido");
        }
        System.out.println("...Guardado\n " + "Total de partidos " + partidos.size());

        Iterator<PartidoFutbol> recorridoIterator = partidos.iterator();
        while (recorridoIterator.hasNext()) {
            PartidoFutbol partidoJugado = recorridoIterator.next();
            System.out.println(partidoJugado.getEquipoLocal() + " "
                    + partidoJugado.getGolLocal() + " "
                    + partidoJugado.getEquipoVisitante() + " "
                    + partidoJugado.getGolVisitante());
        }
        // Mostrar los partidos de fútbol donde el visitante fue el ganador e imprimir
        System.out.println("\n...Partidos donde ganó el visitante ");

        for (PartidoFutbol partido : partidos) {
            if (partido.getGolVisitante() > partido.getGolLocal()) {
                System.out.println(partido.getEquipoLocal() + " "
                        + partido.getGolLocal() + " - "
                        + partido.getGolVisitante() + " "
                        + partido.getEquipoVisitante());
            }
        }

        // Contar cuantas veces gano el Barcelona e imprimir
        int victoriasBarcelona = 0;

        for (PartidoFutbol partido : partidos) {

            if (partido.getEquipoLocal().equals("Barcelona") && partido.getGolLocal() > partido.getGolVisitante()) {
                victoriasBarcelona++;
            }

            if (partido.getEquipoVisitante().equals("Barcelona") && partido.getGolVisitante() > partido.getGolLocal()) {
                victoriasBarcelona++;
            }
        }

        System.out.println("\nBarcelona ganó " + victoriasBarcelona + " partidos");

        // Contar cuántos partidos ganó el equipo local.
        int victoriasLocal = 0;

        for (PartidoFutbol partido : partidos) {

            if (partido.getGolLocal() > partido.getGolVisitante()) {
                victoriasLocal++;
            }
        }

        System.out.println("\nPartidos ganados por el equipo local: " + victoriasLocal);

        // Eliminar los partidos de fútbol del ArrayList, cuyo resultado no sea un
        // empate e imprimir
        Iterator<PartidoFutbol> recorrido_Iterator = partidos.iterator();

        while (recorrido_Iterator.hasNext()) {
            PartidoFutbol partido = recorrido_Iterator.next();

            if (partido.getGolLocal() != partido.getGolVisitante()) {
                recorrido_Iterator.remove();
            }
        }

        System.out.println("\n... Partidos que terminaron en empate ");

        for (PartidoFutbol partido : partidos) {
            System.out.println(partido.getEquipoLocal() + " "
                    + partido.getGolLocal() + " - "
                    + partido.getGolVisitante() + " "
                    + partido.getEquipoVisitante());
        }

    }
}
