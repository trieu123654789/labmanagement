package frame.user;

import connection.MainConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import other.GetUsername;

public class ScheduleUser extends javax.swing.JPanel {

    DefaultTableModel tbModel = new DefaultTableModel();

    public ScheduleUser() {
        initComponents();
        jtbSchedule.getTableHeader().setForeground(Color.RED);
        fillTable();
        showFullText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnSchedule = new javax.swing.JPanel();
        jspSchedule = new javax.swing.JScrollPane();
        jtbSchedule = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtfFind = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        jtbSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Schedule ID", "Schedule version", "Batch code", "Batch type", "Tech name", "Day study", "Slot time", "Lab ID"
            }
        ));
        jspSchedule.setViewportView(jtbSchedule);
        if (jtbSchedule.getColumnModel().getColumnCount() > 0) {
            jtbSchedule.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtbSchedule.getColumnModel().getColumn(1).setPreferredWidth(35);
            jtbSchedule.getColumnModel().getColumn(2).setPreferredWidth(35);
            jtbSchedule.getColumnModel().getColumn(3).setPreferredWidth(35);
            jtbSchedule.getColumnModel().getColumn(5).setPreferredWidth(35);
            jtbSchedule.getColumnModel().getColumn(6).setPreferredWidth(35);
            jtbSchedule.getColumnModel().getColumn(7).setPreferredWidth(35);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Enter information to search:");

        jtfFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfFindKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpnScheduleLayout = new javax.swing.GroupLayout(jpnSchedule);
        jpnSchedule.setLayout(jpnScheduleLayout);
        jpnScheduleLayout.setHorizontalGroup(
            jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnScheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnScheduleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jspSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnScheduleLayout.setVerticalGroup(
            jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnScheduleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(540, Short.MAX_VALUE))
            .addGroup(jpnScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnScheduleLayout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(jspSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            ResultSet rs = st.executeQuery("SELECT s.* FROM Schedule s JOIN Batch b ON s.BatchCode = b.BatchCode JOIN LearningReport r ON b.BatchCode = r.BatchCode WHERE r.StudentID =(select StudentID from Students where UserName='" + username + "')");
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
        jtbSchedule.getColumnModel().getColumn(5).setCellRenderer(renderer);
    }

    public void search(String str) {
        tbModel = (DefaultTableModel) jtbSchedule.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tbModel);
        jtbSchedule.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpnSchedule;
    private javax.swing.JScrollPane jspSchedule;
    private javax.swing.JTable jtbSchedule;
    private javax.swing.JTextField jtfFind;
    // End of variables declaration//GEN-END:variables

}
