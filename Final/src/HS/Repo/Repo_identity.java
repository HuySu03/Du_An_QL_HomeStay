/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;

import HS.Model.Model_indentity;
import HS.Utils.JdbcHelPer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Repo_identity {

    // Đổi tên phương thức thành identity()
    public Model_indentity identity() {
        String sql = "SELECT IDENT_CURRENT('Booking_Phong') as 'maphieu'";
        List<Model_indentity> list = select(sql);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<Model_indentity> select(String sql, Object... args) {
        List<Model_indentity> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelPer.executeQuery(sql, args);
                while (rs.next()) {
                    Model_indentity model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                if (rs != null && rs.getStatement() != null) {
                    rs.getStatement().getConnection().close();
                }
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private Model_indentity readFromResultSet(ResultSet rs) throws SQLException {
        Model_indentity model = new Model_indentity();
        model.setIndentity(rs.getInt("maphieu"));  // Đảm bảo tên cột trong ResultSet khớp
        return model;
    }
}

   


