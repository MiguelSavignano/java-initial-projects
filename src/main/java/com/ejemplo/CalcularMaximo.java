package com.ejemplo;

public class CalcularMaximo {

    public static void run() {
        // Declarar el arreglo de números
        int[] numeros = {1, 3, 6, 8, 0, 8};

        // Inicializar la variable maximo en null
        Integer maximo = null;

        // Iterar sobre cada número del arreglo
        for (int numero : numeros) {
            // Si maximo es null (es el primer número), asignar el valor de numero
            if (maximo == null || numero > maximo) {
                maximo = numero;
            }
        }

        // Mostrar el resultado
        if (maximo != null) {
            System.out.println("El valor máximo es: " + maximo);
        } else {
            System.out.println("El arreglo está vacío.");
        }
    }
}