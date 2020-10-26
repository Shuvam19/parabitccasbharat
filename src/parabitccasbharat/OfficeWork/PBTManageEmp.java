package parabitccasbharat.OfficeWork;

import parabitccasbharat.OfficeWork.PBTAppointedEmp;
import parabitccasbharat.OfficeWork.PBTNewAppointment;
import parabitccasbharat.OfficeWork.PBTOfficeMainDashBoard;
import Models.PBTDataOfEmployee;
import parabitccasbharat.PBTCurrentEmp;

public class PBTManageEmp extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    PBTOfficeMainDashBoard dashboard;
    public PBTManageEmp(PBTOfficeMainDashBoard dashboard) {
        super(dashboard,true);
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.dashboard = dashboard;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newappoint = new javax.swing.JButton();
        transfer = new javax.swing.JButton();
        appointed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        newappoint.setText("New Appointment");
        newappoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newappointActionPerformed(evt);
            }
        });

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });

        appointed.setText("Appointed Employee");
        appointed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newappoint)
                .addGap(18, 18, 18)
                .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(appointed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appointed, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newappoint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        PBTAppointedEmp appointed = new PBTAppointedEmp(dashboard,2);
        appointed.setVisible(true);
    }//GEN-LAST:event_transferActionPerformed

    private void newappointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newappointActionPerformed
        PBTNewAppointment appoint = new PBTNewAppointment(dashboard);
        appoint.setVisible(true);
    }//GEN-LAST:event_newappointActionPerformed

    private void appointedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointedActionPerformed
        PBTAppointedEmp appointed = new PBTAppointedEmp(dashboard,1);
        appointed.setVisible(true);
    }//GEN-LAST:event_appointedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointed;
    private javax.swing.JButton newappoint;
    private javax.swing.JButton transfer;
    // End of variables declaration//GEN-END:variables
}
