
package HS.View;

import HS.Model.Model_NhanVien;
import HS.Repo.Repo_NhanVien;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Nhuth
 */
public class NhanVien_View extends javax.swing.JFrame {

    private Repo_NhanVien repo = new Repo_NhanVien();
    private DefaultTableModel mol = new DefaultTableModel();
    private int index = -1;
    
    public NhanVien_View() {
        initComponents();
        this.fillTable(repo.getAllNV());
        index = repo.getAllNV().size();
        setLocationRelativeTo(null);
    }

    private void fillTable(ArrayList<Model_NhanVien>listNV){
        mol = (DefaultTableModel) tbl_NV.getModel();
        mol.setRowCount(0);
        for (Model_NhanVien x : listNV) {
            mol.addRow(x.toDataRow());
        }
    }
    
    final void showDataNV(int index){
        txt_maNV.setText(tbl_NV.getValueAt(index, 0).toString());
        txt_hotenNV.setText(tbl_NV.getValueAt(index, 1).toString());
        txt_sdtNV.setText(tbl_NV.getValueAt(index, 2).toString());
        txt_emailNV.setText(tbl_NV.getValueAt(index, 3).toString());
        txt_diachiNV.setText(tbl_NV.getValueAt(index, 4).toString());
        String gt = tbl_NV.getValueAt(index, 5).toString();
        if(gt.equalsIgnoreCase("0")) {
            rdo_nuNV.setSelected(true);
        } else {
            rdo_namNV.setSelected(true);
        }
        txt_tuoiNV.setText(tbl_NV.getValueAt(index, 6).toString());
        txt_cccdNV.setText(tbl_NV.getValueAt(index, 7).toString());
        txt_chucNV.setText(tbl_NV.getValueAt(index, 8).toString());        
    }
    
