/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom7.quanlyluong.View.BaoTriThongTinTienThuong;

import com.nhom7.quanlyluong.Controller.BaoTriThongTinTienThuongController;
import com.nhom7.quanlyluong.Model.Thuong;
import com.nhom7.quanlyluong.View.TuyChonUI;
import com.nhom7.quanlyluong.util.IOptionEvent;
import com.nhom7.quanlyluong.util.IUpdateTableEvent;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class BaoTriThongTinTienThuongUI extends javax.swing.JFrame {
    private BaoTriThongTinTienThuongController baoTriThongTinTienThuongController;
    private HashMap<String, Object> data;
    
    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
    /**
     * Creates new form BaoTriThongTinTienThuongUI
     */
    public BaoTriThongTinTienThuongUI() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        txtTenTienThuong.requestFocus();
        baoTriThongTinTienThuongController = new BaoTriThongTinTienThuongController();
        UpdateTable();
        
        baoTriThongTinTienThuongController.setUpdateTableEvent(new IUpdateTableEvent() {
            @Override
            public void onUpdateDataOnTableEvent() {
                try {
                    UpdateTable();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void UpdateTable() throws SQLException{
        ArrayList<Thuong> thuongs = baoTriThongTinTienThuongController.onQueryAllTienThuong();
        
        DefaultTableModel defaultTableModel = (DefaultTableModel)tblTienThuong.getModel();
        
        while(defaultTableModel.getRowCount() > 0){
            defaultTableModel.removeRow(0);
        }
        
        for (Thuong thuong : thuongs) {
            defaultTableModel.addRow(thuong.toObjectArrayData());
        }
    }
    
    public boolean validateData(){
        String message = "";
        int numErr = 0;
        try {
            if(txtTenTienThuong.getText().trim().equalsIgnoreCase("")){
                message += "Tên Tiền Thưởng không được để trống!!\n";
                numErr += 1;
            }
            
            if(txtTienThuong.getText().trim().equalsIgnoreCase("")){
                message += "Tiền Thưởng không được để trống\n";
                numErr += 1;
            }
            
            if(numErr > 0){
                throw new Exception(message);
            }
            
            try{
                Float.parseFloat(txtTienThuong.getText().trim());
            }catch(Exception ex){
                throw new Exception("Tiền thưởng phải nhập đúng định dạng");
            }
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(getContentPane(), message);
        } 
        return false;
    }
    
    public void clearAllTextBox(){
        txtMaTienThuong.setText("");
        txtTenTienThuong.setText("");
        txtTienThuong.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        txtMaTienThuong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenTienThuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTienThuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTienThuong = new javax.swing.JTable();
        btnXoaTienThuong = new javax.swing.JButton();
        btnThemTienThuong = new javax.swing.JButton();
        btnSuaTienThuong = new javax.swing.JButton();
        btnXoaThongTin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bảo Trì Thông Tin Tiền Thưởng");

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+12));
        jLabel1.setText("Bảo Trì Thông Tin Tiền Thưởng");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+4f));
        jLabel2.setText("Mã Tiền Thưởng");

        txtMaTienThuong.setEditable(false);
        txtMaTienThuong.setFont(txtMaTienThuong.getFont().deriveFont(txtMaTienThuong.getFont().getSize()+4f));
        txtMaTienThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaTienThuongMouseClicked(evt);
            }
        });

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+4f));
        jLabel3.setText("Tên Tiền Thưởng");

        txtTenTienThuong.setFont(txtTenTienThuong.getFont().deriveFont(txtTenTienThuong.getFont().getSize()+4f));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+4f));
        jLabel4.setText("Tiền Thưởng");

        txtTienThuong.setFont(txtTienThuong.getFont().deriveFont(txtTienThuong.getFont().getSize()+4f));

        tblTienThuong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Tiền Thưởng", "Tên Tiền Thưởng", "Tiền Thưởng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTienThuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTienThuongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTienThuong);

        btnXoaTienThuong.setFont(btnXoaTienThuong.getFont().deriveFont(btnXoaTienThuong.getFont().getSize()+4f));
        btnXoaTienThuong.setText("Xóa Tiền Thưởng");
        btnXoaTienThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTienThuongActionPerformed(evt);
            }
        });

        btnThemTienThuong.setFont(btnThemTienThuong.getFont().deriveFont(btnThemTienThuong.getFont().getSize()+4f));
        btnThemTienThuong.setText("Thêm Tiền Thưởng");
        btnThemTienThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTienThuongActionPerformed(evt);
            }
        });

        btnSuaTienThuong.setFont(btnSuaTienThuong.getFont().deriveFont(btnSuaTienThuong.getFont().getSize()+4f));
        btnSuaTienThuong.setText("Sửa Tiền Thưởng");
        btnSuaTienThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTienThuongActionPerformed(evt);
            }
        });

        btnXoaThongTin.setFont(btnXoaThongTin.getFont().deriveFont(btnXoaThongTin.getFont().getSize()+4f));
        btnXoaThongTin.setText("Xóa Thông Tin");
        btnXoaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaThongTinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(253, 253, 253))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(btnThemTienThuong)
                        .addGap(18, 18, 18)
                        .addComponent(btnSuaTienThuong)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaTienThuong)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaThongTin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTienThuong, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(txtMaTienThuong)
                            .addComponent(txtTenTienThuong)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTienThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaTienThuong)
                    .addComponent(btnThemTienThuong)
                    .addComponent(btnSuaTienThuong)
                    .addComponent(btnXoaThongTin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTienThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTienThuongMouseClicked
        int rowIndex = tblTienThuong.getSelectedRow();
        TableModel model = tblTienThuong.getModel();
        
        String maTienThuong = model.getValueAt(rowIndex, 0).toString();
        String tenTienThuong =  model.getValueAt(rowIndex, 1).toString();
        String tienThuong = model.getValueAt(rowIndex, 2).toString();
        
        txtMaTienThuong.setText(maTienThuong);
        txtTenTienThuong.setText(tenTienThuong);
        txtTienThuong.setText(tienThuong);
    }//GEN-LAST:event_tblTienThuongMouseClicked

    private void btnThemTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTienThuongActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if(validateData()) {
                    Thuong thuong = new Thuong();
                    thuong.setTenThuong(txtTenTienThuong.getText());
                    thuong.setTienThuong(Float.parseFloat(txtTienThuong.getText()));
                    try {
                        baoTriThongTinTienThuongController.addNewTienThuong(thuong);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Thêm Tiền Thưởng thành công!!");
                }
                
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });
        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn thêm Tiền Thưởng này không ?", "Thông Báo");
    }//GEN-LAST:event_btnThemTienThuongActionPerformed

    private void btnSuaTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTienThuongActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if(validateData()) {
                    if(txtMaTienThuong.getText().equals("")){
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Tiền Thưởng cần sửa!!");
                        return;
                    }
                    Thuong thuong = new Thuong();
                    thuong.setMaThuong(Long.parseLong(txtMaTienThuong.getText()));
                    thuong.setTenThuong(txtTenTienThuong.getText());
                    thuong.setTienThuong(Float.parseFloat(txtTienThuong.getText()));
                    try {
                        baoTriThongTinTienThuongController.updateTienThuongByID(thuong);
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Sửa Tiền Thưởng thành công!!");
                }
                
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });
        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn sửa Tiền Thưởng này không ?", "Thông Báo");
    }//GEN-LAST:event_btnSuaTienThuongActionPerformed

    private void btnXoaTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTienThuongActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if(validateData()) {
                    if(txtMaTienThuong.getText().equals("")){
                        JOptionPane.showMessageDialog(getContentPane(), "Bạn chưa chọn Tiền Thưởng cần xóa!!");
                        return;
                    }

                    try {
                        baoTriThongTinTienThuongController.deleteTienThuongByID(Long.parseLong(txtMaTienThuong.getText().trim()));
                    } catch (SQLException ex) {
                        Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Xóa Tiền Thưởng thành công!!");
                }
                
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });
        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa Tiền Thưởng này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaTienThuongActionPerformed

    private void btnXoaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaThongTinActionPerformed
        TuyChonUI tuyChonUI = new TuyChonUI();
        tuyChonUI.setOnHandleOptionEvent(new IOptionEvent() {
            @Override
            public void onAcceptEvent() {
                if(validateData()){
                    clearAllTextBox();
                    JOptionPane.showMessageDialog(getContentPane(), "Xóa thông tin thành công!!");
                }
                
            }

            @Override
            public void onCancelEvent() {
                clearAllTextBox();
            }
        });
        
        tuyChonUI.onCallGUI(getContentPane(), "Bạn có chắc chắn muốn xóa thông tin này không ?", "Thông Báo");
    }//GEN-LAST:event_btnXoaThongTinActionPerformed

    private void txtMaTienThuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaTienThuongMouseClicked
        JOptionPane.showMessageDialog(getContentPane(), "Mã Tiền Thưởng được tự động sinh\nBạn không được phép sửa mã!!!");
        txtTenTienThuong.requestFocus();
    }//GEN-LAST:event_txtMaTienThuongMouseClicked

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
            java.util.logging.Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BaoTriThongTinTienThuongUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BaoTriThongTinTienThuongUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaTienThuong;
    private javax.swing.JButton btnThemTienThuong;
    private javax.swing.JButton btnXoaThongTin;
    private javax.swing.JButton btnXoaTienThuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTienThuong;
    private javax.swing.JTextField txtMaTienThuong;
    private javax.swing.JTextField txtTenTienThuong;
    private javax.swing.JTextField txtTienThuong;
    // End of variables declaration//GEN-END:variables
}
