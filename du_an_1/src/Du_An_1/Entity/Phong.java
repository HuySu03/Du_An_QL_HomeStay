/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.Entity;

import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class Phong {
    private String IdPhong, Tang, GhiChu;
    private boolean LoaiPhong;
    private BigDecimal GiaPhong;
    private int DienTich;

    public Phong() {
    }

    public Phong(String IdPhong, String Tang, String GhiChu, boolean LoaiPhong, BigDecimal GiaPhong, int DienTich) {
        this.IdPhong = IdPhong;
        this.Tang = Tang;
        this.GhiChu = GhiChu;
        this.LoaiPhong = LoaiPhong;
        this.GiaPhong = GiaPhong;
        this.DienTich = DienTich;
    }

    public String getIdPhong() {
        return IdPhong;
    }

    public void setIdPhong(String IdPhong) {
        this.IdPhong = IdPhong;
    }

    public String getTang() {
        return Tang;
    }

    public void setTang(String Tang) {
        this.Tang = Tang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public boolean isLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(boolean LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    public BigDecimal getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(BigDecimal GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public int getDienTich() {
        return DienTich;
    }

    public void setDienTich(int DienTich) {
        this.DienTich = DienTich;
    }
    
}
