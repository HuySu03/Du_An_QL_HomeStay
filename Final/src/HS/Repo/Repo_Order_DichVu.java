package HS.repo;

import HS.Model.Model_Order_DichVu;
import HS.Utils.JdbcHelPer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Repo_Order_DichVu {

    // Thêm dịch vụ đã thuê
    public void insert(Model_Order_DichVu model) {
        String sql = "INSERT INTO Order_Dich_Vu ( id_DV, id_phong, ten_DV,Don_Gia) VALUES (?, ?, ?, ?)";
        JdbcHelPer.executeUpdate(sql,
                model.getId_DV(),
                model.getId_phong(),
                model.getTen_Dv(),
                model.getDon_Gia()
        );

    }

    // Tìm dịch vụ đã thuê theo mã đặt phòng
    public List<Model_Order_DichVu> findById(int maDP) {
        String sql = "SELECT * FROM Order_Dich_Vu WHERE MaDP = ?";
        return executeQuery(sql, maDP);
    }

    // Xóa dịch vụ đã thuê theo mã đặt phòng
    public void delete(int maDP) {
        String sql = "DELETE FROM Order_Dich_Vu WHERE MaDP = ?";
        JdbcHelPer.executeUpdate(sql, maDP);
    }

    // Thực thi câu lệnh SQL và trả về danh sách dịch vụ đã thuê
    private List<Model_Order_DichVu> executeQuery(String sql, Object... args) {
        List<Model_Order_DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelPer.executeQuery(sql, args);
                while (rs.next()) {
                    // Chuyển ResultSet thành đối tượng DichVuDaThue
                    Model_Order_DichVu model = mapResultSetToModel(rs);
                    list.add(model);
                }
            } finally {
                // Đảm bảo đóng kết nối sau khi sử dụng
                if (rs != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Error executing query", ex);
        }
        return list;
    }

    // Chuyển ResultSet thành đối tượng DichVuDaThue
    private Model_Order_DichVu mapResultSetToModel(ResultSet rs) throws SQLException {
        Model_Order_DichVu model = new Model_Order_DichVu();
        model.setId_order_DV(rs.getString("id_order_DV"));
        model.setId_DV(rs.getString("id_DV"));
        model.setId_phong(rs.getString("id_phong"));

        return model;
    }

    
}
