/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Quyet
 */
public class Model_KhachHang {
    String id_Khachhang;
    String Hoten;
    String sdt;
    String CCCD;
    String diachi;
    boolean gioitinh;
    int tuoi;

    public Model_KhachHang(String id_Khachhang, String Hoten, String sdt, String CCCD, String diachi, boolean gioitinh, int tuoi) {
        this.id_Khachhang = id_Khachhang;
        this.Hoten = Hoten;
        this.sdt = sdt;
        this.CCCD = CCCD;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    public String getId_Khachhang() {
        return id_Khachhang;
    }

    public void setId_Khachhang(String id_Khachhang) {
        this.id_Khachhang = id_Khachhang;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
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
     public Object[] toDataRow(){
        return new Object[]{
            this.getId_Khachhang(),this.getHoten(),this.getSdt(),this.getCCCD(),this.getDiachi(),this.isGioitinh()?"Nam":"Nữ",this.getTuoi()
        };
    }
    
}
