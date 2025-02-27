package com.ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {
    String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/test_database";
    String usuario = "user";
    String contraseña = "password";

    try {
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
      System.out.println("✅ Conexión exitosa");
      conexion.close();
    } catch (SQLException e) {
      System.out.println("❌ No se pudo conectar");
      e.printStackTrace();
    }
  }
}
