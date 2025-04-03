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
    String ngay_order;
    String ghichu;

    public Model_Order_DichVu() {
    }

    public Model_Order_DichVu(String id_order_DV, String id_DV, String id_phong, String ngay_order, String ghichu) {
        this.id_order_DV = id_order_DV;
        this.id_DV = id_DV;
        this.id_phong = id_phong;
        this.ngay_order = ngay_order;
        this.ghichu = ghichu;
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

    public String getNgay_order() {
        return ngay_order;
    }

    public void setNgay_order(String ngay_order) {
        this.ngay_order = ngay_order;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
    
      public Object[] toDataRow(){
        return new Object[]{
            this.getId_order_DV(),this.getId_DV(),this.getId_phong(),this.getNgay_order(),this.getGhichu()
        };
    }
    
    
}
