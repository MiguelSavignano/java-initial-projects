package com.ejemplo;

import java.util.ArrayList;
import java.util.HashSet;


public class BuscarDuplicados {

    public static void main(String[] args) {
        // Declarar el arreglo de números
        int[] numeros = {1, 3, 6, 8, 0, 8};

        // Inicializar la memoria (conjunto de números vistos) y la lista de duplicados
        HashSet<Integer> memoria = new HashSet<>();
        ArrayList<Integer> duplicados = new ArrayList<>();

        // Iterar sobre cada número del arreglo
        for (int numero : numeros) {
            // Si el número ya está en la memoria, es un duplicado
            if (memoria.contains(numero) && !duplicados.contains(numero)) {
                duplicados.add(numero);
            } else {
                // Si no está en la memoria, agregarlo a la memoria
                memoria.add(numero);
            }
        }

        // Mostrar los duplicados encontrados
        System.out.println("Los números duplicados son: " + duplicados);
    }
}