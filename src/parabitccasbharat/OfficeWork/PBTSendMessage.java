
package parabitccasbharat.OfficeWork;

import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.text.DateFormatter;
import parabitccasbharat.PBTCurrentEmp;

public class PBTSendMessage<T> extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    T parent;
    String sendingceid;
    int messagetye;
    ParabitDBC db;
    
    public PBTSendMessage(T parent,int messagetype,String sendingceid) 
    {
        super((JFrame)parent,true);
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.parent = parent;
        this.sendingceid = sendingceid;
        this.messagetye = messagetype;
        db = new ParabitDBC();
        switch(messagetype)
        {
            case 1:
                tyeofmessage.setText("Individual Message");
                messageend.setVisible(false);
                deadline.setVisible(false);
                break;
            case 2:
                tyeofmessage.setText("Chain Message");
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
        deadline = new com.toedter.calendar.JDateChooser();
        messageend = new javax.swing.JLabel();

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

        messageend.setText("Choose the deadline of the message :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tyeofmessage, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(messageend)
                        .addGap(18, 18, 18)
                        .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tyeofmessage)
                        .addComponent(messageend))
                    .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
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
        String query = "";
        switch(messagetye)
        {
            case 1:
                query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', '" + sendingceid +  "', CURRENT_TIMESTAMP , '" + message + "', '0', NULL, NULL, '1');";
                break;
            case 2:
                String date = toDate(deadline.getDate().toString());
                query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', '" + sendingceid +  "', CURRENT_TIMESTAMP , '" + message + "', '0', '" + date + "', NULL, '2');";
                break;
            case 3:
                String lastdate = toDate(deadline.getDate().toString());
                query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', NULL , CURRENT_TIMESTAMP , '" + message + "', '0', '" + lastdate + "', NULL, '3');";
                break;
        }
        System.out.println(query);
        try 
        {
            db.stm.execute(query);
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        this.dispose();
    }//GEN-LAST:event_sendbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser deadline;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageend;
    private javax.swing.JTextArea messagetosend;
    private javax.swing.JButton sendbutton;
    private javax.swing.JLabel tyeofmessage;
    // End of variables declaration//GEN-END:variables

    
    public static String toDate(String Datestr)
    {
        DateFormat format = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
        Date date;
        try {
            date = (Date)format.parse(Datestr);
            //System.out.println(format);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            String formatedDate = calendar.get(Calendar.YEAR) + "-" + (calendar.get(Calendar.MONTH) + 1) + "-" + calendar.get(Calendar.DATE) ;
            return formatedDate;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return "";
    }
}
