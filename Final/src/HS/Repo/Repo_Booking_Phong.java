package HS.Repo;

import HS.Model.Model_Booking_Phong;
import HS.Utils.JdbcHelPer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 
 */
public class Repo_Booking_Phong{

    // Thêm mới một đơn đặt phòng
public void insert(Model_Booking_Phong model) {
   String sql = "INSERT INTO Booking_Phong (check_in, check_out, id_phong, id_KH, id_NV, is_deleted) VALUES (?, ?, ?, ?, ?, ?)";
JdbcHelPer.executeUpdate(sql,
    model.getCheck_in(),
    model.getCheck_out(),
    model.getId_phong(),
    model.getId_KH(),
    model.getId_NV(),
    0);


    }


    // Lấy tất cả đơn đặt phòng
    public List<Model_Booking_Phong> getAll() {
        String sql = "SELECT * FROM Booking_Phong";
         List<Model_Booking_Phong> bookings = new ArrayList<>();
        return executeQuery(sql);
        
    }

    // Lấy đơn đặt phòng theo từ khóa tìm kiếm
//    public List<Model_Booking_Phong> getByKeyword(String keyword) {
//        String sql = "SELECT * FROM Booking_Phong WHERE MaKH LIKE ? "
//                + "UNION SELECT * FROM KhachHang WHERE MaDP LIKE ? "
//                + "UNION SELECT * FROM KhachHang WHERE MaNV LIKE ? "
//                + "UNION SELECT * FROM KhachHang WHERE MaKieuThue LIKE ? "
//                + "UNION SELECT * FROM KhachHang WHERE MaPhong LIKE ? "
//                + "UNION SELECT * FROM KhachHang WHERE MaKH LIKE ?";
//        return executeQuery(sql, "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%", "%" + keyword + "%");
//    }

    // Tìm đơn đặt phòng theo mã khách hàng
    public Model_Booking_Phong getByMaKH(String maKH) {
        String sql = "SELECT * FROM Booking_Phong WHERE id_KH=?";
        List<Model_Booking_Phong> list = executeQuery(sql, maKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    // Tìm đơn đặt phòng theo mã đơn phòng
    public Model_Booking_Phong getByMaDP(int maDP) {
        String sql = "SELECT * FROM Booking_Phong WHERE id_booking_phong=?";
        List<Model_Booking_Phong> list = executeQuery(sql, maDP);
        return list.size() > 0 ? list.get(0) : null;
    }   

    // Tìm đơn đặt phòng theo mã phòng
    public List<Model_Booking_Phong> getByMaPhong(String maPhong) {
        String sql = "SELECT * FROM Booking_Phong WHERE id_phong=?";
        return executeQuery(sql, maPhong);
    }

    // Thực thi câu lệnh SQL và trả về danh sách các đối tượng DatPhong
    private List<Model_Booking_Phong> executeQuery(String sql, Object... args) {
        List<Model_Booking_Phong> list = new ArrayList<>();
        try (ResultSet rs = JdbcHelPer.executeQuery(sql, args)) {
            while (rs.next()) {
                Model_Booking_Phong model = mapResultSetToDatPhong(rs);
                list.add(model);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    // Chuyển ResultSet thành đối tượng DatPhong
    private Model_Booking_Phong mapResultSetToDatPhong(ResultSet rs) throws SQLException {
        Model_Booking_Phong model = new Model_Booking_Phong();
        model.setId_booking_phong(rs.getString("id_booking_phong"));
        model.setCheck_in(rs.getDate("Check_in"));
        model.setCheck_out(rs.getDate("Check_out"));
        model.setId_phong(rs.getString("id_phong"));
        model.setId_KH(rs.getString("id_KH"));
        model.setId_NV(rs.getString("id_NV"));
        
        
        
        return model;
    }
  

}


