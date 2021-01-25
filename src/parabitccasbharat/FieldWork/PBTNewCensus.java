package parabitccasbharat.FieldWork;

import DB.ParabitDBC;
import Models.PBTDataOfEmployee;
import Models.PBTIndustry;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import parabitccasbharat.PBTCurrentEmp;


public class PBTNewCensus<T> extends javax.swing.JFrame {

    private final T parent;
    private final PBTDataOfEmployee data;
    private final ParabitDBC db = new ParabitDBC();
    
    public PBTNewCensus(T parent) {
        initComponents();
        this.parent = parent;
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
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
        industrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                industrialActionPerformed(evt);
            }
        });

        land.setText("Land");
        land.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(industrial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(industrial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void houselistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houselistingActionPerformed
        PBTTypeOfHome newhome = new PBTTypeOfHome(parent);
        newhome.setVisible(true);
    }//GEN-LAST:event_houselistingActionPerformed

    private void industrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_industrialActionPerformed
        String icsno = JOptionPane.showInputDialog("Enter ICSNo First");
        if(icsno!=null && !icsno.isEmpty()) {
            if(checkIsPresentPreviously(icsno)){
                InsertItAndSendToNextFrame(icsno);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Please Enter ICSNo First");
            industrialActionPerformed(evt);
        }
    }//GEN-LAST:event_industrialActionPerformed

    private void landActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_landActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton houselisting;
    private javax.swing.JButton industrial;
    private javax.swing.JButton land;
    // End of variables declaration//GEN-END:variables

    private boolean checkIsPresentPreviously(String icsno) {
        try {
            String query = "SELECT * From `pbtindustry` where icsno ='" + icsno + "'";
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next()){
                JOptionPane.showMessageDialog(null, "This Company is Previously Registered \n Please Complete it in Incomplete Census Or It has been Completed Successfully");
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTNewCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void InsertItAndSendToNextFrame(String icsno) {
        try {
            String query = "INSERT INTO `pbtindustry` (`SNo`, `ICSNo`, `RegWith`, `RegNo`, `NameOfBusiness`, `CompANo`, `CompOwnrANo`, `CompRegDate`, `OfficeType`, `FSSAINo`, `EnvCertNo`, `AreaOfComp`, `TurnOverOfComp`, `FnlProdOfComp`, `PrsntCEOofComp`, `NoOfMaleEmp`, `NoOfFemEMp`, `NoOfOtherEmp`, `MinSalOfComp`, `MaxSalOfComp`, `NoOfShift`, `ExportProd`, `GSTNo`, `MainSrcLight`, `MainSrc_WatForIndus`, `MainSrc_DrnkWat_inIndus`, `NoOfWash_inIndus`, `AvbOfCant`, `NearestPS`, `NearestHsp`, `NearestFireBrgd`, `NearestRail`, `NearestBusStp`, `NearestArprt`, `NearestTrnsprtAr`, `AvbOfMedFac_InsdComp`) VALUES (NULL, ?, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)";
            PreparedStatement stmt = db.con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, icsno);
            int isUpdated = stmt.executeUpdate();
            System.out.println(isUpdated);
            if (isUpdated == 1) {
                db.rs2 = stmt.getGeneratedKeys();
                if(db.rs2.next()){
                    String sno = db.rs2.getString(1);
                    makeObjectAndSendToNextFrame(sno);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTNewCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void makeObjectAndSendToNextFrame(String sno) {
        try {
            String query = "SELECT * FROM `pbtindustry` where sno = '" + sno + "'";
            db.rs3 = db.stm2.executeQuery(query);
            if(db.rs3.next()){
                PBTIndustry industryData = new PBTIndustry();
                industryData.setIcsno(db.rs3.getInt(2));
                sendToNextFrame(industryData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTNewCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendToNextFrame(PBTIndustry industryData) {
        PBTIndustrialCensus frame = new PBTIndustrialCensus(this,industryData);
        this.dispose();
        frame.setVisible(true);
    }
}
