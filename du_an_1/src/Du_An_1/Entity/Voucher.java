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
public class Voucher {
    private String IdVoucher, TenVoucher;
    private Date NgayTao, NgayHetHan;
    private int ChietKhau;
    private boolean TrangThai;

    public Voucher() {
    }

    public Voucher(String IdVoucher, String TenVoucher, Date NgayTao, Date NgayHetHan, int ChietKhau, boolean TrangThai) {
        this.IdVoucher = IdVoucher;
        this.TenVoucher = TenVoucher;
        this.NgayTao = NgayTao;
        this.NgayHetHan = NgayHetHan;
        this.ChietKhau = ChietKhau;
        this.TrangThai = TrangThai;
    }

    public String getIdVoucher() {
        return IdVoucher;
    }

    public void setIdVoucher(String IdVoucher) {
        this.IdVoucher = IdVoucher;
    }

    public String getTenVoucher() {
        return TenVoucher;
    }

    public void setTenVoucher(String TenVoucher) {
        this.TenVoucher = TenVoucher;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public Date getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(Date NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }

    public int getChietKhau() {
        return ChietKhau;
    }

    public void setChietKhau(int ChietKhau) {
        this.ChietKhau = ChietKhau;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
            
}
