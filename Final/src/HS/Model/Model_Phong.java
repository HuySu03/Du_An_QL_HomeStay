/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Quyet
 */
public class Model_Phong {
    String id_phong;
    boolean loai_phong;
    float gia_phong;
    boolean trangthai;

    public Model_Phong() {
    }

    public Model_Phong(String id_phong, boolean loai_phong, float gia_phong, boolean trangthai) {
        this.id_phong = id_phong;
        this.loai_phong = loai_phong;
        this.gia_phong = gia_phong;
     
        this.trangthai = trangthai;
    }
    
  

    public String getId_phong() {
        return id_phong;
    }

    public void setId_phong(String id_phong) {
        this.id_phong = id_phong;
    }

    public boolean isLoai_phong() {
        return loai_phong;
    }

    public void setLoai_phong(boolean loai_phong) {
        this.loai_phong = loai_phong;
    }
    public String getLoaiPhong() {
        return loai_phong ? "VIP" : "Thường";
    }

    public float getGia_phong() {
        return gia_phong;
    }

    public void setGia_phong(float gia_phong) {
        this.gia_phong = gia_phong;
    }

 

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
      public String getTrangThai() {
        return trangthai ? "Đang sử dụng" : "Chưa sử dụng";
    }

 
    }
    

