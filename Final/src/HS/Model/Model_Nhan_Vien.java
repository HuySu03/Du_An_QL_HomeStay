/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Admin
 */
public class Model_Nhan_Vien {
    String id_Nhanvien;
    String Ho_ten;
    String sđt;
    String email;
    String diachi;
    boolean gioitinh;
    int tuoi;
    String CCCD;


    public Model_Nhan_Vien(String id_Nhanvien, String Ho_ten, String sđt, String email, String diachi, boolean gioitinh, int tuoi, String CCCD, boolean chucvu) {
        this.id_Nhanvien = id_Nhanvien;
        this.Ho_ten = Ho_ten;
        this.sđt = sđt;
        this.email = email;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
        this.CCCD = CCCD;
   
    }

    public String getId_Nhanvien() {
        return id_Nhanvien;
    }

    public void setId_Nhanvien(String id_Nhanvien) {
        this.id_Nhanvien = id_Nhanvien;
    }

    public String getHo_ten() {
        return Ho_ten;
    }

    public void setHo_ten(String Ho_ten) {
        this.Ho_ten = Ho_ten;
    }

    public String getSđt() {
        return sđt;
    }

    public void setSđt(String sđt) {
        this.sđt = sđt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

   
    
      public Object[] toDataRow(){
        return new Object[]{
            this.getId_Nhanvien(),this.getHo_ten(),this.getSđt(),this.getEmail(),this.isGioitinh()?"Nam":"Nữ",this.getTuoi(),this.getCCCD()
        };
    }
}
