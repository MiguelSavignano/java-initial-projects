package com.ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/tu_base";
    String usuario = "root";
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
