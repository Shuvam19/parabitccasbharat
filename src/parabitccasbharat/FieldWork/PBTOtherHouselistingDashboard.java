package parabitccasbharat.FieldWork;

import Models.PBTHouseListingModel;
import parabitccasbharat.Utilities.PBTTextWatchers;
import java.util.HashMap;
import javax.swing.JFrame;
import parabitccasbharat.Utilities.PBTCoolingHeatFacility;
import parabitccasbharat.Utilities.PBTMobilePhone;
import parabitccasbharat.Utilities.PBTNumerical;
import parabitccasbharat.Utilities.PBTPersonalComputer;
import parabitccasbharat.Utilities.PBTTelephone;
import parabitccasbharat.Utilities.PBTTelivision;
import parabitccasbharat.Utilities.PBTTypeOfSignal;
import parabitccasbharat.Utilities.PBTUtilities;


public class PBTOtherHouselistingDashboard<T> extends javax.swing.JDialog {

    PBTHouseListingModel houselistingdata;
    PBTTextWatchers textwatcher;
    HashMap<String, Object> updatemap = new HashMap<>();
    public PBTOtherHouselistingDashboard(PBTHouseListingModel houselistingdata,T parent) {
        super((JFrame)parent,true);
        initComponents();
        this.textwatcher = new PBTTextWatchers();
        this.houselistingdata = houselistingdata;
        addTextWatchers();
        setAllLabels();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        radioyes = new javax.swing.JRadioButton();
        radiono = new javax.swing.JRadioButton();
        fmyes = new javax.swing.JRadioButton();
        fmno = new javax.swing.JRadioButton();
        refrigyes = new javax.swing.JRadioButton();
        refrigno = new javax.swing.JRadioButton();
        television = new javax.swing.JTextField();
        typeofsignal = new javax.swing.JTextField();
        coolingheat = new javax.swing.JTextField();
        pc = new javax.swing.JTextField();
        broadband = new javax.swing.JTextField();
        mobilephone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bicycle = new javax.swing.JTextField();
        r2wheel = new javax.swing.JTextField();
        r4wheel = new javax.swing.JTextField();
        commonveh = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Animal Information (If Available) :");

        jLabel2.setText("Radio Avaiable in House :");

        jLabel3.setText("Fm Available in House :");

        jLabel4.setText("Refrigerator Available in House :");

        jLabel5.setText("Type Of Television :");

        jLabel6.setText("Type of Signal :");

        jLabel7.setText("Cooling/Heating Facility :");

        jLabel8.setText("Personal Computer Details :");

        jLabel9.setText("Telephone/BroadBand Details :");

        jLabel10.setText("Mobile Phone Details :");

        jLabel11.setText("Bicycle Details :");

        jLabel12.setText("Registered 2 Wheelers :");

        jLabel13.setText("Registered 4 Wheelers :");

        jLabel14.setText("Total  no Of Comercial Vehicles :");

        buttonGroup1.add(radioyes);
        radioyes.setText("Yes");

        buttonGroup1.add(radiono);
        radiono.setText("No");

        buttonGroup2.add(fmyes);
        fmyes.setText("Yes");
        fmyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmyesActionPerformed(evt);
            }
        });

        buttonGroup2.add(fmno);
        fmno.setText("No");

        buttonGroup3.add(refrigyes);
        refrigyes.setText("Yes");

        buttonGroup3.add(refrigno);
        refrigno.setText("No");

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Select");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Select");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Select");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Select");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Save");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Num");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(typeofsignal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(broadband, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(mobilephone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(television, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(radioyes)
                                .addGap(0, 0, 0)
                                .addComponent(radiono))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(fmyes)
                                .addGap(0, 0, 0)
                                .addComponent(fmno))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(refrigyes)
                                .addGap(0, 0, 0)
                                .addComponent(refrigno)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(bicycle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(r2wheel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(r4wheel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(commonveh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(coolingheat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addComponent(radioyes)
                            .addComponent(radiono))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addComponent(fmyes)
                            .addComponent(fmno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel4))
                            .addComponent(refrigyes)
                            .addComponent(refrigno)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bicycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(r2wheel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(r4wheel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(commonveh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9)
                            .addComponent(jLabel14))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(television, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(typeofsignal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(coolingheat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(broadband, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(mobilephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PBTTelivision frame = new PBTTelivision(houselistingdata,this);
        frame.setVisible(true);
        television.setText(PBTUtilities.getTv("" + houselistingdata.getTv()));
        updatemap.put("Tv", houselistingdata.getTv());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PBTTypeOfSignal frame = new PBTTypeOfSignal(houselistingdata,this);
        frame.setVisible(true);
        typeofsignal.setText(PBTUtilities.getTvsig("" + houselistingdata.getTv()));
        updatemap.put("Tvsig", houselistingdata.getTvsig());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PBTCoolingHeatFacility frame = new PBTCoolingHeatFacility(houselistingdata,this);
        frame.setVisible(true);
        coolingheat.setText(PBTUtilities.getCoolheatfact("" +houselistingdata.getCoolheatfact()));
        updatemap.put("Coolheatfact", houselistingdata.getCoolheatfact());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PBTPersonalComputer frame = new PBTPersonalComputer(houselistingdata,this);
        frame.setVisible(true);
        pc.setText(PBTUtilities.getPc("" +houselistingdata.getPc()));
        updatemap.put("Pc", houselistingdata.getPc());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PBTTelephone frame = new PBTTelephone(houselistingdata,this);
        frame.setVisible(true);
        broadband.setText(PBTUtilities.getTelebroadband("" +houselistingdata.getTelebroadband()));
        updatemap.put("Telebroadband", houselistingdata.getTelebroadband());
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        PBTMobilePhone frame = new PBTMobilePhone(houselistingdata,this);
        frame.setVisible(true);
        mobilephone.setText(PBTUtilities.getPhone("" +houselistingdata.getMob()));
        updatemap.put("Phone", houselistingdata.getMob());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void fmyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmyesActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        PBTNumerical frame = new PBTNumerical(this);
        frame.setVisible(true);
        if(frame.getAns()!=-1){
            commonveh.setText("" + frame.getAns());
            houselistingdata.setTnocommveh(frame.getAns());
            updatemap.put("Tnocommveh", frame.getAns());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.out.println(houselistingdata.toUpdateQuery(updatemap));
        houselistingdata.update(houselistingdata.toUpdateQuery(updatemap));
        houselistingdata.getFromhlsno(houselistingdata.getHl_sno());
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(PBTOtherHouselistingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PBTOtherHouselistingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PBTOtherHouselistingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PBTOtherHouselistingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PBTOtherHouselistingDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bicycle;
    private javax.swing.JTextField broadband;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField commonveh;
    private javax.swing.JTextField coolingheat;
    private javax.swing.JRadioButton fmno;
    private javax.swing.JRadioButton fmyes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobilephone;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField r2wheel;
    private javax.swing.JTextField r4wheel;
    private javax.swing.JRadioButton radiono;
    private javax.swing.JRadioButton radioyes;
    private javax.swing.JRadioButton refrigno;
    private javax.swing.JRadioButton refrigyes;
    private javax.swing.JTextField television;
    private javax.swing.JTextField typeofsignal;
    // End of variables declaration//GEN-END:variables

    private void addTextWatchers() {
        textwatcher.addYesNolistener(radioyes, radiono, updatemap, "Radio");
        textwatcher.addYesNolistener(fmyes, fmno, updatemap, "Fm");
        textwatcher.addYesNolistener(refrigyes, refrigno, updatemap, "Refrigerator");
        textwatcher.addNumberTextWatcher(r2wheel, updatemap, "R2wheel");
        textwatcher.addNumberTextWatcher(r4wheel, updatemap, "R4wheel");
    }

    private void setAllLabels() {
        /*if(houselistingdata.geta()!=null){
            animal information   
        }*/
        if(houselistingdata.getRadio()!=null){
            if(houselistingdata.getRadio().equals("Y")){
                radioyes.setSelected(true);
            }else{
                radiono.setSelected(true);
            }
        }
        if(houselistingdata.getFm()!=null){
            if(houselistingdata.getFm().equals("Y")){
                fmyes.setSelected(true);
            }else{
                fmno.setSelected(true);
            }
        }
        if(houselistingdata.getRefrigerator()!=null){
            if(houselistingdata.getRefrigerator().equals("Y")){
                refrigyes.setSelected(true);
            }else{
                refrigno.setSelected(true);
            }
        }
        if(houselistingdata.getTv()!=0){
            television.setText(PBTUtilities.getTv("" + houselistingdata.getTv()));
        }
        if(houselistingdata.getTvsig()!=0){
            typeofsignal.setText(PBTUtilities.getTvsig("" + houselistingdata.getTvsig()));
        }
        if(houselistingdata.getCoolheatfact()!=0){
            coolingheat.setText(PBTUtilities.getCoolheatfact("" + houselistingdata.getCoolheatfact()));
        }
        if(houselistingdata.getPc()!=0){
            pc.setText(PBTUtilities.getPc("" + houselistingdata.getPc()));
        }
        if(houselistingdata.getTelebroadband()!=0){
            broadband.setText(PBTUtilities.getTelebroadband("" + houselistingdata.getTelebroadband()));
        }
        if(houselistingdata.getMob()!=null){
            mobilephone.setText(PBTUtilities.getPhone(houselistingdata.getMob()));
        }
        if(houselistingdata.getBicycle()!=0){
            //bicycle.setText("" + houselistingdata.getBicycle());
        }
        if(houselistingdata.getR2wheel()!=0){
            r2wheel.setText("" + houselistingdata.getR2wheel());
        }
        if(houselistingdata.getR4wheel()!=0){
            r4wheel.setText("" + houselistingdata.getR4wheel());
        }
        if(houselistingdata.getTnocommveh()!=0){
            commonveh.setText("" + houselistingdata.getTnocommveh());
        }
    }
}
