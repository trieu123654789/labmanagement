package frame.admin;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import connection.MainConnection;
import java.sql.SQLException;
import java.sql.*;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableRowSorter;
import combobox.ComboboxBatchType;
import combobox.ComboboxTechName;
import java.util.ArrayList;
import java.util.List;


public class Batch extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    public Batch() {
        initComponents();
        fillTable();
        jtbBatch.getTableHeader().setForeground(Color.RED);
        showComboboxBatchType();
        fillComboboxTechName();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBatch = new javax.swing.JPanel();
        jspBatch = new javax.swing.JScrollPane();
        jtbBatch = new javax.swing.JTable();
        jtfFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpnBatchEdit = new javax.swing.JPanel();
        jlbBatchCode = new javax.swing.JLabel();
        jtfBatchCode = new javax.swing.JTextField();
        jlbBatchType = new javax.swing.JLabel();
        jlbNoOfStudents = new javax.swing.JLabel();
        jtfNoOfStudents = new javax.swing.JTextField();
        jbtnAddBatch = new javax.swing.JButton();
        jbtnEditBatch = new javax.swing.JButton();
        jbtnDeleteBatch = new javax.swing.JButton();
        jbtnResetBatch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbxTechname = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 255, 255));

        jtbBatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Batch Code", "Duration", "Batch type", "No of Students", "TechID", "Tech name"
            }
        ));
        jspBatch.setViewportView(jtbBatch);
        if (jtbBatch.getColumnModel().getColumnCount() > 0) {
            jtbBatch.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbBatch.getColumnModel().getColumn(1).setPreferredWidth(35);
            jtbBatch.getColumnModel().getColumn(2).setPreferredWidth(35);
            jtbBatch.getColumnModel().getColumn(3).setPreferredWidth(35);
            jtbBatch.getColumnModel().getColumn(4).setPreferredWidth(35);
            jtbBatch.getColumnModel().getColumn(5).setPreferredWidth(35);
        }

        jtfFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFindActionPerformed(evt);
            }
        });
        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        javax.swing.GroupLayout jpnBatchLayout = new javax.swing.GroupLayout(jpnBatch);
        jpnBatch.setLayout(jpnBatchLayout);
        jpnBatchLayout.setHorizontalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBatchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnBatchLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspBatch, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnBatchLayout.setVerticalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBatchLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBatchLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jspBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpnBatchEdit.setBackground(new java.awt.Color(234, 234, 234));

        jlbBatchCode.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbBatchCode.setText("Batch code:");

        jtfBatchCode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfBatchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBatchCodeActionPerformed(evt);
            }
        });
        jtfBatchCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBatchCodeKeyReleased(evt);
            }
        });

        jlbBatchType.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbBatchType.setText("Batch type:");

        jlbNoOfStudents.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbNoOfStudents.setText("No of students:");

        jtfNoOfStudents.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnAddBatch.setBackground(new java.awt.Color(51, 204, 0));
        jbtnAddBatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAddBatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        jbtnAddBatch.setText("ADD");
        jbtnAddBatch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAddBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddBatchActionPerformed(evt);
            }
        });

        jbtnEditBatch.setBackground(new java.awt.Color(255, 204, 102));
        jbtnEditBatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEditBatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/edit.png"))); // NOI18N
        jbtnEditBatch.setText("EDIT");
        jbtnEditBatch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEditBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditBatchActionPerformed(evt);
            }
        });

        jbtnDeleteBatch.setBackground(new java.awt.Color(255, 51, 51));
        jbtnDeleteBatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnDeleteBatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        jbtnDeleteBatch.setText("DELETE");
        jbtnDeleteBatch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDeleteBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteBatchActionPerformed(evt);
            }
        });

        jbtnResetBatch.setBackground(new java.awt.Color(153, 153, 153));
        jbtnResetBatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnResetBatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/reset.png"))); // NOI18N
        jbtnResetBatch.setText("RESET");
        jbtnResetBatch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnResetBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetBatchActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Techname:");

        jcbxTechname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jpnBatchEditLayout = new javax.swing.GroupLayout(jpnBatchEdit);
        jpnBatchEdit.setLayout(jpnBatchEditLayout);
        jpnBatchEditLayout.setHorizontalGroup(
            jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchEditLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBatchEditLayout.createSequentialGroup()
                        .addComponent(jlbBatchCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnBatchEditLayout.createSequentialGroup()
                        .addComponent(jlbBatchType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnDeleteBatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnEditBatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnResetBatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnBatchEditLayout.createSequentialGroup()
                        .addGroup(jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbNoOfStudents)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbxTechname, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnBatchEditLayout.createSequentialGroup()
                                .addComponent(jtfNoOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jbtnAddBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBatchEditLayout.setVerticalGroup(
            jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBatchEditLayout.createSequentialGroup()
                        .addGroup(jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbBatchCode)
                            .addComponent(jtfBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbNoOfStudents)
                            .addComponent(jtfNoOfStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jpnBatchEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbBatchType)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbxTechname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jpnBatchEditLayout.createSequentialGroup()
                        .addComponent(jbtnAddBatch)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditBatch)))
                .addGap(18, 18, 18)
                .addComponent(jbtnDeleteBatch)
                .addGap(18, 18, 18)
                .addComponent(jbtnResetBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnBatchEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBatchEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddBatchActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (!checkValidateForm()) {
                JOptionPane.showMessageDialog(this, "You must enter all the information!");
                return;
            }
            //Check batchcode 
            String batchCodeCheck = "^B\\d+$";
            Pattern pattern = Pattern.compile(batchCodeCheck);
            Matcher matcher = pattern.matcher(jtfBatchCode.getText().trim());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(null, "Batch code must start with 'B' and number behind!");
                jtfBatchCode.requestFocus();
                return;
            }
            //Check number of student
            String numberOfStudentCheck = "^(1?[1-9]|20)$";
            Pattern pattern1 = Pattern.compile(numberOfStudentCheck);
            Matcher matcher1 = pattern1.matcher(jtfNoOfStudents.getText().trim());
            if (!matcher1.find()) {
                JOptionPane.showMessageDialog(null, "You must enter number and number in 1 batch must be greater than 0 and not more than 20!");
                jtfNoOfStudents.requestFocus();
                return;
            }
            //Check batch is exist or not
            Statement st = conn.createStatement();
            String sql1 = "Select BatchCode from Batch";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("BatchCode").equals(jtfBatchCode.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This BatchCode is already exist!");
                    jtfBatchCode.requestFocus();
                    return;
                }
            }
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO Batch (BatchCode, Duration, BatchType, NoOfStudents, TechID, Techname) SELECT ?, Duration, ?, ?, TechID, ? FROM Technology WHERE Techname = ?");
            pstm.setString(1, jtfBatchCode.getText().trim());
            pstm.setString(2, (String) jComboBox1.getSelectedItem());
            pstm.setString(3, jtfNoOfStudents.getText().trim());
            pstm.setString(4, (String) jcbxTechname.getSelectedItem());
            pstm.setString(5, (String) jcbxTechname.getSelectedItem());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnAddBatchActionPerformed

    private void jbtnEditBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditBatchActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbBatch.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            if (!checkValidateForm()) {
                JOptionPane.showMessageDialog(this, "You must enter all the information!");
                return;
            }
            //Check Batchcode
            String numberOfStudentCheck = "^(?:[1-9]|1[0-9]|20)$";
            Pattern pattern1 = Pattern.compile(numberOfStudentCheck);
            Matcher matcher1 = pattern1.matcher(jtfNoOfStudents.getText().trim());
            if (!matcher1.matches()) {
                JOptionPane.showMessageDialog(this, "You must enter number and number in 1 batch must be greater than 0 and not more than 20!");
                jtfNoOfStudents.requestFocus();
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("UPDATE Batch SET Duration = (SELECT Duration FROM Technology WHERE Techname = ?), BatchType = ?, NoOfStudents = ?, TechID=(SELECT TechID FROM Technology WHERE Techname = ?), Techname = ? WHERE BatchCode = ?");
            pstm.setString(1, (String) jcbxTechname.getSelectedItem());
            pstm.setString(2, (String) jComboBox1.getSelectedItem());
            pstm.setString(3, jtfNoOfStudents.getText().trim());
            pstm.setString(4, (String) jcbxTechname.getSelectedItem());
            pstm.setString(5, (String) jcbxTechname.getSelectedItem());
            pstm.setString(6, jtfBatchCode.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnEditBatchActionPerformed

    private void jbtnDeleteBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteBatchActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbBatch.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Delete Batch where BatchCode=?");
            pstm.setString(1, jtbBatch.getValueAt(jtbBatch.getSelectedRow(), 0).toString().trim());
            if (JOptionPane.showConfirmDialog(this, "Delete this batch?", "Confirm",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                PreparedStatement pstm1 = conn.prepareStatement("Delete Schedule where BatchCode=?");
                pstm1.setString(1, jtbBatch.getValueAt(jtbBatch.getSelectedRow(), 0).toString().trim());
                pstm1.executeUpdate();
                PreparedStatement pstm2 = conn.prepareStatement("Delete LearningReport where BatchCode=?");
                pstm2.setString(1, jtbBatch.getValueAt(jtbBatch.getSelectedRow(), 0).toString().trim());
                pstm2.executeUpdate();
                pstm.executeUpdate();
                tbModel.setRowCount(0);
                fillTable();
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jbtnDeleteBatchActionPerformed


    private void jbtnResetBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetBatchActionPerformed
        jtfBatchCode.setText("");
        jtfNoOfStudents.setText("");
    }//GEN-LAST:event_jbtnResetBatchActionPerformed
  
    private void jtfFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFindActionPerformed

    private void jtfFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFindKeyReleased
        String search = jtfFind.getText();
        search(search);
    }//GEN-LAST:event_jtfFindKeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtfBatchCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBatchCodeKeyReleased

    }//GEN-LAST:event_jtfBatchCodeKeyReleased

    private void jtfBatchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBatchCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBatchCodeActionPerformed
      public boolean checkValidateForm() {
        if (jtfBatchCode.getText().isEmpty()
                || jtfNoOfStudents.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void fillTable() {
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            int number;
            Vector row, column;
            column = new Vector();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from Batch");
            ResultSetMetaData mtdt = rs.getMetaData();
            number = mtdt.getColumnCount();
            for (int i = 1; i <= number; i++) {
                column.add(mtdt.getColumnName(i));
            }
            tbModel.setColumnIdentifiers(column);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tbModel.addRow(row);
                jtbBatch.setModel(tbModel);
            }
            jtbBatch.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jtbBatch.getSelectedRow() >= 0) {
                        jtfBatchCode.setText(jtbBatch.getValueAt(jtbBatch.getSelectedRow(), 0) + "");
                        jComboBox1.setSelectedItem(jtbBatch.getValueAt(jtbBatch.getSelectedRow(), 2) + "");
                        jtfNoOfStudents.setText(jtbBatch.getValueAt(jtbBatch.getSelectedRow(), 3) + "");
                        jcbxTechname.setSelectedItem(jtbBatch.getValueAt(jtbBatch.getSelectedRow(), 5) + "");
                    }
                }
            });
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbBatch.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbBatch.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    public void showComboboxBatchType() {
        List<String> data = ComboboxBatchType.getData();
        jComboBox1.removeAllItems();
        for (String string : data) {
            if (!isItemExist(string)) {
                jComboBox1.addItem(string);
            }
        }
    }

    private boolean isItemExist(String item) {
        for (int i = 0; i < jComboBox1.getItemCount(); i++) {
            if (item.equals(jComboBox1.getItemAt(i))) {
                return true;
            }
        }
        return false;
    }

    public void fillComboboxTechName() {
        jcbxTechname.removeAllItems();
        ArrayList<String> data = ComboboxTechName.getTechName();
        for (String item : data) {
            if (!isItemExist1(item)) {
                jcbxTechname.addItem(item);
            }

        }

    }

    private boolean isItemExist1(String item) {
        for (int i = 0; i < jcbxTechname.getItemCount(); i++) {
            if (item.equals(jcbxTechname.getItemAt(i))) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnAddBatch;
    private javax.swing.JButton jbtnDeleteBatch;
    private javax.swing.JButton jbtnEditBatch;
    private javax.swing.JButton jbtnResetBatch;
    private javax.swing.JComboBox<String> jcbxTechname;
    private javax.swing.JLabel jlbBatchCode;
    private javax.swing.JLabel jlbBatchType;
    private javax.swing.JLabel jlbNoOfStudents;
    private javax.swing.JPanel jpnBatch;
    private javax.swing.JPanel jpnBatchEdit;
    private javax.swing.JScrollPane jspBatch;
    private javax.swing.JTable jtbBatch;
    private javax.swing.JTextField jtfBatchCode;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfNoOfStudents;
    // End of variables declaration//GEN-END:variables

}
