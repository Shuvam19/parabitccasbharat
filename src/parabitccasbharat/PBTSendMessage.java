
package parabitccasbharat;

import java.sql.SQLException;
import java.sql.Timestamp;

public class PBTSendMessage extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    PBTOfficeMainDashBoard parent;
    String sendingceid;
    int messagetye;
    ParabitDBC db;
    
    public PBTSendMessage(PBTDataOfEmployee data,PBTOfficeMainDashBoard parent,int messagetype,String sendingceid) {
        super(parent,true);
        initComponents();
        this.data = data;
        this.parent = parent;
        this.sendingceid = sendingceid;
        this.messagetye = messagetype;
        db = new ParabitDBC();
        switch(messagetype)
        {
            case 1:tyeofmessage.setText("Individual Message");
                break;
            case 2:tyeofmessage.setText("Chain Message");
                break;
            case 3:tyeofmessage.setText("General Message");
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        messagetosend = new javax.swing.JTextArea();
        tyeofmessage = new javax.swing.JLabel();
        sendbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        messagetosend.setColumns(20);
        messagetosend.setRows(5);
        jScrollPane1.setViewportView(messagetosend);

        tyeofmessage.setText("jLabel1");

        sendbutton.setText("Send");
        sendbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tyeofmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tyeofmessage)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(sendbutton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbuttonActionPerformed
        String message = messagetosend.getText();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String query = "";
        switch(messagetye)
        {
            case 1:
                query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', '" + sendingceid +  "', '" + timestamp + "', '" + message + "', '0', NULL, NULL, '1');";
                break;
            case 2:
                query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', '" + sendingceid +  "', '" + timestamp + "', '" + message + "', '0', NULL, NULL, '2');";
                break;
            case 3:
                query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', 'null', '" + timestamp + "', '" + message + "', '0', NULL, NULL, '3');";
                break;
        }
        System.out.println(query);
        try {
            db.stm.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_sendbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messagetosend;
    private javax.swing.JButton sendbutton;
    private javax.swing.JLabel tyeofmessage;
    // End of variables declaration//GEN-END:variables
}
