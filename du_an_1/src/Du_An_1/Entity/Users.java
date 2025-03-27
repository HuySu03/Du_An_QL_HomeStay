/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Du_An_1.Entity;

/**
 *
 * @author admin
 */
public class Users {
    private String IdNV, TaiKhoan, MatKhau;

    public Users() {
    }

    public Users(String IdNV, String TaiKhoan, String MatKhau) {
        this.IdNV = IdNV;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
    }

    public String getIdNV() {
        return IdNV;
    }

    public void setIdNV(String IdNV) {
        this.IdNV = IdNV;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
}
