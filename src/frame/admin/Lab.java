package frame.admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import connection.MainConnection;


public class Lab extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    public Lab() {
        initComponents();
        fillTable();
        jtbLab.getTableHeader().setForeground(Color.RED);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnLab = new javax.swing.JPanel();
        jspLab = new javax.swing.JScrollPane();
        jtbLab = new javax.swing.JTable();
        jtfFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpnLabEdit = new javax.swing.JPanel();
        jlbLabID = new javax.swing.JLabel();
        jtfLabID = new javax.swing.JTextField();
        jtfNoOfComputers = new javax.swing.JTextField();
        jlbNoOfComputers = new javax.swing.JLabel();
        jbtnAddLab = new javax.swing.JButton();
        jbtnEditLab = new javax.swing.JButton();
        jBtnDeleteLab = new javax.swing.JButton();
        jbtnResetLab = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jtbLab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lab id", "No of computers"
            }
        ));
        jspLab.setViewportView(jtbLab);
        if (jtbLab.getColumnModel().getColumnCount() > 0) {
            jtbLab.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbLab.getColumnModel().getColumn(1).setPreferredWidth(35);
        }

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        javax.swing.GroupLayout jpnLabLayout = new javax.swing.GroupLayout(jpnLab);
        jpnLab.setLayout(jpnLabLayout);
        jpnLabLayout.setHorizontalGroup(
            jpnLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnLabLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspLab, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnLabLayout.setVerticalGroup(
            jpnLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLabLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jpnLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(jpnLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLabLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jspLab, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpnLabEdit.setBackground(new java.awt.Color(234, 234, 234));

        jlbLabID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbLabID.setText("Lab id:");

        jtfLabID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtfNoOfComputers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbNoOfComputers.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbNoOfComputers.setText("No of computers:");

        jbtnAddLab.setBackground(new java.awt.Color(51, 204, 0));
        jbtnAddLab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAddLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        jbtnAddLab.setText("ADD");
        jbtnAddLab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAddLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddLabActionPerformed(evt);
            }
        });

        jbtnEditLab.setBackground(new java.awt.Color(255, 204, 102));
        jbtnEditLab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEditLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/edit.png"))); // NOI18N
        jbtnEditLab.setText("EDIT");
        jbtnEditLab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEditLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditLabActionPerformed(evt);
            }
        });

        jBtnDeleteLab.setBackground(new java.awt.Color(255, 51, 51));
        jBtnDeleteLab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnDeleteLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        jBtnDeleteLab.setText("DELETE");
        jBtnDeleteLab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBtnDeleteLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteLabActionPerformed(evt);
            }
        });

        jbtnResetLab.setBackground(new java.awt.Color(153, 153, 153));
        jbtnResetLab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnResetLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/reset.png"))); // NOI18N
        jbtnResetLab.setText("RESET");
        jbtnResetLab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnResetLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetLabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnLabEditLayout = new javax.swing.GroupLayout(jpnLabEdit);
        jpnLabEdit.setLayout(jpnLabEditLayout);
        jpnLabEditLayout.setHorizontalGroup(
            jpnLabEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLabEditLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbLabID)
                .addGap(68, 68, 68)
                .addComponent(jtfLabID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jlbNoOfComputers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfNoOfComputers, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jpnLabEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAddLab, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLabEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jBtnDeleteLab, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnEditLab, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnResetLab, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jpnLabEditLayout.setVerticalGroup(
            jpnLabEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLabEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpnLabEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnLabEditLayout.createSequentialGroup()
                        .addComponent(jbtnAddLab)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditLab)
                        .addGap(22, 22, 22)
                        .addComponent(jBtnDeleteLab)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnResetLab, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnLabEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbLabID)
                        .addComponent(jtfLabID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbNoOfComputers)
                        .addComponent(jtfNoOfComputers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnLabEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnLabEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddLabActionPerformed
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
            //Lab check
            String LabIDCheck = "^L\\d+$";
            Pattern pattern = Pattern.compile(LabIDCheck);
            Matcher matcher = pattern.matcher(jtfLabID.getText().trim());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(null, "Lab ID must start with 'L' and number behind!");
                jtfLabID.requestFocus();
                return;

            }
            //No of computers check
             String noOfComputers = "^(?:2[2-9]|[3-9][0-9]|[1-9][0-9]{2,})$";
            Pattern pattern2 = Pattern.compile(noOfComputers);
            Matcher matcher2 = pattern2.matcher(jtfNoOfComputers.getText().trim());
            if (!matcher2.matches()) {
                JOptionPane.showMessageDialog(null, "The number of computers must be equal or greater than 22!");
                jtfNoOfComputers.requestFocus();
                return;
            }
            //Check labid is exist or not
            Statement st = conn.createStatement();
            String sql1 = "Select LabID from Lab";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("LabID").equals(jtfLabID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This LabID is already exist!");
                    jtfLabID.requestFocus();
                    return;
                }
            }
            PreparedStatement pstm = conn.prepareStatement("insert into Lab values (?, ?)");
            pstm.setString(1, jtfLabID.getText().trim());
            pstm.setInt(2, Integer.parseInt(jtfNoOfComputers.getText().trim()));
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnAddLabActionPerformed

    private void jbtnEditLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditLabActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbLab.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            //Check number of computers
            String NoOfComputers = "^(?:2[2-9]|[3-9][0-9]|[1-9][0-9]{2,})$";
            Pattern pattern2 = Pattern.compile(NoOfComputers);
            Matcher matcher2 = pattern2.matcher(jtfNoOfComputers.getText().trim());
            if (!matcher2.matches()) {
                JOptionPane.showMessageDialog(null, "You must enter number and the number of computers must be equal or greater than 22!");
                jtfNoOfComputers.requestFocus();
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Update Lab set NoOfComputers=? where LabID = ?");
            pstm.setInt(1, Integer.parseInt(jtfNoOfComputers.getText().trim()));
            pstm.setString(2, jtfLabID.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnEditLabActionPerformed

    private void jBtnDeleteLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteLabActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbLab.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Delete Lab where LabID=?");
            pstm.setString(1, jtbLab.getValueAt(jtbLab.getSelectedRow(), 0).toString().trim());
            if (JOptionPane.showConfirmDialog(this, "Delete this Lab?", "Confirm",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
               
                pstm.executeUpdate();
                tbModel.setRowCount(0);
                fillTable();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Cannot delete this lab because this lab is being used");
        }
    }//GEN-LAST:event_jBtnDeleteLabActionPerformed

    private void jbtnResetLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetLabActionPerformed
        jtfLabID.setText("");
        jtfNoOfComputers.setText("");
    }//GEN-LAST:event_jbtnResetLabActionPerformed

    private void jtfFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFindKeyReleased
        String search = jtfFind.getText();
        search(search);
    }//GEN-LAST:event_jtfFindKeyReleased
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
            ResultSet rs = st.executeQuery("Select * from Lab");
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
                jtbLab.setModel(tbModel);
            }
            jtbLab.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jtbLab.getSelectedRow() >= 0) {
                        jtfLabID.setText(jtbLab.getValueAt(jtbLab.getSelectedRow(), 0) + "");
                        jtfNoOfComputers.setText(jtbLab.getValueAt(jtbLab.getSelectedRow(), 1) + "");
                    }
                }
            });
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public boolean checkValidateForm() {
        if (jtfLabID.getText().isEmpty()  || jtfNoOfComputers.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    
    public void search(String str) {
        tbModel = (DefaultTableModel) jtbLab.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbLab.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDeleteLab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnAddLab;
    private javax.swing.JButton jbtnEditLab;
    private javax.swing.JButton jbtnResetLab;
    private javax.swing.JLabel jlbLabID;
    private javax.swing.JLabel jlbNoOfComputers;
    private javax.swing.JPanel jpnLab;
    private javax.swing.JPanel jpnLabEdit;
    private javax.swing.JScrollPane jspLab;
    private javax.swing.JTable jtbLab;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfLabID;
    private javax.swing.JTextField jtfNoOfComputers;
    // End of variables declaration//GEN-END:variables

}
