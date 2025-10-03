package frame.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import other.GetUsername;
import connection.MainConnection;
import java.awt.Color;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class LearningReportUser extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    /**
     * Creates new form Batch
     */
    public LearningReportUser() {
        initComponents();
        fillTable();
        jtbLearningreport.getTableHeader().setForeground(Color.RED);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBatch = new javax.swing.JPanel();
        jspLearningreport = new javax.swing.JScrollPane();
        jtbLearningreport = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfFind = new javax.swing.JTextField();

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnBatchLayout = new javax.swing.GroupLayout(jpnBatch);
        jpnBatch.setLayout(jpnBatchLayout);
        jpnBatchLayout.setHorizontalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBatchLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jpnBatchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspLearningreport)
                .addContainerGap())
        );
        jpnBatchLayout.setVerticalGroup(
            jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBatchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBatchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jspLearningreport, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

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
            GetUsername getusn = new GetUsername();
            String username = getusn.getUsername();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Learningreport WHERE StudentID = (SELECT StudentID FROM Students WHERE UserName = '" + username + "')");
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

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbLearningreport.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbLearningreport.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpnBatch;
    private javax.swing.JScrollPane jspLearningreport;
    private javax.swing.JTable jtbLearningreport;
    private javax.swing.JTextField jtfFind;
    // End of variables declaration//GEN-END:variables

}
