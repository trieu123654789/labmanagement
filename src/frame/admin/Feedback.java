package frame.admin;

import connection.MainConnection;
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

public class Feedback extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();
    DefaultTableModel tbModel1 = new DefaultTableModel();

    public Feedback() {
        initComponents();
        fillTable();
        fillTable1();
        jtbSendFeedback.getTableHeader().setForeground(Color.RED);
        jtbReceiveFeedback.getTableHeader().setForeground(Color.RED);
        jtaFbContent.setLineWrap(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnSendFeedback = new javax.swing.JPanel();
        jpnsendFeedback = new javax.swing.JPanel();
        jspFeedback = new javax.swing.JScrollPane();
        jtbSendFeedback = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jlbFeedbackID = new javax.swing.JLabel();
        jtfFeedbackID = new javax.swing.JTextField();
        jlbFbContent = new javax.swing.JLabel();
        jbtnSend = new javax.swing.JButton();
        jbtnEdit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaFbContent = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jtfStudentID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfFind = new javax.swing.JTextField();
        jpnReceiveFeedback = new javax.swing.JPanel();
        jpnreceiveFeedback = new javax.swing.JPanel();
        jspFeedback1 = new javax.swing.JScrollPane();
        jtbReceiveFeedback = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtfFind1 = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtbSendFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FeedbackID", "StudentID", "Feedback content"
            }
        ));
        jspFeedback.setViewportView(jtbSendFeedback);
        if (jtbSendFeedback.getColumnModel().getColumnCount() > 0) {
            jtbSendFeedback.getColumnModel().getColumn(0).setPreferredWidth(3);
            jtbSendFeedback.getColumnModel().getColumn(1).setHeaderValue("StudentID");
        }

        javax.swing.GroupLayout jpnsendFeedbackLayout = new javax.swing.GroupLayout(jpnsendFeedback);
        jpnsendFeedback.setLayout(jpnsendFeedbackLayout);
        jpnsendFeedbackLayout.setHorizontalGroup(
            jpnsendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnsendFeedbackLayout.createSequentialGroup()
                .addComponent(jspFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnsendFeedbackLayout.setVerticalGroup(
            jpnsendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnsendFeedbackLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jspFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(234, 234, 234));

        jlbFeedbackID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbFeedbackID.setText("Feedback ID:");

        jtfFeedbackID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfFeedbackID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFeedbackIDActionPerformed(evt);
            }
        });

        jlbFbContent.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbFbContent.setText("Feedback content");

        jbtnSend.setBackground(new java.awt.Color(51, 204, 0));
        jbtnSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        jbtnSend.setText("SEND");
        jbtnSend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSendActionPerformed(evt);
            }
        });

        jbtnEdit.setBackground(new java.awt.Color(255, 204, 102));
        jbtnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/edit.png"))); // NOI18N
        jbtnEdit.setText("EDIT");
        jbtnEdit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt);
            }
        });

        jbtnDelete.setBackground(new java.awt.Color(255, 51, 51));
        jbtnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        jbtnDelete.setText("DELETE");
        jbtnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(new java.awt.Color(153, 153, 153));
        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/reset.png"))); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jtaFbContent.setColumns(20);
        jtaFbContent.setRows(5);
        jScrollPane1.setViewportView(jtaFbContent);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("StudentID:");

        jtfStudentID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbFeedbackID)
                    .addComponent(jlbFbContent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtfFeedbackID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnSend, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jbtnSend)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbFeedbackID)
                            .addComponent(jtfFeedbackID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jtfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbFbContent)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

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

        javax.swing.GroupLayout jpnSendFeedbackLayout = new javax.swing.GroupLayout(jpnSendFeedback);
        jpnSendFeedback.setLayout(jpnSendFeedbackLayout);
        jpnSendFeedbackLayout.setHorizontalGroup(
            jpnSendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSendFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnSendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnSendFeedbackLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpnSendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnSendFeedbackLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpnsendFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnSendFeedbackLayout.setVerticalGroup(
            jpnSendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSendFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnSendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpnSendFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSendFeedbackLayout.createSequentialGroup()
                    .addContainerGap(40, Short.MAX_VALUE)
                    .addComponent(jpnsendFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Send Feedback", jpnSendFeedback);

        jtbReceiveFeedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FeedbackID", "StudentID", "Feedback content"
            }
        ));
        jspFeedback1.setViewportView(jtbReceiveFeedback);

        javax.swing.GroupLayout jpnreceiveFeedbackLayout = new javax.swing.GroupLayout(jpnreceiveFeedback);
        jpnreceiveFeedback.setLayout(jpnreceiveFeedbackLayout);
        jpnreceiveFeedbackLayout.setHorizontalGroup(
            jpnreceiveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnreceiveFeedbackLayout.createSequentialGroup()
                .addComponent(jspFeedback1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpnreceiveFeedbackLayout.setVerticalGroup(
            jpnreceiveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnreceiveFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspFeedback1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Enter information to search:");

        jtfFind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFind1ActionPerformed(evt);
            }
        });
        jtfFind1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFind1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnReceiveFeedbackLayout = new javax.swing.GroupLayout(jpnReceiveFeedback);
        jpnReceiveFeedback.setLayout(jpnReceiveFeedbackLayout);
        jpnReceiveFeedbackLayout.setHorizontalGroup(
            jpnReceiveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnReceiveFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jtfFind1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jpnReceiveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnReceiveFeedbackLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpnreceiveFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnReceiveFeedbackLayout.setVerticalGroup(
            jpnReceiveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnReceiveFeedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnReceiveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFind1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(469, Short.MAX_VALUE))
            .addGroup(jpnReceiveFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnReceiveFeedbackLayout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(jpnreceiveFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Receive feedback", jpnReceiveFeedback);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFindKeyReleased
        String Search = jtfFind.getText();
        search(Search);
    }//GEN-LAST:event_jtfFindKeyReleased

    private void jtfFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFindActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed

    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbSendFeedback.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Delete Feedback where FeedbackID=?");
            pstm.setString(1, jtbSendFeedback.getValueAt(jtbSendFeedback.getSelectedRow(), 0).toString().trim());
            if (JOptionPane.showConfirmDialog(this, "Delete this feedback?", "Confirm",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                pstm.executeUpdate();
                tbModel.setRowCount(0);
                fillTable();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbSendFeedback.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }

            if (!checkValidateForm()) {
                JOptionPane.showMessageDialog(this, "You must enter all the information!");
                return;
            }
            Statement st = conn.createStatement();
            //Check studentID
            String stdIDCheck = "^S\\d+$";
            Pattern pattern1 = Pattern.compile(stdIDCheck);
            Matcher matcher1 = pattern1.matcher(jtfStudentID.getText().trim());
            if (!matcher1.find()) {
                JOptionPane.showMessageDialog(null, "StudentID must start with 'S' and number behind!");
                jtfStudentID.requestFocus();
                return;
            }
            //Check student is exist or not
            String sql2 = "Select * from Students where Studentid='" + jtfStudentID.getText().trim() + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            if (!rs2.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Studentid!");
                jtfStudentID.requestFocus();
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Update Feedback set FeedbackContent=? where FeedBackID=?");
            pstm.setString(2, jtfFeedbackID.getText().trim());
            pstm.setString(1, jtaFbContent.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jbtnEditActionPerformed

    private void jbtnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSendActionPerformed
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
            Statement st = conn.createStatement();
            //Check feedbackID
            String FeedbackCheck = "^F\\d+$";
            Pattern pattern = Pattern.compile(FeedbackCheck);
            Matcher matcher = pattern.matcher(jtfFeedbackID.getText().trim());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(null, "FeedbackID must start with 'F' and number behind!");
                jtfFeedbackID.requestFocus();
                return;
            }
            //Check studentID
            String stdIDCheck = "^S\\d+$";
            Pattern pattern1 = Pattern.compile(stdIDCheck);
            Matcher matcher1 = pattern1.matcher(jtfStudentID.getText().trim());
            if (!matcher1.find()) {
                JOptionPane.showMessageDialog(null, "StudentID must start with 'S' and number behind!");
                jtfStudentID.requestFocus();
                return;
            }
            //Check feedback id is exist or not
            String sql1 = "Select FeedbackID from Feedback";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("FeedbackID").equals(jtfFeedbackID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This FeedbackID is already exist!");
                    jtfFeedbackID.requestFocus();
                    return;
                }
            }
            //Check student is exist or not
            String sql2 = "Select * from Students where Studentid='" + jtfStudentID.getText().trim() + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            if (!rs2.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Studentid!");
                jtfStudentID.requestFocus();
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO Feedback (FeedbackID, StudentID, FeedbackContent, Sendby) SELECT ?, ?, ?, ?");
            pstm.setString(1, jtfFeedbackID.getText().trim());
            pstm.setString(4, "Admin");
            pstm.setString(3, jtaFbContent.getText().trim());
            pstm.setString(2, jtfStudentID.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnSendActionPerformed

    private void jtfFeedbackIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFeedbackIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFeedbackIDActionPerformed

    private void jtfFind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFind1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFind1ActionPerformed

    private void jtfFind1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFind1KeyReleased
        String Search = jtfFind.getText();
        search1(Search);
    }//GEN-LAST:event_jtfFind1KeyReleased
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
            ResultSet rs = st.executeQuery("select FeedbackID, StudentID, FeedbackContent from Feedback where Sendby='Admin'");
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
                jtbSendFeedback.setModel(tbModel);
            }
            jtbSendFeedback.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jtbSendFeedback.getSelectedRow() >= 0) {
                        jtfFeedbackID.setText(jtbSendFeedback.getValueAt(jtbSendFeedback.getSelectedRow(), 0) + "");
                        jtfStudentID.setText(jtbSendFeedback.getValueAt(jtbSendFeedback.getSelectedRow(), 1) + "");
                        jtaFbContent.setText(jtbSendFeedback.getValueAt(jtbSendFeedback.getSelectedRow(), 2) + "");
                    }
                }
            });

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void fillTable1() {
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
            ResultSet rs = st.executeQuery("select FeedbackID, StudentID, FeedbackContent from Feedback where Sendby='Student'");
            ResultSetMetaData mtdt = rs.getMetaData();
            number = mtdt.getColumnCount();
            for (int i = 1; i <= number; i++) {
                column.add(mtdt.getColumnName(i));
            }
            tbModel1.setColumnIdentifiers(column);
            while (rs.next()) {
                row = new Vector();
                for (int i = 1; i <= number; i++) {
                    row.addElement(rs.getString(i));
                }
                tbModel1.addRow(row);
                jtbReceiveFeedback.setModel(tbModel1);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public boolean checkValidateForm() {
        if (jtfFeedbackID.getText().isEmpty()
                || jtaFbContent.getText().isEmpty() || jtfStudentID.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbSendFeedback.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbSendFeedback.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    public void search1(String str) {
        tbModel1 = (DefaultTableModel) jtbReceiveFeedback.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel1);
        jtbReceiveFeedback.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSend;
    private javax.swing.JLabel jlbFbContent;
    private javax.swing.JLabel jlbFeedbackID;
    private javax.swing.JPanel jpnReceiveFeedback;
    private javax.swing.JPanel jpnSendFeedback;
    private javax.swing.JPanel jpnreceiveFeedback;
    private javax.swing.JPanel jpnsendFeedback;
    private javax.swing.JScrollPane jspFeedback;
    private javax.swing.JScrollPane jspFeedback1;
    private javax.swing.JTextArea jtaFbContent;
    private javax.swing.JTable jtbReceiveFeedback;
    private javax.swing.JTable jtbSendFeedback;
    private javax.swing.JTextField jtfFeedbackID;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfFind1;
    private javax.swing.JTextField jtfStudentID;
    // End of variables declaration//GEN-END:variables
}
