package com.ejemplo;

import java.util.Random;

public class UrlShortener {

  // Método para generar un identificador aleatorio para la URL corta
  public static String generateRandomShortUrl() {
    // Caracteres posibles para la URL corta
    String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();
    StringBuilder shortUrl = new StringBuilder();

    // Generar una cadena de 8 caracteres aleatorios
    for (int i = 0; i < 8; i++) {
      int index = random.nextInt(characters.length());
      shortUrl.append(characters.charAt(index));
    }

    // Retornar la URL corta como "http://short.url/{identificador_aleatorio}"
    return "http://short.url/" + shortUrl.toString();
  }
}
