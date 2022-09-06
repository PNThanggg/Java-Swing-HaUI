/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nhom7.quanlyluong.View.TrangChu.TrangChuGiamDoc;

import com.nhom7.quanlyluong.View.QuanLyThongTinCaNhan.QuanLyThongTinCaNhanUI;
import com.nhom7.quanlyluong.View.XemChiTietLuongCaNhan.XemChiTietLuongCaNhanUI;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TrangChuGiamDocUI extends javax.swing.JFrame {
    private HashMap<String, Object> data;
    
    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
    /**
     * Creates new form TrangChuGiamDocUI
     */
    public TrangChuGiamDocUI(HashMap<String, Object> data) {
        this.data = data;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan = new javax.swing.JButton();
        btnSuaThongTinCaNhan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan1 = new javax.swing.JButton();
        btnXemChiTietLuongCaNhan2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Trang Chủ Giám Đốc");

        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnXemChiTietLuongCaNhan.setFont(btnXemChiTietLuongCaNhan.getFont().deriveFont(btnXemChiTietLuongCaNhan.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan.setText("Xem Chi Tiết Lương Cá Nhân");
        btnXemChiTietLuongCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhanActionPerformed(evt);
            }
        });

        btnSuaThongTinCaNhan.setFont(btnSuaThongTinCaNhan.getFont().deriveFont(btnSuaThongTinCaNhan.getFont().getSize()+3f));
        btnSuaThongTinCaNhan.setText("Sửa Thông Tin Cá Nhân");
        btnSuaThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinCaNhanActionPerformed(evt);
            }
        });

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()+3f));
        jButton1.setText("Xem Thông Tin Nhân Viên");

        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getSize()+3f));
        jButton2.setText("Xem Thông Tin Phụ Cấp");

        btnXemChiTietLuongCaNhan1.setFont(btnXemChiTietLuongCaNhan1.getFont().deriveFont(btnXemChiTietLuongCaNhan1.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan1.setText("Xem Thống Kê Lương Cả Công Ty");
        btnXemChiTietLuongCaNhan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhan1ActionPerformed(evt);
            }
        });

        btnXemChiTietLuongCaNhan2.setFont(btnXemChiTietLuongCaNhan2.getFont().deriveFont(btnXemChiTietLuongCaNhan2.getFont().getSize()+3f));
        btnXemChiTietLuongCaNhan2.setText("Xem Chi Tiết Lương Từng Nhân Sự");
        btnXemChiTietLuongCaNhan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietLuongCaNhan2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(49, 49, 49)
                            .addComponent(btnDangXuat))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnXemChiTietLuongCaNhan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnXemChiTietLuongCaNhan1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXemChiTietLuongCaNhan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnDangXuat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXemChiTietLuongCaNhan)
                    .addComponent(btnSuaThongTinCaNhan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXemChiTietLuongCaNhan1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXemChiTietLuongCaNhan2)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnXemChiTietLuongCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhanActionPerformed
        XemChiTietLuongCaNhanUI xemChiTietLuongCaNhanUI = new XemChiTietLuongCaNhanUI();
        xemChiTietLuongCaNhanUI.setData(data);
        xemChiTietLuongCaNhanUI.onStartGUI();
        dispose();
    }//GEN-LAST:event_btnXemChiTietLuongCaNhanActionPerformed

    private void btnSuaThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinCaNhanActionPerformed
        QuanLyThongTinCaNhanUI quanLyThongTinCaNhanUI;
        try {
            quanLyThongTinCaNhanUI = new QuanLyThongTinCaNhanUI(data);
            quanLyThongTinCaNhanUI.onStartGUI();
        } catch (SQLException ex) {
            Logger.getLogger(TrangChuGiamDocUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dispose();
    }//GEN-LAST:event_btnSuaThongTinCaNhanActionPerformed

    private void btnXemChiTietLuongCaNhan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXemChiTietLuongCaNhan1ActionPerformed

    private void btnXemChiTietLuongCaNhan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietLuongCaNhan2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXemChiTietLuongCaNhan2ActionPerformed

    public void onStartGUI() {
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
            java.util.logging.Logger.getLogger(TrangChuGiamDocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuGiamDocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuGiamDocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuGiamDocUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuGiamDocUI(data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnSuaThongTinCaNhan;
    private javax.swing.JButton btnXemChiTietLuongCaNhan;
    private javax.swing.JButton btnXemChiTietLuongCaNhan1;
    private javax.swing.JButton btnXemChiTietLuongCaNhan2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
