package com.ejemplo;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String operacion= "";
    int resultado = 0;
    while (true) {
      

      System.out.println("Que operacion quieres hacer? +,*");
      operacion = leer.next();
      System.out.println(operacion); 


      if ("+".equals(operacion)) {
        System.out.println("numero: ");
      int numero1 = leer.nextInt();
        System.out.println("operacion sumar"); 
        resultado = Sumar.run(resultado, numero1);

      }else if ("resta".equals(operacion)) {
        System.out.println("numero: ");
        int numero1 = leer.nextInt();
        System.out.println("operacion Restar");
        resultado = Restar.run(resultado, numero1);

      }else if ("multiplicar".equals(operacion)) {
        System.out.println("numero: ");
        int numero1 = leer.nextInt();
        System.out.println("operacion Multiplicar");
      resultado = Multiplicar.run(resultado, numero1);
     } else if ("/".equals(operacion)) {
      System.out.println("numero: ");
      int numero1 = leer.nextInt();
      System.out.println("/");
    resultado = Dividir.run(resultado, numero1);
     }
    }
  }

}
