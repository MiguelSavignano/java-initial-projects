package com.ejemplo;

import java.util.UUID;

public class UrlShortener {
  public static String generateRandomShortUrl() {
    return UUID.randomUUID().toString().substring(0, 8);
  }
}
