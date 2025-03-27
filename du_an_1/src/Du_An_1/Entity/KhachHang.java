/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.Entity;

/**
 *
 * @author admin
 */
public class KhachHang {
    private String IdKH, HoTen, SDT, CCCD, DiaChi;
    private boolean GioiTinh;
    private int Tuoi;

    public KhachHang() {
    }

    public KhachHang(String IdKH, String HoTen, String SDT, String CCCD, String DiaChi, boolean GioiTinh, int Tuoi) {
        this.IdKH = IdKH;
        this.HoTen = HoTen;
        this.SDT = SDT;
        this.CCCD = CCCD;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
        this.Tuoi = Tuoi;
    }

    public String getIdKH() {
        return IdKH;
    }

    public void setIdKH(String IdKH) {
        this.IdKH = IdKH;
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

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
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
