package com.ejemplo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("¡Bienvenido al juego de adivinar el número!");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce el número de jugadores (1-4): ");
    int numeroJugadores = scanner.nextInt();
    while (numeroJugadores < 1 || numeroJugadores > 4) {
      System.out.print("Número inválido. Introduce un número entre 1 y 4: ");
      numeroJugadores = scanner.nextInt();
    }

    int[] puntuaciones = new int[numeroJugadores];
    int numeroAleatorio = (int) (Math.random() * 11); // Número aleatorio único para todos los jugadores
    boolean juegoTerminado = false;

    int jugadorActual = 1; // Comenzar con el jugador 1

    while (!juegoTerminado) {
      System.out.println(String.format("\nTurno del jugador %d (Jugador %d)", jugadorActual, jugadorActual));
      System.out.print(String.format("Jugador %d, introduce un número entero entre 0 y 10: ", jugadorActual));
      int numeroEntero = scanner.nextInt();
      System.out.println(String.format("Jugador %d ha introducido: %d", jugadorActual, numeroEntero));

      if (numeroEntero == numeroAleatorio) {
        System.out.println(String.format("¡Jugador %d ganó! Adivinaste el número.", jugadorActual));

        // Asignar puntuación según los intentos
        puntuaciones[jugadorActual - 1] = 100; // Ganador obtiene 100 puntos
        juegoTerminado = true; // Terminar el juego
      } else {
        System.out.println(String.format("Jugador %d, incorrecto. Intenta de nuevo en tu próximo turno.", jugadorActual));
      }

      // Pasar al siguiente jugador
      jugadorActual++;
      if (jugadorActual > numeroJugadores) {
        jugadorActual = 1; // Volver al jugador 1 si se supera el número de jugadores
      }
    }

    System.out.println("\nPuntuaciones finales:");
    for (int jugador = 1; jugador <= numeroJugadores; jugador++) {
      System.out.println(String.format("Jugador %d: %d", jugador, puntuaciones[jugador - 1]));
    }

    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    scanner.close();
  }
}