/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.Untils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DBConnect {
    public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=QLKS_DB;encrypt=true;trustServerCertificate=true";
    public static String username = "sa";
    public static String password = "123123";
//    public static String password = "123";
  //  public static String password = "myPassw0rd";
    public static Connection conn;

    static {
        try {
            Class.forName(driver);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    public static Connection getConnect() {
		try {
			        Connection conn = DriverManager.getConnection(dburl, username, password);

		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, username, password);
        PreparedStatement stmt;
        if (sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;

    }

    public static int update(String sql, Object... args)  {
        try {
            PreparedStatement stmt = DBConnect.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stmt = DBConnect.getStmt(sql, args);
        return stmt.executeQuery();
    }
    public static int sp_dp()throws SQLException {
	Connection conn = DriverManager.getConnection(dburl, username, password);
	 CallableStatement cstmt = conn.prepareCall("{call sp_loadPhong}");
	int rs = cstmt.executeUpdate();
	return rs;
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = DBConnect.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
