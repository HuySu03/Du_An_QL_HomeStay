package HS.Repo;

import HS.Model.Model_NhanVien;
import HS.Utils.JdbcHelPer;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Repo_NhanVien {

    public void insert(Model_NhanVien model) {
        String sql = "INSERT INTO Nhan_Vien (id_NV, ho_ten, sdt, email, dia_chi, tai_khoan, mat_khau, cccd, gioi_tinh, tuoi, is_deleted) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JdbcHelPer.executeUpdate(sql,
            model.getId_nv(),
            model.getHo_ten(),
            model.getSdt(),
            model.getEmail(),
            model.getDia_chi(),
            model.getTai_khoan(),
            model.getMat_khau(),
            model.getCccd(),
            model.isGioitinh(),
            model.getTuoi(),
            0
        );
    }

    public void update(Model_NhanVien model) {
        String sql = "UPDATE Nhan_Vien SET ho_ten = ?, sdt = ?, email = ?, dia_chi = ?, tai_khoan = ?, mat_khau = ?, cccd = ?, gioi_tinh = ?, tuoi = ? WHERE id_NV = ?";
        JdbcHelPer.executeUpdate(sql,
            model.getHo_ten(),
            model.getSdt(),
            model.getEmail(),
            model.getDia_chi(),
            model.getTai_khoan(),
            model.getMat_khau(),
            model.getCccd(),
            model.isGioitinh(),
            model.getTuoi(),
            model.getId_nv()
        );
    }

    public void softDelete(String id_nv) {
        String sql = "UPDATE Nhan_Vien SET is_deleted = 1 WHERE id_NV = ?";
        JdbcHelPer.executeUpdate(sql, id_nv);
    }

    public ArrayList<Model_NhanVien> getAll() {
        String sql = "SELECT * FROM Nhan_Vien WHERE is_deleted = 0";
        ArrayList<Model_NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelPer.executeQuery(sql);
            while (rs.next()) {
                Model_NhanVien nv = new Model_NhanVien(
                    rs.getString("id_NV"),
                    rs.getString("ho_ten"),
                    rs.getString("sdt"),
                    rs.getString("email"),
                    rs.getString("dia_chi"),
                    rs.getString("tai_khoan"),
                    rs.getString("mat_khau"),
                    rs.getString("cccd"),
                    rs.getBoolean("gioi_tinh"),
                    rs.getInt("tuoi")
                );
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
