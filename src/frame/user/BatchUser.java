package frame.user;

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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import connection.MainConnection;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import other.GetUsername;

public class BatchUser extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();
    DefaultTableModel tbModel1 = new DefaultTableModel();

    public BatchUser() {

        initComponents();
        fillTable();
        fillTable1();
        jtbBatchAvai.getTableHeader().setForeground(Color.RED);
        jtbYourBatch.getTableHeader().setForeground(Color.RED);
        showFullText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBatch = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnBatchAvai = new javax.swing.JPanel();
        jspBatch1 = new javax.swing.JScrollPane();
        jtbBatchAvai = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfFind = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfBatchCode = new javax.swing.JTextField();
        jtbnRegister = new javax.swing.JButton();
        jpnYourBatch = new javax.swing.JPanel();
        jspBatch = new javax.swing.JScrollPane();
        jtbYourBatch = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtfFind1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        jpnBatchAvai.setBackground(new java.awt.Color(255, 255, 255));

        jtbBatchAvai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Batch Code", "Duration", "Batch type", "Day Study", "Slot time", "No of Students", "Tech ID", "Tech  Name"
            }
        ));
        jspBatch1.setViewportView(jtbBatchAvai);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        jLabel2.setText("Enter Batch code that you want to register:");

        jtbnRegister.setBackground(new java.awt.Color(153, 255, 153));
        jtbnRegister.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jtbnRegister.setText("REGISTER");
        jtbnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBatchAvaiLayout = new javax.swing.GroupLayout(jpnBatchAvai);
        jpnBatchAvai.setLayout(jpnBatchAvaiLayout);
        jpnBatchAvaiLayout.setHorizontalGroup(
            jpnBatchAvaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchAvaiLayout.createSequentialGroup()
                .addComponent(jspBatch1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpnBatchAvaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBatchAvaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnBatchAvaiLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnBatchAvaiLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtbnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBatchAvaiLayout.setVerticalGroup(
            jpnBatchAvaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBatchAvaiLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jpnBatchAvaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspBatch1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jpnBatchAvaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtbnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("Batch available", jpnBatchAvai);

        jtbYourBatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "StudentID", "Batch Code", "Duration", "Batch type", "Tech name", "Lab id"
            }
        ));
        jspBatch.setViewportView(jtbYourBatch);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Enter information to search:");

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

        javax.swing.GroupLayout jpnYourBatchLayout = new javax.swing.GroupLayout(jpnYourBatch);
        jpnYourBatch.setLayout(jpnYourBatchLayout);
        jpnYourBatchLayout.setHorizontalGroup(
            jpnYourBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jspBatch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
            .addGroup(jpnYourBatchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFind1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnYourBatchLayout.setVerticalGroup(
            jpnYourBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnYourBatchLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(jpnYourBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfFind1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Your batch", jpnYourBatch);

        javax.swing.GroupLayout jpnBatchLayout = new javax.swing.GroupLayout(jpnBatch);
        jpnBatch.setLayout(jpnBatchLayout);
        jpnBatchLayout.setHorizontalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBatchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jpnBatchLayout.setVerticalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFindKeyReleased
        String search = jtfFind.getText();
        search(search);
    }//GEN-LAST:event_jtfFindKeyReleased

    private void jtfFind1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFind1KeyReleased
        String search = jtfFind1.getText();
        search1(search);
    }//GEN-LAST:event_jtfFind1KeyReleased
    public static String dayStudy1 = "";
    public static String slotTime1 = "";
    private void jtbnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnRegisterActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
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
            //Check batchcode is exist or not
            Statement st = conn.createStatement();
            String sql3 = "Select * from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs3 = st.executeQuery(sql3);
            if (!rs3.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Batch!");
                jtfBatchCode.requestFocus();
                return;
            }
            //Check this batch is registered or not
            GetUsername getusn = new GetUsername();
            String username = getusn.getUsername();
            String sql5 = "SELECT Students.StudentID, Batch.BatchCode, Batch.Duration, Batch.BatchType, Batch.TechID, Batch.TechName FROM Students JOIN Learningreport ON Students.StudentID = Learningreport.Studentid JOIN Batch ON LearningReport.BatchCode = Batch.BatchCode where Students.UserName='" + username + "'";
            ResultSet rs5 = st.executeQuery(sql5);
            while (rs5.next()) {
                if (rs5.getString("BatchCode").equals(jtfBatchCode.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This batch is already in your batch!");
                    jtfBatchCode.requestFocus();
                    return;
                }
            }
            //Check student in this batch is full or not
            String sql4 = "Select NoOfStudents from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs4 = st.executeQuery(sql4);
            while (rs4.next()) {
                int numberofstudents = rs4.getInt("NoOfStudents");
                if (numberofstudents == 20) {
                    JOptionPane.showMessageDialog(this, "Students in this batch is full!");

                    return;
                }
            }
            //To check if the batch overlaps with the student's schedule.
            String sql6 = "select Batch.BatchCode, s.DayStudy, s.Slottime from Batch join Schedule s on Batch.BatchCode = s.BatchCode where Batch.BatchCode=?";
            PreparedStatement statement1 = conn.prepareStatement(sql6);
            statement1.setString(1, jtfBatchCode.getText().trim());
            ResultSet resultSet1 = statement1.executeQuery();
            while (resultSet1.next()) {
                dayStudy1 = resultSet1.getString("DayStudy");
                slotTime1 = resultSet1.getString("SlotTime");
            }
            String[] days = dayStudy1.split("-");
            if (days.length == 2) {
                String[] days1 = days[1].trim().split(":");
                String[] days2 = days1[1].trim().split(";");
                String sql = "SELECT COUNT(*) AS count FROM Schedule s JOIN Batch b ON s.BatchCode = b.BatchCode JOIN LearningReport r ON b.BatchCode = r.BatchCode WHERE r.StudentID =(select StudentID from Students where UserName='" + username + "') AND ( DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND s.Slottime='" + slotTime1 + "'";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, "%" + days[0] + "%");
                statement.setString(2, "%" + days1[0] + "%");
                statement.setString(3, "%" + days2[1].trim() + "%");
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int count = resultSet.getInt("count");
                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "You have another batch in this day and time!");
                        return;
                    }
                }
            } else if (days.length == 3) {
                String[] days1 = days[1].trim().split(":");
                String[] days2 = days1[1].trim().split(";");
                String[] days3 = days[2].trim().split(":");
                String sql = "SELECT s.* FROM Schedule s JOIN Batch b ON s.BatchCode = b.BatchCode JOIN LearningReport r ON b.BatchCode = r.BatchCode WHERE r.StudentID =(select StudentID from Students where UserName='" + username + "') AND ( DayStudy LIKE ? or  DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND s.Slottime='" + slotTime1 + "'";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, "%" + days[0] + "%");
                statement.setString(2, "%" + days1[0] + "%");
                statement.setString(3, "%" + days2[1].trim() + "%");
                statement.setString(4, "%" + days3[0].trim() + "%");
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "You have another batch in this day and time!");
                    return;
                }
            } else {
                String[] days1 = days[4].trim().split(":");
                String sql = "SELECT s.* FROM Schedule s JOIN Batch b ON s.BatchCode = b.BatchCode JOIN LearningReport r ON b.BatchCode = r.BatchCode WHERE r.StudentID =(select StudentID from Students where UserName='" + username + "') AND ( DayStudy LIKE ? or  DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND s.Slottime='" + slotTime1 + "'";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, "%" + days[0] + "%");
                statement.setString(2, "%" + days1[0] + "%");
                statement.setString(3, "%" + days[3].trim() + "%");
                statement.setString(4, "%" + days1[0].trim() + "%");
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "You have another batch in this day and time!");
                    return;
                }
            }
            PreparedStatement stmt = conn.prepareStatement("SELECT MAX(ReportID) AS MaxReportID FROM LearningReport");
            ResultSet rs = stmt.executeQuery();
            int maxReportID = 1;
            if (rs.next()) {
                maxReportID = rs.getInt("MaxReportID");
            }
            int ReportIDCounter = maxReportID + 1;
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO LearningReport (ReportID, StudentID, StudentName, BatchCode, Techname) SELECT ?, StudentID, StudentName, ?, Techname FROM Students, Batch WHERE Students.Username = ? AND Batch.BatchCode = ?");
            pstm.setInt(1, ReportIDCounter);
            pstm.setString(2, jtfBatchCode.getText().trim());
            pstm.setString(3, username);
            pstm.setString(4, jtfBatchCode.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable1();
            //Increase number of students
            PreparedStatement stmt2 = conn.prepareStatement("SELECT NoOfStudents FROM Batch WHERE BatchCode=?");
            stmt2.setString(1, jtfBatchCode.getText().trim());
            ResultSet rs6 = stmt2.executeQuery();
            while (rs6.next()) {
                int newNoOfStd = rs6.getInt("NoOfStudents") + 1;
                PreparedStatement stmt1 = conn.prepareStatement("UPDATE Batch SET NoOfStudents=? WHERE BatchCode=?");
                stmt1.setInt(1, newNoOfStd);
                stmt1.setString(2, jtfBatchCode.getText().trim());
                stmt1.executeUpdate();
            }
            tbModel1.setRowCount(0);
            fillTable();
            JOptionPane.showMessageDialog(this, "Register batch successfully!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jtbnRegisterActionPerformed

    private void jtfFind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFind1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFind1ActionPerformed
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
            ResultSet rs = st.executeQuery("select Batch.BatchCode, Batch.Duration, Batch.BatchType, s.DayStudy, s.Slottime, Batch.NoOfStudents, Batch.Techid, Batch.Techname from Batch join Schedule s on Batch.BatchCode = s.BatchCode");
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
                jtbBatchAvai.setModel(tbModel1);
            }
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
            GetUsername getusn = new GetUsername();
            String username = getusn.getUsername();
            ResultSet rs = st.executeQuery("SELECT Students.StudentID, Batch.BatchCode, Batch.Duration, Batch.BatchType, Batch.TechID, Batch.TechName FROM Students JOIN Learningreport ON Students.StudentID = Learningreport.Studentid JOIN Batch ON LearningReport.BatchCode = Batch.BatchCode where Students.UserName='" + username + "'");

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
                jtbYourBatch.setModel(tbModel);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void showFullText() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus,
                    int row, int column) {
                java.awt.Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                        row, column);
                if (table.getGraphics().getFontMetrics().stringWidth(value.toString()) > table.getColumnModel().getColumn(column).getWidth()) {
                    table.setToolTipText(value.toString());
                } else {
                    table.setToolTipText(null);
                }
                return component;
            }
        };
        jtbBatchAvai.getColumnModel().getColumn(3).setCellRenderer(renderer);
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbBatchAvai.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbBatchAvai.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    public void search1(String str) {
        tbModel = (DefaultTableModel) jtbYourBatch.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbYourBatch.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnBatch;
    private javax.swing.JPanel jpnBatchAvai;
    private javax.swing.JPanel jpnYourBatch;
    private javax.swing.JScrollPane jspBatch;
    private javax.swing.JScrollPane jspBatch1;
    private javax.swing.JTable jtbBatchAvai;
    private javax.swing.JTable jtbYourBatch;
    private javax.swing.JButton jtbnRegister;
    private javax.swing.JTextField jtfBatchCode;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfFind1;
    // End of variables declaration//GEN-END:variables

}
