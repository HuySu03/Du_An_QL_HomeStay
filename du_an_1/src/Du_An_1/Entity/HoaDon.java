/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.Entity;
import java.math.BigDecimal;
import java.util.Date;
/**
 *
 * @author admin
 */
public class HoaDon {
    private String IdHD, IdVoucher, IdOderDV, IdBookingPhong, IdKH, IdNV, GhiChu;
    private Date NgayTao;
    private boolean LoaiThanhToan, TrangThai;
    private BigDecimal TongTien;

    public HoaDon() {
    }

    public HoaDon(String IdHD, String IdVoucher, String IdOderDV, String IdBookingPhong, String IdKH, String IdNV, String GhiChu, Date NgayTao, boolean LoaiThanhToan, boolean TrangThai, BigDecimal TongTien) {
        this.IdHD = IdHD;
        this.IdVoucher = IdVoucher;
        this.IdOderDV = IdOderDV;
        this.IdBookingPhong = IdBookingPhong;
        this.IdKH = IdKH;
        this.IdNV = IdNV;
        this.GhiChu = GhiChu;
        this.NgayTao = NgayTao;
        this.LoaiThanhToan = LoaiThanhToan;
        this.TrangThai = TrangThai;
        this.TongTien = TongTien;
    }

    public String getIdHD() {
        return IdHD;
    }

    public void setIdHD(String IdHD) {
        this.IdHD = IdHD;
    }

    public String getIdVoucher() {
        return IdVoucher;
    }

    public void setIdVoucher(String IdVoucher) {
        this.IdVoucher = IdVoucher;
    }

    public String getIdOderDV() {
        return IdOderDV;
    }

    public void setIdOderDV(String IdOderDV) {
        this.IdOderDV = IdOderDV;
    }

    public String getIdBookingPhong() {
        return IdBookingPhong;
    }

    public void setIdBookingPhong(String IdBookingPhong) {
        this.IdBookingPhong = IdBookingPhong;
    }

    public String getIdKH() {
        return IdKH;
    }

    public void setIdKH(String IdKH) {
        this.IdKH = IdKH;
    }

    public String getIdNV() {
        return IdNV;
    }

    public void setIdNV(String IdNV) {
        this.IdNV = IdNV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public boolean isLoaiThanhToan() {
        return LoaiThanhToan;
    }

    public void setLoaiThanhToan(boolean LoaiThanhToan) {
        this.LoaiThanhToan = LoaiThanhToan;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public BigDecimal getTongTien() {
        return TongTien;
    }

    public void setTongTien(BigDecimal TongTien) {
        this.TongTien = TongTien;
    }
    
}