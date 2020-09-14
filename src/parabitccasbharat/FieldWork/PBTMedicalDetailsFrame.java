
package parabitccasbharat.FieldWork;

import Models.PBTHouseHoldModel;
import parabitccasbharat.Utilities.PBTTextWatchers;
import parabitccasbharat.Utilities.PBTBloodGroup;
import parabitccasbharat.Utilities.PBTUtilities;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import parabitccasbharat.Utilities.PBTChronicDisease;

public class PBTMedicalDetailsFrame<T> extends javax.swing.JDialog {

    PBTHouseHoldModel persondata;
    PBTTextWatchers textWatchers;
    HashMap<String, Object> updatemap = new HashMap<>();
    public PBTMedicalDetailsFrame(PBTHouseHoldModel persondata,T parent) {
        super((JFrame)parent,true);
        initComponents();
        this.persondata = persondata;
        textWatchers = new PBTTextWatchers();
        addTextWatchers();
        getAllLabels();
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
        homeFood = new javax.swing.ButtonGroup();
        outsideFood = new javax.swing.ButtonGroup();
        Vegitarian = new javax.swing.ButtonGroup();
        healthcheckup = new javax.swing.ButtonGroup();
        yoga = new javax.swing.ButtonGroup();
        meditation = new javax.swing.ButtonGroup();
        spiritual = new javax.swing.ButtonGroup();
        addiction = new javax.swing.ButtonGroup();
        disability = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        bmi = new javax.swing.JTextField();
        bloodgrp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sleephrs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sports = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        chronicdisease = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        stemcellid = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        veg = new javax.swing.JSlider();
        homefood = new javax.swing.JSlider();
        outsidefood = new javax.swing.JSlider();
        medications = new javax.swing.JSlider();
        yogas = new javax.swing.JSlider();
        health = new javax.swing.JSlider();
        Disability = new javax.swing.JSlider();
        addictions = new javax.swing.JSlider();
        spirituals = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        Select = new javax.swing.JButton();
        ratehealth = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Height : ");

        jLabel2.setText("Weight : ");

        jLabel4.setText("BMI : ");

        jLabel5.setText("Blood group : ");

        jLabel6.setText("Sleep Hrs :");

        jLabel7.setText("Sports :");

        jLabel8.setText("Meditations :");

        jLabel9.setText("Home Food :");

        jLabel10.setText("Outside Food :");

        jLabel11.setText("Veg :");

        jLabel12.setText("Health Checkup :");

        jLabel13.setText("Yoga :");

        jLabel14.setText("Chronic Disease :");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel3.setText("Stem cell Id :");

        jLabel17.setText("Rate Your Health :");

        jLabel15.setText("Spritual :");

        jLabel16.setText("Addiction :");

        jLabel18.setText("Disability :");

        veg.setMajorTickSpacing(1);
        veg.setMaximum(5);
        veg.setMinimum(1);
        veg.setMinorTickSpacing(1);
        veg.setPaintLabels(true);
        veg.setPaintTicks(true);

        homefood.setMajorTickSpacing(1);
        homefood.setMaximum(5);
        homefood.setMinimum(1);
        homefood.setMinorTickSpacing(1);
        homefood.setPaintLabels(true);
        homefood.setPaintTicks(true);
        homefood.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                homefoodStateChanged(evt);
            }
        });

        outsidefood.setMajorTickSpacing(1);
        outsidefood.setMaximum(5);
        outsidefood.setMinimum(1);
        outsidefood.setMinorTickSpacing(1);
        outsidefood.setPaintLabels(true);
        outsidefood.setPaintTicks(true);

        medications.setMajorTickSpacing(1);
        medications.setMaximum(5);
        medications.setMinimum(1);
        medications.setMinorTickSpacing(1);
        medications.setPaintLabels(true);
        medications.setPaintTicks(true);

        yogas.setMajorTickSpacing(1);
        yogas.setMaximum(5);
        yogas.setMinimum(1);
        yogas.setMinorTickSpacing(1);
        yogas.setPaintLabels(true);
        yogas.setPaintTicks(true);

        health.setMajorTickSpacing(1);
        health.setMaximum(5);
        health.setMinimum(1);
        health.setMinorTickSpacing(1);
        health.setPaintLabels(true);
        health.setPaintTicks(true);

        Disability.setMajorTickSpacing(1);
        Disability.setMaximum(5);
        Disability.setMinimum(1);
        Disability.setMinorTickSpacing(1);
        Disability.setPaintLabels(true);
        Disability.setPaintTicks(true);

        addictions.setMajorTickSpacing(1);
        addictions.setMaximum(5);
        addictions.setMinimum(1);
        addictions.setMinorTickSpacing(1);
        addictions.setPaintLabels(true);
        addictions.setPaintTicks(true);

        spirituals.setMajorTickSpacing(1);
        spirituals.setMaximum(5);
        spirituals.setMinimum(1);
        spirituals.setMinorTickSpacing(1);
        spirituals.setPaintLabels(true);
        spirituals.setPaintTicks(true);

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Select.setText("Select");
        Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });

        ratehealth.setMajorTickSpacing(1);
        ratehealth.setMaximum(5);
        ratehealth.setMinimum(1);
        ratehealth.setPaintLabels(true);
        ratehealth.setPaintTicks(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel9)
                        .addGap(49, 49, 49)
                        .addComponent(homefood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel10)
                        .addGap(46, 46, 46)
                        .addComponent(outsidefood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(bmi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel11)
                        .addGap(45, 45, 45)
                        .addComponent(veg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stemcellid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodgrp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(Select)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel12)
                        .addGap(38, 38, 38)
                        .addComponent(health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(sleephrs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel13)
                        .addGap(39, 39, 39)
                        .addComponent(yogas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(sports, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addComponent(medications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(chronicdisease, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel15)
                        .addGap(37, 37, 37)
                        .addComponent(spirituals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ratehealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addictions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Disability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(homefood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(outsidefood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(bmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(veg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stemcellid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(bloodgrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Select))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(sleephrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(yogas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(sports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(medications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(chronicdisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(spirituals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel16)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ratehealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel17))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(addictions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Disability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        System.out.println(persondata.toUpdateQuery(updatemap));
        persondata.update(persondata.toUpdateQuery(updatemap));
        persondata.getDataFromAadhar(persondata.getUid());
        this.dispose();
    }//GEN-LAST:event_saveActionPerformed

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        PBTBloodGroup frame = new PBTBloodGroup(persondata, this);
        frame.setVisible(true);
        bloodgrp.setText(PBTUtilities.getBloodGroup(persondata.getBgroup()));
        updatemap.put("Bgroup", persondata.getBgroup());
    }//GEN-LAST:event_SelectActionPerformed

    private void homefoodStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_homefoodStateChanged

    }//GEN-LAST:event_homefoodStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PBTChronicDisease frame = new PBTChronicDisease(persondata, this);
        frame.setVisible(true);
        chronicdisease.setText(PBTUtilities.getTypesofchronicdisease(persondata.getChronicdisease()));
        updatemap.put("Bgroup", persondata.getChronicdisease());
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider Disability;
    private javax.swing.JButton Select;
    private javax.swing.ButtonGroup Vegitarian;
    private javax.swing.ButtonGroup addiction;
    private javax.swing.JSlider addictions;
    private javax.swing.JTextField bloodgrp;
    private javax.swing.JTextField bmi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField chronicdisease;
    private javax.swing.ButtonGroup disability;
    private javax.swing.JSlider health;
    private javax.swing.ButtonGroup healthcheckup;
    private javax.swing.JTextField height;
    private javax.swing.ButtonGroup homeFood;
    private javax.swing.JSlider homefood;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSlider medications;
    private javax.swing.ButtonGroup meditation;
    private javax.swing.ButtonGroup outsideFood;
    private javax.swing.JSlider outsidefood;
    private javax.swing.JSlider ratehealth;
    private javax.swing.JButton save;
    private javax.swing.JTextField sleephrs;
    private javax.swing.ButtonGroup spiritual;
    private javax.swing.JSlider spirituals;
    private javax.swing.JTextField sports;
    private javax.swing.JTextField stemcellid;
    private javax.swing.JSlider veg;
    private javax.swing.JTextField weight;
    private javax.swing.ButtonGroup yoga;
    private javax.swing.JSlider yogas;
    // End of variables declaration//GEN-END:variables

    private void getAllLabels() {
        if(persondata.getHt()!=null){
            height.setText(persondata.getHt());
        }
        if(persondata.getWt()!=0){
            weight.setText("" + persondata.getWt());
        }
        if(persondata.getBmi()!=null){
            bmi.setText(persondata.getBmi());
        }
        if(persondata.getStem_cell_id()!=null){
            stemcellid.setText(persondata.getStem_cell_id());
        }
        if(persondata.getBgroup()!=null){
           bloodgrp.setText(PBTUtilities.getBloodGroup(persondata.getBgroup()));
        }
        if(persondata.getSleephrs()!=null){
            sleephrs.setText(persondata.getSleephrs());
        }
        if(persondata.getSport()!=null){
            sports.setText(persondata.getSport());
        }
        if(persondata.getRatyourhealth()!=0){
            ratehealth.setValue(persondata.getRatyourhealth());
        }
        if(persondata.getMeditation()!=null){
            medications.setValue(Integer.parseInt(persondata.getMeditation()));
        }
        if(persondata.getHomefood()!=null){
            homefood.setValue(Integer.parseInt(persondata.getHomefood()));
        }
        if(persondata.getOutsidefood()!=null){
            outsidefood.setValue(Integer.parseInt(persondata.getOutsidefood()));
        }
        if(persondata.getVeg()!=null){
            veg.setValue(Integer.parseInt(persondata.getVeg()));
        }
        if(persondata.getHealth_checkup()!=null){
            health.setValue(Integer.parseInt(persondata.getHealth_checkup()));
        }
        if(persondata.getYoga()!=null){
            yogas.setValue(Integer.parseInt(persondata.getYoga()));
        }
        if(persondata.getMeditation()!=null){
            medications.setValue(Integer.parseInt(persondata.getMeditation()));
        }
        if(persondata.getSpiritual()!=null){
            spirituals.setValue(Integer.parseInt(persondata.getSpiritual()));
        }
        if(persondata.getAddiction()!=null){
            addictions.setValue(Integer.parseInt(persondata.getAddiction()));
        }
        if(persondata.getPwd()!=null){
            Disability.setValue(Integer.parseInt(persondata.getPwd()));
        }
        if(persondata.getChronicdisease()!=null){
            chronicdisease.setText(PBTUtilities.getTypesofchronicdisease(persondata.getChronicdisease()));
        }
    }
    
    private void addTextWatchers(){
        textWatchers.addNumberTextWatcher(sleephrs,updatemap,"sleephrs");
        textWatchers.addNameTextWatcher(sports,updatemap,"sport");
        textWatchers.addNumberTextWatcher(weight,updatemap,"wt");
        textWatchers.addNumberTextWatcher(bmi,updatemap,"bmi");
        textWatchers.addNumberTextWatcher(height,updatemap,"ht");
        textWatchers.addNameTextWatcher(stemcellid, updatemap, "Stem_cell_id");
        textWatchers.addJSliderListener(homefood,updatemap,"Homefood");
        textWatchers.addJSliderListener(outsidefood,updatemap,"Outsidefood");
        textWatchers.addJSliderListener(veg,updatemap,"Veg");
        textWatchers.addJSliderListener(health,updatemap,"Health_checkup");
        textWatchers.addJSliderListener(yogas,updatemap,"Yoga");
        textWatchers.addJSliderListener(medications,updatemap,"Meditation");
        textWatchers.addJSliderListener(spirituals,updatemap,"Spiritual");
        textWatchers.addJSliderListener(addictions,updatemap,"Addiction");
        textWatchers.addJSliderListener(Disability,updatemap,"Pwd");
        textWatchers.addJSliderListener(ratehealth, updatemap, "Ratyourhealth");
    }
}