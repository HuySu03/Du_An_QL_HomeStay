/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Repo;

import HS.Model.Model_DichVu;
import HS.Utils.DBconnet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Quyet
 */
public class Repo_DichVu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public Repo_DichVu() {
        con = DBconnet.getConnection();
    }

    public ArrayList<Model_DichVu> getAll() {
        ArrayList<Model_DichVu> list = new ArrayList<>();

        sql = "select * from Dich_Vu ";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String idDV;
                String tenDV;
                float giaDV;
                String ghichu;

                idDV = rs.getString(1);
                tenDV = rs.getString(2);
                giaDV = rs.getFloat(3);
              
                ghichu = rs.getString(4);

                list.add(new Model_DichVu(idDV, tenDV, giaDV, ghichu));
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
