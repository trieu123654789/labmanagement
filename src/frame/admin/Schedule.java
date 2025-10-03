package frame.admin;

import combobox.ComboboxSlottime;
import combobox.ComboboxDayStudy;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import connection.MainConnection;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableRowSorter;

public class Schedule extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    public Schedule() {
        initComponents();
        jtbSchedule.getTableHeader().setForeground(Color.RED);
        fillTable();
        showComboboxDaystudy();
        showComboboxSlottime();
        showFullText();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnSchedule = new javax.swing.JPanel();
        jspSchedule = new javax.swing.JScrollPane();
        jtbSchedule = new javax.swing.JTable();
        jpnScheduleEdit = new javax.swing.JPanel();
        jlbScheduleID = new javax.swing.JLabel();
        jtfScheduleID = new javax.swing.JTextField();
        jlbLabID = new javax.swing.JLabel();
        jtfLabID = new javax.swing.JTextField();
        jlbDayStudy = new javax.swing.JLabel();
        jtfBatchCode = new javax.swing.JTextField();
        jlbBatchCode = new javax.swing.JLabel();
        jlbSlottimeID = new javax.swing.JLabel();
        jlbScheduleVer = new javax.swing.JLabel();
        jtfScheduleVer = new javax.swing.JTextField();
        jbtnEditSchedule = new javax.swing.JButton();
        jbtnDeleteSchedule = new javax.swing.JButton();
        jbtnResetSchedule = new javax.swing.JButton();
        jbtnSendSchedule = new javax.swing.JButton();
        jComboBoxDayStudy = new javax.swing.JComboBox<>();
        jComboBoxSlottime = new javax.swing.JComboBox<>();
        jtfFind = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jtbSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Schedule ID", "Schedule version", "Batch code", "Batch type", "Techname", "Day study", "Slot time", "Lab ID"
            }
        ));
        jspSchedule.setViewportView(jtbSchedule);
        if (jtbSchedule.getColumnModel().getColumnCount() > 0) {
            jtbSchedule.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbSchedule.getColumnModel().getColumn(1).setPreferredWidth(10);
            jtbSchedule.getColumnModel().getColumn(2).setPreferredWidth(10);
            jtbSchedule.getColumnModel().getColumn(3).setPreferredWidth(10);
            jtbSchedule.getColumnModel().getColumn(4).setPreferredWidth(10);
            jtbSchedule.getColumnModel().getColumn(5).setPreferredWidth(70);
            jtbSchedule.getColumnModel().getColumn(6).setPreferredWidth(10);
            jtbSchedule.getColumnModel().getColumn(7).setPreferredWidth(10);
        }

        jpnScheduleEdit.setBackground(new java.awt.Color(234, 234, 234));

        jlbScheduleID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbScheduleID.setText("Schedule ID:");

        jtfScheduleID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbLabID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbLabID.setText("Lab ID:");

        jtfLabID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbDayStudy.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbDayStudy.setText("Day study:");

        jtfBatchCode.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfBatchCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfBatchCodeKeyReleased(evt);
            }
        });

        jlbBatchCode.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbBatchCode.setText("Batch code:");

        jlbSlottimeID.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbSlottimeID.setText("Slot time:");

        jlbScheduleVer.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jlbScheduleVer.setText("Schedule Version:");

        jtfScheduleVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnEditSchedule.setBackground(new java.awt.Color(255, 204, 102));
        jbtnEditSchedule.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnEditSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/edit.png"))); // NOI18N
        jbtnEditSchedule.setText("EDIT");
        jbtnEditSchedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnEditSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditScheduleActionPerformed(evt);
            }
        });

        jbtnDeleteSchedule.setBackground(new java.awt.Color(255, 51, 51));
        jbtnDeleteSchedule.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnDeleteSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/delete.png"))); // NOI18N
        jbtnDeleteSchedule.setText("DELETE");
        jbtnDeleteSchedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnDeleteSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteScheduleActionPerformed(evt);
            }
        });

        jbtnResetSchedule.setBackground(new java.awt.Color(153, 153, 153));
        jbtnResetSchedule.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnResetSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/reset.png"))); // NOI18N
        jbtnResetSchedule.setText("RESET");
        jbtnResetSchedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnResetSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetScheduleActionPerformed(evt);
            }
        });

        jbtnSendSchedule.setBackground(new java.awt.Color(51, 204, 0));
        jbtnSendSchedule.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbtnSendSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/send.png"))); // NOI18N
        jbtnSendSchedule.setText("SEND");
        jbtnSendSchedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSendSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSendScheduleActionPerformed(evt);
            }
        });

        jComboBoxDayStudy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxSlottime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jpnScheduleEditLayout = new javax.swing.GroupLayout(jpnScheduleEdit);
        jpnScheduleEdit.setLayout(jpnScheduleEditLayout);
        jpnScheduleEditLayout.setHorizontalGroup(
            jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleEditLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnScheduleEditLayout.createSequentialGroup()
                        .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbScheduleVer)
                            .addComponent(jlbScheduleID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfScheduleID, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jtfScheduleVer))
                        .addGap(54, 54, 54)
                        .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlbSlottimeID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbBatchCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbLabID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfLabID, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jtfBatchCode, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(jComboBoxSlottime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(jpnScheduleEditLayout.createSequentialGroup()
                        .addComponent(jlbDayStudy)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDayStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnDeleteSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnResetSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSendSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEditSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jpnScheduleEditLayout.setVerticalGroup(
            jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleEditLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnScheduleEditLayout.createSequentialGroup()
                        .addComponent(jbtnSendSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnEditSchedule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnDeleteSchedule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnResetSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 105, Short.MAX_VALUE))
                    .addGroup(jpnScheduleEditLayout.createSequentialGroup()
                        .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlbScheduleID)
                                .addComponent(jtfScheduleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfLabID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbLabID))
                            .addGroup(jpnScheduleEditLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlbScheduleVer)
                                    .addComponent(jtfScheduleVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbBatchCode)
                                    .addComponent(jtfBatchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbSlottimeID)
                            .addComponent(jComboBoxSlottime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jpnScheduleEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxDayStudy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbDayStudy))
                        .addGap(75, 75, 75))))
        );

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        javax.swing.GroupLayout jpnScheduleLayout = new javax.swing.GroupLayout(jpnSchedule);
        jpnSchedule.setLayout(jpnScheduleLayout);
        jpnScheduleLayout.setHorizontalGroup(
            jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspSchedule, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnScheduleEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnScheduleLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnScheduleLayout.setVerticalGroup(
            jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnScheduleEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSendScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSendScheduleActionPerformed
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
            //Check ScheduleID 
            String scheduleCheck = "^SD\\d+$";
            Pattern pattern = Pattern.compile(scheduleCheck);
            Matcher matcher = pattern.matcher(jtfScheduleID.getText().trim());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(null, "ScheduleID must start with 'SD' and number behind!");
                jtfScheduleID.requestFocus();
                return;

            }
            //Check batchcode
            String batchCodeCheck = "^B\\d+$";
            Pattern pattern3 = Pattern.compile(batchCodeCheck);
            Matcher matcher3 = pattern3.matcher(jtfBatchCode.getText().trim());
            if (!matcher3.find()) {
                JOptionPane.showMessageDialog(null, "Batch code must start with 'B' and number behind!");
                jtfBatchCode.requestFocus();
                return;
            }
            //Check labID
            String LabIDCheck = "^L\\d+$";
            Pattern pattern2 = Pattern.compile(LabIDCheck);
            Matcher matcher2 = pattern2.matcher(jtfLabID.getText().trim());
            if (!matcher2.find()) {
                JOptionPane.showMessageDialog(null, "Lab ID must start with 'L' and number behind!");
                jtfLabID.requestFocus();
                return;
            }
            //Check ScheduleID id exist or not
            Statement st = conn.createStatement();
            String sql1 = "Select ScheduleID from Schedule";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("ScheduleID").equals(jtfScheduleID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This ScheduleID is already exist!");
                    jtfScheduleID.requestFocus();
                    return;
                }
            }
            //Check batchcode exist or not, if not show message
            String sql2 = "Select * from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            if (!rs2.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any batch!");
                jtfBatchCode.requestFocus();
                return;

            }
            //Check lab id exist or not
            String sql3 = "Select * from Lab where LabID='" + jtfLabID.getText().trim() + "'";
            ResultSet rs3 = st.executeQuery(sql3);
            if (!rs3.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Lab!");
                jtfLabID.requestFocus();
                return;
            }
            //Check batchcode exist or not, if exist show message
            String sql6 = "Select * from Schedule where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs6 = st.executeQuery(sql6);
            if (rs6.next()) {
                JOptionPane.showMessageDialog(this, "This batch is already have schedule!");
                jtfBatchCode.requestFocus();
                return;

            }
            //Check daystudy and slottime
            String dayStudy = (String) jComboBoxDayStudy.getSelectedItem();
            String[] days = dayStudy.split("-");
            if (days.length == 2) {
                String[] days1 = days[1].trim().split(":");
                String[] days2 = days1[1].trim().split(";");
                String sql = "SELECT COUNT(*) AS count FROM Schedule WHERE LabID = ? AND (DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND SlotTime = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, jtfLabID.getText().trim());
                statement.setString(2, "%" + days[0] + "%");
                statement.setString(3, "%" + days1[0] + "%");
                statement.setString(4, "%" + days2[1].trim() + "%");
                statement.setString(5, (String) jComboBoxSlottime.getSelectedItem());
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int count = resultSet.getInt("count");
                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "This lab is already in use in this day and this time!");
                        return;
                    }
                }
            } else if (days.length == 3) {
                String[] days1 = days[1].trim().split(":");
                String[] days2 = days1[1].trim().split(";");
                String[] days3 = days[2].trim().split(":");
                String sql = "SELECT LabID, DayStudy, SlotTime FROM Schedule WHERE LabID = ? AND (DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND SlotTime = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, jtfLabID.getText().trim());
                statement.setString(2, "%" + days[0] + "%");
                statement.setString(3, "%" + days1[0] + "%");
                statement.setString(4, "%" + days2[1].trim() + "%");
                statement.setString(5, "%" + days3[0].trim() + "%");
                statement.setString(6, (String) jComboBoxSlottime.getSelectedItem());
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "This lab is already in use in this day and this time!");
                    return;
                }
            } else {
                String[] days1 = days[4].trim().split(":");
                String sql = "SELECT LabID, DayStudy, SlotTime FROM Schedule WHERE LabID = ? AND (DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND SlotTime = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, jtfLabID.getText().trim());
                statement.setString(2, "%" + days[0] + "%");
                statement.setString(3, "%" + days1[0] + "%");
                statement.setString(4, "%" + days[3].trim() + "%");
                statement.setString(5, "%" + days1[0].trim() + "%");
                statement.setString(6, (String) jComboBoxSlottime.getSelectedItem());
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "This lab is already in use in this day and this time!");
                    return;
                }
            }
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO Schedule (ScheduleID, ScheduleVersion, BatchCode, BatchType, Techname, DayStudy, Slottime, LabID) SELECT ?, ?, ?, BatchType, Techname, ?, ?, ? from Batch where BatchCode = ?");
            pstm.setString(1, jtfScheduleID.getText().trim());
            pstm.setString(2, jtfScheduleVer.getText().trim());
            pstm.setString(3, jtfBatchCode.getText().trim());
            pstm.setString(4, (String) jComboBoxDayStudy.getSelectedItem());
            pstm.setString(5, (String) jComboBoxSlottime.getSelectedItem());
            pstm.setString(6, jtfLabID.getText().trim());
            pstm.setString(7, jtfBatchCode.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnSendScheduleActionPerformed

    private void jbtnResetScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetScheduleActionPerformed
        jtfScheduleID.setText("");
        jtfScheduleVer.setText("");
        jtfBatchCode.setText("");
        jtfLabID.setText("");
    }//GEN-LAST:event_jbtnResetScheduleActionPerformed

    private void jbtnDeleteScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteScheduleActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbSchedule.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Delete Schedule where ScheduleID=?");
            pstm.setString(1, jtbSchedule.getValueAt(jtbSchedule.getSelectedRow(), 0).toString().trim());
            if (JOptionPane.showConfirmDialog(this, "Delete this Schedule?", "Confirm",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                pstm.executeUpdate();
                tbModel.setRowCount(0);
                fillTable();
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnDeleteScheduleActionPerformed

    private void jbtnEditScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditScheduleActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (jtbSchedule.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(this, "You not have choose any row!");
                return;
            }
            //Check batchcode
            String batchCodeCheck = "^B\\d+$";
            Pattern pattern3 = Pattern.compile(batchCodeCheck);
            Matcher matcher3 = pattern3.matcher(jtfBatchCode.getText().trim());
            if (!matcher3.find()) {
                JOptionPane.showMessageDialog(null, "Batch code must start with 'B' and number behind!");
                jtfBatchCode.requestFocus();
                return;
            }
            //Check labID
            String LabIDCheck = "^L\\d+$";
            Pattern pattern2 = Pattern.compile(LabIDCheck);
            Matcher matcher2 = pattern2.matcher(jtfLabID.getText().trim());
            if (!matcher2.find()) {
                JOptionPane.showMessageDialog(null, "Lab ID must start with 'L' and number behind!");
                jtfLabID.requestFocus();
                return;
            }
            //Check ScheduleID id exist or not
            Statement st = conn.createStatement();
            String sql1 = "Select ScheduleID from Schedule";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("ScheduleID").equals(jtfScheduleID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This ScheduleID is already exist!");
                    jtfScheduleID.requestFocus();
                    return;
                }
            }
            //Check batchcode exist or not, if not show message
            String sql2 = "Select * from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            if (!rs2.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any batch!");
                jtfBatchCode.requestFocus();
                return;

            }
            //Check lab id exist or not
            String sql3 = "Select * from Lab where LabID='" + jtfLabID.getText().trim() + "'";
            ResultSet rs3 = st.executeQuery(sql3);
            if (!rs3.next()) {
                JOptionPane.showMessageDialog(this, "Cannot find any Lab!");
                jtfLabID.requestFocus();
                return;
            }
            //Check batchcode exist or not, if exist show message
            String sql6 = "Select * from Schedule where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs6 = st.executeQuery(sql6);
            if (rs6.next()) {
                JOptionPane.showMessageDialog(this, "This batch is already have schedule!");
                jtfBatchCode.requestFocus();
                return;

            }
            //Check daystudy and slottime
            String dayStudy = (String) jComboBoxDayStudy.getSelectedItem();
            String[] days = dayStudy.split("-");
            if (days.length == 2) {
                String[] days1 = days[1].trim().split(":");
                String[] days2 = days1[1].trim().split(";");
                String sql = "SELECT COUNT(*) AS count FROM Schedule WHERE LabID = ? AND (DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND SlotTime = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, jtfLabID.getText().trim());
                statement.setString(2, "%" + days[0] + "%");
                statement.setString(3, "%" + days1[0] + "%");
                statement.setString(4, "%" + days2[1].trim() + "%");
                statement.setString(5, (String) jComboBoxSlottime.getSelectedItem());
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int count = resultSet.getInt("count");
                    if (count > 0) {
                        JOptionPane.showMessageDialog(null, "This lab is already in use in this day and this time!");
                        return;
                    }
                }
            } else if (days.length == 3) {
                String[] days1 = days[1].trim().split(":");
                String[] days2 = days1[1].trim().split(";");
                String[] days3 = days[2].trim().split(":");
                String sql = "SELECT LabID, DayStudy, SlotTime FROM Schedule WHERE LabID = ? AND (DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND SlotTime = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, jtfLabID.getText().trim());
                statement.setString(2, "%" + days[0] + "%");
                statement.setString(3, "%" + days1[0] + "%");
                statement.setString(4, "%" + days2[1].trim() + "%");
                statement.setString(5, "%" + days3[0].trim() + "%");
                statement.setString(6, (String) jComboBoxSlottime.getSelectedItem());
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "This lab is already in use in this day and this time!");
                    return;
                }
            } else {
                String[] days1 = days[4].trim().split(":");
                String sql = "SELECT LabID, DayStudy, SlotTime FROM Schedule WHERE LabID = ? AND (DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ? or DayStudy LIKE ?) AND SlotTime = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, jtfLabID.getText().trim());
                statement.setString(2, "%" + days[0] + "%");
                statement.setString(3, "%" + days1[0] + "%");
                statement.setString(4, "%" + days[3].trim() + "%");
                statement.setString(5, "%" + days1[0].trim() + "%");
                statement.setString(6, (String) jComboBoxSlottime.getSelectedItem());
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "This lab is already in use in this day and this time!");
                    return;
                }
            }
            PreparedStatement pstm = conn.prepareStatement("Update Schedule set ScheduleVersion =?, BatchCode=?, BatchType = (select BatchType from Batch where BatchCode=?), Techname = (select Techname from Batch where BatchCode=?), DayStudy=?,  Slottime=?, LabID=? where ScheduleID = ?");
            pstm.setString(1, jtfScheduleVer.getText().trim());
            pstm.setString(2, jtfBatchCode.getText().trim());
            pstm.setString(3, jtfBatchCode.getText().trim());
            pstm.setString(4, jtfBatchCode.getText().trim());
            pstm.setString(5, (String) jComboBoxDayStudy.getSelectedItem());

            pstm.setString(6, (String) jComboBoxSlottime.getSelectedItem());
            pstm.setString(7, jtfLabID.getText().trim());
            pstm.setString(8, jtfScheduleID.getText().trim());
            pstm.executeUpdate();
            tbModel.setRowCount(0);
            fillTable();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jbtnEditScheduleActionPerformed

    private void jtfFindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFindKeyReleased
        String Search = jtfFind.getText();
        search(Search);
    }//GEN-LAST:event_jtfFindKeyReleased

    private void jtfBatchCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBatchCodeKeyReleased
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            jComboBoxDayStudy.removeAllItems();
            Statement st = conn.createStatement();
            String sql2 = "Select BatchType from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
            ResultSet rs2 = st.executeQuery(sql2);
            while (rs2.next()) {
                if (rs2.getString("BatchType").equals("Fast Track")) {
                    jComboBoxDayStudy.addItem("Monday-Wendesday-Friday: theory ; Tuesday-Thursday-Saturday: lab");
                } else if (rs2.getString("BatchType").equals("Normal Track")) {
                    jComboBoxDayStudy.addItem("Monday-Wednesday: theory ; Tuesday-Thursday: lab");
                    jComboBoxDayStudy.addItem("Tuesday-Thursday: theory ; Wednesday-Friday: lab");
                    jComboBoxDayStudy.addItem("Wednesday-Friday: theory ; Thursday-Saturday: lab");
                } else if (rs2.getString("BatchType").equals("Slow Track")) {
                    jComboBoxDayStudy.addItem("Monday-Wednesday: theory ; Friday: lab");
                    jComboBoxDayStudy.addItem("Tuesday-Thursday: theory ; Saturday: lab");
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jtfBatchCodeKeyReleased
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
            ResultSet rs = st.executeQuery("Select * from Schedule");
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
                jtbSchedule.setModel(tbModel);
            }
            jtbSchedule.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (jtbSchedule.getSelectedRow() >= 0) {
                        jtfScheduleID.setText(jtbSchedule.getValueAt(jtbSchedule.getSelectedRow(), 0) + "");
                        jtfScheduleVer.setText(jtbSchedule.getValueAt(jtbSchedule.getSelectedRow(), 1) + "");
                        jtfBatchCode.setText(jtbSchedule.getValueAt(jtbSchedule.getSelectedRow(), 2) + "");
                        jComboBoxDayStudy.setSelectedItem(jtbSchedule.getValueAt(jtbSchedule.getSelectedRow(), 5) + "");
                        jComboBoxSlottime.setSelectedItem(jtbSchedule.getValueAt(jtbSchedule.getSelectedRow(), 6) + "");
                        jtfLabID.setText(jtbSchedule.getValueAt(jtbSchedule.getSelectedRow(), 7) + "");

                        try {
                            Connection conn = MainConnection.getConnection();
                            if (conn == null) {
                                System.out.println("Connect failure");
                                return;
                            }
                            jComboBoxDayStudy.removeAllItems();
                            Statement st = conn.createStatement();
                            String sql2 = "Select BatchType from Batch where BatchCode='" + jtfBatchCode.getText().trim() + "'";
                            ResultSet rs2 = st.executeQuery(sql2);
                            while (rs2.next()) {
                                if (rs2.getString("BatchType").equals("Fast Track")) {
                                    jComboBoxDayStudy.addItem("Monday-Wendesday-Friday: theory ; Tuesday-Thursday-Saturday: lab");
                                } else if (rs2.getString("BatchType").equals("Normal Track")) {
                                    jComboBoxDayStudy.addItem("Monday-Wednesday: theory ; Tuesday-Thursday: lab");
                                    jComboBoxDayStudy.addItem("Tuesday-Thursday: theory ; Wednesday-Friday: lab");
                                    jComboBoxDayStudy.addItem("Wednesday-Friday: theory ; Thursday-Saturday: lab");
                                } else if (rs2.getString("BatchType").equals("Slow Track")) {
                                    jComboBoxDayStudy.addItem("Monday-Wednesday: theory ; Friday: lab");
                                    jComboBoxDayStudy.addItem("Tuesday-Thursday: theory ; Saturday: lab");
                                }
                            }

                        } catch (SQLException ex) {
                            System.out.println(ex);
                        }
                    }
                }
            });
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public boolean checkValidateForm() {
        if (jtfScheduleID.getText().isEmpty() || jtfBatchCode.getText().isEmpty() || jtfBatchCode.getText().isEmpty()
                || jtfScheduleVer.getText().isEmpty() || jtfLabID.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbSchedule.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbSchedule.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
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
        jtbSchedule.getColumnModel().getColumn(5).setCellRenderer(renderer);
    }
    
    public void showComboboxDaystudy() {
        List<String> data = ComboboxDayStudy.getData();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        jComboBoxDayStudy.removeAllItems();
        for (String string : data) {
            if (!isItemExist(string)) {
                jComboBoxDayStudy.addItem(string);
            }
        }
        jComboBoxDayStudy.setModel(comboBoxModel);
    }

    private boolean isItemExist(String item) {
        for (int i = 0; i < jComboBoxDayStudy.getItemCount(); i++) {
            if (item.equals(jComboBoxDayStudy.getItemAt(i))) {
                return true;
            }
        }
        return false;
    }

    public void showComboboxSlottime() {
        List<String> data = ComboboxSlottime.getData();
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        HashSet<String> uniqueItems = new HashSet<>(data);
        for (String string : uniqueItems) {
            comboBoxModel.addElement(string);
        }
        jComboBoxSlottime.setModel(comboBoxModel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxDayStudy;
    private javax.swing.JComboBox<String> jComboBoxSlottime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnDeleteSchedule;
    private javax.swing.JButton jbtnEditSchedule;
    private javax.swing.JButton jbtnResetSchedule;
    private javax.swing.JButton jbtnSendSchedule;
    private javax.swing.JLabel jlbBatchCode;
    private javax.swing.JLabel jlbDayStudy;
    private javax.swing.JLabel jlbLabID;
    private javax.swing.JLabel jlbScheduleID;
    private javax.swing.JLabel jlbScheduleVer;
    private javax.swing.JLabel jlbSlottimeID;
    private javax.swing.JPanel jpnSchedule;
    private javax.swing.JPanel jpnScheduleEdit;
    private javax.swing.JScrollPane jspSchedule;
    private javax.swing.JTable jtbSchedule;
    private javax.swing.JTextField jtfBatchCode;
    private javax.swing.JTextField jtfFind;
    private javax.swing.JTextField jtfLabID;
    private javax.swing.JTextField jtfScheduleID;
    private javax.swing.JTextField jtfScheduleVer;
    // End of variables declaration//GEN-END:variables

}
