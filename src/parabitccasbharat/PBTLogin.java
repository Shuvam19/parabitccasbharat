
package parabitccasbharat;

import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PBTLogin extends javax.swing.JFrame {
    ParabitDBC db;
    String username,password;
    
    public PBTLogin() {
        initComponents();
        db = new ParabitDBC();
        tfemppass.setText("qwerty");
        tfotp.setText("1234");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfempid = new javax.swing.JTextField();
        tfemppass = new javax.swing.JTextField();
        tfotp = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Emploee ID :");

        jLabel2.setText("Password :");

        jLabel3.setText("OTP :");
        jLabel3.setVisible(false);

        tfempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfempidActionPerformed(evt);
            }
        });

        tfotp.setVisible(false);
        tfotp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfotpActionPerformed(evt);
            }
        });

        btnok.setText("Login");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btnsubmit.setText("SUBMIT");
        btnsubmit.setVisible(false);
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(tfempid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(tfemppass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(tfotp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnsubmit)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(tfempid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(tfemppass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnok)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(tfotp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnsubmit)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfempidActionPerformed
        
    }//GEN-LAST:event_tfempidActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        username = tfempid.getText().trim();
        password = tfemppass.getText().trim();
        String query = "SELECT * FROM `pbtemployeetable2` where ceid = '" + username + "' and pass = '" + password + "'";
        System.out.println(query);
        try {
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next())
            {
                jLabel3.setVisible(true);
                tfotp.setVisible(true);
                btnsubmit.setVisible(true);
            }
            else
            {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Error  Occurred");
                tfemppass.setText("");
                tfempid.setText("");
                this.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        String otp = tfotp.getText();
        try {
            String checkotp = db.rs1.getString("otp").trim();
            if(checkotp.equals(otp))
            {
                sendToNextFrameAfterLogin(db.rs1);
                
            }
            else
            {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "You Entered Wrong Otp");
                tfotp.setText("");
                this.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void tfotpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfotpActionPerformed
        
    }//GEN-LAST:event_tfotpActionPerformed

    
    public static void main(String args[]) {
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PBTLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PBTLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PBTLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PBTLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PBTLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField tfempid;
    private javax.swing.JTextField tfemppass;
    private javax.swing.JTextField tfotp;
    // End of variables declaration//GEN-END:variables

    private void switchrepceid(String username, int preceid) 
    {
        String query1 = "Update `pbtemployeetable2` set crepempid = '" + username + "' where crepempid = 'R" + preceid + "'";
        String query2 = "Update `pbtemployeetable2` set status = 1, note = null where ceid = '" + username + "'";
        System.out.println(query1);
        System.out.println(query2);
        try {
            db.stm.execute(query1);
            db.stm2.execute(query2);
            System.out.println("Done");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void sendToNextFrameAfterLogin(ResultSet rs1) throws SQLException {
        PBTDataOfEmployee data = getModel(rs1); 
        int status = rs1.getInt("status");
        int preceid = rs1.getInt("note");
        if(isEnumerator(data)){
            logEnumerator(data);
        }
        switch(status)
        {
            case -1:
                JOptionPane.showMessageDialog(null, "You are Not Allowed To Login");
                break;
            case 2:
                switchrepceid(username,preceid);
            case 1:
                PBTHome home = new PBTHome(this,data);
                this.setVisible(false);
                home.setVisible(true);
                break;
        }
    }

    private PBTDataOfEmployee getModel(ResultSet rs1) throws SQLException {
        int grade = rs1.getInt("grade");
        String name = rs1.getString("EmpName").trim();
        String crepempid = rs1.getString("CRepEmpId").trim();
        String pincode = rs1.getString("PIN");
        String acity = rs1.getString("AreaCity");
        String adist = rs1.getString("AreaDist");
        String astate = rs1.getString("AreaState");
        String Mobno = rs1.getString("EmpOffMob");
        return new PBTDataOfEmployee(username, crepempid, name, grade, pincode, acity, adist, astate, Mobno);
    }

    private boolean isEnumerator(PBTDataOfEmployee data) {
        return data.getGrade()==5;
    }

    private void logEnumerator(PBTDataOfEmployee data) {
        String Query = "INSERT INTO `pbtempdailylog` VALUES (NULL, " + data.getCeid() + ", CURDATE(), CURRENT_TIME(), NULL, 0, 0, NULL, NULL, NULL, NULL);";
        try {
            db.stm2.execute(Query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
