/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.Entity;

/**
 *
 * @author admin
 */
public class NhanVien {
    private String IdNV, HoTen, SDT, Email, DiaChi, CCCD, ChucVu;
    private boolean GioiTinh;
    private int Tuoi;

    public NhanVien() {
    }

    public NhanVien(String IdNV, String HoTen, String SDT, String Email, String DiaChi, String CCCD, String ChucVu, boolean GioiTinh, int Tuoi) {
        this.IdNV = IdNV;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.CCCD = CCCD;
        this.ChucVu = ChucVu;
        this.GioiTinh = GioiTinh;
        this.Tuoi = Tuoi;
    }

    public String getIdNV() {
        return IdNV;
    }

    public void setIdNV(String IdNV) {
        this.IdNV = IdNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    
}
