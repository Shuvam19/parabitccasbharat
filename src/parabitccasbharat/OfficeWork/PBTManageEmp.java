package parabitccasbharat.OfficeWork;

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

        getContentPane().setLayout(null);

        newappoint.setText("New Appointment");
        newappoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newappointActionPerformed(evt);
            }
        });
        getContentPane().add(newappoint);
        newappoint.setBounds(10, 94, 117, 60);

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        getContentPane().add(transfer);
        transfer.setBounds(145, 94, 110, 60);

        appointed.setText("Appointed Employee");
        appointed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointedActionPerformed(evt);
            }
        });
        getContentPane().add(appointed);
        appointed.setBounds(273, 94, 131, 60);
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