    Model_NhanVien readFormNV(){
        String id_NV,ho_ten,sdt,email,dia_chi,cccd,chuc_vu;
        int gioi_tinh,tuoi;
        
        if(txt_maNV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Mã nhân viên trống!");
            txt_maNV.requestFocus();
            return null;
        }
        id_NV = txt_maNV.getText().trim();
        
        if(txt_hotenNV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Tên nhân viên trống!");
            txt_hotenNV.requestFocus();
            return null;
        }
        ho_ten = txt_hotenNV.getText().trim();
        
        if(txt_sdtNV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Số điện thoại nhân viên trống!");
            txt_sdtNV.requestFocus();
            return null;
        }
        sdt = txt_sdtNV.getText().trim();
        
        if(txt_emailNV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Email nhân viên trống!");
            txt_emailNV.requestFocus();
            return null;
        }
        email = txt_emailNV.getText().trim();
        
        dia_chi = txt_diachiNV.getText().trim();
        
        if(rdo_namNV.isSelected()){
            gioi_tinh = 1;
        } else if(rdo_nuNV.isSelected()) {
            gioi_tinh = 0;
        } else {
            JOptionPane.showMessageDialog(this,"Giới tính nhân viên trống!");
            return null;
        }
        
        if(txt_tuoiNV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Email nhân viên trống!");
            txt_emailNV.requestFocus();
            return null;
        }
        try {
            tuoi = Integer.parseInt(txt_tuoiNV.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải là số!");
            txt_tuoiNV.requestFocus();
            return null;
        }
        
        if(txt_cccdNV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"CCCD nhân viên trống!");
            txt_cccdNV.requestFocus();
            return null;
        }
        cccd = txt_cccdNV.getText().trim();
        
        if(txt_chucNV.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Chức vụ nhân viên trống!");
            txt_chucNV.requestFocus();
            return null;
        }
        chuc_vu = txt_chucNV.getText().trim();
        return new Model_NhanVien(id_NV, ho_ten, sdt, email, dia_chi, gioi_tinh, tuoi, cccd, chuc_vu);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_NV = new javax.swing.JTable();
        btn_themNV = new javax.swing.JButton();
        btn_suaNV = new javax.swing.JButton();
        btn_xoaNV = new javax.swing.JButton();
        txt_maNV = new javax.swing.JTextField();
        txt_hotenNV = new javax.swing.JTextField();
        txt_sdtNV = new javax.swing.JTextField();
        txt_emailNV = new javax.swing.JTextField();
        txt_diachiNV = new javax.swing.JTextField();
        rdo_namNV = new javax.swing.JRadioButton();
        rdo_nuNV = new javax.swing.JRadioButton();
        txt_tuoiNV = new javax.swing.JTextField();
        txt_cccdNV = new javax.swing.JTextField();
        txt_chucNV = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản lý nhân viên ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Họ tên");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Sdt");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Địa chỉ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Giới tính");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Tuổi");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("CCCD");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Chức vụ");

        tbl_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Họ tên", "Sdt", "Email", "Địa chỉ", "Giới tính", "Tuổi", "CCCD", "Chức vụ"
            }
        ));
        jScrollPane1.setViewportView(tbl_NV);

        btn_themNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_themNV.setText("THÊM");
        btn_themNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themNVActionPerformed(evt);
            }
        });

        btn_suaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_suaNV.setText("SỬA");
        btn_suaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaNVActionPerformed(evt);
            }
        });

        btn_xoaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_xoaNV.setText("XÓA");
        btn_xoaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaNVActionPerformed(evt);
            }
        });

        txt_maNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_maNVActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo_namNV);
        rdo_namNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_namNV.setText("Nam");

        buttonGroup1.add(rdo_nuNV);
        rdo_nuNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_nuNV.setText("Nữ");
        rdo_nuNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_nuNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_emailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tuoiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_hotenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_sdtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_suaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_themNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn_xoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_cccdNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(txt_chucNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_diachiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(rdo_namNV, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdo_nuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_themNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hotenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdtNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_suaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_emailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdo_namNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rdo_nuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_xoaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tuoiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cccdNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_chucNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_diachiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_maNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_maNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_maNVActionPerformed

    private void rdo_nuNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_nuNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_nuNVActionPerformed

    private void btn_themNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themNVActionPerformed
        // TODO add your handling code here:
        int confirm_them = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(confirm_them != JOptionPane.YES_OPTION){
            return;
        }
        if(this.readFormNV() != null){
            return;
        }
        
        repo.addNV(this.readFormNV());
        JOptionPane.showMessageDialog(this, "Thêm thành công");
        this.fillTable(repo.getAllNV());
    }//GEN-LAST:event_btn_themNVActionPerformed

    private void btn_suaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaNVActionPerformed
        // TODO add your handling code here:
        int confirm_sua = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm_sua != JOptionPane.YES_OPTION){
            return;
        }
        if (index == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một dòng để sửa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String accoutNV = tbl_NV.getValueAt(index, 0).toString();
        Model_NhanVien updateNV = this.readFormNV();
        updateNV.setId_NV(accoutNV);
        
        int resultNV = repo.update_NhanVien(updateNV);
        if(resultNV > 0){
            JOptionPane.showMessageDialog(this, "Đã sửa thành công");
            this.fillTable(repo.getAllNV());
        } else {
            JOptionPane.showMessageDialog(this, "Sửa không thành công!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_suaNVActionPerformed

    private void btn_xoaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaNVActionPerformed
        // TODO add your handling code here:
        int confirm_xoa = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if(confirm_xoa != JOptionPane.YES_OPTION){
            return;
        }
        index = tbl_NV.getSelectedRow();
        String idNV = tbl_NV.getValueAt(index, 0).toString();
        repo.NV_Soft_Delete(idNV);
        JOptionPane.showMessageDialog(this, "Xoá thành công");
        this.fillTable(repo.getAllNV());
    }//GEN-LAST:event_btn_xoaNVActionPerformed

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
            java.util.logging.Logger.getLogger(NhanVien_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVien_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVien_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVien_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhanVien_View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_suaNV;
    private javax.swing.JButton btn_themNV;
    private javax.swing.JButton btn_xoaNV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdo_namNV;
    private javax.swing.JRadioButton rdo_nuNV;
    private javax.swing.JTable tbl_NV;
    private javax.swing.JTextField txt_cccdNV;
    private javax.swing.JTextField txt_chucNV;
    private javax.swing.JTextField txt_diachiNV;
    private javax.swing.JTextField txt_emailNV;
    private javax.swing.JTextField txt_hotenNV;
    private javax.swing.JTextField txt_maNV;
    private javax.swing.JTextField txt_sdtNV;
    private javax.swing.JTextField txt_tuoiNV;
    // End of variables declaration//GEN-END:variables
}
