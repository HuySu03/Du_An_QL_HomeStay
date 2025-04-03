/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;

import HS.Model.Model_Dang_Nhap;
import HS.Utils.JdbcHelPer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author huyhy
 */
public class Repo_Dang_Nhap {
   public void insert(Model_Dang_Nhap model) {
        String sql = "insert into dbo.Nhan_Vien(id_NV,ho_ten,sdt,email,dia_chi,gioi_tinh,tuoi,cccd,tai_khoan,mat_khau) values (?,?,?,?,?,?,?,?,?,?)";
        JdbcHelPer.executeUpdate(sql,
                model.getId_nv(),
                model.getHo_ten(),
                model.getSdt(),
                model.getEmail(),
                model.getDia_chi(),
                model.isGioitinh(),
                model.getTuoi(),
                model.getCccd(),
                model.getTai_khoan(),
                model.getMat_khau()
        );
    }
public Model_Dang_Nhap login(String taiKhoan, String matKhau) {
    String sql = "SELECT * FROM dbo.Nhan_Vien WHERE tai_khoan = ? AND mat_khau = ?";
    List<Model_Dang_Nhap> list = select(sql, taiKhoan, matKhau);
    return list.size() > 0 ? list.get(0) : null;
}

    public void updatePassword(Model_Dang_Nhap model) {
        String sql = "UPDATE dbo.Nhan_Vien SET mat_khau = ? where id_NV = ?";
        JdbcHelPer.executeUpdate(sql,
                model.getMat_khau(),
                model.getId_nv());
    }
    // chưa đụng tới.

    public void update(Model_Dang_Nhap model) {
        String sql = "UPDATE dbo.Nhan_Vien SET ho_ten=?, sdt=?,email=?,dia_chi=?,gioi_tinh=?,tuoi=?,cccd=?,mat_khau=? WHERE MaNV=?";
        JdbcHelPer.executeUpdate(sql,
                model.getHo_ten(),
                model.getSdt(),
                model.getEmail(),
                model.getDia_chi(),
                model.isGioitinh(),
                model.getTuoi(),
                model.getCccd(),
                model.getMat_khau()
        );
    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM dbo.Nhan_Vien WHERE id_NV=?";
        JdbcHelPer.executeUpdate(sql, MaNV);
    }

    public List<Model_Dang_Nhap> select() {
        String sql = "SELECT * FROM dbo.Nhan_Vien";
        return select(sql);
    }

    public Model_Dang_Nhap findById(String manv) {
        String sql = "SELECT * FROM dbo.Nhan_Vien WHERE id_NV=?";
        List<Model_Dang_Nhap> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;

    }

    private List<Model_Dang_Nhap> select(String sql, Object... args) {
        List<Model_Dang_Nhap> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelPer.executeQuery(sql, args);
                if (rs != null) {
                    while (rs.next()) {
                        Model_Dang_Nhap model = readFromResultSet(rs);
                        list.add(model);
                    }
                }
            } finally {
                if (rs != null) {
                    Connection connection;
                    try (Statement statement = rs.getStatement()) {
                        connection = statement.getConnection();
                        rs.close();
                    }
                    connection.close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Model_Dang_Nhap readFromResultSet(ResultSet rs) throws SQLException {
        Model_Dang_Nhap model = new Model_Dang_Nhap();
        model.setId_nv(rs.getString("id_NV"));
        model.setHo_ten(rs.getString("ho_ten"));
        model.setSdt(rs.getString("sdt"));
        model.setEmail(rs.getString("email"));
        model.setDia_chi(rs.getString("dia_chi"));
        model.setGioitinh(rs.getBoolean("gioi_tinh"));
        model.setTuoi(rs.getInt("tuoi"));
        model.setCccd(rs.getString("cccd"));
        return model;

    }

}
