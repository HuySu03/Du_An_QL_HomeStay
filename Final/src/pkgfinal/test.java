/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgfinal;
 import HS.Model.Model_Phong;

/**
 *
 * @author Quyet
 */
public class test {



    public static void main(String[] args) {
        // Tạo 2 phòng test - 1 VIP, 1 Thường
        Model_Phong phongVip = new Model_Phong("P101", true, 500000, true);
        Model_Phong phongThuong = new Model_Phong("P102", false, 300000, false);

        // In ra để kiểm tra
        System.out.println("Phòng: " + phongVip.getId_phong());
        System.out.println("Loại phòng: " + phongVip.getLoaiPhong()); // Phải là VIP
        System.out.println("Trạng thái: " + phongVip.getTrangThai()); // Đang sử dụng

        System.out.println("--------------------");

        System.out.println("Phòng: " + phongThuong.getId_phong());
        System.out.println("Loại phòng: " + phongThuong.getLoaiPhong()); // Phải là Thường
        System.out.println("Trạng thái: " + phongThuong.getTrangThai()); // Chưa sử dụng
    }
}
   

