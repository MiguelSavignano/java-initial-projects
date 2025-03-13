package com.ejemplo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String opcion= "";
    Scanner leer = new Scanner(System.in);
    opcion = leer.nextLine();
    System.out.println("Que operacion quuieres hacer? 1 o 2");

    System.out.println(opcion);

    if ("1".equals(opcion)) {
      CalcularMedia.run();
      System.out.println("opcion 1");
    } else if ("2".equals(opcion)) { 
      System.out.println("opcion 2");
      BuscarDuplicados.run();
    }
  }
}
