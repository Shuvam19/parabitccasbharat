
package parabitccasbharat;


public class PBTOfficeMainDashBoard extends javax.swing.JFrame {

    PBTDataOfEmployee data;
    ParabitDBC db;
    PBTNotifications notifications;
    
    public PBTOfficeMainDashBoard(PBTDataOfEmployee data) {
        initComponents();
        this.data = data;
        pername.setText(data.getName());
        db = new ParabitDBC();
        this.notifications = new PBTNotifications(data);
        notifications.fetchDataOfnotification(tablenotify);
        notifications.clickEvents(tablenotify);
        if(data.getGrade() != 4)
            workass.setVisible(false);
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
    PBTWorkAssignDashboard dashboard = new PBTWorkAssignDashboard(data, this);
    dashboard.setVisible(true);
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
}
