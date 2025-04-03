/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;

import HS.Model.Model_Booking_Phong;
import HS.Model.Model_Phong;
import HS.Utils.DBconnet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Quyet
 */
public class Repo_Phong {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Repo_Phong() {
        con = DBconnet.getConnection();
    }

    public ArrayList<Model_Phong>getAll() {
        ArrayList<Model_Phong> list = new ArrayList<>();

        sql = "select * from Phong ";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                String id_phong;
                boolean loai_phong;
                String gia_phong;
                String tang;
                float dientich;
                String ghichu;
                boolean trangthai;

                id_phong = rs.getString(1);
                loai_phong = rs.getBoolean(2);
                gia_phong = rs.getString(3);
                tang = rs.getString(4);
                dientich = rs.getFloat(5);
                ghichu = rs.getString(6);
                trangthai  = rs.getBoolean(7);

                list.add(new Model_Phong(id_phong, loai_phong, dientich, tang, 0, ghichu, trangthai));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
