package parabitccasbharat.Utilities;

import DB.ParabitDBC;
import Models.PBTDataOfEmployee;
import Models.PBTHouseListingModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import parabitccasbharat.FieldWork.PBTHomeDashBoard;
import parabitccasbharat.PBTCurrentEmp;

public class PBTTypeOfHouse extends javax.swing.JFrame {
    ParabitDBC db;

    PBTHouseListingModel model = new PBTHouseListingModel();
    PBTDataOfEmployee employeedata;

    public PBTTypeOfHouse(String hlsno) {
        System.out.println(hlsno);
        this.employeedata = PBTCurrentEmp.getEmployeeData();
        if(this.employeedata==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.db = new ParabitDBC();
        model.getFromhlsno(Integer.parseInt(hlsno));
        initComponents();
        getAllFields();
    }
    
        public PBTTypeOfHouse(PBTHouseListingModel model) {
        this.employeedata = PBTCurrentEmp.getEmployeeData();
        if(this.employeedata==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.db = new ParabitDBC();
        this.model = model;
        initComponents();
        getAllFields();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Select :");

        jButton1.setText("Save and Proceed ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println(jComboBox1.getSelectedIndex());   
        setTypeOfHouse(jComboBox1.getSelectedIndex() + 1);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
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
                new PBTTypeOfHouse("1").setVisible(true);
            }
        });
    }

    private void getAllFields() {
        String query = "SELECT * FROM " + getTable() + "";
        DefaultComboBoxModel model = (DefaultComboBoxModel) jComboBox1.getModel();
        model.removeAllElements();
        try {
            db.rs1 = db.stm.executeQuery(query);
            while (db.rs1.next()) {
                String a = db.rs1.getString(2);
                model.addElement(a);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private String getTable(){
        switch(model.getUseofhouse()){
            case "1": return "typeofhouse";
            case "2": return "typeofhouse";
            case "3": return "typeofhouse";
            case "4": return "typeofhouse";
            case "5": return "typeofhouse";
            case "6": return "typeofhouse";
            case "7": return "typeofhouse";
            case "8": return "placeofworship";
            case "9": return "typeofhouse";
            default : return "typeofhouse";
        }
    }
}
