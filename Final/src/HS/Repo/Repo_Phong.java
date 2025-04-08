    package HS.Repo;

    import HS.Model.Model_Phong;
    import HS.Utils.DBconnet;
    import HS.Utils.JdbcHelPer;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.ArrayList;
    import java.util.List;

    /**
     *
     * @author Quyet
     */
    public class Repo_Phong {

        // Lấy danh sách phòng
        public List<Model_Phong> getAll() {
            String sql = "SELECT * FROM Phong";
            return executeQuery(sql);
        }

        // Tìm phòng theo mã phòng
        public Model_Phong getById(String maphong) {
            String sql = "select * from Phong WHERE id_phong = ?";
            List<Model_Phong> list = executeQuery(sql, maphong);
            return list.size() > 0 ? list.get(0) : null;
        }

        // Cập nhật trạng thái phòng
        public void update(Model_Phong model) {
            String sql = "UPDATE Phong SET trang_thai=? WHERE id_phong=?";
            JdbcHelPer.executeUpdate(sql,
                    model.isTrangthai(),
                    model.getId_phong());
        }

        // Thực thi câu lệnh SQL và trả về danh sách phòng
       private List<Model_Phong> executeQuery(String sql, Object... args) {
    List<Model_Phong> list = new ArrayList<>();
    ResultSet rs = null;
    try {
        rs = JdbcHelPer.executeQuery(sql, args);
        if (rs != null) { // Kiểm tra nếu rs không null
            while (rs.next()) {
                Model_Phong model = mapResultSetToModel(rs);
                list.add(model);
            }
        }
    } catch (SQLException ex) {
                throw new RuntimeException(ex);
    } finally {
        if (rs != null) { // Kiểm tra lại nếu rs không null trước khi đóng kết nối
            try {
                if(rs.getStatement() != null) {
                    rs.getStatement().getConnection().close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    return list;
}


        // Chuyển ResultSet thành đối tượng Model_Phong
  private Model_Phong mapResultSetToModel(ResultSet rs) throws SQLException {
    Model_Phong model = new Model_Phong();
    model.setId_phong(rs.getString("id_phong"));
    model.setLoai_phong(rs.getBoolean("loai_phong")); // <- QUAN TRỌNG
    model.setGia_phong(rs.getFloat("gia_phong"));
    model.setTrangthai(rs.getBoolean("trang_thai"));   // <- QUAN TRỌNG
    return model;
}


    }
