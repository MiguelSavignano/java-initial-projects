package com.ejemplo;

public class CalcularMedia {

    public static void run() {
        // Declarar el arreglo de números
        double[] numeros = {1, 3, 6, 8, 0, 8.5};

        // Inicializar la variable total a 0
        double total = 0;

        // Iterar sobre cada número del arreglo y sumar al total
        for (double numero : numeros) {
            total = total + numero;
        }

        // Calcular la media dividiendo el total entre la longitud del arreglo
        double media = total / numeros.length;

        // Mostrar el resultado
        System.out.println("La media de los números es: " + media);
    }
}