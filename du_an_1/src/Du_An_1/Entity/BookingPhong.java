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
public class BookingPhong {
    private Date NgayDat, CheckIn, CheckOut;
    private String IdPhong, IdKH, IdNV;

    public BookingPhong() {
    }

    public BookingPhong(Date NgayDat, Date CheckIn, Date CheckOut, String IdPhong, String IdKH, String IdNV) {
        this.NgayDat = NgayDat;
        this.CheckIn = CheckIn;
        this.CheckOut = CheckOut;
        this.IdPhong = IdPhong;
        this.IdKH = IdKH;
        this.IdNV = IdNV;
    }

    public Date getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(Date NgayDat) {
        this.NgayDat = NgayDat;
    }

    public Date getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(Date CheckIn) {
        this.CheckIn = CheckIn;
    }

    public Date getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(Date CheckOut) {
        this.CheckOut = CheckOut;
    }

    public String getIdPhong() {
        return IdPhong;
    }

    public void setIdPhong(String IdPhong) {
        this.IdPhong = IdPhong;
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
    
}
