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

public class Technology extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    public Technology() {
        initComponents();
        fillTable();
        jtbTechnology.getTableHeader().setForeground(Color.RED);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnTechnology = new javax.swing.JPanel();
        jspTechnology = new javax.swing.JScrollPane();
        jtbTechnology = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfFind = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jlbTechnologyID = new javax.swing.JLabel();
        jtfTechnologyID = new javax.swing.JTextField();
        jlbTechnologyName = new javax.swing.JLabel();
        jtfTechnologyName = new javax.swing.JTextField();
        jlbSoftware = new javax.swing.JLabel();
        jtfSoftware = new javax.swing.JTextField();
        jlbDuration = new javax.swing.JLabel();
        jtfDuration = new javax.swing.JTextField();
        jbtnAddTech = new javax.swing.JButton();
        jbtnEditTech = new javax.swing.JButton();
        jbtnDeleteTech = new javax.swing.JButton();
        jbtnResetTech = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jtbTechnology.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Technology ID", "Technology name", "Software", "Duration"
            }
        ));
        jspTechnology.setViewportView(jtbTechnology);
        if (jtbTechnology.getColumnModel().getColumnCount() > 0) {
            jtbTechnology.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbTechnology.getColumnModel().getColumn(1).setPreferredWidth(35);
            jtbTechnology.getColumnModel().getColumn(2).setPreferredWidth(35);
            jtbTechnology.getColumnModel().getColumn(3).setPreferredWidth(35);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnTechnologyLayout = new javax.swing.GroupLayout(jpnTechnology);
        jpnTechnology.setLayout(jpnTechnologyLayout);
        jpnTechnologyLayout.setHorizontalGroup(
            jpnTechnologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTechnologyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnTechnologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnTechnologyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspTechnology, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnTechnologyLayout.setVerticalGroup(
            jpnTechnologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTechnologyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnTechnologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(jpnTechnologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTechnologyLayout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addComponent(jspTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        jlbTechnologyID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbTechnologyID.setText("Technology ID:");

        jtfTechnologyID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfTechnologyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTechnologyIDActionPerformed(evt);
            }
        });

        jlbTechnologyName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbTechnologyName.setText("Technology name:");

        jtfTechnologyName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbSoftware.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbSoftware.setText("Software:");

        jtfSoftware.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbDuration.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbDuration.setText("Duration:");

        jtfDuration.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnAddTech.setBackground(new java.awt.Color(51, 204, 0));
        jbtnAddTech.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAddTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        jbtnAddTech.setText("ADD");
        jbtnAddTech.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAddTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddTechActionPerformed(evt);
            }
        });

        jbtnEditTech.setBackground(new java.awt.Color(255, 204, 102));
        jbtnEditTech.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEditTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/edit.png"))); // NOI18N
        jbtnEditTech.setText("EDIT");
        jbtnEditTech.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEditTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditTechActionPerformed(evt);
            }
        });

        jbtnDeleteTech.setBackground(new java.awt.Color(255, 51, 51));
        jbtnDeleteTech.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnDeleteTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        jbtnDeleteTech.setText("DELETE");
        jbtnDeleteTech.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDeleteTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteTechActionPerformed(evt);
            }
        });

        jbtnResetTech.setBackground(new java.awt.Color(153, 153, 153));
        jbtnResetTech.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnResetTech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/reset.png"))); // NOI18N
        jbtnResetTech.setText("RESET");
        jbtnResetTech.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnResetTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetTechActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbTechnologyName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfTechnologyName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbTechnologyID)
                        .addGap(25, 25, 25)
                        .addComponent(jtfTechnologyID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnResetTech, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbSoftware)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlbDuration)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnEditTech, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAddTech, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDeleteTech, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnAddTech)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbTechnologyID)
                        .addComponent(jtfTechnologyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbSoftware)
                        .addComponent(jtfSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jbtnEditTech)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDeleteTech)
                    .addComponent(jlbTechnologyName)
                    .addComponent(jtfTechnologyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbDuration)
                    .addComponent(jtfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbtnResetTech, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnTechnology, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddTechActionPerformed
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
            //Check techID
            String TechIDCheck = "^T\\d+$";
            Pattern pattern = Pattern.compile(TechIDCheck);
            Matcher matcher = pattern.matcher(jtfTechnologyID.getText().trim());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(null, "TechID must start with 'T' and number behind!");
                jtfTechnologyID.requestFocus();
                return;
            }
            //Check techID is exist or not
            Statement st = conn.createStatement();
            String sql1 = "Select Techid from Technology";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("Techid").equals(jtfTechnologyID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This Techid is already exist!");
                    jtfTechnologyID.requestFocus();
                    return;
                }
            }
            //Check technology is exist or not
            Statement st1 = conn.createStatement();
            String sql2 = "Select Techname from Technology";
            ResultSet rs2 = st1.executeQuery(sql2);
            while (rs2.next()) {
                if (rs2.getString("Techname").equals(jtfTechnologyName.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This technology is already exist!");
                    jtfTechnologyName.requestFocus();
                    return;
                }
            }
            PreparedStatement pstm = conn.prepareStatement("insert into Technology (Techid, Techname, Duration, Software) values (?, ?, ?, ?)");
            pstm.setString(1, jtfTechnologyID.getText().trim());
            pstm.setString(2, jtfTechnologyName.getText().trim());
            pstm.setString(3, jtfDuration.getText().trim());
            pstm.setString(4, jtfSoftware.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnAddTechActionPerformed

    private void jbtnEditTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditTechActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbTechnology.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            //Check technology is exist or not
            PreparedStatement technameCheckStmt = conn.prepareStatement("SELECT COUNT(*) FROM Technology WHERE Techname = ? AND Techid != ?");
            technameCheckStmt.setString(1, jtfTechnologyName.getText().trim());
            technameCheckStmt.setString(2, jtfTechnologyID.getText().trim());
            ResultSet usernameCheckResult = technameCheckStmt.executeQuery();
            usernameCheckResult.next();
            int count = usernameCheckResult.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "This technology is already exist!");
                jtfTechnologyName.requestFocus();
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Update Technology set Techname =?, Duration=?, Software=? where Techid = ?");
            pstm.setString(1, jtfTechnologyName.getText().trim());
            pstm.setString(2, jtfDuration.getText().trim());
            pstm.setString(3, jtfSoftware.getText().trim());
            pstm.setString(4, jtfTechnologyID.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnEditTechActionPerformed

    private void jbtnDeleteTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteTechActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbTechnology.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Delete Technology where Techid=?");
            pstm.setString(1, jtbTechnology.getValueAt(jtbTechnology.getSelectedRow(), 0).toString().trim());
            if (JOptionPane.showConfirmDialog(this, "Delete this technology?", "Confirm",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                pstm.executeUpdate();
                tbModel.setRowCount(0);
                fillTable();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Cannot delete this technology because technology is already in use!");
        }
    }//GEN-LAST:event_jbtnDeleteTechActionPerformed

    private void jbtnResetTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetTechActionPerformed
        jtfTechnologyID.setText("");
        jtfDuration.setText("");
        jtfTechnologyName.setText("");
        jtfSoftware.setText("");
    }//GEN-LAST:event_jbtnResetTechActionPerformed

    private void jtfTechnologyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTechnologyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTechnologyIDActionPerformed

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
            ResultSet rs = st.executeQuery("Select * from Technology");
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
                jtbTechnology.setModel(tbModel);
            }
            jtbTechnology.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jtbTechnology.getSelectedRow() >= 0) {
                        jtfTechnologyID.setText(jtbTechnology.getValueAt(jtbTechnology.getSelectedRow(), 0) + "");
                        jtfTechnologyName.setText(jtbTechnology.getValueAt(jtbTechnology.getSelectedRow(), 1) + "");
                        jtfDuration.setText(jtbTechnology.getValueAt(jtbTechnology.getSelectedRow(), 2) + "");
                        jtfSoftware.setText(jtbTechnology.getValueAt(jtbTechnology.getSelectedRow(), 3) + "");
                    }
                }
            });
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public boolean checkValidateForm() {
        if (jtfTechnologyID.getText().isEmpty() || jtfSoftware.getText().isEmpty() || jtfDuration.getText().isEmpty()
                || jtfTechnologyName.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbTechnology.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbTechnology.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAddTech;
    private javax.swing.JButton jbtnDeleteTech;
    private javax.swing.JButton jbtnEditTech;
    private javax.swing.JButton jbtnResetTech;
    private javax.swing.JLabel jlbDuration;
    private javax.swing.JLabel jlbSoftware;
    private javax.swing.JLabel jlbTechnologyID;
    private javax.swing.JLabel jlbTechnologyName;
    private javax.swing.JPanel jpnTechnology;
    private javax.swing.JScrollPane jspTechnology;
    private javax.swing.JTable jtbTechnology;
    private javax.swing.JTextField jtfDuration;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfSoftware;
    private javax.swing.JTextField jtfTechnologyID;
    private javax.swing.JTextField jtfTechnologyName;
    // End of variables declaration//GEN-END:variables

}
