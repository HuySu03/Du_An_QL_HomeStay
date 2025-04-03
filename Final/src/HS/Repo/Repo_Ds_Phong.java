/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;
import HS.Model.Model_Phong;
import HS.Utils.DBconnet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Repo_Ds_Phong {
     private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Repo_Ds_Phong() {
        con = DBconnet.getConnection();
    }

    public ArrayList<Model_Phong> getAll() {
        ArrayList<Model_Phong> list = new ArrayList<>();
        sql = "SELECT * FROM Phong";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Model_Phong(
                    rs.getString("id_Phong"),
                    rs.getBoolean("Loai_Phong"),
                    rs.getFloat("gia_phong"),
                    rs.getString("tang"),
                    rs.getInt("dien_tich"),
                    rs.getString("Ghi_Chu"),
                    rs.getBoolean("trang_thai")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Model_Phong findById(String id_Phong) {
        sql = "SELECT * FROM Phong WHERE id_phong = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id_Phong);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Model_Phong(
                    rs.getString("id_Phong"),
                    rs.getBoolean("Loai_Phong"),
                    rs.getFloat("gia_phong"),
                    rs.getString("tang"),
                    rs.getInt("dien_tich"),
                    rs.getString("Ghi_Chu"),
                    rs.getBoolean("trang_thai")
                );
            }
        } catch (Exception e) {
            System.err.println("Lỗi khi lấy thông tin phòng có ID: " + id_Phong);
            e.printStackTrace();
        }
        return null;
    }

    public int updateTrangThaiPhong(String id_Phong, boolean trangThai) {
        sql = "UPDATE Phong SET trang_thai=? WHERE id_Phong=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setBoolean(1, trangThai);  // Đặt trạng thái phòng
            ps.setString(2, id_Phong);    // ID của phòng cần cập nhật
            return ps.executeUpdate();  // Thực thi câu lệnh SQL
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

   private Model_Phong readFromResultSet(ResultSet rs) throws Exception {
    return new Model_Phong(
        rs.getString("id_Phong"),
        rs.getBoolean("Loai_Phong"),
        rs.getFloat("gia_phong"),
        rs.getString("tang"),
        rs.getInt("dien_tich"),
        rs.getString("Ghi_Chu"),
        rs.getBoolean("trang_thai")  // Cập nhật kiểu dữ liệu boolean
    );
}

}

