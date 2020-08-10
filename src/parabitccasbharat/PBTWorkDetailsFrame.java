/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

import java.util.HashMap;

/**
 *
 * @author acer
 */
public class PBTWorkDetailsFrame extends javax.swing.JFrame {

    PBTHouseHoldModel persondata;
    PBTTextWatchers textWatchers;
    HashMap<String, Object> updatemap = new HashMap<>();
    public PBTWorkDetailsFrame(PBTHouseHoldModel persondata) {
        initComponents();
        this.textWatchers = new PBTTextWatchers();
        this.persondata = persondata;
        addTextWatchers();
        getAllLabels();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        occupation = new javax.swing.JTextField();
        workexp = new javax.swing.JTextField();
        income = new javax.swing.JTextField();
        distfromwork = new javax.swing.JTextField();
        natofwork = new javax.swing.JTextField();
        worksector = new javax.swing.JTextField();
        specdiscip = new javax.swing.JTextField();
        specexp = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        working = new javax.swing.JRadioButton();
        notworking = new javax.swing.JRadioButton();
        economicactivity = new javax.swing.JRadioButton();
        bothactivity = new javax.swing.JRadioButton();
        noneconomicactivity = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        icsno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        itryes = new javax.swing.JRadioButton();
        itrno = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        proflicno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        bussregno = new javax.swing.JTextField();
        jobseekyes = new javax.swing.JRadioButton();
        jobseekno = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        modoftravel = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Occupation :");

        jLabel2.setText("Currnt Work Stat :");

        jLabel3.setText("Work experience :");

        jLabel4.setText("Income :");

        jLabel5.setText("Distance From Work :");

        jLabel6.setText("Nature Of Work :");

        jLabel7.setText("Work Category :");

        jLabel8.setText("Working Sector :");

        jLabel10.setText("Specialisation Discription :");

        jLabel11.setText("Specialisation Experience :");

        jLabel12.setText("Job Seek :");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        buttonGroup1.add(working);
        working.setText("Working");
        working.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workingActionPerformed(evt);
            }
        });

        buttonGroup1.add(notworking);
        notworking.setText("NotWorking");

        buttonGroup2.add(economicactivity);
        economicactivity.setText("Economic Activity");

        buttonGroup2.add(bothactivity);
        bothactivity.setText("Both");

        buttonGroup2.add(noneconomicactivity);
        noneconomicactivity.setText("Non Economic Activity");

        jLabel13.setText("ICS No :");

        icsno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icsnoActionPerformed(evt);
            }
        });

        jLabel14.setText("ITR :");

        buttonGroup3.add(itryes);
        itryes.setText("Yes");

        buttonGroup3.add(itrno);
        itrno.setText("No");

        jLabel15.setText("Professional Liscence no :");

        proflicno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proflicnoActionPerformed(evt);
            }
        });

        jLabel16.setText("buisness registration no :");

        buttonGroup4.add(jobseekyes);
        jobseekyes.setText("Yes");
        jobseekyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobseekyesActionPerformed(evt);
            }
        });

        buttonGroup4.add(jobseekno);
        jobseekno.setText("No");

        jLabel9.setText("Mode Of Travel :");

        jButton1.setText("Select");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noneconomicactivity)
                            .addComponent(bothactivity))
                        .addGap(213, 213, 213)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(36, 36, 36)
                        .addComponent(worksector, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(specexp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(itryes)
                        .addGap(18, 18, 18)
                        .addComponent(itrno)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(working)
                        .addGap(0, 0, 0)
                        .addComponent(notworking)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(workexp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)
                        .addComponent(economicactivity)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(specdiscip, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36)
                        .addComponent(natofwork, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(proflicno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel13)
                        .addGap(36, 36, 36)
                        .addComponent(icsno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(bussregno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(jLabel12)
                        .addGap(40, 40, 40)
                        .addComponent(jobseekyes)
                        .addGap(18, 18, 18)
                        .addComponent(jobseekno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(distfromwork, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(36, 36, 36)
                        .addComponent(modoftravel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(211, 211, 211)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(working)
                    .addComponent(notworking)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(workexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7))
                    .addComponent(economicactivity)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(specdiscip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(noneconomicactivity)
                        .addComponent(bothactivity)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(itryes)
                            .addComponent(itrno))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(worksector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(specexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(natofwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proflicno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icsno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bussregno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(occupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12))
                    .addComponent(jobseekyes)
                    .addComponent(jobseekno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(distfromwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(modoftravel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1))
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        System.out.println(persondata.toUpdateQuery(updatemap));
    }//GEN-LAST:event_saveActionPerformed

    private void jobseekyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobseekyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobseekyesActionPerformed

    private void workingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workingActionPerformed

    private void icsnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icsnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icsnoActionPerformed

    private void proflicnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proflicnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proflicnoActionPerformed

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
            java.util.logging.Logger.getLogger(PBTWorkDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PBTWorkDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PBTWorkDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PBTWorkDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PBTWorkDetailsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bothactivity;
    private javax.swing.JTextField bussregno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField distfromwork;
    private javax.swing.JRadioButton economicactivity;
    private javax.swing.JTextField icsno;
    private javax.swing.JTextField income;
    private javax.swing.JRadioButton itrno;
    private javax.swing.JRadioButton itryes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jobseekno;
    private javax.swing.JRadioButton jobseekyes;
    private javax.swing.JTextField modoftravel;
    private javax.swing.JTextField natofwork;
    private javax.swing.JRadioButton noneconomicactivity;
    private javax.swing.JRadioButton notworking;
    private javax.swing.JTextField occupation;
    private javax.swing.JTextField proflicno;
    private javax.swing.JButton save;
    private javax.swing.JTextField specdiscip;
    private javax.swing.JTextField specexp;
    private javax.swing.JTextField workexp;
    private javax.swing.JRadioButton working;
    private javax.swing.JTextField worksector;
    // End of variables declaration//GEN-END:variables

    private void getAllLabels() {
        if(persondata.getCworkstat()!=null){
            if(persondata.getCworkstat().equals("W")){
                working.setSelected(true);
            }else{
                notworking.setSelected(true);
            }
        }
        if(persondata.getWorkcategory()!=null){
            switch (persondata.getWorkcategory()) {
                case "E":
                    economicactivity.setSelected(true);
                    break;
                case "N":
                    noneconomicactivity.setSelected(true);
                    break;
                default:
                    bothactivity.setSelected(true);
                    break;
            }
        }
        if(persondata.getWorkingsector()!=null){
            worksector.setText(persondata.getWorkingsector());
        }
        if(persondata.getNatureofwork()!=null){
            natofwork.setText(persondata.getNatureofwork());
        }
        if(persondata.getIcsno()!=null){
            icsno.setText(persondata.getIcsno());
        }
        if(persondata.getOccupation()!=null){
            occupation.setText(persondata.getOccupation());
        }
        if(persondata.getIncome()!=null){
            income.setText(persondata.getIncome());
        }
        if(persondata.getModoftravel()!=null){
            modoftravel.setText(persondata.getModoftravel());
        }
        if(persondata.getWorkexp()!=null){
            workexp.setText(persondata.getWorkexp());
        }
        if(persondata.getSpecdescription()!=null){
            specdiscip.setText(persondata.getSpecdescription());
        }
        if(persondata.getItr()!=null){
            if(persondata.getItr().equals("Y")){
                itryes.setSelected(true);
            }else{
                itrno.setSelected(true);
            }
        }
        if(persondata.getSpecexp()!=null){
            specexp.setText(persondata.getSpecexp());
        }
        if(persondata.getProflicno()!=null){
            proflicno.setText(persondata.getProflicno());
        }
        if(persondata.getBusiregno()!=null){
            bussregno.setText(persondata.getBusiregno());
        }
        if(persondata.getJobseek()!=null){
            if(persondata.getJobseek().equals("Y")){
                jobseekyes.setSelected(true);
            }else{
                jobseekno.setSelected(true);
            }
        }
        if(persondata.getDistfrmworkplace()!=null){
            distfromwork.setText(persondata.getDistfrmworkplace());
        }
    }

    private void addTextWatchers() {
        textWatchers.addNameTextWatcher(bussregno,updatemap,"busiregno");
        textWatchers.addNameTextWatcher(distfromwork,updatemap,"distfrmworkplace");
        textWatchers.addNameTextWatcher(income,updatemap,"income");
        textWatchers.addNameTextWatcher(natofwork,updatemap,"natureofwork");
        textWatchers.addNameTextWatcher(occupation,updatemap,"occupation");
        textWatchers.addNameTextWatcher(specdiscip,updatemap,"specdescription");
        textWatchers.addNameTextWatcher(specexp,updatemap,"specexp");
        textWatchers.addNameTextWatcher(worksector,updatemap,"workcategory");
        textWatchers.addNameTextWatcher(workexp,updatemap,"workexp");
        textWatchers.addNameTextWatcher(worksector,updatemap,"workingsector");
        textWatchers.addYesNolistener(itryes,itrno,updatemap,"Itr");
        textWatchers.addYesNolistener(jobseekyes,jobseekno,updatemap,"Jobseek");
    }
}
