package HS.Repo;

import HS.Model.Model_KhachHang;
import HS.Utils.JdbcHelPer;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Repo_KhachHang {

    public void insert(Model_KhachHang model) {
        String sql = "INSERT INTO Khach_Hang (id_KH, ho_ten, sdt, CCCD, dia_chi,gioi_tinh,tuoi) VALUES (?, ?, ?, ?, ?, ?,?)";
        JdbcHelPer.executeUpdate(sql,
                model.getId_KH(),
                model.getHoten(),
                model.getSdt(),
                model.getCCCD(),
                
                model.getDiachi(),
                model.isGioitinh(),
                model.getTuoi()
        );
    }

    public List<Model_KhachHang> getAll() {
        String sql = "SELECT * FROM Khach_Hang";
        return select(sql);
    }

    public Model_KhachHang findById(String id_KH) {
        String sql = "SELECT * FROM Khach_Hang WHERE id_KH = ?";
        List<Model_KhachHang> list = select(sql, id_KH);
        return list.size() > 0 ? list.get(0) : null;
    }
//
//    public List<Model_KhachHang> selectByKeyword(String keyword) {
//        String sql = "SELECT * FROM KhachHang WHERE MaKH LIKE ? "
//                   + "UNION SELECT * FROM KhachHang WHERE TenKH LIKE ? "
//                   + "UNION SELECT * FROM KhachHang WHERE SoDT LIKE ? "
//                   + "UNION SELECT * FROM KhachHang WHERE CCCD LIKE ?";
//        String like = "%" + keyword + "%";
//        return select(sql, like, like, like, like);
//    }

    private List<Model_KhachHang> select(String sql, Object... args) {
        List<Model_KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelPer.executeQuery(sql, args);
                while (rs.next()) {
                    Model_KhachHang model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Model_KhachHang readFromResultSet(ResultSet rs) throws SQLException {
        Model_KhachHang model = new Model_KhachHang();
        model.setId_KH(rs.getString("id_KH"));
        model.setHoten(rs.getString("ho_ten"));
        model.setSdt(rs.getString("sdt"));
        model.setCCCD(rs.getString("CCCD"));
        model.setDiachi(rs.getString("dia_chi"));
        model.setGioitinh(rs.getBoolean("gioi_tinh"));
        model.setTuoi(rs.getInt("tuoi"));

        return model;
    }   
}
