/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Nhuth
 */
public class Model_NhanVien {
    String id_NV;
    String hoten;
    String sdt;
    String email;
    String dia_chi;
    boolean gioi_tinh;
    int tuoi;
    String cccd;
    String chucvu;

    public Model_NhanVien() {
    }

    public Model_NhanVien(String id_NV, String hoten, String sdt, String email, String dia_chi, boolean gioi_tinh, int tuoi, String cccd, String chucvu) {
        this.id_NV = id_NV;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.dia_chi = dia_chi;
        this.gioi_tinh = gioi_tinh;
        this.tuoi = tuoi;
        this.cccd = cccd;
        this.chucvu = chucvu;
    }

    public String getId_NV() {
        return id_NV;
    }

    public void setId_NV(String id_NV) {
        this.id_NV = id_NV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public boolean isGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(boolean gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            this.getId_NV(),this.getHoten(),this.getSdt(),this.getEmail(),this.getDia_chi(),this.isGioi_tinh()?"Nam":"Nữ",
            this.getTuoi(),this.getCccd(),this.getChucvu()
        };
    }
}