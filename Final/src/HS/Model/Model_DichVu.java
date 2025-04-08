/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HS.Model;

/**
 *
 * @author Quyet
 */
public class Model_DichVu {
    String idDV;
    String tenDV;
    float giaDV;
    String ghichu;

    public Model_DichVu() {
    }

    public Model_DichVu(String idDV, String tenDV, float giaDV, String ghichu) {
        this.idDV = idDV;
        this.tenDV = tenDV;
        this.giaDV = giaDV;
        this.ghichu = ghichu;
    }

 

  

    public String getIdDV() {
        return idDV;
    }

    public void setIdDV(String idDV) {
        this.idDV = idDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public float getGiaDV() {
        return giaDV;
    }

    public void setGiaDV(float giaDV) {
        this.giaDV = giaDV;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
      public Object[] toDataRow(){
        return new Object[]{
            this.getIdDV(),this.getTenDV(),this.getGiaDV(),this.getGhichu()
        };
    }
    
    
}
