package com.ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {

    // URL original
    String urlFull = "https://sdkman.io/install#windows-installation";

    // Generar URL corta
    String urlShort = UrlShortener.generateRandomShortUrl();

    // Crear un objeto Url
    Url url = new Url(urlFull, urlShort);

    // Imprimir la URL completa y la URL corta
    System.out.println("Full URL: " + url.getUrl());
    System.out.println("Short URL: " + url.getUrl_short());
  }
}


