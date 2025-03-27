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
public class OderDichVu {
    private String IdOderDV, IdDV, IdPhong, GhiChu;
    private Date NgayOder;

    public OderDichVu() {
    }

    public OderDichVu(String IdOderDV, String IdDV, String IdPhong, String GhiChu, Date NgayOder) {
        this.IdOderDV = IdOderDV;
        this.IdDV = IdDV;
        this.IdPhong = IdPhong;
        this.GhiChu = GhiChu;
        this.NgayOder = NgayOder;
    }

    public String getIdOderDV() {
        return IdOderDV;
    }

    public void setIdOderDV(String IdOderDV) {
        this.IdOderDV = IdOderDV;
    }

    public String getIdDV() {
        return IdDV;
    }

    public void setIdDV(String IdDV) {
        this.IdDV = IdDV;
    }

    public String getIdPhong() {
        return IdPhong;
    }

    public void setIdPhong(String IdPhong) {
        this.IdPhong = IdPhong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Date getNgayOder() {
        return NgayOder;
    }

    public void setNgayOder(Date NgayOder) {
        this.NgayOder = NgayOder;
    }
    
          
}
