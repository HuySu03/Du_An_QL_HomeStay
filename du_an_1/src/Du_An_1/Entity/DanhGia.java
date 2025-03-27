/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.Entity;
import java.util.Date;
/**
 *
 * @author admin
 */
public class DanhGia {
    private String IdDG, IdKH, DanhGiaChiTiet;
    private int DanhGia;
    private Date ThoiGianDanhGia;

    public DanhGia() {
    }

    public DanhGia(String IdDG, String IdKH, String DanhGiaChiTiet, int DanhGia, Date ThoiGianDanhGia) {
        this.IdDG = IdDG;
        this.IdKH = IdKH;
        this.DanhGiaChiTiet = DanhGiaChiTiet;
        this.DanhGia = DanhGia;
        this.ThoiGianDanhGia = ThoiGianDanhGia;
    }

    public String getIdDG() {
        return IdDG;
    }

    public void setIdDG(String IdDG) {
        this.IdDG = IdDG;
    }

    public String getIdKH() {
        return IdKH;
    }

    public void setIdKH(String IdKH) {
        this.IdKH = IdKH;
    }

    public String getDanhGiaChiTiet() {
        return DanhGiaChiTiet;
    }

    public void setDanhGiaChiTiet(String DanhGiaChiTiet) {
        this.DanhGiaChiTiet = DanhGiaChiTiet;
    }

    public int getDanhGia() {
        return DanhGia;
    }

    public void setDanhGia(int DanhGia) {
        this.DanhGia = DanhGia;
    }

    public Date getThoiGianDanhGia() {
        return ThoiGianDanhGia;
    }

    public void setThoiGianDanhGia(Date ThoiGianDanhGia) {
        this.ThoiGianDanhGia = ThoiGianDanhGia;
    }
    
}
