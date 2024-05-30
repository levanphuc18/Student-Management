
package view;

import DAO.SinhVienDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.sinhvien;


public class quanlysv_JPanel extends javax.swing.JPanel {

    private DefaultTableModel tblModel = new DefaultTableModel();
    public quanlysv_JPanel() {
        initComponents();
        initTable();
        fillTable();
        btnThemSV.setEnabled(false);
        btnXoaSV.setEnabled(false);
        btnCapNhatSV.setEnabled(false);
    }

    public void resertForm(){
        txtMalop.setText("");
        txtTenlop.setText("");
        txtMaSV.setText("");
        txtTenSV.setText("");
        txtEmail.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        txtMaSV.setBackground(null);
    }
    
    private void initTable() {
        String[] header = new String[]{"Mã SV", "Họ Tên", "Mã Lớp", "Tên Lớp", "Email", "Số ĐT", "Địa Chỉ"};
        tblModel.setColumnIdentifiers(header);
        tbSinhVien.setModel(tblModel);
    }
    
    private void fillTable() {
        List<sinhvien> lstStudent = new ArrayList<>();
        try {
            SinhVienDAO dao = new SinhVienDAO();
            lstStudent = dao.getAllSV();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tblModel.setRowCount(0);
        for (sinhvien student : lstStudent) {
            tblModel.addRow(new String[]{ student.getMaSV(), student.getHoten(), student.getMalop(), student.getTenlop(),student.getEmail(), student.getSoDT(), student.getDiachi()});
        }
        tblModel.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMalop = new javax.swing.JTextField();
        txtMaSV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        btnThemSV = new javax.swing.JButton();
        btnXoaSV = new javax.swing.JButton();
        btnCapNhatSV = new javax.swing.JButton();
        btnNhapMoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        btnTimSV = new javax.swing.JButton();
        uuuu = new javax.swing.JLabel();
        txtTenlop = new javax.swing.JTextField();
        ttttttt = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Mã SV:");

        jLabel3.setText("Mã lớp:");

        jLabel4.setText("Email:");

        jLabel5.setText("Số ĐT");

        jLabel7.setText("Địa chỉ");

        txtMalop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMalopActionPerformed(evt);
            }
        });

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        btnThemSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon16x16/Create.png"))); // NOI18N
        btnThemSV.setText("Thêm");
        btnThemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSVActionPerformed(evt);
            }
        });

        btnXoaSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon16x16/Delete.png"))); // NOI18N
        btnXoaSV.setText("Xóa");
        btnXoaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSVActionPerformed(evt);
            }
        });

        btnCapNhatSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconHS/Actions-document-edit-icon-16.png"))); // NOI18N
        btnCapNhatSV.setText("Cập nhật");
        btnCapNhatSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatSVActionPerformed(evt);
            }
        });

        btnNhapMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon16x16/Brush.png"))); // NOI18N
        btnNhapMoi.setText("Nhập mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã lớp", "Tên lớp", "Mã sinh viên", "Họ và tên", "Email", "Số điện thoại", "Địa chỉ"
            }
        ));
        tbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSinhVien);

        btnTimSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon16x16/Find.png"))); // NOI18N
        btnTimSV.setText("Tìm SV");
        btnTimSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimSVActionPerformed(evt);
            }
        });

        uuuu.setText("Họ tên:");

        ttttttt.setText("Tên lớp:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMalop, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uuuu)
                                            .addComponent(ttttttt))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenlop, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTimSV)
                                .addGap(18, 18, 18)
                                .addComponent(btnThemSV)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoaSV)
                                .addGap(32, 32, 32)
                                .addComponent(btnCapNhatSV)
                                .addGap(18, 18, 18)
                                .addComponent(btnNhapMoi)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uuuu)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ttttttt)
                    .addComponent(txtTenlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaSV)
                    .addComponent(btnCapNhatSV)
                    .addComponent(btnNhapMoi)
                    .addComponent(btnTimSV)
                    .addComponent(btnThemSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMalopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMalopActionPerformed
    }//GEN-LAST:event_txtMalopActionPerformed

    private void btnThemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSVActionPerformed
        try {
            sinhvien sv = new sinhvien();
            if(!txtMaSV.getText().equals("") && !txtMalop.getText().equals("") && 
                !txtTenlop.getText().equals("")&& !txtTenSV.getText().equals("") && 
                !txtEmail.getText().equals("") && !txtSDT.getText().equals("") && 
                !txtDiaChi.getText().equals("")) {

            sv.setMaSV(txtMaSV.getText());
            sv.setHoten(txtTenSV.getText());
            sv.setMalop(txtMalop.getText());
            sv.setTenlop(txtTenlop.getText());
            sv.setEmail(txtEmail.getText());
            sv.setSoDT(txtSDT.getText());
            sv.setDiachi(txtDiaChi.getText());
            
            SinhVienDAO dao = new SinhVienDAO();
            
            dao.Insert(sv);
            JOptionPane.showMessageDialog(this, "Thêm 1 SV thành công","Thành công",1);
            }else{
                JOptionPane.showMessageDialog(this, "Không được bỏ trống","Lỗi",JOptionPane.ERROR_MESSAGE);
            }
            fillTable();
//            resertForm();
//            btnThemSV.setEnabled(false);
            btnCapNhatSV.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại, không tạo được", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnThemSVActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        resertForm();
        txtMaSV.requestFocus();
        txtMaSV.setEnabled(true);
        btnThemSV.setEnabled(true);
        btnCapNhatSV.setEnabled(false);
        btnXoaSV.setEnabled(false); // nhap ma sv de xoa
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
        int row = tbSinhVien.getSelectedRow();
        if(row>=0){
            txtMaSV.setEnabled(false);
            txtMaSV.setText(tbSinhVien.getValueAt(row, 0).toString());
            txtTenSV.setText(tbSinhVien.getValueAt(row, 1).toString());
            txtMalop.setText(tbSinhVien.getValueAt(row, 2).toString());
            txtTenlop.setText(tbSinhVien.getValueAt(row, 3).toString());
            txtEmail.setText(tbSinhVien.getValueAt(row, 4).toString());
            txtSDT.setText(tbSinhVien.getValueAt(row, 5).toString());
            txtDiaChi.setText(tbSinhVien.getValueAt(row, 6).toString());
            
            btnCapNhatSV.setEnabled(true);
            btnXoaSV.setEnabled(true);
        }
    }//GEN-LAST:event_tbSinhVienMouseClicked

    private void btnTimSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimSVActionPerformed
        btnThemSV.setEnabled(false);
        txtMaSV.setEnabled(true);
        txtMaSV.setBackground(Color.pink);
        txtMaSV.requestFocus();
        try {
            if(!txtMaSV.getText().equals("")){
                SinhVienDAO dao = new SinhVienDAO();
                sinhvien sv = dao.Find(txtMaSV.getText());
                if(sv!=null){
                    txtMaSV.setText(sv.getMaSV());
                    txtTenSV.setText(sv.getHoten());
                    txtMalop.setText(sv.getMalop());
                    txtTenlop.setText(sv.getTenlop());
                    txtEmail.setText(sv.getEmail());
                    txtSDT.setText(sv.getSoDT());
                    txtDiaChi.setText(sv.getDiachi());
                    btnCapNhatSV.setEnabled(true);
                    btnXoaSV.setEnabled(true);
                    txtMaSV.setEnabled(false);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Mã SV chưa đúng","Lỗi",3);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTimSVActionPerformed

    private void btnCapNhatSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatSVActionPerformed
        try {
            sinhvien sv =new sinhvien();

            sv.setMaSV(txtMaSV.getText());
            sv.setHoten(txtTenSV.getText());
            sv.setMalop(txtMalop.getText());
            sv.setTenlop(txtTenlop.getText());
            sv.setEmail(txtEmail.getText());
            sv.setSoDT(txtSDT.getText());
            sv.setDiachi(txtDiaChi.getText());
            
            SinhVienDAO dao = new SinhVienDAO();
            dao.Update(sv);
            
            if(!txtMaSV.getText().equals("") && !txtMalop.getText().equals("") && 
                !txtTenlop.getText().equals("")&& !txtTenSV.getText().equals("") && 
                !txtEmail.getText().equals("") && !txtSDT.getText().equals("") && 
                !txtDiaChi.getText().equals("")) {
            
            JOptionPane.showMessageDialog(this, "Cập nhật thành công","Thành công",1);
            btnCapNhatSV.setEnabled(false);
            btnXoaSV.setEnabled(false);
            fillTable();
            resertForm();
            }else{
                JOptionPane.showMessageDialog(this, "Không được bỏ trống","Lỗi",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mã SV đã tồn tại","Lỗi",2);
        }
    }//GEN-LAST:event_btnCapNhatSVActionPerformed

    private void btnXoaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSVActionPerformed
        // TODO add your handling code here:
        try {
            if(!txtMaSV.getText().equals("")){
                SinhVienDAO dao= new SinhVienDAO();
                if(dao.Delete(txtMaSV.getText())){
                    JOptionPane.showMessageDialog(this, "Xóa thành công 1 sinh viên","Thành công",1);
                    fillTable();
                    resertForm();
                    btnCapNhatSV.setEnabled(false);
                    btnXoaSV.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(this,"Không thể xóa", "Lỗi",2);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnXoaSVActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatSV;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JButton btnThemSV;
    private javax.swing.JButton btnTimSV;
    private javax.swing.JButton btnXoaSV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JLabel ttttttt;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtMalop;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtTenlop;
    private javax.swing.JLabel uuuu;
    // End of variables declaration//GEN-END:variables
}
