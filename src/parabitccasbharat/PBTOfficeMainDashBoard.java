
package parabitccasbharat;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.time.LocalTime;
import javax.swing.table.DefaultTableModel;


public class PBTOfficeMainDashBoard extends javax.swing.JFrame {

    PBTDataOfEmployee data;
    ParabitDBC db;
    
    public PBTOfficeMainDashBoard(PBTDataOfEmployee data) {
        initComponents();
        this.data = data;
        pername.setText(data.getName());
        db = new ParabitDBC();
        fetchDataOfnotification();
        clickListener();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        pername = new javax.swing.JLabel();
        manemp = new javax.swing.JButton();
        workass = new javax.swing.JButton();
        notify = new javax.swing.JButton();
        empsumm = new javax.swing.JButton();
        censumm = new javax.swing.JButton();
        notification = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablenotify = new javax.swing.JTable();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("Name : ");

        pername.setText("     ");

        manemp.setText("Manage Employee");
        manemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manempActionPerformed(evt);
            }
        });

        workass.setText("Work Assignment");
        workass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workassActionPerformed(evt);
            }
        });

        notify.setText("Notification");
        notify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyActionPerformed(evt);
            }
        });

        empsumm.setText("Employee Summary");
        empsumm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsummActionPerformed(evt);
            }
        });

        censumm.setText("Census Summary");
        censumm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                censummActionPerformed(evt);
            }
        });

        notification.setText("Notificatons : ");

        tablenotify.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From", "Message Id", "Time", "Message", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablenotify);
        if (tablenotify.getColumnModel().getColumnCount() > 0) {
            tablenotify.getColumnModel().getColumn(0).setMaxWidth(200);
            tablenotify.getColumnModel().getColumn(1).setMaxWidth(200);
            tablenotify.getColumnModel().getColumn(2).setMaxWidth(200);
            tablenotify.getColumnModel().getColumn(4).setMaxWidth(200);
        }

        logout.setText("Log out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notification)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(manemp)
                                .addGap(144, 144, 144)
                                .addComponent(workass)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notify, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(129, 129, 129)
                                .addComponent(empsumm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addComponent(censumm)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logout)
                                .addGap(49, 49, 49))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(pername)
                    .addComponent(logout))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manemp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empsumm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(censumm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(notification)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(792, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manempActionPerformed
    PBTManageEmp manageemp = new PBTManageEmp(data,this);
    manageemp.setVisible(true);
    }//GEN-LAST:event_manempActionPerformed

    private void workassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workassActionPerformed
        
    }//GEN-LAST:event_workassActionPerformed

    private void notifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyActionPerformed
    PBTSendNotification notify = new PBTSendNotification(this,data);
    notify.setVisible(true);
    }//GEN-LAST:event_notifyActionPerformed

    private void empsummActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsummActionPerformed
    PBTEmpSummary summary = new PBTEmpSummary(data,this,1);
    summary.setVisible(true);
    }//GEN-LAST:event_empsummActionPerformed

    private void censummActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_censummActionPerformed
        
    }//GEN-LAST:event_censummActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new PBTLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton censumm;
    private javax.swing.JButton empsumm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton manemp;
    private javax.swing.JLabel name;
    private javax.swing.JLabel notification;
    private javax.swing.JButton notify;
    private javax.swing.JLabel pername;
    private javax.swing.JTable tablenotify;
    private javax.swing.JButton workass;
    // End of variables declaration//GEN-END:variables

    private void fetchDataOfnotification() {
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
        String query2 = "SELECT * FROM `pbtnotification` WHERE MsgStatus = 0 and ((NotType = 1 and RecieverCeId = '" +  data.getCeid() + "') OR (NotType = 2 and SenderCeId IN (" + query3 + ")) OR (NotType = 3 and SenderCeId IN (" + query3 + ")))";
        System.out.println(query2);
        DefaultTableModel model = (DefaultTableModel)tablenotify.getModel();
        model.setRowCount(0);
        try {
            db.rs1 = db.stm.executeQuery(query2);
            while(db.rs1.next())
            {
                String from = db.rs1.getString("SenderCeId");
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
                Object row[] = {from, msgid, time, message, type};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clickListener() {
        tablenotify.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tablenotify.rowAtPoint(e.getPoint());
                String messageid = tablenotify.getValueAt(row, 1).toString();
                System.out.println(messageid);
                LocalTime localtime = LocalTime.now();
                String query = "UPDATE `pbtnotification` SET `MsgStatus` = 1 , `ReadTime` = '" + localtime + "' WHERE `NotId` = '" + messageid + "'";
                System.out.println(query);
                try {
                    db.stm.execute(query);
                    fetchDataOfnotification();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }
}
