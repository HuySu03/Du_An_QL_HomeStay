/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Admin
 */
public class Model_Phong {
    String id_Phong;
    boolean Loai_Phong;
    float Gia;
    String tang;
    int dientich;
    String Ghi_Chu;
    boolean Trangthai;

    public Model_Phong() {
    }

    public Model_Phong(String id_Phong, boolean Loai_Phong) {
        this.id_Phong = id_Phong;
        this.Loai_Phong = Loai_Phong;
    }
    
    
    
    

    public Model_Phong(String id_Phong, boolean Loai_Phong, float Gia, String tang, int dientich, String Ghi_Chu, boolean Trangthai) {
        this.id_Phong = id_Phong;
        this.Loai_Phong = Loai_Phong;
        this.Gia = Gia;
        this.tang = tang;
        this.dientich = dientich;
        this.Ghi_Chu = Ghi_Chu;
        this.Trangthai = Trangthai;
    }

    public String getId_Phong() {
        return id_Phong;
    }

    public void setId_Phong(String id_Phong) {
        this.id_Phong = id_Phong;
    }

    public boolean isLoai_Phong() {
        return Loai_Phong;
    }

    public void setLoai_Phong(boolean Loai_Phong) {
        this.Loai_Phong = Loai_Phong;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public String getTang() {
        return tang;
    }

    public void setTang(String tang) {
        this.tang = tang;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public String getGhi_Chu() {
        return Ghi_Chu;
    }

    public void setGhi_Chu(String Ghi_Chu) {
        this.Ghi_Chu = Ghi_Chu;
    }

    public boolean isTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(boolean Trangthai) {
        this.Trangthai = Trangthai;
    }
    
     public String getLoaiPhongAsString() {
        return Loai_Phong ? "VIP" : "Thường";
    }
      public String getTrangThaiAsString() {
        return Trangthai ? "Đang sử dụng" : "Trống";
    }
  public Object[] toDataRow(){
        return new Object[]{
            this.getId_Phong(),this.getLoaiPhongAsString(),this.getGia(),this.getTang(),this.getDientich(),this.getGhi_Chu(),this.getTrangThaiAsString()
        };
    }
   
    
}
