/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Quyet
 */
public class Model_Order_DichVu {
    String id_order_DV;
    String id_DV;
    String id_phong;
    String ten_Dv;
    String Don_Gia;

    public Model_Order_DichVu() {
    }

    public Model_Order_DichVu(String id_order_DV, String id_DV, String id_phong, String ten_Dv, String Don_Gia) {
        this.id_order_DV = id_order_DV;
        this.id_DV = id_DV;
        this.id_phong = id_phong;
        this.ten_Dv = ten_Dv;
        this.Don_Gia = Don_Gia;
    }

    public String getId_order_DV() {
        return id_order_DV;
    }

    public void setId_order_DV(String id_order_DV) {
        this.id_order_DV = id_order_DV;
    }

    public String getId_DV() {
        return id_DV;
    }

    public void setId_DV(String id_DV) {
        this.id_DV = id_DV;
    }

    public String getId_phong() {
        return id_phong;
    }

    public void setId_phong(String id_phong) {
        this.id_phong = id_phong;
    }

    public String getTen_Dv() {
        return ten_Dv;
    }

    public void setTen_Dv(String ten_Dv) {
        this.ten_Dv = ten_Dv;
    }

    public String getDon_Gia() {
        return Don_Gia;
    }

    public void setDon_Gia(String Don_Gia) {
        this.Don_Gia = Don_Gia;
    }
    
    

  
    
}
