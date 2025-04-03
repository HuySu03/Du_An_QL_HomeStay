/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Quyet
 */
public class Model_Booking_Phong {
    String id_booking_phong;
    String ngay_dat;
    String check_in;
    String check_out;
    String id_phong;
    String id_KH;
    String id_NV;
    boolean is_deleted;

    public Model_Booking_Phong() {
    }

    public Model_Booking_Phong(String id_booking_phong, String ngay_dat, String check_in, String check_out, String id_phong, String id_KH, String id_NV, boolean is_deleted) {
        this.id_booking_phong = id_booking_phong;
        this.ngay_dat = ngay_dat;
        this.check_in = check_in;
        this.check_out = check_out;
        this.id_phong = id_phong;
        this.id_KH = id_KH;
        this.id_NV = id_NV;
        this.is_deleted = is_deleted;
    }

    public String getId_booking_phong() {
        return id_booking_phong;
    }

    public void setId_booking_phong(String id_booking_phong) {
        this.id_booking_phong = id_booking_phong;
    }

    public String getNgay_dat() {
        return ngay_dat;
    }

    public void setNgay_dat(String ngay_dat) {
        this.ngay_dat = ngay_dat;
    }

    public String getCheck_in() {
        return check_in;
    }

    public void setCheck_in(String check_in) {
        this.check_in = check_in;
    }

    public String getCheck_out() {
        return check_out;
    }

    public void setCheck_out(String check_out) {
        this.check_out = check_out;
    }

    public String getId_phong() {
        return id_phong;
    }

    public void setId_phong(String id_phong) {
        this.id_phong = id_phong;
    }

    public String getId_KH() {
        return id_KH;
    }

    public void setId_KH(String id_KH) {
        this.id_KH = id_KH;
    }

    public String getId_NV() {
        return id_NV;
    }

    public void setId_NV(String id_NV) {
        this.id_NV = id_NV;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }
    



  
      public Object[] toDataRow(){
        return new Object[]{
            this.getId_booking_phong(),this.getId_phong(),this.getId_KH(),this.getId_NV(),this.getNgay_dat(),this.getCheck_in(),this.getCheck_out()
        };
    }
}
