package parabitccasbharat;


public class PBTNewCensus<T> extends javax.swing.JFrame {

    T parent;
    PBTDataOfEmployee data;
    public PBTNewCensus(T parent,PBTDataOfEmployee data) {
        initComponents();
        this.parent = parent;
        this.data = data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        houselisting = new javax.swing.JButton();
        industrial = new javax.swing.JButton();
        land = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        houselisting.setText("House Listing");
        houselisting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houselistingActionPerformed(evt);
            }
        });

        industrial.setText("Industrial Census");

        land.setText("Land");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(industrial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(industrial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void houselistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houselistingActionPerformed
        PBTTypeOfHome newhome = new PBTTypeOfHome(parent,data);
        newhome.setVisible(true);
        
        PBTHouseHoldModel model = new PBTHouseHoldModel();
        model.toUpdateQuery(model.toHashMap());
    }//GEN-LAST:event_houselistingActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton houselisting;
    private javax.swing.JButton industrial;
    private javax.swing.JButton land;
    // End of variables declaration//GEN-END:variables
}
