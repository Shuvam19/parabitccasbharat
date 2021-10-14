package parabitccasbharat.OfficeWork;

import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import parabitccasbharat.Custom.RoundedPanel;
import parabitccasbharat.PBTCurrentEmp;
import parabitccasbharat.PBTLogin;

public class PBTOfficeMainDashBoard extends javax.swing.JFrame {

    PBTDataOfEmployee data;
    ParabitDBC db;
    PBTNotifications notifications;

    public PBTOfficeMainDashBoard() {
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if (this.data == null) {
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        pername.setText(data.getName());
        db = new ParabitDBC();
        this.notifications = new PBTNotifications(data);
//        notifications.fetchDataOfnotification(tablenotify);
//        notifications.clickEvents(tablenotify);
        if (data.getGrade() != 4) {
            workass.setVisible(false);
        }
        JPanel jpanel = new PBTManageEmployee(this);
        addPanelToTransactionalPanel(jpanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedPanel(15,Color.GREEN);
        manemp = new javax.swing.JButton();
        workass = new javax.swing.JButton();
        empsumm = new javax.swing.JButton();
        notify = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        pername = new javax.swing.JLabel();
        transactionalPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        manemp.setText("Manage Employee");
        manemp.setBorder(null);
        manemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manempActionPerformed(evt);
            }
        });

        workass.setText("Work Assignment");
        workass.setBorder(null);
        workass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workassActionPerformed(evt);
            }
        });

        empsumm.setText("Employee Summary");
        empsumm.setBorder(null);
        empsumm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsummActionPerformed(evt);
            }
        });

        notify.setText("Notification");
        notify.setBorder(null);
        notify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyActionPerformed(evt);
            }
        });

        logout.setText("Log out");
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        name.setText("Name : ");

        pername.setFont(new java.awt.Font("Berlin Sans FB", 0, 15)); // NOI18N
        pername.setText(" shuvam    ");

        transactionalPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(notify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manemp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empsumm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(workass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transactionalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 607, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(manemp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(empsumm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(notify, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(workass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(178, Short.MAX_VALUE))
                    .addComponent(transactionalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(982, 520));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void manempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manempActionPerformed
        JPanel jpanel = new PBTManageEmployee(this);
        addPanelToTransactionalPanel(jpanel);
    }//GEN-LAST:event_manempActionPerformed

    private void workassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workassActionPerformed
        JPanel jpanel = new PBTWorkAssignDashboard(this);
        addPanelToTransactionalPanel(jpanel);
    }//GEN-LAST:event_workassActionPerformed

    private void notifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyActionPerformed
        JPanel jpanel = new PBTSendNotification(this);
        addPanelToTransactionalPanel(jpanel);
    }//GEN-LAST:event_notifyActionPerformed

    private void empsummActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsummActionPerformed
        PBTEmpSummary summary = PBTEmpSummary.getSummaryInstance(this);
        summary.setVisible(true);
    }//GEN-LAST:event_empsummActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new PBTLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empsumm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton manemp;
    private javax.swing.JLabel name;
    private javax.swing.JButton notify;
    private javax.swing.JLabel pername;
    private javax.swing.JPanel transactionalPanel;
    private javax.swing.JButton workass;
    // End of variables declaration//GEN-END:variables

    private void addPanelToTransactionalPanel(JPanel jpanel) {
        transactionalPanel.removeAll();
        transactionalPanel.add(jpanel);
        transactionalPanel.repaint();
        transactionalPanel.revalidate();
    }

}
