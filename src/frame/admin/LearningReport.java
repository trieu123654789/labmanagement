package frame.admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
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

public class LearningReport extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    public LearningReport() {
        initComponents();
        jtbLearningreport.getTableHeader().setForeground(Color.RED);
        jtbLearningreport.getTableHeader().setForeground(Color.RED);
        fillTable();

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnLearningreport = new javax.swing.JPanel();
        jspLearningreport = new javax.swing.JScrollPane();
        jtbLearningreport = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfFind = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jlbStudentID = new javax.swing.JLabel();
        jtfStudentID = new javax.swing.JTextField();
        jlbBatchCode = new javax.swing.JLabel();
        jtfBatchCode = new javax.swing.JTextField();
        jlb1stTest = new javax.swing.JLabel();
        jtf1tsTest = new javax.swing.JTextField();
        jlb2ndTest = new javax.swing.JLabel();
        jtf2ndTest = new javax.swing.JTextField();
        jlbLastTest = new javax.swing.JLabel();
        jtfLastTest = new javax.swing.JTextField();
        jbtnAddReport = new javax.swing.JButton();
        jbtnEditReport = new javax.swing.JButton();
        jbtnDeleteReport = new javax.swing.JButton();
        jbtnResetReport = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jtbLearningreport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Report ID", "Student ID", "Student name", "Batch code", "Tech name", "First test marks", "Second test marks", "Last test marks", "Average marks"
            }
        ));
        jspLearningreport.setViewportView(jtbLearningreport);
        if (jtbLearningreport.getColumnModel().getColumnCount() > 0) {
            jtbLearningreport.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbLearningreport.getColumnModel().getColumn(1).setPreferredWidth(35);
            jtbLearningreport.getColumnModel().getColumn(2).setPreferredWidth(35);
            jtbLearningreport.getColumnModel().getColumn(3).setPreferredWidth(35);
            jtbLearningreport.getColumnModel().getColumn(4).setPreferredWidth(35);
            jtbLearningreport.getColumnModel().getColumn(5).setPreferredWidth(35);
            jtbLearningreport.getColumnModel().getColumn(6).setPreferredWidth(35);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnLearningreportLayout = new javax.swing.GroupLayout(jpnLearningreport);
        jpnLearningreport.setLayout(jpnLearningreportLayout);
        jpnLearningreportLayout.setHorizontalGroup(
            jpnLearningreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLearningreportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnLearningreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnLearningreportLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspLearningreport, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnLearningreportLayout.setVerticalGroup(
            jpnLearningreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLearningreportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnLearningreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(jpnLearningreportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnLearningreportLayout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jspLearningreport, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(234, 234, 234));

        jlbStudentID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbStudentID.setText("Student ID:");

        jtfStudentID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbBatchCode.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbBatchCode.setText("Batch code:");

        jtfBatchCode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlb1stTest.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlb1stTest.setText("First test marks:");

        jtf1tsTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlb2ndTest.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlb2ndTest.setText("Second test marks:");

        jtf2ndTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbLastTest.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbLastTest.setText("Last test marks:");

        jtfLastTest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnAddReport.setBackground(new java.awt.Color(51, 204, 0));
        jbtnAddReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnAddReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/add.png"))); // NOI18N
        jbtnAddReport.setText("SEND");
        jbtnAddReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnAddReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddReportActionPerformed(evt);
            }
        });

        jbtnEditReport.setBackground(new java.awt.Color(255, 204, 102));
        jbtnEditReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEditReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/edit.png"))); // NOI18N
        jbtnEditReport.setText("EDIT");
        jbtnEditReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEditReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditReportActionPerformed(evt);
            }
        });

        jbtnDeleteReport.setBackground(new java.awt.Color(255, 51, 51));
        jbtnDeleteReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnDeleteReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        jbtnDeleteReport.setText("DELETE");
        jbtnDeleteReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDeleteReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteReportActionPerformed(evt);
            }
        });

        jbtnResetReport.setBackground(new java.awt.Color(153, 153, 153));
        jbtnResetReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnResetReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/reset.png"))); // NOI18N
        jbtnResetReport.setText("RESET");
        jbtnResetReport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnResetReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlb1stTest, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf1tsTest, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbStudentID)
                            .addComponent(jlbBatchCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlb2ndTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf2ndTest, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbLastTest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfLastTest, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnDeleteReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnEditReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnResetReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnAddReport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbStudentID)
                            .addComponent(jtfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb2ndTest)
                            .addComponent(jtf2ndTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbBatchCode)
                            .addComponent(jtfBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbLastTest)
                            .addComponent(jtfLastTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlb1stTest)
                            .addComponent(jtf1tsTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnAddReport)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditReport)
                        .addGap(16, 16, 16)
                        .addComponent(jbtnDeleteReport)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnResetReport, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnLearningreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnLearningreport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddReportActionPerformed
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
            //Check studentID
            String studentIDCheck = "^S\\d+$";
            Pattern pattern1 = Pattern.compile(studentIDCheck);
            Matcher matcher1 = pattern1.matcher(jtfStudentID.getText().trim());
            if (!matcher1.find()) {
                JOptionPane.showMessageDialog(this, "StudentID must start with 'S' and number behind!");
                jtfStudentID.requestFocus();
                return;
            }
            //Check batchcode
            String batchCodeCheck = "^B\\d+$";
            Pattern pattern2 = Pattern.compile(batchCodeCheck);
            Matcher matcher2 = pattern2.matcher(jtfBatchCode.getText().trim());
            if (!matcher2.find()) {
                JOptionPane.showMessageDialog(this, "Batch code must start with 'B' and number behind!");
                jtfBatchCode.requestFocus();
                return;
            }
            //Check firstmarks
            String FirstMarkscheck = "^^(10|[0-9])$";
            Pattern pattern4 = Pattern.compile(FirstMarkscheck);
            Matcher matcher4 = pattern4.matcher(jtf1tsTest.getText().trim());
            if (!matcher4.matches()) {
                JOptionPane.showMessageDialog(this, "First mark must a number and from 0-10");
                jtf1tsTest.requestFocus();
                return;
            }
            //Check 2ndmarks
            String SecondMarkscheck = "^^(10|[0-9])$";
            Pattern pattern5 = Pattern.compile(SecondMarkscheck);
            Matcher matcher5 = pattern5.matcher(jtf2ndTest.getText().trim());
            if (!matcher5.matches()) {
                JOptionPane.showMessageDialog(this, "Second mark must a number and from 0-10");
                jtf2ndTest.requestFocus();
                return;
            }
            //Check lastmarks
            String LastMarkscheck = "^^(10|[0-9])$";
            Pattern pattern6 = Pattern.compile(LastMarkscheck);
            Matcher matcher6 = pattern6.matcher(jtfLastTest.getText().trim());
            if (!matcher6.matches()) {
                JOptionPane.showMessageDialog(this, "Last mark must a number and from 0-10");
                jtfLastTest.requestFocus();
                return;
            }
            //Check studentID is exist or not
            String sql2 = "Select * from Students where Studentid='" + jtfStudentID.getText().trim() + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            if (!rs2.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Studentid!");
                jtfStudentID.requestFocus();
                return;
            }
            //Check batchcode is exist or not
            String sql3 = "Select * from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs3 = st.executeQuery(sql3);
            if (!rs3.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Batch!");
                jtfBatchCode.requestFocus();
                return;
            }
            //Caculate average marks
            float firstTest = Float.parseFloat(jtf1tsTest.getText().trim());
            float secondTest = Float.parseFloat(jtf2ndTest.getText().trim());
            float lastTest = Float.parseFloat(jtfLastTest.getText().trim());
            float avarage = (firstTest + secondTest + lastTest) / 3;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setMaximumFractionDigits(2);
            String formattedAverage = decimalFormat.format(avarage);
            PreparedStatement stmt = conn.prepareStatement("SELECT MAX(ReportID) AS MaxReportID FROM LearningReport");
            ResultSet rs = stmt.executeQuery();
            int maxReportID = 1;
            if (rs.next()) {
                maxReportID = rs.getInt("MaxReportID");
            }
            int ReportIDCounter = maxReportID + 1;
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO LearningReport (ReportID, StudentID, StudentName, BatchCode, Techname, FirstTestMarks, SecondTestMarks, LastTestMarks, AverageMarks) SELECT ?, ?, StudentName, ?, Techname, ?, ?, ?, ? FROM Students, Batch WHERE Students.StudentID = ? AND Batch.BatchCode = ?");

            pstm.setInt(1, ReportIDCounter);
            pstm.setString(2, jtfStudentID.getText().trim());
            pstm.setString(3, jtfBatchCode.getText().trim());
            pstm.setString(4, jtf1tsTest.getText().trim());
            pstm.setString(5, jtf2ndTest.getText().trim());
            pstm.setString(6, jtfLastTest.getText().trim());
            pstm.setString(7, String.valueOf(formattedAverage));
            pstm.setString(8, jtfStudentID.getText().trim());
            pstm.setString(9, jtfBatchCode.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnAddReportActionPerformed

    private void jbtnEditReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditReportActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbLearningreport.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            Statement st = conn.createStatement();
            //Check studentID
            String studentIDCheck = "^S\\d+$";
            Pattern pattern1 = Pattern.compile(studentIDCheck);
            Matcher matcher1 = pattern1.matcher(jtfStudentID.getText().trim());
            if (!matcher1.find()) {
                JOptionPane.showMessageDialog(this, "StudentID must start with 'S' and number behind!");
                jtfStudentID.requestFocus();
                return;
            }
            //Check batchcode
            String batchCodeCheck = "^B\\d+$";
            Pattern pattern2 = Pattern.compile(batchCodeCheck);
            Matcher matcher2 = pattern2.matcher(jtfBatchCode.getText().trim());
            if (!matcher2.find()) {
                JOptionPane.showMessageDialog(this, "Batch code must start with 'B' and number behind!");
                jtfBatchCode.requestFocus();
                return;
            }
            //Check firstmarks
            String FirstMarkscheck = "^^(10|[0-9])$";
            Pattern pattern4 = Pattern.compile(FirstMarkscheck);
            Matcher matcher4 = pattern4.matcher(jtf1tsTest.getText().trim());
            if (!matcher4.matches()) {
                JOptionPane.showMessageDialog(this, "First mark must a number and from 0-10");
                jtf1tsTest.requestFocus();
                return;
            }
            //Check 2ndmarks
            String SecondMarkscheck = "^^(10|[0-9])$";
            Pattern pattern5 = Pattern.compile(SecondMarkscheck);
            Matcher matcher5 = pattern5.matcher(jtf2ndTest.getText().trim());
            if (!matcher5.matches()) {
                JOptionPane.showMessageDialog(this, "Second mark must a number and from 0-10");
                jtf2ndTest.requestFocus();
                return;
            }
            //Check lastmarks
            String LastMarkscheck = "^^(10|[0-9])$";
            Pattern pattern6 = Pattern.compile(LastMarkscheck);
            Matcher matcher6 = pattern6.matcher(jtfLastTest.getText().trim());
            if (!matcher6.matches()) {
                JOptionPane.showMessageDialog(this, "Last mark must a number and from 0-10");
                jtfLastTest.requestFocus();
                return;
            }
            //Check studentID is exist or not
            String sql2 = "Select * from Students where Studentid='" + jtfStudentID.getText().trim() + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            if (!rs2.next()) {

                JOptionPane.showMessageDialog(this, "Cannot find any Studentid!");
                jtfStudentID.requestFocus();
                return;

            }
            //Check batchcode is exist or not
            String sql3 = "Select * from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs3 = st.executeQuery(sql3);
            if (!rs3.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Batch!");
                jtfBatchCode.requestFocus();
                return;
            }
            float firstTest = Float.parseFloat(jtf1tsTest.getText().trim());
            float secondTest = Float.parseFloat(jtf2ndTest.getText().trim());
            float lastTest = Float.parseFloat(jtfLastTest.getText().trim());
            float avarage = (firstTest + secondTest + lastTest) / 3;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setMaximumFractionDigits(2);
            String formattedAverage = decimalFormat.format(avarage);
            PreparedStatement pstm = conn.prepareStatement("UPDATE LearningReport SET StudentID = ?, StudentName = (SELECT StudentName FROM Students WHERE StudentID = ?), BatchCode = ?, TechName = (SELECT Techname FROM Batch WHERE BatchCode = ?), FirstTestMarks = ?, SecondTestMarks = ?, LastTestMarks = ?, AverageMarks = ? WHERE Reportid = ?");
            pstm.setString(1, jtfStudentID.getText().trim());
            pstm.setString(2, jtfStudentID.getText().trim());
            pstm.setString(3, jtfBatchCode.getText().trim());
            pstm.setString(4, jtfBatchCode.getText().trim());
            pstm.setString(5, jtf1tsTest.getText().trim());
            pstm.setString(6, jtf2ndTest.getText().trim());
            pstm.setString(7, jtfLastTest.getText().trim());
            pstm.setString(8, String.valueOf(formattedAverage));
            pstm.setString(9, jtbLearningreport.getValueAt(jtbLearningreport.getSelectedRow(), 0).toString().trim());

            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnEditReportActionPerformed

    private void jbtnDeleteReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteReportActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbLearningreport.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Delete Learningreport where Reportid=?");
            pstm.setString(1, jtbLearningreport.getValueAt(jtbLearningreport.getSelectedRow(), 0).toString().trim());
            if (JOptionPane.showConfirmDialog(this, "Delete this Learning report?", "Confirm",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                pstm.executeUpdate();
                tbModel.setRowCount(0);
                fillTable();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnDeleteReportActionPerformed

    private void jbtnResetReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetReportActionPerformed
        jtfStudentID.setText("");
        jtfBatchCode.setText("");
        jtf1tsTest.setText("");
        jtf2ndTest.setText("");
        jtfLastTest.setText("");
    }//GEN-LAST:event_jbtnResetReportActionPerformed

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
            ResultSet rs = st.executeQuery("Select * from Learningreport");
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
                jtbLearningreport.setModel(tbModel);
            }
            jtbLearningreport.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jtbLearningreport.getSelectedRow() >= 0) {
                        jtfStudentID.setText(jtbLearningreport.getValueAt(jtbLearningreport.getSelectedRow(), 1) + "");
                        jtfBatchCode.setText(jtbLearningreport.getValueAt(jtbLearningreport.getSelectedRow(), 3) + "");
                        jtf1tsTest.setText(jtbLearningreport.getValueAt(jtbLearningreport.getSelectedRow(), 5) + "");
                        jtf2ndTest.setText(jtbLearningreport.getValueAt(jtbLearningreport.getSelectedRow(), 6) + "");
                        jtfLastTest.setText(jtbLearningreport.getValueAt(jtbLearningreport.getSelectedRow(), 7) + "");
                    }
                }
            });
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public boolean checkValidateForm() {
        if (jtfBatchCode.getText().isEmpty()
                || jtfStudentID.getText().isEmpty() || jtf1tsTest.getText().isEmpty() || jtf2ndTest.getText().isEmpty() || jtfLastTest.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbLearningreport.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbLearningreport.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAddReport;
    private javax.swing.JButton jbtnDeleteReport;
    private javax.swing.JButton jbtnEditReport;
    private javax.swing.JButton jbtnResetReport;
    private javax.swing.JLabel jlb1stTest;
    private javax.swing.JLabel jlb2ndTest;
    private javax.swing.JLabel jlbBatchCode;
    private javax.swing.JLabel jlbLastTest;
    private javax.swing.JLabel jlbStudentID;
    private javax.swing.JPanel jpnLearningreport;
    private javax.swing.JScrollPane jspLearningreport;
    private javax.swing.JTable jtbLearningreport;
    private javax.swing.JTextField jtf1tsTest;
    private javax.swing.JTextField jtf2ndTest;
    private javax.swing.JTextField jtfBatchCode;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfLastTest;
    private javax.swing.JTextField jtfStudentID;
    // End of variables declaration//GEN-END:variables

}
