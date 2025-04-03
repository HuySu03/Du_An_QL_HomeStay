/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;

import HS.Model.Model_Booking_Phong;
import HS.Model.Model_Order_DichVu;
import HS.Utils.DBconnet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Quyet
 */
public class Repo_Order_DichVu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Repo_Order_DichVu() {
        con = DBconnet.getConnection();
    }

    public ArrayList<Model_Order_DichVu> getAll() {
        ArrayList<Model_Order_DichVu> list = new ArrayList<>();

        sql = "select * from Order_Dich_Vu ";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String id_order_DV;
                String id_DV;
                String id_phong;
                String ngay_order;
                String ghichu;

                id_order_DV = rs.getString(1);
                id_DV = rs.getString(2);
                id_phong = rs.getString(3);
                ngay_order = rs.getString(4);
                ghichu = rs.getString(5);
               

                list.add(new Model_Order_DichVu(id_order_DV, id_DV, id_phong, ngay_order, ghichu));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
