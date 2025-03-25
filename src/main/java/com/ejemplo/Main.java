package com.ejemplo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("¡Bienvenido al juego de adivinar el número!");
    int numeroAleatorio = (int) (Math.random() * 11);
    Scanner scanner = new Scanner(System.in);
    boolean adivinado = false;
    int intentos = 0;
    int puntuacion = 0;

    while (!adivinado) {
      System.out.print("Introduce un número entero entre 0 y 10: ");
      int numeroEntero = scanner.nextInt();
      intentos++;
      System.out.println("Has introducido: " + numeroEntero);

      if (numeroEntero == numeroAleatorio) {
        System.out.println("¡Ganaste! Adivinaste el número.");
        adivinado = true;

        // Asignar puntuación según los intentos
        if (intentos == 1) {
          puntuacion = 100;
        } else if (intentos == 2) {
          puntuacion = 80;
        } else if (intentos == 3) {
          puntuacion = 60;
        } else {
          puntuacion = 40;
        }
      } else {
        System.out.println("Incorrecto. Intenta de nuevo.");
      }
    }

    System.out.println("Tu puntuación final es: " + puntuacion);
    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    scanner.close();
  }
}