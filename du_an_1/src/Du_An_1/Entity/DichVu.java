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
public class DichVu {
    private String IdDV, TenDV, GhiChu;
    private BigDecimal GiaDV;

    public DichVu() {
    }

    public DichVu(String IdDV, String TenDV, String GhiChu, BigDecimal GiaDV) {
        this.IdDV = IdDV;
        this.TenDV = TenDV;
        this.GhiChu = GhiChu;
        this.GiaDV = GiaDV;
    }

    public String getIdDV() {
        return IdDV;
    }

    public void setIdDV(String IdDV) {
        this.IdDV = IdDV;
    }

    public String getTenDV() {
        return TenDV;
    }

    public void setTenDV(String TenDV) {
        this.TenDV = TenDV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public BigDecimal getGiaDV() {
        return GiaDV;
    }

    public void setGiaDV(BigDecimal GiaDV) {
        this.GiaDV = GiaDV;
    }
    
}
