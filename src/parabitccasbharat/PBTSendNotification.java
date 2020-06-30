
package parabitccasbharat;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class PBTSendNotification extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    ParabitDBC db;

    public PBTSendNotification(PBTOfficeMainDashBoard parent,PBTDataOfEmployee data) {
        super(parent,true);
        initComponents();
        this.data = data;
        db = new ParabitDBC();
        fetchdatanotification();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        notificationtable = new javax.swing.JTable();
        individual = new javax.swing.JButton();
        general = new javax.swing.JButton();
        channel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        notificationtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "To", "Message ID", "Message", "Time", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(notificationtable);
        if (notificationtable.getColumnModel().getColumnCount() > 0) {
            notificationtable.getColumnModel().getColumn(0).setMaxWidth(200);
            notificationtable.getColumnModel().getColumn(1).setMaxWidth(200);
            notificationtable.getColumnModel().getColumn(2).setMaxWidth(200);
            notificationtable.getColumnModel().getColumn(4).setMaxWidth(200);
            notificationtable.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        individual.setText("Individual");
        individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualActionPerformed(evt);
            }
        });

        general.setText("General");

        channel.setText("Chanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(individual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(general, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(channel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(individual)
                    .addComponent(general)
                    .addComponent(channel))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void individualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_individualActionPerformed
        PBTEmpSummary sendnotification = new PBTEmpSummary(data, 2);
        sendnotification.setVisible(true);
    }//GEN-LAST:event_individualActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton channel;
    private javax.swing.JButton general;
    private javax.swing.JButton individual;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notificationtable;
    // End of variables declaration//GEN-END:variables

    private void fetchdatanotification() {
        String query = "SELECT * FROM `pbtnotification` WHERE RecieverCeId = '" +data.getCeid() + "' or SenderCeid = '" + data.getCeid() + "'";
        DefaultTableModel model = (DefaultTableModel)notificationtable.getModel();
        model.setRowCount(0);
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String from = db.rs1.getString("SenderCeId");
                String to = db.rs1.getString("RecieverCeId");
                String time = db.rs1.getTimestamp("Time").toString();
                String message = db.rs1.getString("Message");
                String msgid = db.rs1.getString("NotId");
                int nottype = db.rs1.getInt("NotType");
                String type;
                switch (nottype) {
                    case 1:
                        type = "Individual";
                        break;
                    case 2:
                        type = "Chain";
                        break;
                    default:
                        type = "General";
                        break;
                }
                Object row[] = {from, to, msgid, time, message, type};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
