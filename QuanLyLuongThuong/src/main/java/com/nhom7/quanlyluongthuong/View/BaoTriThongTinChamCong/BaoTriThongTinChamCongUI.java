package com.nhom7.quanlyluongthuong.View.BaoTriThongTinChamCong;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

public class BaoTriThongTinChamCongUI extends javax.swing.JFrame {
    public BaoTriThongTinChamCongUI() {
        initComponents();
        setLocationRelativeTo(null);
        generateComboBoxData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaCong = new javax.swing.JTextField();
        cboThang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSoNgayLamViec = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        txtTienUngTruoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSoGioLamThem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listThuong = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPhuCap = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listHocPhan = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bảo trì thông tin chấm công");
        setResizable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+11));
        jLabel1.setText("Bảo trì thông tin chấm công");

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+3f));
        jLabel2.setText("Mã Công");

        txtMaCong.setFont(txtMaCong.getFont().deriveFont(txtMaCong.getFont().getSize()+3f));

        cboThang.setFont(cboThang.getFont().deriveFont(cboThang.getFont().getSize()+3f));
        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+3f));
        jLabel3.setText("Tháng:");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+3f));
        jLabel4.setText("Năm:");

        cboNam.setFont(cboNam.getFont().deriveFont(cboNam.getFont().getSize()+3f));

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getSize()+3f));
        jLabel6.setText("Mã Nhân Viên");

        txtMaNhanVien.setFont(txtMaNhanVien.getFont().deriveFont(txtMaNhanVien.getFont().getSize()+3f));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getSize()+3f));
        jLabel7.setText("Số ngày làm việc");

        txtSoNgayLamViec.setFont(txtSoNgayLamViec.getFont().deriveFont(txtSoNgayLamViec.getFont().getSize()+3f));

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getSize()+3f));
        jLabel8.setText("Tiền ứng trước");

        txtTienUngTruoc.setFont(txtTienUngTruoc.getFont().deriveFont(txtTienUngTruoc.getFont().getSize()+3f));

        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getSize()+3f));
        jLabel9.setText("Số giờ làm thêm");

        txtSoGioLamThem.setFont(txtSoGioLamThem.getFont().deriveFont(txtSoGioLamThem.getFont().getSize()+3f));

        jScrollPane1.setViewportView(listThuong);

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getSize()+3f));
        jLabel10.setText("Danh sách thưởng");

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getSize()+3f));
        jLabel11.setText("Danh sách phụ cấp");

        jScrollPane2.setViewportView(listPhuCap);

        jLabel12.setFont(jLabel12.getFont().deriveFont(jLabel12.getFont().getSize()+3f));
        jLabel12.setText("Danh sách học phần");

        jScrollPane3.setViewportView(listHocPhan);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Công", "Tháng", "Năm", "Mã Nhân Viên", "Số ngày làm việc", "Số giờ làm thêm", "Tiền ứng trước"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jButton1.setFont(jButton1.getFont().deriveFont(jButton1.getFont().getSize()+3f));
        jButton1.setText("Xóa Thông Tin");

        jButton2.setFont(jButton2.getFont().deriveFont(jButton2.getFont().getSize()+3f));
        jButton2.setText("Thêm Chấm Công");

        jButton3.setFont(jButton3.getFont().deriveFont(jButton3.getFont().getSize()+3f));
        jButton3.setText("Sửa Chấm Công");

        jButton4.setFont(jButton4.getFont().deriveFont(jButton4.getFont().getSize()+3f));
        jButton4.setText("Xóa Chấm Công");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(46, 46, 46)
                                        .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtMaCong, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(cboThang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoNgayLamViec)
                                    .addComponent(txtSoGioLamThem)
                                    .addComponent(txtTienUngTruoc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(465, 465, 465)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(368, 368, 368)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtSoNgayLamViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel12)
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtSoGioLamThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTienUngTruoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addComponent(jScrollPane1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaoTriThongTinChamCongUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaoTriThongTinChamCongUI().setVisible(true);
            }
        });
    }
    
    private void generateComboBoxData(){
        ArrayList<String> thang = new ArrayList(); 
        
        for(int i = 1 ; i <= 12 ; i++){
            thang.add(String.valueOf(i));
        }
      
        ArrayList<String> nam = new ArrayList<>();
        
        for (int i = 1970; i <= 2022; i++) {
            nam.add(String.valueOf(i));
        }
        
       cboThang.setModel(new DefaultComboBoxModel<>(thang.toArray(new String[thang.size()])));
       cboNam.setModel(new DefaultComboBoxModel<>(nam.toArray(new String[nam.size()])));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listHocPhan;
    private javax.swing.JList<String> listPhuCap;
    private javax.swing.JList<String> listThuong;
    private javax.swing.JTextField txtMaCong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoGioLamThem;
    private javax.swing.JSpinner txtSoNgayLamViec;
    private javax.swing.JTextField txtTienUngTruoc;
    // End of variables declaration//GEN-END:variables
}
