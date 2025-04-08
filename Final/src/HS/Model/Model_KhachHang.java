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
    String id_KH;
    String Hoten;
    String sdt;
    String CCCD;
    String diachi;
    boolean gioitinh;
    int tuoi;

    public Model_KhachHang(String id_KH, String Hoten, String sdt, String CCCD, String diachi, boolean gioitinh, int tuoi) {
        this.id_KH = id_KH;
        this.Hoten = Hoten;
        this.sdt = sdt;
        this.CCCD = CCCD;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    public Model_KhachHang() {
    }

  

    public String getId_KH() {
        return id_KH;
    }

    public void setId_KH(String id_KH) {
        this.id_KH = id_KH;
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
            this.getId_KH(),this.getHoten(),this.getSdt(),this.getCCCD(),this.getDiachi(),this.isGioitinh()?"Nam":"Nữ",this.getTuoi()
        };
    }
    
}
