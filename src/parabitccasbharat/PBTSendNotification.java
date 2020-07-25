
package parabitccasbharat;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class PBTSendNotification<T> extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    ParabitDBC db;
    T parent;

    public PBTSendNotification(T parent,PBTDataOfEmployee data) {
        super((JFrame)parent,true);
        initComponents();
        this.data = data;
        this.parent = parent;
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
                "From", "To", "Message ID", "Time", "Message", "Type"
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
            notificationtable.getColumnModel().getColumn(3).setMaxWidth(200);
            notificationtable.getColumnModel().getColumn(5).setMaxWidth(200);
        }

        individual.setText("Individual");
        individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                individualActionPerformed(evt);
            }
        });

        general.setText("General");
        general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalActionPerformed(evt);
            }
        });

        channel.setText("Chanel");
        channel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                channelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(individual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(general, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(channel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        PBTEmpSummary sendnotification = new PBTEmpSummary(data,parent, 2);
        sendnotification.setVisible(true);
    }//GEN-LAST:event_individualActionPerformed

    private void channelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_channelActionPerformed
        PBTAppointedEmp sendnotification = new PBTAppointedEmp(data, parent, 4);
        sendnotification.setVisible(true);
    }//GEN-LAST:event_channelActionPerformed

    private void generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalActionPerformed
        PBTSendMessage sendMessage = new PBTSendMessage(data, parent, 3, "");
        sendMessage.setVisible(true);
    }//GEN-LAST:event_generalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton channel;
    private javax.swing.JButton general;
    private javax.swing.JButton individual;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notificationtable;
    // End of variables declaration//GEN-END:variables

    private void fetchdatanotification() {
        String query4 = "SELECT CRepEmpID FROM `pbtemployeetable2`  WHERE CEID = (";
        String query = "SELECT CRepEmpID FROM `pbtemployeetable2`  WHERE CEID = '" + data.getCeid() + "'";
        String query3 = query;
        switch(data.getGrade())
        {
            case 5:
                query3 = query3 + "or CEID = (" + query + ")";
                query = query4 + query + ")";
            case 4:
                query3 = query3 + "or CEID = (" + query + ")";
                query = query4 + query + ")";
            case 3:
                query3 = query3 + "or CEID = (" + query + ")";
                break;
        }
        System.out.println(query);
        String query2 = "SELECT * FROM `pbtnotification` WHERE SenderCeId = '" +data.getCeid() + "' OR (NotType = 1 and RecieverCeId = '" +  data.getCeid() + "') OR (NotType = 2 and SenderCeId IN (" + query3 +") and RecieverCeId In (" + query3 + ")) OR (NotType = 3 and SenderCeId IN (" + query3 + "))  ORDER BY Time DESC";
        System.out.println(query2);
        DefaultTableModel model = (DefaultTableModel)notificationtable.getModel();
        model.setRowCount(0);
        try {
            db.rs1 = db.stm.executeQuery(query2);
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
