/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaz;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import dominio.*;
/**
 *
 * @author User
 */
public class Sistema {
public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(System.in);
    ConsolaSoliflips consola = new ConsolaSoliflips();
    Juego juego;

    while (true) {
        // Mostrar el menú principal
        consola.mostrarMenuPrincipal();
        String opcion = scanner.nextLine();

        switch (opcion.toLowerCase()) {
            case "a":
                juego = new Juego();
                juego.crearTableroDeArchivo();
                juego.guardarTablero(juego.obtenerTableroActual());
                consola.imprimirTablero(juego.obtenerTableroActual());
                jugarPartida(juego, consola, scanner);
                break;
            case "b":
                juego = new Juego();
                juego.crearTableroPredefinido();
                juego.guardarTablero(juego.obtenerTableroActual());
                consola.imprimirTablero(juego.obtenerTableroActual());
                jugarPartida(juego, consola, scanner);
                break;
            case "c":
                juego = new Juego();
                Scanner in = new Scanner(System.in);
                System.out.println("Ingrese nivel: ");
                int nivel = in.nextInt();
                juego.guardarTablero(juego.obtenerTableroActual());
                consola.imprimirTablero(juego.obtenerTableroActual());
                jugarPartida(juego, consola, scanner);
                break;
            case "s":
                System.out.println("Adios. ¡Gracias por jugar!");
                return; // Salir del programa
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}

    public static void jugarPartida(Juego juego, ConsolaSoliflips consola, Scanner scanner) {
        String[][] tablero;
        int contador = 0;
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            consola.mostrarSubMenu();
            String opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "m":
                    System.out.println("Ingrese Movimiento: fila columna");
                    int fila = scanner.nextInt();
                    int columna = scanner.nextInt();
                    contador++;
                    scanner.nextLine();

                    juego.jugar(fila, columna, contador);

                    String[][] tablero1 = juego.obtenerTablero(contador - 1);
                    String[][] tablero2 = juego.obtenerTablero(contador);

                    consola.imprimirTablerosLadoALado(tablero1, tablero2);

                    juegoTerminado = juego.juegoTerminado();
                    break;
                case "x":
                    System.out.println("Adios. ¡Gracias por jugar!");
                    juegoTerminado = true;
                    break;
                case "h":
                    consola.imprimirHistorial(juego.obtenerHistorialMovimientos());
                    break;
                case "s":
                    System.out.println("...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        if (juegoTerminado) {
            System.out.println("Tiempo de partida: " + juego.obtenerTiempoTotal());
            System.out.println("Desea comenzar una nueva partida? S/N ");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("N")) {
                System.out.println("Adios. ¡Gracias por jugar!");
                System.exit(0); // Salir del programa
            }
        }
    }


}
