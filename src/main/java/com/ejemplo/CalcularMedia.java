package com.ejemplo;

public class CalcularMedia {

    public static void main(String[] args) {
        // Declarar el arreglo de números
        int[] numeros = {1, 3, 6, 8, 0, 8};

        // Inicializar la variable total a 0
        int total = 0;

        // Iterar sobre cada número del arreglo y sumar al total
        for (int numero : numeros) {
            total = total + numero;
        }

        // Calcular la media dividiendo el total entre la longitud del arreglo
        double media = (double) total / numeros.length;

        // Mostrar el resultado
        System.out.println("La media de los números es: " + media);
    }
}