package frame.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import other.GetUsername;
import connection.MainConnection;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentsUser extends javax.swing.JPanel {

    public StudentsUser() {
        initComponents();
        fillTable1();
    }

    @SuppressWarnings("unchecked")
    public boolean checkValidateForm() {
        if (jtfOldpw.getText().isEmpty()
                || jtfNewpw.getText().isEmpty() || jtfConfirmpw.getText().isEmpty()) {
            return false;
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDlgChangePassword = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnChangepw2 = new javax.swing.JButton();
        jtfOldpw = new javax.swing.JPasswordField();
        jtfNewpw = new javax.swing.JPasswordField();
        jtfConfirmpw = new javax.swing.JPasswordField();
        jPanelStudents = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelStudentName = new javax.swing.JLabel();
        jLabelStudentID = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelStudentAddress = new javax.swing.JLabel();
        jLabelDayofbirth = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Change Password");

        jLabel5.setText("Enter old password: ");

        jLabel6.setText("Enter new password:");

        jLabel7.setText("Confirm new password:");

        btnChangepw2.setBackground(new java.awt.Color(102, 102, 102));
        btnChangepw2.setText("Change password");
        btnChangepw2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChangepw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangepw2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDlgChangePasswordLayout = new javax.swing.GroupLayout(jDlgChangePassword.getContentPane());
        jDlgChangePassword.getContentPane().setLayout(jDlgChangePasswordLayout);
        jDlgChangePasswordLayout.setHorizontalGroup(
            jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgChangePasswordLayout.createSequentialGroup()
                .addGroup(jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDlgChangePasswordLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDlgChangePasswordLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtfConfirmpw, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDlgChangePasswordLayout.createSequentialGroup()
                                .addGroup(jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33)
                                .addGroup(jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfNewpw, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(jtfOldpw)))))
                    .addGroup(jDlgChangePasswordLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel4))
                    .addGroup(jDlgChangePasswordLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnChangepw2)))
                .addGap(0, 87, Short.MAX_VALUE))
        );
        jDlgChangePasswordLayout.setVerticalGroup(
            jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDlgChangePasswordLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfOldpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfNewpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDlgChangePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfConfirmpw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnChangepw2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("YOUR INFORMATION");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Student name:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Phone:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Day of birth:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("User name:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Password:");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("CHANGE PASSWORD");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("NOITICE:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("If your information is wrong, con send feedback to admin to update your right information!");

        javax.swing.GroupLayout jPanelStudentsLayout = new javax.swing.GroupLayout(jPanelStudents);
        jPanelStudents.setLayout(jPanelStudentsLayout);
        jPanelStudentsLayout.setHorizontalGroup(
            jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStudentsLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStudentsLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addGroup(jPanelStudentsLayout.createSequentialGroup()
                        .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelStudentsLayout.createSequentialGroup()
                                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelStudentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jLabelStudentAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jLabelStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelStudentsLayout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabelDayofbirth, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                        .addGroup(jPanelStudentsLayout.createSequentialGroup()
                                            .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStudentsLayout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addGap(26, 26, 26))
                                                .addGroup(jPanelStudentsLayout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addGap(32, 32, 32)))
                                            .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                .addComponent(jLabelUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanelStudentsLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(105, 105, 105))))))
        );
        jPanelStudentsLayout.setVerticalGroup(
            jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStudentsLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10))
                    .addComponent(jLabelStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDayofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addComponent(jLabelStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addComponent(jLabelStudentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStudentsLayout.createSequentialGroup()
                        .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanelStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelStudents, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangepw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangepw2ActionPerformed
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
            GetUsername getusn = new GetUsername();
            String username = getusn.getUsername();
            Statement st = conn.createStatement();
            //Check old password
            ResultSet rs = st.executeQuery("SELECT Password from Students where UserName='" + username + "'");
            while (rs.next()) {
                if (!rs.getString("Password").equals(jtfOldpw.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "Old password is incorrect!");
                    jtfOldpw.requestFocus();
                    return;
                }
            }
            //Check new password
            if (!jtfNewpw.getText().trim().equals(jtfConfirmpw.getText().trim())) {
                JOptionPane.showMessageDialog(this, "New password and confirm password is not same!");
                jtfConfirmpw.requestFocus();
                return;
            }
            PreparedStatement pstm = conn.prepareStatement("Update Students set Password = ? where UserName='" + username + "'");
            pstm.setString(1, jtfNewpw.getText().trim());
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(this, "Change password successfully!");
            ResultSet rs1 = st.executeQuery("SELECT Password from Students where UserName='" + username + "'");
             while (rs1.next()) {
                String password = rs1.getString("Password");
                jLabelPassword.setText(password);
                Font font = new Font("Segoe UI", Font.PLAIN, 14);
                jLabelPassword.setFont(font);
            }
            jDlgChangePassword.setVisible(false);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnChangepw2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDlgChangePassword.setSize(500, 400);
        jDlgChangePassword.setLocationRelativeTo(null);
        jDlgChangePassword.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void fillTable1() {
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            Statement st = conn.createStatement();
            GetUsername getusn = new GetUsername();
            String username = getusn.getUsername();
            ResultSet rs = st.executeQuery("SELECT * from Students where UserName='" + username + "'");
            while (rs.next()) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = rs.getDate("Dayofbirth");
                String formattedDate = dateFormat.format(date);
                String studentID = rs.getString("StudentID");
                jLabelStudentID.setText(studentID);
                String studentName = rs.getString("StudentName");
                jLabelStudentName.setText(studentName);
                String address = rs.getString("Address");
                jLabelStudentAddress.setText(address);
                String phone = rs.getString("Phone");
                jLabelPhone.setText("0" + phone);
                String dayOfBirth = formattedDate;
                jLabelDayofbirth.setText(dayOfBirth);
                jLabelUserName.setText(username);
                String password = rs.getString("Password");
                jLabelPassword.setText(password);
                Font font = new Font("Segoe UI", Font.PLAIN, 14);
                jLabelStudentID.setFont(font);
                jLabelStudentName.setFont(font);
                jLabelStudentAddress.setFont(font);
                jLabelPhone.setFont(font);
                jLabelDayofbirth.setFont(font);
                jLabelUserName.setFont(font);
                jLabelPassword.setFont(font);
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangepw2;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDlgChangePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDayofbirth;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelStudentAddress;
    private javax.swing.JLabel jLabelStudentID;
    private javax.swing.JLabel jLabelStudentName;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanelStudents;
    private javax.swing.JPasswordField jtfConfirmpw;
    private javax.swing.JPasswordField jtfNewpw;
    private javax.swing.JPasswordField jtfOldpw;
    // End of variables declaration//GEN-END:variables

}
