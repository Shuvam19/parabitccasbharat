package parabitccasbharat;

import Models.PBTHouseListingModel;

public class PBTTypeOfHouse extends javax.swing.JFrame {

    PBTHouseListingModel model = new PBTHouseListingModel();
    public PBTTypeOfHouse(String hlsno) {
        System.out.println(hlsno);
        model.getFromhlsno(Integer.parseInt(hlsno));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fixed = new javax.swing.JToggleButton();
        mobile = new javax.swing.JToggleButton();
        bunker = new javax.swing.JToggleButton();
        floating = new javax.swing.JToggleButton();
        shadow = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(fixed);
        fixed.setText("Fixed House");
        fixed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixedActionPerformed(evt);
            }
        });

        buttonGroup1.add(mobile);
        mobile.setText("Mobile House");
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });

        buttonGroup1.add(bunker);
        bunker.setText("Bunker House");
        bunker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bunkerActionPerformed(evt);
            }
        });

        buttonGroup1.add(floating);
        floating.setText("Floating House");
        floating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floatingActionPerformed(evt);
            }
        });

        buttonGroup1.add(shadow);
        shadow.setText("Shadow House");
        shadow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shadowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fixed)
                        .addGap(18, 18, 18)
                        .addComponent(mobile)
                        .addGap(18, 18, 18)
                        .addComponent(bunker))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(floating)
                        .addGap(18, 18, 18)
                        .addComponent(shadow)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bunker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fixed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floating, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shadow, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        setTypeOfHouse(2);
    }//GEN-LAST:event_mobileActionPerformed

    private void fixedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixedActionPerformed
        setTypeOfHouse(1);
    }//GEN-LAST:event_fixedActionPerformed

    private void bunkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bunkerActionPerformed
        setTypeOfHouse(3);
    }//GEN-LAST:event_bunkerActionPerformed

    private void floatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floatingActionPerformed
        setTypeOfHouse(4);
    }//GEN-LAST:event_floatingActionPerformed

    private void shadowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shadowActionPerformed
        setTypeOfHouse(5);
    }//GEN-LAST:event_shadowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton bunker;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JToggleButton fixed;
    private javax.swing.JToggleButton floating;
    private javax.swing.JToggleButton mobile;
    private javax.swing.JToggleButton shadow;
    // End of variables declaration//GEN-END:variables

    private void setTypeOfHouse(int i) {
        model.setTypeofhouse(i);
        PBTHomeDashBoard dashboard = new PBTHomeDashBoard(model);
        dashboard.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PBTHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PBTHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PBTHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PBTHomeDashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PBTTypeOfHouse("8").setVisible(true);
            }
        });
    }
}
