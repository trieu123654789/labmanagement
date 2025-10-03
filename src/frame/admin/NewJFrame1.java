package frame.admin;

import bean.Bean;
import controller.ChangeScreenAdmin;
import java.util.ArrayList;
import java.util.List;
import frame.login.FrameLogIn;


public class NewJFrame1 extends javax.swing.JFrame {
    
   
    public NewJFrame1() {
        initComponents();

        setTitle("CONCOURSE'S LAB MANAGEMENT SYSTEM");
        ChangeScreenAdmin controller = new ChangeScreenAdmin(jpnView);
        controller.setView(jpnBatch, jlbBatch);
        List<Bean> listItem = new ArrayList<>();

        listItem.add(new Bean("Batch", jpnBatch, jlbBatch));
        listItem.add(new Bean("Lab", jpnLab, jlbLab));
        listItem.add(new Bean("Students", jpnStudents, jlbStudents));
        listItem.add(new Bean("Technology", jpnTechnology, jlbTechnology));
        listItem.add(new Bean("LearningReport", jpnLearningReport, jlbLearningReport));
        listItem.add(new Bean("Schedule", jpnSchedule, jlbSchedule));
        listItem.add(new Bean("Feedback", jpnFeedback, jlbFeedback));
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
        jpnHeader = new javax.swing.JPanel();
        jlbName = new javax.swing.JLabel();
        jbtbLogout = new javax.swing.JButton();
        jpnLab = new javax.swing.JPanel();
        jlbLab = new javax.swing.JLabel();
        jpnStudents = new javax.swing.JPanel();
        jlbStudents = new javax.swing.JLabel();
        jpnTechnology = new javax.swing.JPanel();
        jlbTechnology = new javax.swing.JLabel();
        jpnLearningReport = new javax.swing.JPanel();
        jlbLearningReport = new javax.swing.JLabel();
        jpnSchedule = new javax.swing.JPanel();
        jlbSchedule = new javax.swing.JLabel();
        jpnFeedback = new javax.swing.JPanel();
        jlbFeedback = new javax.swing.JLabel();
        jpnBatch = new javax.swing.JPanel();
        jlbBatch = new javax.swing.JLabel();

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

        jpnHeader.setBackground(new java.awt.Color(0, 204, 204));

        jlbName.setBackground(new java.awt.Color(255, 255, 204));
        jlbName.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbName.setText("Hi, admin");

        jbtbLogout.setBackground(new java.awt.Color(204, 204, 204));
        jbtbLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Logout1.png"))); // NOI18N
        jbtbLogout.setText("Log Out");
        jbtbLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtbLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnHeaderLayout = new javax.swing.GroupLayout(jpnHeader);
        jpnHeader.setLayout(jpnHeaderLayout);
        jpnHeaderLayout.setHorizontalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbName)
                .addGap(36, 36, 36)
                .addComponent(jbtbLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnHeaderLayout.setVerticalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtbLogout))
                .addContainerGap())
        );

        jpnLab.setBackground(new java.awt.Color(255, 255, 204));

        jlbLab.setBackground(new java.awt.Color(255, 255, 204));
        jlbLab.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/lab.png"))); // NOI18N
        jlbLab.setText("LAB MANAGEMENT");

        javax.swing.GroupLayout jpnLabLayout = new javax.swing.GroupLayout(jpnLab);
        jpnLab.setLayout(jpnLabLayout);
        jpnLabLayout.setHorizontalGroup(
            jpnLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLabLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLabLayout.setVerticalGroup(
            jpnLabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLabLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbLab)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnStudents.setBackground(new java.awt.Color(255, 255, 204));

        jlbStudents.setBackground(new java.awt.Color(255, 255, 204));
        jlbStudents.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbStudents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/student.png"))); // NOI18N
        jlbStudents.setText("STUDENT MANAGEMENT");

        javax.swing.GroupLayout jpnStudentsLayout = new javax.swing.GroupLayout(jpnStudents);
        jpnStudents.setLayout(jpnStudentsLayout);
        jpnStudentsLayout.setHorizontalGroup(
            jpnStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnStudentsLayout.setVerticalGroup(
            jpnStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnStudentsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbStudents)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpnTechnology.setBackground(new java.awt.Color(255, 255, 204));

        jlbTechnology.setBackground(new java.awt.Color(255, 255, 204));
        jlbTechnology.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbTechnology.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbTechnology.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/technology.png"))); // NOI18N
        jlbTechnology.setText("TECHNOLOGY MANAGEMENT");

        javax.swing.GroupLayout jpnTechnologyLayout = new javax.swing.GroupLayout(jpnTechnology);
        jpnTechnology.setLayout(jpnTechnologyLayout);
        jpnTechnologyLayout.setHorizontalGroup(
            jpnTechnologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTechnologyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbTechnology)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnTechnologyLayout.setVerticalGroup(
            jpnTechnologyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTechnologyLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbTechnology)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpnLearningReport.setBackground(new java.awt.Color(255, 255, 204));

        jlbLearningReport.setBackground(new java.awt.Color(255, 255, 204));
        jlbLearningReport.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbLearningReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbLearningReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/report.png"))); // NOI18N
        jlbLearningReport.setText("LEARNING REPORT");

        javax.swing.GroupLayout jpnLearningReportLayout = new javax.swing.GroupLayout(jpnLearningReport);
        jpnLearningReport.setLayout(jpnLearningReportLayout);
        jpnLearningReportLayout.setHorizontalGroup(
            jpnLearningReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLearningReportLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbLearningReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnLearningReportLayout.setVerticalGroup(
            jpnLearningReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnLearningReportLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbLearningReport)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnSchedule.setBackground(new java.awt.Color(255, 255, 204));

        jlbSchedule.setBackground(new java.awt.Color(255, 255, 204));
        jlbSchedule.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbSchedule.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/schedule.png"))); // NOI18N
        jlbSchedule.setText("SCHEDULE");

        javax.swing.GroupLayout jpnScheduleLayout = new javax.swing.GroupLayout(jpnSchedule);
        jpnSchedule.setLayout(jpnScheduleLayout);
        jpnScheduleLayout.setHorizontalGroup(
            jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnScheduleLayout.setVerticalGroup(
            jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbSchedule)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnFeedback.setBackground(new java.awt.Color(255, 255, 204));

        jlbFeedback.setBackground(new java.awt.Color(255, 255, 204));
        jlbFeedback.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbFeedback.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/announcement.png"))); // NOI18N
        jlbFeedback.setText("FEEDBACK");

        javax.swing.GroupLayout jpnFeedbackLayout = new javax.swing.GroupLayout(jpnFeedback);
        jpnFeedback.setLayout(jpnFeedbackLayout);
        jpnFeedbackLayout.setHorizontalGroup(
            jpnFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFeedbackLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnFeedbackLayout.setVerticalGroup(
            jpnFeedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFeedbackLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbFeedback)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpnBatch.setBackground(new java.awt.Color(255, 255, 204));

        jlbBatch.setBackground(new java.awt.Color(255, 255, 204));
        jlbBatch.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jlbBatch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbBatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/khoahoc.png"))); // NOI18N
        jlbBatch.setText("BATCH MANAGEMENT");

        javax.swing.GroupLayout jpnBatchLayout = new javax.swing.GroupLayout(jpnBatch);
        jpnBatch.setLayout(jpnBatchLayout);
        jpnBatchLayout.setHorizontalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlbBatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnBatchLayout.setVerticalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbBatch)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnHeader, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTechnology, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnLearningReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSchedule, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnFeedback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jpnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnLearningReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
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
                .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              frame.login.FrameLogIn frmLogIn = new FrameLogIn();
                frmLogIn.show();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtbLogout;
    private javax.swing.JLabel jlbBatch;
    private javax.swing.JLabel jlbFeedback;
    private javax.swing.JLabel jlbLab;
    private javax.swing.JLabel jlbLearningReport;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbSchedule;
    private javax.swing.JLabel jlbStudents;
    private javax.swing.JLabel jlbTechnology;
    private javax.swing.JPanel jpnBatch;
    private javax.swing.JPanel jpnFeedback;
    private javax.swing.JPanel jpnHeader;
    private javax.swing.JPanel jpnLab;
    private javax.swing.JPanel jpnLearningReport;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnSchedule;
    private javax.swing.JPanel jpnStudents;
    private javax.swing.JPanel jpnTechnology;
    private javax.swing.JPanel jpnView;
    // End of variables declaration//GEN-END:variables
}
