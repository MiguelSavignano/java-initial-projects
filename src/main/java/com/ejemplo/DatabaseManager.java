package com.ejemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
  private static final String URL = "jdbc:sqlite:/app/my_database.db";

  public static void initializeDatabase() {
    try (Connection conn = DriverManager.getConnection(URL);
        Statement stmt = conn.createStatement()) {
      // Read SQL script from file
      String sqlScript = readSqlScript("src/main/resources/create_table.sql");
      stmt.execute(sqlScript);
    } catch (SQLException | IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private static String readSqlScript(String filePath) throws IOException {
    StringBuilder script = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        script.append(line).append("\n");
      }
    }
    return script.toString();
  }

  public static void saveUrl(Url url) {
    String sql = "INSERT INTO urls(url, url_short) VALUES(?, ?)";

    try (Connection conn = DriverManager.getConnection(URL);
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, url.getUrl());
      pstmt.setString(2, url.getUrl_short());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }
}
