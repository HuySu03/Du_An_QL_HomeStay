/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package HS.View;

import HS.Model.Model_Booking_Phong;
import HS.Repo.Repo_Booking_Phong;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Phong_Vieww extends javax.swing.JPanel {
private Repo_Booking_Phong repo = new Repo_Booking_Phong();
    private DefaultTableModel mol = new DefaultTableModel();
    private int index = -1;
    /**
     * Creates new form Phong_Vieww
     */
    private View_Main mainForm;
     private String MaPhong;
    private String LoaiPhong;
   public Phong_Vieww(String maphong, String loaiphong, View_Main main) {
        initComponents();
        this.fillTable(repo.getAll());
        index = repo.getAll().size();
        this.mainForm = main;
        this.MaPhong = maphong;
        this.LoaiPhong = loaiphong;
        
        //this.showData(index-1);  
    }

   
public boolean checkDate() {
    try {
        Date ngayden = txt_checkin.getDate();
        Date ngaydi = txt_checkout.getDate();

        if (ngayden == null || ngaydi == null) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ ngày đến và ngày đi");
            return false;
        }

        if (ngayden.after(ngaydi)) {
            JOptionPane.showMessageDialog(null, "Checkin không được lớn hơn Checkout");
            return false;
        }

        return true; // Ngày hợp lệ
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Lỗi khi kiểm tra ngày!");
        e.printStackTrace();
        return false;
    }
}


    private void fillTable(ArrayList<Model_Booking_Phong> list) {

        mol = (DefaultTableModel) tbl_bang.getModel();

        mol.setRowCount(0);
        for (Model_Booking_Phong x : list) {
            mol.addRow(x.toDataRow());
        }
    }

   final void showData(int index) {
    try {
        txt_id_booking_phong.setText(tbl_bang.getValueAt(index, 0).toString());
        txt_idPhong.setText(tbl_bang.getValueAt(index, 1).toString());
        txt_idKH.setText(tbl_bang.getValueAt(index, 2).toString());
        txt_idNV.setText(tbl_bang.getValueAt(index, 3).toString());

        // Chuyển String sang Date rồi gán vào JDateChooser
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date ngayDatDate = sdf.parse(tbl_bang.getValueAt(index, 4).toString());
        Calendar ngayDatCal = Calendar.getInstance();
        ngayDatCal.setTime(ngayDatDate);
        txt_ngaydat.setCalendar(ngayDatCal);

        Date checkInDate = sdf.parse(tbl_bang.getValueAt(index, 5).toString());
        Calendar checkInCal = Calendar.getInstance();
        checkInCal.setTime(checkInDate);
        txt_checkin.setCalendar(checkInCal);

        Date checkOutDate = sdf.parse(tbl_bang.getValueAt(index, 6).toString());
        Calendar checkOutCal = Calendar.getInstance();
        checkOutCal.setTime(checkOutDate);
        txt_checkout.setCalendar(checkOutCal);

    } catch (Exception e) {
        e.printStackTrace();
    }
}
Model_Booking_Phong readForm() {
    String id_booking_phong;
    String ngay_dat;
    String check_in;
    String check_out;
    String id_phong;
    String id_KH;
    String id_NV;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    if (txt_id_booking_phong.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID đặt phòng trống");
        txt_id_booking_phong.requestFocus();
        return null;
    } 
    id_booking_phong = txt_id_booking_phong.getText().trim();

    if (txt_ngaydat.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Ngày đặt trống");
        txt_ngaydat.requestFocus();
        return null;
    } 
    ngay_dat = sdf.format(txt_ngaydat.getDate());

    if (txt_checkin.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Check-in trống");
        txt_checkin.requestFocus();
        return null;
    } 
    check_in = sdf.format(txt_checkin.getDate());

    if (txt_checkout.getDate() == null) {
        JOptionPane.showMessageDialog(this, "Check-out trống");
        txt_checkout.requestFocus();
        return null;
    } 
    check_out = sdf.format(txt_checkout.getDate());

    if (txt_idPhong.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID phòng trống");
        txt_idPhong.requestFocus();
        return null;
    } 
    id_phong = txt_idPhong.getText().trim();

    if (txt_idKH.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID khách hàng trống");
        txt_idKH.requestFocus();
        return null;
    } 
    id_KH = txt_idKH.getText().trim();

    if (txt_idNV.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID nhân viên trống");
        txt_idNV.requestFocus();
        return null;
    } 
    id_NV = txt_idNV.getText().trim();

    return new Model_Booking_Phong(id_booking_phong, ngay_dat, check_in, check_out, id_phong, id_KH, id_NV, true);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bang = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_idKH = new javax.swing.JTextField();
        txt_idNV = new javax.swing.JTextField();
        txt_idPhong = new javax.swing.JTextField();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        txt_id_booking_phong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_checkin = new com.toedter.calendar.JDateChooser();
        txt_checkout = new com.toedter.calendar.JDateChooser();
        txt_ngaydat = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(" QUẢN LÝ ĐẶT PHÒNG");

        tbl_bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Booking", "Id_Phong", "Id_KH", "Id_NV", "Ngay_Dat", "Check_In", "Check_Out"
            }
        ));
        tbl_bang.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bang);

        jLabel4.setText("MÃ NHÂN VIÊN");

        jLabel5.setText("MÃ KHÁCH HÀNG");

        jLabel6.setText("MÃ PHÒNG");

        jLabel7.setText("MÃ ĐẶT PHÒNG");

        jLabel9.setText("CHECK IN");

        jLabel10.setText("CHECK OUT");

        txt_idKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idKHActionPerformed(evt);
            }
        });

        btn_them.setText("THÊM");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        txt_id_booking_phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_booking_phongActionPerformed(evt);
            }
        });

        jLabel11.setText("NGÀY ĐẶT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(txt_idNV))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                .addGap(257, 257, 257))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idKH)
                                    .addComponent(txt_id_booking_phong)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_sua)
                                            .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_ngaydat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(177, 177, 177))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_idPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_idNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_idKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_ngaydat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(btn_them))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_idPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_booking_phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(btn_xoa))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_checkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bangMouseClicked
        // TODO add your handling code here:
        index = tbl_bang.getSelectedRow();
        this.showData(index);
    }//GEN-LAST:event_tbl_bangMouseClicked

    private void txt_idKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idKHActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_idKHActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        if (this.readForm() != null) {
            if (!checkDate()) {  // Nếu checkDate() trả về false, dừng lại luôn
                return;
            }

            repo.addPhong(this.readForm());
            JOptionPane.showMessageDialog(this, "Thêm thành công");

            this.fillTable(repo.getAll());
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        int index = tbl_bang.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Lấy ID đặt phòng từ bảng
        String acount = tbl_bang.getValueAt(index, 0).toString();

        // Đọc dữ liệu từ form và gán ID đặt phòng vào đối tượng cập nhật
        Model_Booking_Phong updatedBooking = this.readForm();
        updatedBooking.setId_booking_phong(acount); // Cập nhật ID của đặt phòng cần sửa

        // Gọi phương thức update
        int result = repo.updatePhong(updatedBooking);

        if (result > 0) {
            JOptionPane.showMessageDialog(this, "Đã sửa thành công");
            this.fillTable(repo.getAll()); // Cập nhật lại bảng sau khi sửa
        } else {
            JOptionPane.showMessageDialog(this, "Sửa không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        index = tbl_bang.getSelectedRow();
        String bookingID = tbl_bang.getValueAt(index, 0).toString();
        repo.deleteSoft(bookingID );
        JOptionPane.showMessageDialog(this, "Xoá thành công");
        this.fillTable(repo.getAll());
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void txt_id_booking_phongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_booking_phongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_booking_phongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_bang;
    private com.toedter.calendar.JDateChooser txt_checkin;
    private com.toedter.calendar.JDateChooser txt_checkout;
    private javax.swing.JTextField txt_idKH;
    private javax.swing.JTextField txt_idNV;
    private javax.swing.JTextField txt_idPhong;
    private javax.swing.JTextField txt_id_booking_phong;
    private com.toedter.calendar.JDateChooser txt_ngaydat;
    // End of variables declaration//GEN-END:variables
}
