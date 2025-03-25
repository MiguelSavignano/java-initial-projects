package com.ejemplo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("hola mundo");
    int numeroAleatorio = (int) (Math.random() * 11);
    Scanner scanner = new Scanner(System.in);
    boolean adivinado = false;

    while (!adivinado) {
      System.out.print("Introduce un número entero entre 0 y 10: ");
      int numeroEntero = scanner.nextInt();
      System.out.println("Has introducido: " + numeroEntero);

      if (numeroEntero == numeroAleatorio) {
        System.out.println("¡Ganaste! Adivinaste el número.");
        adivinado = true;
      } else {
        System.out.println("Incorrecto. Intenta de nuevo.");
      }
    }

    System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    scanner.close();
  }
}