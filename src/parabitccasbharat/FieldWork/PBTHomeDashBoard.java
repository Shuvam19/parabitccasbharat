/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat.FieldWork;

import DB.ParabitDBC;
import Models.PBTDataOfEmployee;
import Models.PBTHouseHoldModel;
import Models.PBTHouseListingModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import parabitccasbharat.PBTCurrentEmp;

/**
 *
 * @author acer
 */
public class PBTHomeDashBoard extends javax.swing.JFrame {

    PBTHouseListingModel listingmodel;
    List<PBTHouseHoldModel> listofpeople = new ArrayList<>();
    ParabitDBC db;
    PBTDataOfEmployee employeedata;
    public PBTHomeDashBoard(PBTHouseListingModel model) {
        initComponents();
        this.employeedata = PBTCurrentEmp.getEmployeeData();
        if(this.employeedata==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.listingmodel = model;
        this.db = new ParabitDBC();
        getAllPersonFromHome();
        setToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        familyinformation = new javax.swing.JTable();
        houselistingbutton = new javax.swing.JButton();
        finallock = new javax.swing.JButton();
        exitwithsave = new javax.swing.JButton();
        addnewmember = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        familyinformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Title 3", "Title 4"
            }
        ));
        familyinformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                familyinformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(familyinformation);

        houselistingbutton.setText("Information Of House");
        houselistingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houselistingbuttonActionPerformed(evt);
            }
        });

        finallock.setText("Final Lock");
        finallock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finallockActionPerformed(evt);
            }
        });

        exitwithsave.setText("Save & Exit With Note");
        exitwithsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitwithsaveActionPerformed(evt);
            }
        });

        addnewmember.setText("Add new Member");
        addnewmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewmemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitwithsave)
                        .addGap(18, 18, 18)
                        .addComponent(finallock, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(houselistingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addnewmember)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(houselistingbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addnewmember))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitwithsave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finallock, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void houselistingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houselistingbuttonActionPerformed
        PBTHouseListDashboard dashboard = new PBTHouseListDashboard(listingmodel);
        dashboard.setVisible(true);
    }//GEN-LAST:event_houselistingbuttonActionPerformed

    private void familyinformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_familyinformationMouseClicked
        PBTPersonInfoDashBoard dashboard = new PBTPersonInfoDashBoard(listofpeople.get(familyinformation.rowAtPoint(evt.getPoint())),listingmodel);
        dashboard.setVisible(true);
    }//GEN-LAST:event_familyinformationMouseClicked

    private void addnewmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewmemberActionPerformed
        PBTPersonInfoDashBoard dashboard = new PBTPersonInfoDashBoard(new PBTHouseHoldModel(),listingmodel);
        dashboard.setVisible(true);
    }//GEN-LAST:event_addnewmemberActionPerformed

    private void exitwithsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitwithsaveActionPerformed
        
    }//GEN-LAST:event_exitwithsaveActionPerformed

    private void finallockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finallockActionPerformed
        if(checkEverything()){
            finalLockCensus();
        }
    }//GEN-LAST:event_finallockActionPerformed

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
                //new PBTHomeDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnewmember;
    private javax.swing.JButton exitwithsave;
    private javax.swing.JTable familyinformation;
    private javax.swing.JButton finallock;
    private javax.swing.JButton houselistingbutton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void getAllPersonFromHome() {
        String query = "Select * from `pbtcensus_household` where hl_sno = '" + listingmodel.getHl_sno() + "'";
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next()){
                PBTHouseHoldModel model = new PBTHouseHoldModel();
                model.getDataFromhhsno(db.rs1.getString("hh_sno"));
                listofpeople.add(model);
          }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void setToTable() {
        DefaultTableModel model = (DefaultTableModel)familyinformation.getModel();
        model.setRowCount(0);
        for(int i=0;i<listofpeople.size();i++){
            String name = listofpeople.get(i).getName();
            String age = listofpeople.get(i).getAge();
            Object row[] = {name,age,null,null};
            model.addRow(row);
        }
    }

    private boolean checkEverything() {
        return true;
    }

    private void finalLockCensus() {
        updateHouseHold();
        updateHouselisting();
        if (employeedata!=null){
            updateDailyLog();
            updateEmpSchedule();
        }
    }

    private void updateHouseHold() {
        for(int i=0;i<listofpeople.size();i++){
            String query = "UPDATE `pbtcensus_household` SET `Status` = '1' WHERE HH_SNo = '" + listofpeople.get(i).getHh_sno() + "';";
            try {
                db.stm2.execute(query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void updateHouselisting() {
        String query = "UPDATE `pbtcensus_houselisting` SET `Status` = '1' WHERE Hl_SNo = '" + listingmodel.getHl_sno() + "';";
        try {
            db.stm2.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateEmpSchedule() {
        String query = "UPDATE `pbtempschecdule` SET WorkDone = WorkDone + 1 WHERE CEID = '" + employeedata.getCeid() + "' AND city_vill = " + employeedata.getAreacity() + ";";
        try {
            db.stm2.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void updateDailyLog() {
        String query = "UPDATE `pbtempdailylog` SET NoOfFormsSub = NoOfFormsSub + " + listofpeople.size() + " WHERE CEID = '" + employeedata.getCeid() + "' AND LogOutTime IS NULL;";
        try {
            db.stm2.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
