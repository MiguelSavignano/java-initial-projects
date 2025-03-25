package com.ejemplo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("hola mundo");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    int numeroEntero = scanner.nextInt();
    System.out.println("Has introducido: " + numeroEntero);

    int numeroAleatorio = (int) (Math.random() * 11);

    // Imprime el número aleatorio
    System.out.println("El número aleatorio es: " + numeroAleatorio);

    if(numeroEntero == numeroAleatorio) {
      System.out.println("Ganaste");
      
    }else{
      System.out.println("Perdiste");
    }







  }
}    