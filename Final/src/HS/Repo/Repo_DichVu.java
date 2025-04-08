package HS.Repo;

import HS.Model.Model_DichVu;
import HS.Utils.JdbcHelPer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Repo_DichVu {

    // Lấy tất cả dịch vụ
    public List<Model_DichVu> getAll() {
        String sql = "SELECT * FROM Dich_Vu";
        return executeQuery(sql);
    }

    // Tìm dịch vụ theo tên
    public Model_DichVu findByName(String tenDV) {
        String sql = "SELECT * FROM Dich_Vu WHERE ten_DV=?";
        List<Model_DichVu> list = executeQuery(sql, tenDV);
        return list.size() > 0 ? list.get(0) : null;
    }

    // Thực thi câu lệnh SQL và trả về danh sách dịch vụ
    private List<Model_DichVu> executeQuery(String sql, Object... args) {
        List<Model_DichVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelPer.executeQuery(sql, args);
                while (rs.next()) {
                    // Chuyển ResultSet thành đối tượng DichVu
                    Model_DichVu model = mapResultSetToModel(rs);
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

    // Chuyển ResultSet thành đối tượng DichVu
    private Model_DichVu mapResultSetToModel(ResultSet rs) throws SQLException {
        Model_DichVu model = new Model_DichVu();
        model.setIdDV(rs.getString("id_DV"));
        model.setTenDV(rs.getString("ten_DV"));
        model.setGiaDV(rs.getFloat("gia_DV"));
        return model;
    }
}
