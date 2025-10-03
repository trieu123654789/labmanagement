package frame.login;

import connection.MainConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import other.GetUsername;
import frame.admin.NewJFrame1;
import frame.user.NewJFrameUser;

public class FrameLogIn extends javax.swing.JFrame {

    public FrameLogIn() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("LOGIN");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbtnSignUp = new javax.swing.JButton();
        jtfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel3.setText("Username:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jtfUserName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 160, -1));

        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jbtnLogin.setBackground(new java.awt.Color(153, 153, 153));
        jbtnLogin.setText("Login");
        jbtnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 80, -1));

        jLabel5.setText("No account?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jbtnSignUp.setBackground(new java.awt.Color(153, 153, 153));
        jbtnSignUp.setText("Sign up");
        jbtnSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 70, -1));

        jtfPassword.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jtfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 160, -1));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Backgroundlogin1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoginActionPerformed
        try {
            Connection conn = MainConnection.getConnection();
            if (conn == null) {
                System.out.println("Connect failure");
                return;
            }
            if (!checkValidateForm()) {
                JOptionPane.showMessageDialog(this, "You must enter username and password!");
                return;
            }
            //Check account admin
            String username = jtfUserName.getText().trim();
            String password = jtfPassword.getText().trim();
            if (username.equals("admin") && password.equals("admin1234")) {
                frame.admin.NewJFrame1 frmAdmin = new NewJFrame1();
                frmAdmin.show();
                frmAdmin.setLocationRelativeTo(null);
                this.dispose();
                //Check account user
            } else {
                String sql1 = "Select * from Students where UserName='" + username + "' and Password='" + password + "'";
                Statement st = conn.createStatement();
                ResultSet rs1 = st.executeQuery(sql1);
                if (rs1.next()) {
                    frame.user.NewJFrameUser frmUser = new NewJFrameUser();
                    frmUser.show();

                    GetUsername getusn = new GetUsername();
                    getusn.setUsername(jtfUserName.getText().trim());
                    frmUser.setLocationRelativeTo(null);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "User name or password is incorrect");
                    jtfUserName.requestFocus();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jbtnLoginActionPerformed

    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed
        frame.login.FrameSignUp frmDK = new FrameSignUp();
        frmDK.show();
        this.dispose();
    }//GEN-LAST:event_jbtnSignUpActionPerformed
    public boolean checkValidateForm() {
        if (jtfUserName.getText().isEmpty() || jtfPassword.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public String getUsername() {
        return jtfUserName.getText().trim();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnLogin;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JPasswordField jtfPassword;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables
}
