/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

import java.util.Date;

/**
 *
 * @author Quyet
 */
public class Model_Booking_Phong {
    String id_booking_phong;
    
    Date check_in;
    Date check_out;
    String id_phong;
    String id_KH;
    String id_NV;
    boolean is_deleted;

    public Model_Booking_Phong() {
    }

    public Model_Booking_Phong(String id_booking_phong, Date check_in, Date check_out, String id_phong, String id_KH, String id_NV, boolean is_deleted) {
        this.id_booking_phong = id_booking_phong;
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

    public Date getCheck_in() {
        return check_in;
    }

    public void setCheck_in(Date check_in) {
        this.check_in = check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public void setCheck_out(Date check_out) {
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
            this.getId_booking_phong(),this.getId_phong(),this.getId_KH(),this.getId_NV(),this.getCheck_in(),this.getCheck_out()
        };
    }
}
