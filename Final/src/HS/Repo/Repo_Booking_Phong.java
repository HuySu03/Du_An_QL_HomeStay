/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;

import HS.Model.Model_Booking_Phong;
import HS.Utils.DBconnet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Quyet
 */
public class Repo_Booking_Phong {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Repo_Booking_Phong() {
        con = DBconnet.getConnection();
    }

    public ArrayList<Model_Booking_Phong> getAll() {
        ArrayList<Model_Booking_Phong> list = new ArrayList<>();

        sql = "select * from Booking_Phong where is_deleted = 0;";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                String id_booking_phong;
                String ngay_dat;
                String check_in;
                String check_out;
                String id_phong;
                String id_KH;
                String id_NV;
                

                id_booking_phong = rs.getString(1);
                ngay_dat = rs.getString(2);
                check_in = rs.getString(3);
                check_out = rs.getString(4);
                id_phong = rs.getString(5);
                id_KH = rs.getString(6);
                id_NV = rs.getString(7);

                list.add(new Model_Booking_Phong(id_booking_phong, ngay_dat, check_in, check_out, id_phong, id_KH, id_NV, true));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
public void deleteSoft(String bookingId) {
    String sql = "UPDATE booking_phong SET is_deleted = 1 WHERE id_booking_phong = ?";
    try (PreparedStatement statement = con.prepareStatement(sql)) { // Sửa từ connection thành con
        statement.setString(1, bookingId);
        int rowsAffected = statement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Đã xóa mềm bản ghi có id_booking_phong = " + bookingId);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    
}
  public int addPhong(Model_Booking_Phong u) {
        sql = "INSERT INTO booking_phong (id_booking_phong, id_phong, id_KH, id_NV, ngay_dat, check_in, check_out, is_deleted) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, 0)";
        try {
            ps = con.prepareStatement(sql);

            ps.setObject(1, u.getId_booking_phong());
            ps.setObject(2, u.getId_phong());
            ps.setObject(3, u.getId_KH());
            ps.setObject(4, u.getId_NV());
            ps.setObject(5, u.getNgay_dat());
            ps.setObject(6, u.getCheck_in());
            ps.setObject(7, u.getCheck_out());
            
            
            return ps.executeUpdate();//thêm/sủa/xoá:executeUpđate()
        } catch (Exception e) {
            e.printStackTrace();
            return 0;

        }
    }
  
public int updatePhong(Model_Booking_Phong u_New) {
    sql = "UPDATE Booking_Phong SET ngay_dat=?, check_in=?, check_out=?, "
        + "id_phong=?, id_KH=?, id_NV=?, is_deleted=0 WHERE id_booking_phong=?";
    try {
        ps = con.prepareStatement(sql);

        // Xử lý ngày đặt
        if (u_New.getNgay_dat() != null && !u_New.getNgay_dat().isEmpty()) {
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date parsedDate = format.parse(u_New.getNgay_dat());
                ps.setDate(1, new java.sql.Date(parsedDate.getTime())); 
            } catch (Exception e) {
                e.printStackTrace();
                ps.setNull(1, java.sql.Types.DATE);
            }
        } else {
            ps.setNull(1, java.sql.Types.DATE);
        }

        // Xử lý check-in
        if (u_New.getCheck_in() != null && !u_New.getCheck_in().isEmpty()) {
            ps.setTimestamp(2, Timestamp.valueOf(u_New.getCheck_in()));
        } else {
            ps.setNull(2, java.sql.Types.TIMESTAMP);
        }

        // Xử lý check-out
        if (u_New.getCheck_out() != null && !u_New.getCheck_out().isEmpty()) {
            ps.setTimestamp(3, Timestamp.valueOf(u_New.getCheck_out()));
        } else {
            ps.setNull(3, java.sql.Types.TIMESTAMP);
        }

        ps.setString(4, u_New.getId_phong()); 
        ps.setString(5, u_New.getId_KH()); 
        ps.setString(6, u_New.getId_NV()); 
        ps.setString(7, u_New.getId_booking_phong());

        return ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    } finally {
        try {
            if (ps != null) ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
}



     /*public int updatePhong(Model_Booking_Phong u_New, String ac_sua) {
        sql = "UPDATE Booking_Phong SET ngay_dat=?, check_in=?, check_out=?, "
                   + "id_phong=?, id_KH=?, id_NV=?, is_deleted=0 WHERE id_booking_phong=?";
        try {
        ps = con.prepareStatement(sql);
        
        ps.setDate(1, (u_New.getNgay_dat())); // ngày đặt
        ps.setTimestamp(2, (u_New.getCheck_in())); // check-in
        ps.setTimestamp(3, (u_New.getCheck_out())); // check-out
        ps.setString(4, u_New.getId_phong()); // ID phòng
        ps.setString(5, u_New.getId_KH()); // ID khách hàng
        ps.setString(6, u_New.getId_NV()); // ID nhân viên
        ps.setString(7, u_New.getId_booking_phong()); // WHERE điều kiện cập nhật

        return ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
    }
}
*/