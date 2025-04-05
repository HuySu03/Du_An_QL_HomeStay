/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;




import HS.Model.Model_Nhan_Vien;
import HS.Utils.DBconnet;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Nhuth
 */
public class Repo_NhanVien {
    private java.sql.Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public Repo_NhanVien(){
        con = DBconnet.getConnection();
    }
    
    public ArrayList<Model_Nhan_Vien> getAllNV(){
        ArrayList<Model_Nhan_Vien> listNV = new ArrayList<>();
        sql = "Select * from Nhan_Vien";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                String id,name,sdt,email,diachi,cccd,chuc;
                boolean gt;
                int tuoi;
                id = rs.getString(1);
                name = rs.getString(2);
                sdt = rs.getString(3);
                email = rs.getString(4);
                diachi = rs.getString(5);
                gt = rs.getBoolean(6);
                tuoi = rs.getInt(7);
                cccd = rs.getString(8);
                chuc = rs.getString(9);
                listNV.add(new Model_Nhan_Vien(diachi, sdt, sdt, email, diachi, gt, tuoi, cccd, gt));
            }
            return listNV;
        } catch ( Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public int addNV(Model_Nhan_Vien nv){
        sql = "INSERT INTO Nhan_Vien (id_NV, ho_ten, sdt, email, dia_chi, gioi_tinh, tuoi, cccd, chuc_vu) " +
                 "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            
            ps.setObject(1, nv.getId_Nhanvien());
            ps.setObject(2, nv.getHo_ten());
            ps.setObject(3, nv.getSđt());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.getDiachi());
            ps.setObject(6, nv.isGioitinh());
            ps.setObject(7, nv.getTuoi());
            ps.setObject(8, nv.getCCCD());
            
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    
    
    public int update_NhanVien(Model_Nhan_Vien nv_New){
        sql = "UPDATE Nhan_Vien SET id_NV=?, ho_ten=?, sdt=?, "
        + "email=?, dia_chi=?, gioi_tinh=?, tuoi=0, cccd=?, chuc_vu=? WHERE id_NV=?";
        try {
            ps = con.prepareStatement(sql);
            
            ps.setString(1, nv_New.getId_Nhanvien());
            ps.setString(2, nv_New.getHo_ten());
            ps.setString(3, nv_New.getSđt());
            ps.setString(4, nv_New.getEmail());
            ps.setString(5, nv_New.getDiachi());
            ps.setBoolean(6, true);
            ps.setInt(7, nv_New.getTuoi());
            ps.setString(8, nv_New.getCCCD());
          
            
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            try {
                if(ps != null) ps.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void NV_Soft_Delete(String id_NV){
        String sql = "UPDATE Nhan_Vien SET is_deleted = 1 WHERE NV_is_deleted = ?";
        try (PreparedStatement statement = con.prepareStatement(sql)) { // Sửa từ connection thành con
            statement.setString(1, id_NV);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Đã xóa mềm bản ghi có id_booking_phong = " + id_NV);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
