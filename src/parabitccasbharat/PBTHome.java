/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

/**
 *
 * @author acer
 */
public class PBTHome extends javax.swing.JDialog {
    
    PBTDataOfEmployee data;
    PBTLogin login;
    public PBTHome(PBTLogin login,PBTDataOfEmployee data) {
        super(login,true);
        this.login = login;
        this.data = data;
        initComponents();
        switch (data.getGrade()) {
            case 100:
                censusdepartent.setEnabled(false);
                ministry.setEnabled(false);
                break;
            case 200:
                pmo.setEnabled(false);
                censusdepartent.setEnabled(false);
                break;
            default:
                pmo.setEnabled(false);
                ministry.setEnabled(false);
                break;
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmo = new javax.swing.JButton();
        ministry = new javax.swing.JButton();
        censusdepartent = new javax.swing.JButton();

        pmo.setText("PMO");
        pmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmoActionPerformed(evt);
            }
        });

        ministry.setText("Ministry");
        ministry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ministryActionPerformed(evt);
            }
        });

        censusdepartent.setText("Census Department");
        censusdepartent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                censusdepartentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pmo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ministry, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(censusdepartent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pmo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ministry, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(censusdepartent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmoActionPerformed

    }//GEN-LAST:event_pmoActionPerformed

    private void ministryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ministryActionPerformed

    }//GEN-LAST:event_ministryActionPerformed

    private void censusdepartentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_censusdepartentActionPerformed
    PBTDepartmentDashBoard dashBoard = new PBTDepartmentDashBoard(login,this,true,data);
    this.setVisible(false);
    dashBoard.setVisible(true);
    //this.setVisible(true);
    }//GEN-LAST:event_censusdepartentActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton censusdepartent;
    private javax.swing.JButton ministry;
    private javax.swing.JButton pmo;
    // End of variables declaration//GEN-END:variables
}
