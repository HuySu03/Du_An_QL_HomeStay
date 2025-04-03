/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author HuySu
 */
public class Model_Dang_Nhap {

    private String id_nv;
    private String ho_ten;
    private String sdt;
    private String email;
    private String dia_chi;
    private String tai_khoan;
    private String mat_khau;
    private String cccd;
    private boolean gioitinh;
    private int tuoi;

    public Model_Dang_Nhap(String id_nv, String ho_ten, String sdt, String email, String dia_chi, String tai_khoan, String mat_khau, String cccd, boolean gioitinh, int tuoi) {
        this.id_nv = id_nv;
        this.ho_ten = ho_ten;
        this.sdt = sdt;
        this.email = email;
        this.dia_chi = dia_chi;
        this.tai_khoan = tai_khoan;
        this.mat_khau = mat_khau;
        this.cccd = cccd;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

  

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    

    public Model_Dang_Nhap() {
    }

    public String getId_nv() {
        return id_nv;
    }

    public void setId_nv(String id_nv) {
        this.id_nv = id_nv;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
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

    public String getTai_khoan() {
        return tai_khoan;
    }

    public void setTai_khoan(String tai_khoan) {
        this.tai_khoan = tai_khoan;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}
