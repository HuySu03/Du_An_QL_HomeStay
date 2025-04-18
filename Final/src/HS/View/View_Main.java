/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HS.View;

import HS.Utils.ShareHelper;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class View_Main extends javax.swing.JFrame {

    /**
     * Creates new form View_Main
     */
    public View_Main() {
        initComponents();
    }
    
     public void startProgram() {
    if (ShareHelper.authenticated()) {
        showPanel(new JpanelTrangChu()); // Đảm bảo đúng tên class
    } else if (ShareHelper.authenticatedNV()) {
        showPanel(new JpanelTrangChu());
        if (btnThongKe != null) { // Kiểm tra tránh lỗi NullPointerException
            btnThongKe.setEnabled(false);
        }
    } else {
        System.out.println("Không thể xác thực tài khoản. Vui lòng đăng nhập lại.");
        // Có thể thêm xử lý như hiển thị hộp thoại thông báo
    }
}
    
    public void showPanel(JPanel panel) {
//        chidrenpanel = panel;
        JpanelView.removeAll();
        JpanelView.setLayout(new BoxLayout(JpanelView, BoxLayout.Y_AXIS)); // Đặt layout thành BoxLayout theo chiều dọc
        JpanelView.add(panel);
        JpanelView.validate();
        JpanelView.repaint();
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpanelView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        JpanelTrangChu = new javax.swing.JPanel();
        btnTrangchu = new javax.swing.JButton();
        JpanelNhanVien = new javax.swing.JPanel();
        btnNhanVien = new javax.swing.JButton();
        JpanelKhachHang = new javax.swing.JPanel();
        btnKhachhang = new javax.swing.JButton();
        JpanelQLPhong = new javax.swing.JPanel();
        btnPhong = new javax.swing.JButton();
        JpanelHoaDon = new javax.swing.JPanel();
        btnHoaDon = new javax.swing.JButton();
        JpanelThongKe = new javax.swing.JPanel();
        btnThongKe = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpanelView.setBackground(new java.awt.Color(255, 255, 204));
        JpanelView.setPreferredSize(new java.awt.Dimension(730, 556));
        JpanelView.setRequestFocusEnabled(false);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("CHÀO MỪNG ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dịch vụ tốt nhất, Đúng lúc, Đúng người");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HS/IMG/ok.jpg"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HS/IMG/result_homestay background.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("“Chốn yên vui, rủ hội The Boys – Đến rồi yêu, chill rồi quên lối.”");

        javax.swing.GroupLayout JpanelViewLayout = new javax.swing.GroupLayout(JpanelView);
        JpanelView.setLayout(JpanelViewLayout);
        JpanelViewLayout.setHorizontalGroup(
            JpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelViewLayout.createSequentialGroup()
                .addGroup(JpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpanelViewLayout.createSequentialGroup()
                        .addGroup(JpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelViewLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(228, 228, 228)
                                .addComponent(jLabel4))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpanelViewLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelViewLayout.setVerticalGroup(
            JpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelViewLayout.createSequentialGroup()
                .addGroup(JpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(JpanelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addGroup(JpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Xin chào");

        lblTenNV.setText("Tên nhân viên");

        JpanelTrangChu.setBackground(new java.awt.Color(204, 204, 255));

        btnTrangchu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTrangchu.setText("Trang chủ");
        btnTrangchu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTrangchu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangchuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelTrangChuLayout = new javax.swing.GroupLayout(JpanelTrangChu);
        JpanelTrangChu.setLayout(JpanelTrangChuLayout);
        JpanelTrangChuLayout.setHorizontalGroup(
            JpanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpanelTrangChuLayout.setVerticalGroup(
            JpanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpanelNhanVien.setBackground(new java.awt.Color(204, 204, 255));

        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhanVien.setText(" Nhân viên");
        btnNhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelNhanVienLayout = new javax.swing.GroupLayout(JpanelNhanVien);
        JpanelNhanVien.setLayout(JpanelNhanVienLayout);
        JpanelNhanVienLayout.setHorizontalGroup(
            JpanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpanelNhanVienLayout.setVerticalGroup(
            JpanelNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpanelKhachHang.setBackground(new java.awt.Color(204, 204, 255));

        btnKhachhang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKhachhang.setText("Quản lí khách hàng");
        btnKhachhang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachhangMouseClicked(evt);
            }
        });
        btnKhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachhangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelKhachHangLayout = new javax.swing.GroupLayout(JpanelKhachHang);
        JpanelKhachHang.setLayout(JpanelKhachHangLayout);
        JpanelKhachHangLayout.setHorizontalGroup(
            JpanelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpanelKhachHangLayout.setVerticalGroup(
            JpanelKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpanelKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnKhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        JpanelQLPhong.setBackground(new java.awt.Color(204, 204, 255));

        btnPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPhong.setText("Quản lí phòng");
        btnPhong.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelQLPhongLayout = new javax.swing.GroupLayout(JpanelQLPhong);
        JpanelQLPhong.setLayout(JpanelQLPhongLayout);
        JpanelQLPhongLayout.setHorizontalGroup(
            JpanelQLPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelQLPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpanelQLPhongLayout.setVerticalGroup(
            JpanelQLPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelQLPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpanelHoaDon.setBackground(new java.awt.Color(204, 204, 255));

        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHoaDon.setText("Hoá đơn");
        btnHoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelHoaDonLayout = new javax.swing.GroupLayout(JpanelHoaDon);
        JpanelHoaDon.setLayout(JpanelHoaDonLayout);
        JpanelHoaDonLayout.setHorizontalGroup(
            JpanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpanelHoaDonLayout.setVerticalGroup(
            JpanelHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpanelThongKe.setBackground(new java.awt.Color(204, 204, 255));

        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpanelThongKeLayout = new javax.swing.GroupLayout(JpanelThongKe);
        JpanelThongKe.setLayout(JpanelThongKeLayout);
        JpanelThongKeLayout.setHorizontalGroup(
            JpanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        JpanelThongKeLayout.setVerticalGroup(
            JpanelThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 51, 51));
        btnDangXuat.setText("Thoát");
        btnDangXuat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseClicked(evt);
            }
        });
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpanelNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JpanelKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JpanelQLPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JpanelHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JpanelThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(JpanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenNV)
                .addGap(9, 9, 9)
                .addComponent(JpanelTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JpanelNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JpanelKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JpanelQLPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JpanelHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JpanelThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpanelView, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JpanelView, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangchuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangchuActionPerformed
        // TODO add your handling code here:
        showPanel(new JpanelTrangChu());
    }//GEN-LAST:event_btnTrangchuActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
//        showPanel(new JpanelNhanVien(this));
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachhangMouseClicked
        // TODO add your handling code here:

//        showPanel(new JpanelKhachHang());

    }//GEN-LAST:event_btnKhachhangMouseClicked

    private void btnKhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachhangActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnKhachhangActionPerformed

    private void btnPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongActionPerformed
        // TODO add your handling code here:

      showPanel(new JpanelDatPhong(this));
    }//GEN-LAST:event_btnPhongActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        //         TODO add your handling code here:
//        showPanel(new JpanelHoaDon(this));
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
//        showPanel(new JpanelThongKe());
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseClicked
        
                int thoat = JOptionPane.showConfirmDialog(this, "Bạn có muốn Thoát?", "thông báo", JOptionPane.YES_NO_OPTION);
                if (thoat == JOptionPane.YES_OPTION) {
                       System.exit(0);
                    } else {
                        return;
                    }
    }//GEN-LAST:event_btnDangXuatMouseClicked

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangXuatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new View_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelHoaDon;
    private javax.swing.JPanel JpanelKhachHang;
    private javax.swing.JPanel JpanelNhanVien;
    private javax.swing.JPanel JpanelQLPhong;
    private javax.swing.JPanel JpanelThongKe;
    private javax.swing.JPanel JpanelTrangChu;
    private javax.swing.JPanel JpanelView;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachhang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhong;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangchu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTenNV;
    // End of variables declaration//GEN-END:variables
}
