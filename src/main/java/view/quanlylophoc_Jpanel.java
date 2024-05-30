
package view;

import DAO.LopDAO;
import DAO.SinhVienDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.sinhvien;

/**
 *
 * @author lvfuc
 */
public class quanlylophoc_Jpanel extends javax.swing.JPanel {

    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel model2 = new DefaultTableModel();
    
    public quanlylophoc_Jpanel() {
        initComponents();
        initTable();
        fillTable();
    }
    
    public void resertForm(){
        txtMalop.setText("");
        txtTenlop.setText("");
        txtMasv.setText("");
        txtTensv.setText("");
        txtEmail.setText("");
        txtSodt.setText("");
        txtDiachi.setText("");
//        txtMasv.setBackground(null);
    }
    
    private void initTable(){
        String[] header = new String[]{"Mã lớp", "Tên lớp"};
        model.setColumnIdentifiers(header);
        tbDSlop.setModel(model);
    }   
   
    private void fillTable(){
        List<sinhvien> lstsinhvien = new ArrayList<>();
        try {
            LopDAO dao = new LopDAO();
            lstsinhvien =dao.getAllClass();
        } catch (Exception e) {
        }
        model.setRowCount(0);
        for (sinhvien o : lstsinhvien) {
            model.addRow(new String[]{o.getMalop(),o.getTenlop()});
        }
        model.fireTableDataChanged();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSlop = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDSsinhvien = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMalop = new javax.swing.JTextField();
        txtMasv = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSodt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTenlop = new javax.swing.JTextField();
        txtTensv = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ LỚP HỌC");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Danh sách lớp");

        tbDSlop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã lớp", "Tên lớp"
            }
        ));
        tbDSlop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSlopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDSlop);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Danh sách sinh viên");

        tbDSsinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Tên SV", "Mã lớp", "Tên lớp", "Email", "Số ĐT", "Địa chỉ"
            }
        ));
        tbDSsinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSsinhvienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDSsinhvien);

        jLabel4.setText("Mã lớp:");

        jLabel5.setText("Mã SV:");

        jLabel6.setText("Email:");

        jLabel7.setText("Số ĐT");

        jLabel8.setText("Tên lớp:");

        jLabel9.setText("Tên SV:");

        jLabel10.setText("Địa chỉ");

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane3.setViewportView(txtDiachi);

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Cập nhật");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Làm mới ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail)
                                            .addComponent(txtMalop)
                                            .addComponent(txtMasv))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTensv, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTenlop))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMalop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTenlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTensv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbDSlopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSlopMouseClicked
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
      //  txtMasv.setEnabled(false);
      
        initTable2();
        fillTable2();
//        initTable();
//        fillTable();
        resertForm();

    }//GEN-LAST:event_tbDSlopMouseClicked

    private void tbDSsinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSsinhvienMouseClicked

        int row = tbDSsinhvien.getSelectedRow();
        if(row>=0){
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            txtMalop.setEnabled(false);
            txtTenlop.setEnabled(false);
            txtMasv.setEnabled(false);
            
            txtMasv.setText(tbDSsinhvien.getValueAt(row, 0).toString());
            txtTensv.setText(tbDSsinhvien.getValueAt(row, 1).toString());
            txtMalop.setText(tbDSsinhvien.getValueAt(row, 2).toString());
            txtTenlop.setText(tbDSsinhvien.getValueAt(row, 3).toString());
            txtEmail.setText(tbDSsinhvien.getValueAt(row, 4).toString());
            txtSodt.setText(tbDSsinhvien.getValueAt(row, 5).toString());
            txtDiachi.setText(tbDSsinhvien.getValueAt(row, 6).toString());
        }
    }//GEN-LAST:event_tbDSsinhvienMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            if(!txtMasv.getText().equals("")){
                SinhVienDAO dao= new SinhVienDAO();
                if(dao.Delete(txtMasv.getText())){
                    JOptionPane.showMessageDialog(this, "Xóa thành công 1 sinh viên","Thành công",1);
                    fillTable2();
                    fillTable();
                    resertForm();
                    btnUpdate.setEnabled(false);
                    btnDelete.setEnabled(false);
                }else{
                    JOptionPane.showMessageDialog(this,"Không thể xóa", "Lỗi",2);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            sinhvien sv =new sinhvien();

            sv.setMaSV(txtMasv.getText());
            sv.setHoten(txtTensv.getText());
            sv.setMalop(txtMalop.getText());
            sv.setTenlop(txtTenlop.getText());
            sv.setEmail(txtEmail.getText());
            sv.setSoDT(txtSodt.getText());
            sv.setDiachi(txtDiachi.getText());
            
            SinhVienDAO dao = new SinhVienDAO();
            dao.Update(sv);
            JOptionPane.showMessageDialog(this, "Cập nhật thành công","Thành công",1);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            fillTable2();
            resertForm();
        } catch (Exception e) {
  //          JOptionPane.showMessageDialog(this, "Mã SV đã tồn tại","Lỗi",2);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        initTable();
        fillTable();
        initTable2();
        initTable2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void initTable2(){
        String[] header = new String[]{"Mã SV", "Tên SV","Mã Lớp","Tên Lớp","Email","Số DT","Địa chỉ"};
        model2.setColumnIdentifiers(header);
        tbDSsinhvien.setModel(model2);
    } 
    
        private void fillTable2(){
            int row= tbDSlop.getSelectedRow();
            int col=0;
            String idClass=(String) tbDSlop.getValueAt(row, col);
            System.out.println(idClass);
        List<sinhvien> lstsinhvien = new ArrayList<>();
        try {
            LopDAO dao = new LopDAO();
            lstsinhvien =dao.getAllStudentByClass(idClass);
        } catch (Exception e) {
        }
        model2.setRowCount(0);
        for (sinhvien o : lstsinhvien) {
            model2.addRow(new String[]{o.getMaSV(),o.getHoten(),o.getMalop(),
            o.getTenlop(),o.getEmail(),o.getSoDT(),o.getDiachi()});
        }
        model2.fireTableDataChanged();
    }
         
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbDSlop;
    private javax.swing.JTable tbDSsinhvien;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMalop;
    private javax.swing.JTextField txtMasv;
    private javax.swing.JTextField txtSodt;
    private javax.swing.JTextField txtTenlop;
    private javax.swing.JTextField txtTensv;
    // End of variables declaration//GEN-END:variables
}
