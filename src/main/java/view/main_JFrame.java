package view;

import java.util.logging.Level;
import java.util.logging.Logger;

public class main_JFrame extends javax.swing.JFrame {
       
    public main_JFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private quanlysv_JPanel qlsvJPanel;
    private quanlylophoc_Jpanel qllhJpanel;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnDangxuat = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnQuanlysinhvien = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnGioithieu = new javax.swing.JButton();
        tbpMain = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        memuThoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuQuanlysinhvien = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        menuQuanlylophoc = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuNoidung = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuGioithieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ SINH VIÊN");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(204, 204, 255));
        jToolBar1.setRollover(true);

        btnDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/logout-icon-32.png"))); // NOI18N
        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.setFocusable(false);
        btnDangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangxuat);
        jToolBar1.add(jSeparator2);

        btnQuanlysinhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        btnQuanlysinhvien.setText("Quản lý sinh viên");
        btnQuanlysinhvien.setFocusable(false);
        btnQuanlysinhvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQuanlysinhvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanlysinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanlysinhvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQuanlysinhvien);
        jToolBar1.add(jSeparator6);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/gpa-icon-32.png"))); // NOI18N
        jButton2.setText("Quản lý lớp học");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator5);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/Actions-document-edit-icon-32.png"))); // NOI18N
        jButton1.setText("Hướng dẫn");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator3);

        btnGioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/Actions-help-about-icon-32.png"))); // NOI18N
        btnGioithieu.setText("Giới thiệu");
        btnGioithieu.setFocusable(false);
        btnGioithieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGioithieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGioithieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGioithieuActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGioithieu);

        tbpMain.setBackground(new java.awt.Color(0, 255, 0));
        tbpMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tbpMainStateChanged(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu1.setText("Hệ thống");

        menuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/logout-icon-16.png"))); // NOI18N
        menuDangXuat.setText("Đăng xuất");
        menuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(menuDangXuat);
        jMenu1.add(jSeparator1);

        memuThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        memuThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/Button-Close-icon-16.png"))); // NOI18N
        memuThoat.setText("Thoát");
        memuThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memuThoatActionPerformed(evt);
            }
        });
        jMenu1.add(memuThoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        menuQuanlysinhvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQuanlysinhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        menuQuanlysinhvien.setText("Quản lý sinh viên");
        menuQuanlysinhvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuanlysinhvienActionPerformed(evt);
            }
        });
        jMenu2.add(menuQuanlysinhvien);
        jMenu2.add(jSeparator7);

        menuQuanlylophoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQuanlylophoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/gpa-icon-24.png"))); // NOI18N
        menuQuanlylophoc.setText("Quản lý lớp học");
        menuQuanlylophoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuanlylophocActionPerformed(evt);
            }
        });
        jMenu2.add(menuQuanlylophoc);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ giúp");

        menuNoidung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuNoidung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon16x16/About.png"))); // NOI18N
        menuNoidung.setText("Hướng dẫn");
        menuNoidung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNoidungActionPerformed(evt);
            }
        });
        jMenu3.add(menuNoidung);
        jMenu3.add(jSeparator4);

        menuGioithieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuGioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon16x16/Help symbol.png"))); // NOI18N
        menuGioithieu.setText("Giới thiệu");
        menuGioithieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGioithieuActionPerformed(evt);
            }
        });
        jMenu3.add(menuGioithieu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .addComponent(tbpMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGioithieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGioithieuActionPerformed
        Gioithieu_JDialog gioithieu_JDialog = new Gioithieu_JDialog(this, true);
        gioithieu_JDialog.setVisible(true);
    }//GEN-LAST:event_menuGioithieuActionPerformed

    private void memuThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memuThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_memuThoatActionPerformed

    private void menuQuanlysinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuanlysinhvienActionPerformed
        if (qlsvJPanel == null) {
        qlsvJPanel = new quanlysv_JPanel();
   
        tbpMain.addTab("Quản lý sinh viên", null,qlsvJPanel, "Quản lý sinh viên");
        }
        tbpMain.setSelectedComponent(qlsvJPanel);
    }//GEN-LAST:event_menuQuanlysinhvienActionPerformed
  
    private void btnQuanlysinhvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanlysinhvienActionPerformed
            menuQuanlysinhvienActionPerformed(evt);
    }//GEN-LAST:event_btnQuanlysinhvienActionPerformed

    private void btnGioithieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGioithieuActionPerformed
        Gioithieu_JDialog gioithieu_JDialog = new Gioithieu_JDialog(this, true);
        gioithieu_JDialog.setVisible(true);
    }//GEN-LAST:event_btnGioithieuActionPerformed

    private void menuNoidungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNoidungActionPerformed
        // TODO add your handling code here:
        Noidung_JDialog noidung_JDialog= new Noidung_JDialog(this, true);
        noidung_JDialog.setVisible(true);
    }//GEN-LAST:event_menuNoidungActionPerformed

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        login_JDialog login_JDialog = new login_JDialog(this, true);
        login_JDialog.setVisible(true);
    }//GEN-LAST:event_btnDangxuatActionPerformed

    private void menuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDangXuatActionPerformed
        btnDangxuatActionPerformed(evt);
    }//GEN-LAST:event_menuDangXuatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        login_JDialog lDialog = new login_JDialog(this, true);
        lDialog.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Noidung_JDialog noidung_JDialog = new Noidung_JDialog(this, true);
        noidung_JDialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuQuanlylophocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuanlylophocActionPerformed
        if (qllhJpanel == null ) {
            try {
                qllhJpanel = new quanlylophoc_Jpanel();
            } catch (Exception ex) {
                Logger.getLogger(main_JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
           tbpMain.addTab("Quản lý lớp học", null,qllhJpanel, "Quản lý lớp học");
   //           tbpMain.addTab("Đăng ký", qlmhJPanel);
        }    
        tbpMain.setSelectedComponent(qllhJpanel);
    }//GEN-LAST:event_menuQuanlylophocActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menuQuanlylophocActionPerformed(evt);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbpMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tbpMainStateChanged
        // TODO add your handling code here:
       System.out.println("Da doi tab");
    }//GEN-LAST:event_tbpMainStateChanged

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
            java.util.logging.Logger.getLogger(main_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnGioithieu;
    private javax.swing.JButton btnQuanlysinhvien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem memuThoat;
    private javax.swing.JMenuItem menuDangXuat;
    private javax.swing.JMenuItem menuGioithieu;
    private javax.swing.JMenuItem menuNoidung;
    private javax.swing.JMenuItem menuQuanlylophoc;
    private javax.swing.JMenuItem menuQuanlysinhvien;
    private javax.swing.JTabbedPane tbpMain;
    // End of variables declaration//GEN-END:variables

    private void menuNoidung() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
