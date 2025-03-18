package com.ejemplo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String operacion= "";
    int resultado = 0;
    while (true) {
      

      System.out.println("Que operacion quuieres hacer? +,*");
      operacion = leer.next();
      System.out.println(operacion); 


      if ("+".equals(operacion)) {
        System.out.println("numero: ");
      int numero1 = leer.nextInt();
        System.out.println("operacion sumar"); 
        resultado = Sumar.run(resultado, numero1);
      }
    }
  }

}
