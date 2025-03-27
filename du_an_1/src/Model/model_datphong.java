/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class model_datphong {
    private String idOrder;
    private Date ngayDat;
    private Date checkIn;
    private Date checkOut;
    private String idHS;
    private String idKH;
    private String idNV;

    public model_datphong() {
    }

    public model_datphong(String idOrder, Date ngayDat, Date checkIn, Date checkOut, String idHS, String idKH, String idNV) {
        this.idOrder = idOrder;
        this.ngayDat = ngayDat;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.idHS = idHS;
        this.idKH = idKH;
        this.idNV = idNV;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getIdHS() {
        return idHS;
    }

    public void setIdHS(String idHS) {
        this.idHS = idHS;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

   

}
