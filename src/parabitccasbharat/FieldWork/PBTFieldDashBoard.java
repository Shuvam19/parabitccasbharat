
package parabitccasbharat.FieldWork;

import DB.ParabitDBC;
import java.sql.SQLException;
import Models.PBTDataOfEmployee;
import Models.PBTDataScheduledToEmp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import parabitccasbharat.OfficeWork.PBTNotifications;
import parabitccasbharat.OfficeWork.PBTSendNotification;
import parabitccasbharat.PBTCurrentEmp;
import parabitccasbharat.PBTLogin;


public class PBTFieldDashBoard extends javax.swing.JFrame {

    PBTDataOfEmployee data;
    PBTDataScheduledToEmp sno;
    ParabitDBC db;
    PBTNotifications notify;

    public PBTFieldDashBoard(PBTDataScheduledToEmp sno) {
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.sno = sno;
        this.db = new ParabitDBC();
        initComponents();
        fetchLabels();
        this.notify = new PBTNotifications(data);
        notify.fetchDataOfnotification(notifications);
        notify.clickEvents(notifications);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        empname = new javax.swing.JLabel();
        populationalloted = new javax.swing.JLabel();
        popcompleted = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        popremaining = new javax.swing.JLabel();
        hhcompleted = new javax.swing.JLabel();
        newcensus = new javax.swing.JButton();
        incompcensus = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notifications = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Name :");

        jLabel2.setText("Alloted Population:");

        jLabel3.setText("Completed Population:");

        jLabel4.setText("Remaining Population:");

        empname.setText("         ");

        populationalloted.setText("          ");

        popcompleted.setText("              ");

        jLabel8.setText("Houses Done:");

        popremaining.setText("                   ");

        hhcompleted.setText("                ");

        newcensus.setText("New Census");
        newcensus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcensusActionPerformed(evt);
            }
        });

        incompcensus.setText("Incomplete Census");
        incompcensus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incompcensusActionPerformed(evt);
            }
        });

        jButton3.setText("Notification");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        notifications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "From", "MessageID", "Time", "Message", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(notifications);
        if (notifications.getColumnModel().getColumnCount() > 0) {
            notifications.getColumnModel().getColumn(0).setMaxWidth(250);
            notifications.getColumnModel().getColumn(1).setMaxWidth(250);
            notifications.getColumnModel().getColumn(2).setMaxWidth(250);
            notifications.getColumnModel().getColumn(4).setMaxWidth(250);
        }

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(populationalloted))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(popcompleted))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(popremaining))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(hhcompleted))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(empname, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(newcensus, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(incompcensus)
                                .addGap(103, 103, 103)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(empname)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(populationalloted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(popcompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(popremaining))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(hhcompleted))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newcensus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incompcensus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newcensusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcensusActionPerformed
        PBTCensus newcensus = new PBTCensus(this,new PBTCensus.ClickListener<JFrame>() {
            @Override
            public void onHouseListingCensus(JFrame parent) {
                PBTTypeOfHome newhome = new PBTTypeOfHome(parent);
                newhome.setVisible(true);
            }
        });
        newcensus.setVisible(true);
    }//GEN-LAST:event_newcensusActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PBTSendNotification notification = new PBTSendNotification(this);
        notification.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void incompcensusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incompcensusActionPerformed
        PBTCensus newcensus = new PBTCensus(this,new PBTCensus.ClickListener<JFrame>() {
            @Override
            public void onHouseListingCensus(JFrame parent) {
                PBTIncompleteCensus frame = new PBTIncompleteCensus();
                frame.setVisible(true);
            }
        });
        newcensus.setVisible(true);
    }//GEN-LAST:event_incompcensusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        logoutUser();
        new PBTLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        data.logoutEnumerator();
    }//GEN-LAST:event_formWindowClosing

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel empname;
    private javax.swing.JLabel hhcompleted;
    private javax.swing.JButton incompcensus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newcensus;
    private javax.swing.JTable notifications;
    private javax.swing.JLabel popcompleted;
    private javax.swing.JLabel popremaining;
    private javax.swing.JLabel populationalloted;
    // End of variables declaration//GEN-END:variables

    private void fetchLabels() {
        populationalloted.setText(sno.getToppopulation());
        popcompleted.setText(sno.getWorkdone());
        System.out.println(sno.toString());
        int remaining = Integer.parseInt(sno.getToppopulation()) - Integer.parseInt(sno.getWorkdone());
        popremaining.setText(" " + remaining);
        String noofhh = "0";
        hhcompleted.setText(noofhh);
    }

    private void logoutUser() {
        String query = "UPDATE `pbtempdailylog` SET LogOutTime = NOW() WHERE CEID = '" + data.getCeid() + "' AND LogOutTime IS NULL;";
        try {
            db.stm.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
