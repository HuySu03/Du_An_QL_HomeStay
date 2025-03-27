/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Admin
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=HomeStay;encrypt=false";
    private static final String USER = "sa";
    private static final String PASSWORD = "123";  // Thay bằng mật khẩu SQL Server của bạn

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

