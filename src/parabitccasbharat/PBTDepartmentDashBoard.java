
package parabitccasbharat;

import parabitccasbharat.FieldWork.PBTSelectAreaForEnum;
import parabitccasbharat.OfficeWork.PBTOfficeDashBoard;
import Models.PBTDataOfEmployee;


public class PBTDepartmentDashBoard extends javax.swing.JDialog {
    
    PBTDataOfEmployee data;
    PBTLogin login;
    
    public PBTDepartmentDashBoard(PBTLogin login,PBTHome parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.login = login;
        if(data.getGrade() == 1 || data.getGrade() == 2 || data.getGrade() == 3 || data.getGrade() == 4)
        {
            field.setEnabled(false);
        }
        else
        {
            office.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        office = new javax.swing.JButton();
        field = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        office.setText("Census Office");
        office.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officeActionPerformed(evt);
            }
        });

        field.setText("Census Field");
        field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(office, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(office, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldActionPerformed
     /*   PBTFieldDashBoard dashBoard = new PBTFieldDashBoard(data);
        login.dispose();
        dashBoard.setVisible(true);*/
     PBTSelectAreaForEnum select = new PBTSelectAreaForEnum();
     login.dispose();
     select.setVisible(true);
    }//GEN-LAST:event_fieldActionPerformed

    private void officeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officeActionPerformed
        PBTOfficeDashBoard dashBoard = new PBTOfficeDashBoard();
        login.dispose();
        dashBoard.setVisible(true);
    }//GEN-LAST:event_officeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton field;
    private javax.swing.JButton office;
    // End of variables declaration//GEN-END:variables
}
