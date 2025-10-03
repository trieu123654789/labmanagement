package frame.user;

import bean.Bean;
import controller.ChangeScreenUser;
import java.util.ArrayList;
import java.util.List;
import frame.login.FrameLogIn;


public class NewJFrameUser extends javax.swing.JFrame {

  
    public NewJFrameUser() {
        initComponents();
        setTitle("CONCOURSE'S LAB MANAGEMENT SYSTEM");
         ChangeScreenUser controller = new ChangeScreenUser(jpnView);
         controller.setView(jpnBatchUser, jlbBatchUser);
         List<Bean> listItem = new ArrayList<>();
         listItem.add(new Bean("Batch", jpnBatchUser, jlbBatchUser));
         listItem.add(new Bean("Students", jpnStudentsUser, jlbStudentsUser));
         listItem.add(new Bean("LearningReport", jpnLearningReport,jlbLearningReportUser));
         listItem.add(new Bean("Schedule", jpnScheduleUser,jlbScheduleUser));
         listItem.add(new Bean("Feedback", jpnAnnouncementUser,jlbAnnouncementUser));
         controller.setEvent(listItem);
    jScrollPane1.getVerticalScrollBar().setUnitIncrement(30);
    jScrollPane1.getVerticalScrollBar().setBlockIncrement(30);
       setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpnMenu = new javax.swing.JPanel();
        jpnHeaderUser = new javax.swing.JPanel();
        jbtbLogout = new javax.swing.JButton();
        jlbName = new javax.swing.JLabel();
        jpnBatchUser = new javax.swing.JPanel();
        jlbBatchUser = new javax.swing.JLabel();
        jpnStudentsUser = new javax.swing.JPanel();
        jlbStudentsUser = new javax.swing.JLabel();
        jpnLearningReport = new javax.swing.JPanel();
        jlbLearningReportUser = new javax.swing.JLabel();
        jpnScheduleUser = new javax.swing.JPanel();
        jlbScheduleUser = new javax.swing.JLabel();
        jpnAnnouncementUser = new javax.swing.JPanel();
        jlbAnnouncementUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnMenu.setBackground(new java.awt.Color(204, 255, 255));

        jpnHeaderUser.setBackground(new java.awt.Color(0, 204, 204));

        jbtbLogout.setBackground(new java.awt.Color(204, 255, 204));
        jbtbLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Logout1.png"))); // NOI18N
        jbtbLogout.setText("Log Out");
        jbtbLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtbLogoutActionPerformed(evt);
            }
        });

        jlbName.setBackground(new java.awt.Color(255, 255, 204));
        jlbName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jpnHeaderUserLayout = new javax.swing.GroupLayout(jpnHeaderUser);
        jpnHeaderUser.setLayout(jpnHeaderUserLayout);
        jpnHeaderUserLayout.setHorizontalGroup(
            jpnHeaderUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHeaderUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtbLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jpnHeaderUserLayout.setVerticalGroup(
            jpnHeaderUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHeaderUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHeaderUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtbLogout)
                    .addComponent(jlbName))
                .addContainerGap())
        );

        jpnBatchUser.setBackground(new java.awt.Color(255, 255, 204));

        jlbBatchUser.setBackground(new java.awt.Color(255, 255, 204));
        jlbBatchUser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbBatchUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbBatchUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/khoahoc.png"))); // NOI18N
        jlbBatchUser.setText("BATCH REGISTER");

        javax.swing.GroupLayout jpnBatchUserLayout = new javax.swing.GroupLayout(jpnBatchUser);
        jpnBatchUser.setLayout(jpnBatchUserLayout);
        jpnBatchUserLayout.setHorizontalGroup(
            jpnBatchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchUserLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbBatchUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnBatchUserLayout.setVerticalGroup(
            jpnBatchUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchUserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbBatchUser)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jpnStudentsUser.setBackground(new java.awt.Color(255, 255, 204));

        jlbStudentsUser.setBackground(new java.awt.Color(255, 255, 204));
        jlbStudentsUser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbStudentsUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbStudentsUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/student.png"))); // NOI18N
        jlbStudentsUser.setText("STUDENT INFORMATION");

        javax.swing.GroupLayout jpnStudentsUserLayout = new javax.swing.GroupLayout(jpnStudentsUser);
        jpnStudentsUser.setLayout(jpnStudentsUserLayout);
        jpnStudentsUserLayout.setHorizontalGroup(
            jpnStudentsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsUserLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbStudentsUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStudentsUserLayout.setVerticalGroup(
            jpnStudentsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsUserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbStudentsUser)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpnLearningReport.setBackground(new java.awt.Color(255, 255, 204));

        jlbLearningReportUser.setBackground(new java.awt.Color(255, 255, 204));
        jlbLearningReportUser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbLearningReportUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbLearningReportUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/report.png"))); // NOI18N
        jlbLearningReportUser.setText("VIEW LEARNING REPORT");

        javax.swing.GroupLayout jpnLearningReportLayout = new javax.swing.GroupLayout(jpnLearningReport);
        jpnLearningReport.setLayout(jpnLearningReportLayout);
        jpnLearningReportLayout.setHorizontalGroup(
            jpnLearningReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLearningReportLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbLearningReportUser, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLearningReportLayout.setVerticalGroup(
            jpnLearningReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLearningReportLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbLearningReportUser)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnScheduleUser.setBackground(new java.awt.Color(255, 255, 204));

        jlbScheduleUser.setBackground(new java.awt.Color(255, 255, 204));
        jlbScheduleUser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbScheduleUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbScheduleUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/schedule.png"))); // NOI18N
        jlbScheduleUser.setText("SCHEDULE");

        javax.swing.GroupLayout jpnScheduleUserLayout = new javax.swing.GroupLayout(jpnScheduleUser);
        jpnScheduleUser.setLayout(jpnScheduleUserLayout);
        jpnScheduleUserLayout.setHorizontalGroup(
            jpnScheduleUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleUserLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbScheduleUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnScheduleUserLayout.setVerticalGroup(
            jpnScheduleUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleUserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbScheduleUser)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnAnnouncementUser.setBackground(new java.awt.Color(255, 255, 204));

        jlbAnnouncementUser.setBackground(new java.awt.Color(255, 255, 204));
        jlbAnnouncementUser.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbAnnouncementUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbAnnouncementUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/announcement.png"))); // NOI18N
        jlbAnnouncementUser.setText("FEEDBACK");

        javax.swing.GroupLayout jpnAnnouncementUserLayout = new javax.swing.GroupLayout(jpnAnnouncementUser);
        jpnAnnouncementUser.setLayout(jpnAnnouncementUserLayout);
        jpnAnnouncementUserLayout.setHorizontalGroup(
            jpnAnnouncementUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAnnouncementUserLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbAnnouncementUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnAnnouncementUserLayout.setVerticalGroup(
            jpnAnnouncementUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAnnouncementUserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbAnnouncementUser)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnBatchUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnStudentsUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnScheduleUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnAnnouncementUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnLearningReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addComponent(jpnHeaderUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jpnHeaderUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnBatchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnScheduleUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnStudentsUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnLearningReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnAnnouncementUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jpnMenu);

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtbLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtbLogoutActionPerformed
        frame.login.FrameLogIn frmLogin = new FrameLogIn();
        frmLogin.show();
        this.dispose();

    }//GEN-LAST:event_jbtbLogoutActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrameUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // NewJFrameUser frm = new NewJFrameUser();
                //frm.setVisible(true);
                frame.login.FrameLogIn frmLogIn = new FrameLogIn();
                frmLogIn.show();
                NewJFrameUser frmuser = new NewJFrameUser();
           
               
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtbLogout;
    private javax.swing.JLabel jlbAnnouncementUser;
    private javax.swing.JLabel jlbBatchUser;
    private javax.swing.JLabel jlbLearningReportUser;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbScheduleUser;
    private javax.swing.JLabel jlbStudentsUser;
    private javax.swing.JPanel jpnAnnouncementUser;
    private javax.swing.JPanel jpnBatchUser;
    private javax.swing.JPanel jpnHeaderUser;
    private javax.swing.JPanel jpnLearningReport;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnScheduleUser;
    private javax.swing.JPanel jpnStudentsUser;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
