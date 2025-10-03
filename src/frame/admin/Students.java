package frame.admin;

import java.awt.Color;
import java.math.BigDecimal;
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
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Students extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    public Students() {
        initComponents();
        fillTable();
        jtbStudents.getTableHeader().setForeground(Color.RED);
        hidePassword();

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnStudents = new javax.swing.JPanel();
        jspStudents = new javax.swing.JScrollPane();
        jtbStudents = new javax.swing.JTable();
        jtfFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jpnStudentsEdit = new javax.swing.JPanel();
        jlbStudentID = new javax.swing.JLabel();
        jtfStudentID = new javax.swing.JTextField();
        jlbFirstName = new javax.swing.JLabel();
        jtfFirstName = new javax.swing.JTextField();
        jlbAddress = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jlbPhone = new javax.swing.JLabel();
        jtfPhone = new javax.swing.JTextField();
        jlbDayofbirth = new javax.swing.JLabel();
        jtfDayofbirth = new javax.swing.JTextField();
        jbtnAddStudents = new javax.swing.JButton();
        jbtnEditStudents = new javax.swing.JButton();
        jbtnDeleteStudents = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jlbUserName = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jlbPassword = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        jtbStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student name", "Address", "Phone", "Day of birth", "UserName", "Password"
            }
        ));
        jspStudents.setViewportView(jtbStudents);
        if (jtbStudents.getColumnModel().getColumnCount() > 0) {
            jtbStudents.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbStudents.getColumnModel().getColumn(1).setPreferredWidth(35);
            jtbStudents.getColumnModel().getColumn(2).setPreferredWidth(35);
            jtbStudents.getColumnModel().getColumn(3).setPreferredWidth(35);
            jtbStudents.getColumnModel().getColumn(4).setPreferredWidth(35);
        }

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        javax.swing.GroupLayout jpnStudentsLayout = new javax.swing.GroupLayout(jpnStudents);
        jpnStudents.setLayout(jpnStudentsLayout);
        jpnStudentsLayout.setHorizontalGroup(
            jpnStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnStudentsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnStudentsLayout.setVerticalGroup(
            jpnStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(jpnStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnStudentsLayout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jspStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jpnStudentsEdit.setBackground(new java.awt.Color(234, 234, 234));

        jlbStudentID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbStudentID.setText("Student ID:");

        jtfStudentID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbFirstName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbFirstName.setText("Student name:");

        jtfFirstName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbAddress.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbAddress.setText("Address:");

        jtfAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbPhone.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbPhone.setText("Phone:");

        jtfPhone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbDayofbirth.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbDayofbirth.setText("Day of birth:");

        jtfDayofbirth.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnAddStudents.setBackground(new java.awt.Color(51, 204, 0));
        jbtnAddStudents.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAddStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        jbtnAddStudents.setText("ADD");
        jbtnAddStudents.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAddStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddStudentsActionPerformed(evt);
            }
        });

        jbtnEditStudents.setBackground(new java.awt.Color(255, 204, 102));
        jbtnEditStudents.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEditStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/edit.png"))); // NOI18N
        jbtnEditStudents.setText("EDIT");
        jbtnEditStudents.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEditStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditStudentsActionPerformed(evt);
            }
        });

        jbtnDeleteStudents.setBackground(new java.awt.Color(255, 51, 51));
        jbtnDeleteStudents.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnDeleteStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        jbtnDeleteStudents.setText("DELETE");
        jbtnDeleteStudents.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDeleteStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteStudentsActionPerformed(evt);
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

        jlbUserName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbUserName.setText("UserName:");

        jtfUserName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbPassword.setText("Password:");

        jtfPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpnStudentsEditLayout = new javax.swing.GroupLayout(jpnStudentsEdit);
        jpnStudentsEdit.setLayout(jpnStudentsEditLayout);
        jpnStudentsEditLayout.setHorizontalGroup(
            jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                        .addComponent(jlbStudentID)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnStudentsEditLayout.createSequentialGroup()
                        .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbAddress)
                            .addComponent(jlbFirstName)
                            .addComponent(jlbUserName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jtfFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jtfUserName)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(49, 49, 49)
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbPassword)
                    .addComponent(jlbDayofbirth)
                    .addComponent(jlbPhone))
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDayofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnEditStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAddStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeleteStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jpnStudentsEditLayout.setVerticalGroup(
            jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbStudentID)
                            .addComponent(jtfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbFirstName)
                            .addComponent(jtfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnStudentsEditLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbAddress)
                            .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUserName)
                    .addComponent(jtfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                        .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbDayofbirth)
                                    .addComponent(jtfDayofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpnStudentsEditLayout.createSequentialGroup()
                                .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnAddStudents)
                                    .addComponent(jlbPhone)
                                    .addComponent(jtfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEditStudents)))
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDeleteStudents)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnStudentsEditLayout.createSequentialGroup()
                        .addGroup(jpnStudentsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbPassword)
                            .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnStudentsEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnStudentsEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtfStudentID.setText("");
        jtfFirstName.setText("");
        jtfAddress.setText("");
        jtfDayofbirth.setText("");
        jtfPhone.setText("");
        jtfUserName.setText("");
        jtfPassword.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnDeleteStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteStudentsActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbStudents.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Delete Students where StudentID=?");
            pstm.setString(1, jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 0).toString().trim());
            if (JOptionPane.showConfirmDialog(this, "Delete this student?", "Confirm",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                PreparedStatement pstm1 = conn.prepareStatement("Delete LearningReport where StudentID=?");
                pstm1.setString(1, jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 0).toString().trim());
                pstm1.executeUpdate();
                PreparedStatement pstm2 = conn.prepareStatement("Delete Feedback where StudentID=?");
                pstm2.setString(1, jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 0).toString().trim());
                pstm2.executeUpdate();
                pstm.executeUpdate();
                tbModel.setRowCount(0);
                fillTable();
                hidePassword();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnDeleteStudentsActionPerformed

    private void jbtnEditStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditStudentsActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbStudents.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            //Check phone
            String phoneCheck = "^[0-9]{10,11}$";
            Pattern pattern1 = Pattern.compile(phoneCheck);
            Matcher matcher1 = pattern1.matcher(jtfPhone.getText().trim());
            if (!matcher1.find()) {
                JOptionPane.showMessageDialog(null, "You must enter right form of number phone!");
                jtfPhone.requestFocus();
                return;
            }
            //Check date
            String datecheck = "^\\d{4}-(0?[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])$";
            Pattern pattern2 = Pattern.compile(datecheck);
            Matcher matcher2 = pattern2.matcher(jtfDayofbirth.getText().trim());
            if (!matcher2.find()) {
                JOptionPane.showMessageDialog(null, "You must enter right form of datetime! Example: '2000-2-28'");
                jtfDayofbirth.requestFocus();
                return;
            }
            //Check username
            PreparedStatement usernameCheckStmt = conn.prepareStatement("SELECT COUNT(*) FROM Students WHERE UserName = ? AND StudentID != ?");
            usernameCheckStmt.setString(1, jtfUserName.getText().trim());
            usernameCheckStmt.setString(2, jtfStudentID.getText().trim());
            ResultSet usernameCheckResult = usernameCheckStmt.executeQuery();
            usernameCheckResult.next();
            int count = usernameCheckResult.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Username already exists!");
                jtfUserName.requestFocus();
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("UPDATE Students SET StudentName=?, Address=?, Phone=?, Dayofbirth=?, UserName=?, Password=? WHERE StudentID = ?");
            pstm.setString(1, jtfFirstName.getText().trim());
            pstm.setString(2, jtfAddress.getText().trim());
            String phone = jtfPhone.getText();
            BigDecimal phoneValue = new BigDecimal(phone);
            pstm.setBigDecimal(3, phoneValue);
            pstm.setString(4, jtfDayofbirth.getText());
            pstm.setString(5, jtfUserName.getText().trim());
            pstm.setString(6, jtfPassword.getText().trim());
            pstm.setString(7, jtfStudentID.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
            hidePassword();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnEditStudentsActionPerformed

    private void jbtnAddStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddStudentsActionPerformed
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
            //Check studentID
            String stdIDCheck = "^S\\d+$";
            Pattern pattern = Pattern.compile(stdIDCheck);
            Matcher matcher = pattern.matcher(jtfStudentID.getText().trim());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(null, "StudentID must start with 'S' and number behind!");
                jtfStudentID.requestFocus();
                return;
            }
            //Check phone
            String phoneCheck = "^[0-9]{10,11}$";
            Pattern pattern1 = Pattern.compile(phoneCheck);
            Matcher matcher1 = pattern1.matcher(jtfPhone.getText().trim());
            if (!matcher1.find()) {
                JOptionPane.showMessageDialog(null, "You must enter right form of number phone!");
                jtfPhone.requestFocus();
                return;
            }
            //Check date
            String dateCheck = "^\\d{4}-(0?[1-9]|1[0-2])-(0?[1-9]|[12][0-9]|3[01])$";
            Pattern pattern2 = Pattern.compile(dateCheck);
            Matcher matcher2 = pattern2.matcher(jtfDayofbirth.getText().trim());
            if (!matcher2.find()) {
                JOptionPane.showMessageDialog(null, "You must enter right form of datetime! Example: '2000-2-28'");
                jtfDayofbirth.requestFocus();
                return;
            }
            //Check studentID is exist or not
            Statement st = conn.createStatement();
            String sql1 = "Select StudentID from Students";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("StudentID").equals(jtfStudentID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This StudentID is already exist!");
                    jtfStudentID.requestFocus();
                    return;
                }
            }
            //Check username is exist or not
            String sql2 = "Select UserName from Students";
            ResultSet rs = st.executeQuery(sql2);
            while (rs.next()) {
                if (rs.getString("UserName").equals(jtfUserName.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This username is already in use");
                    jtfUserName.requestFocus();
                    return;
                }
            }
            PreparedStatement pstm = conn.prepareStatement("insert into Students values (?, ?, ?, ?, ?, ?, ?)");
            pstm.setString(1, jtfStudentID.getText().trim());
            pstm.setString(2, jtfFirstName.getText().trim());
            pstm.setString(3, jtfAddress.getText().trim());
            String phone = jtfPhone.getText();
            BigDecimal phoneValue = new BigDecimal(phone);
            pstm.setBigDecimal(4, phoneValue);
            pstm.setString(5, jtfDayofbirth.getText());
            pstm.setString(6, jtfUserName.getText().trim());
            pstm.setString(7, jtfPassword.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
            hidePassword();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnAddStudentsActionPerformed

    private void jtfFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFindKeyReleased
        String Search = jtfFind.getText();
        search(Search);
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
            ResultSet rs = st.executeQuery("Select * from Students");
            ResultSetMetaData mtdt = rs.getMetaData();
            number = mtdt.getColumnCount();
            for (int i = 1; i <= number; i++) {
                column.add(mtdt.getColumnName(i));
            }
            tbModel.setColumnIdentifiers(column);
            while (rs.next()) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = rs.getDate("Dayofbirth");
                String formattedDate = dateFormat.format(date);
                row = new Vector();
                row.addElement(rs.getString("StudentID"));
                row.addElement(rs.getString("StudentName"));
                row.addElement(rs.getString("Address"));
                row.addElement("0"+rs.getString("Phone"));
                row.addElement(formattedDate);
                row.addElement(rs.getString("UserName"));
                row.addElement(rs.getString("Password"));
                tbModel.addRow(row);
                jtbStudents.setModel(tbModel);
            }
            jtbStudents.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jtbStudents.getSelectedRow() >= 0) {
                        jtfStudentID.setText(jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 0) + "");
                        jtfFirstName.setText(jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 1) + "");
                        jtfAddress.setText(jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 2) + "");
                        jtfPhone.setText(jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 3) + "");
                        jtfDayofbirth.setText(jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 4) + "");
                        jtfUserName.setText(jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 5) + "");
                        jtfPassword.setText(jtbStudents.getValueAt(jtbStudents.getSelectedRow(), 6) + "");

                    }
                }
            });
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public boolean checkValidateForm() {
        if (jtfStudentID.getText().isEmpty() || jtfFirstName.getText().isEmpty()
                || jtfAddress.getText().isEmpty() || jtfDayofbirth.getText().isEmpty() || jtfPhone.getText().isEmpty() || jtfUserName.getText().isEmpty() || jtfPassword.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbStudents.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbStudents.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    public void hidePassword() {
        DefaultTableCellRenderer passwordRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (value != null && column == 6) {
                    String password = value.toString();
                    int passwordLength = password.length();
                    StringBuilder maskedPassword = new StringBuilder();
                    for (int i = 0; i < passwordLength; i++) {
                        maskedPassword.append("*");
                    }
                    setText(maskedPassword.toString());
                }
                return component;
            }
        };

        // Đặt renderer tùy chỉnh cho cột "password"
        jtbStudents.getColumnModel().getColumn(6).setCellRenderer(passwordRenderer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnAddStudents;
    private javax.swing.JButton jbtnDeleteStudents;
    private javax.swing.JButton jbtnEditStudents;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlbAddress;
    private javax.swing.JLabel jlbDayofbirth;
    private javax.swing.JLabel jlbFirstName;
    private javax.swing.JLabel jlbPassword;
    private javax.swing.JLabel jlbPhone;
    private javax.swing.JLabel jlbStudentID;
    private javax.swing.JLabel jlbUserName;
    private javax.swing.JPanel jpnStudents;
    private javax.swing.JPanel jpnStudentsEdit;
    private javax.swing.JScrollPane jspStudents;
    private javax.swing.JTable jtbStudents;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfDayofbirth;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfFirstName;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfStudentID;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables

}
