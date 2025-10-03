package frame.login;

import connection.MainConnection;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class FrameSignUp extends javax.swing.JFrame {

    public FrameSignUp() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("SIGN UP");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfPasswordAgain = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtfStudentID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfDayOfBirth = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfPhone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("SIGN UP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        jtfUserName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 160, -1));

        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        jtfPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 160, -1));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Sign up");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 70, -1));

        jLabel6.setText("Enter password again:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jtfPasswordAgain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtfPasswordAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPasswordAgainActionPerformed(evt);
            }
        });
        getContentPane().add(jtfPasswordAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 110, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Login");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 70, -1));

        jLabel5.setText("StudentID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jtfStudentID.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 140, -1));

        jLabel7.setText("Student name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jtfFirstName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 140, -1));

        jLabel9.setText("Address:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jtfAddress.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, -1));

        jLabel10.setText("Day of birth:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jtfDayOfBirth.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfDayOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 160, -1));

        jLabel11.setText("Phone:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jtfPhone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Backgroundlogin1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPasswordAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPasswordAgainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPasswordAgainActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
            Pattern pattern = Pattern.compile(dateCheck);
            Matcher matcher = pattern.matcher(jtfDayOfBirth.getText().trim());
            if (!matcher.find()) {
                JOptionPane.showMessageDialog(null, "You must enter right form of datetime! Example: '2000-2-28'");
                jtfDayOfBirth.requestFocus();
                return;
            }
            //Check password
            if (!jtfPassword.getText().trim().equals(jtfPasswordAgain.getText().trim())) {
                JOptionPane.showMessageDialog(this, "Password and password that enter again is not same");
                jtfPasswordAgain.requestFocus();
                return;
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
            //Check studentID is exist or not
            String sql1 = "Select StudentID from Students";
            ResultSet rs1 = st.executeQuery(sql1);
            while (rs1.next()) {
                if (rs1.getString("StudentID").equals(jtfStudentID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "This Student ID is already exist!");
                    jtfStudentID.requestFocus();
                    return;
                }
            }
            String sql = "insert into Students values (?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, jtfStudentID.getText().trim());
            stmt.setString(2, jtfFirstName.getText().trim());
            stmt.setString(3, jtfAddress.getText().trim());
            String phone = jtfPhone.getText().trim();
            BigDecimal phoneValue = new BigDecimal(phone);
            stmt.setBigDecimal(4, phoneValue);
            stmt.setString(5, jtfDayOfBirth.getText().trim());
            stmt.setString(6, jtfUserName.getText().trim());
            stmt.setString(7, jtfPassword.getText().trim());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Create account successfully!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frame.login.FrameLogIn frmLogin = new FrameLogIn();
        frmLogin.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean checkValidateForm() {
        if (jtfStudentID.getText().isEmpty() || jtfFirstName.getText().isEmpty()
                || jtfAddress.getText().isEmpty() || jtfPhone.getText().isEmpty() || jtfDayOfBirth.getText().isEmpty()
                || jtfUserName.getText().isEmpty() || jtfPassword.getText().isEmpty() || jtfPasswordAgain.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfDayOfBirth;
    private javax.swing.JTextField jtfFirstName;
    private javax.swing.JTextField jtfPassword;
    private javax.swing.JTextField jtfPasswordAgain;
    private javax.swing.JTextField jtfPhone;
    private javax.swing.JTextField jtfStudentID;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables
}
