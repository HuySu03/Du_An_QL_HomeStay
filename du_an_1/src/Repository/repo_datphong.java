/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import Model.model_datphong;
    import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Admin
 */
public class repo_datphong {
    public List<model_datphong> getAllOrders() {
    List<model_datphong> orders = new ArrayList<>();
    String query = "SELECT * FROM Order_HomeStay";
    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {

        while (rs.next()) {
            model_datphong order = new model_datphong(
                    rs.getString("id_order_HS"),
                    rs.getDate("ngay_dat"),
                    rs.getDate("check_in"),
                    rs.getDate("check_out"),
                    rs.getString("id_HS"),
                    rs.getString("id_KH"),
                    rs.getString("id_NV")
            );
            orders.add(order);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return orders;
}



    // 1. Thêm đặt phòng mới
    public boolean addOrderHomeStay(String idOrder, Date ngayDat, Date checkIn, Date checkOut, 
                                    String idHS, String idKH, String idNV) {
        String query = "INSERT INTO Order_HomeStay (id_order_HS, ngay_dat, check_in, check_out, id_HS, id_KH, id_NV) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, idOrder);
            pstmt.setDate(2, ngayDat);
            pstmt.setDate(3, checkIn);
            pstmt.setDate(4, checkOut);
            pstmt.setString(5, idHS);
            pstmt.setString(6, idKH);
            pstmt.setString(7, idNV);

            return pstmt.executeUpdate() > 0; // Trả về true nếu thành công
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 2. Cập nhật thông tin đặt phòng
    public boolean updateOrderHomeStay(String idOrder, Date ngayDat, Date checkIn, Date checkOut, 
                                       String idHS, String idKH, String idNV) {
        String query = "UPDATE Order_HomeStay SET ngay_dat = ?, check_in = ?, check_out = ?, id_HS = ?, id_KH = ?, id_NV = ? WHERE id_order_HS = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setDate(1, ngayDat);
            pstmt.setDate(2, checkIn);
            pstmt.setDate(3, checkOut);
            pstmt.setString(4, idHS);
            pstmt.setString(5, idKH);
            pstmt.setString(6, idNV);
            pstmt.setString(7, idOrder);

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 3. Xóa đặt phòng
    public boolean deleteOrderHomeStay(String idOrder) {
        String query = "DELETE FROM Order_HomeStay WHERE id_order_HS = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, idOrder);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // 4.

    // 5. Lấy thông tin đặt phòng theo ID
    public model_datphong getOrderById(String idOrder) {
        String query = "SELECT * FROM Order_HomeStay WHERE id_order_HS = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, idOrder);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new model_datphong(
                        rs.getString("id_order_HS"),
                        rs.getDate("ngay_dat"),
                        rs.getDate("check_in"),
                        rs.getDate("check_out"),
                        rs.getString("id_HS"),
                        rs.getString("id_KH"),
                        rs.getString("id_NV")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

