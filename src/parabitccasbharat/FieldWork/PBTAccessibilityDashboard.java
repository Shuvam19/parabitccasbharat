package parabitccasbharat.FieldWork;

import Models.PBTHouseListingModel;
import java.util.HashMap;
import javax.swing.JFrame;
import parabitccasbharat.Utilities.PBTMainSrcOfDrWater;
import parabitccasbharat.Utilities.PBTSrcOfLight;
import parabitccasbharat.Utilities.PBTTextWatchers;
import parabitccasbharat.Utilities.PBTUtilities;

public class PBTAccessibilityDashboard<T> extends javax.swing.JDialog {

    PBTHouseListingModel houselistingdata;
    PBTTextWatchers textwathers;
    HashMap<String, Object> updatemap = new HashMap<>();
    public PBTAccessibilityDashboard(PBTHouseListingModel houselistingdata,T parent) {
        super((JFrame)parent,true);
        initComponents();
        this.textwathers = new PBTTextWatchers();
        this.houselistingdata = houselistingdata;
        addtextWatchers();
        getAllInformation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        wateryes = new javax.swing.JRadioButton();
        waterno = new javax.swing.JRadioButton();
        swimmingno = new javax.swing.JRadioButton();
        swimmingyes = new javax.swing.JRadioButton();
        parkingno = new javax.swing.JRadioButton();
        parkingyes = new javax.swing.JRadioButton();
        srcofDrinkin = new javax.swing.JTextField();
        srcoflight = new javax.swing.JTextField();
        altsrcoflight = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        securityno = new javax.swing.JRadioButton();
        securityyes = new javax.swing.JRadioButton();
        bulalarmno = new javax.swing.JRadioButton();
        bulalarmyes = new javax.swing.JRadioButton();
        fireextinguisher = new javax.swing.JTextField();
        ipadress = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        firealarm = new javax.swing.JTextField();
        privatesecguard = new javax.swing.JTextField();
        escalator = new javax.swing.JTextField();
        lift = new javax.swing.JTextField();
        helipad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Main Src Of Drinking Water :");

        jLabel2.setText("Main Src Of Light :");

        jLabel3.setText("Alternate Src Of Light :");

        jLabel4.setText("Water Harvesting Favility :");

        jLabel5.setText("Swimming Pool Facility Available :");

        jLabel6.setText("Parking Facility Available :");

        jLabel7.setText("Escalator Facility Available :");

        jLabel8.setText("Lift Facility Available :");

        jLabel9.setText("Helipad Facility Available :");

        buttonGroup1.add(wateryes);
        wateryes.setText("Yes");

        buttonGroup1.add(waterno);
        waterno.setText("No");

        buttonGroup2.add(swimmingno);
        swimmingno.setText("No");

        buttonGroup2.add(swimmingyes);
        swimmingyes.setText("Yes");

        buttonGroup3.add(parkingno);
        parkingno.setText("No");

        buttonGroup3.add(parkingyes);
        parkingyes.setText("Yes");

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

        jLabel10.setText("Smart Scurity System Available :");

        jLabel11.setText("No Of Fire Extinguisher In the House :");

        jLabel12.setText("Fire Alarm Available :");

        jLabel13.setText("Private Security Guard Available :");

        jLabel14.setText("Bulgar Alarm Available :");

        jLabel15.setText("CCTV Ip Adress :");

        buttonGroup7.add(securityno);
        securityno.setText("No");

        buttonGroup7.add(securityyes);
        securityyes.setText("Yes");

        buttonGroup10.add(bulalarmno);
        bulalarmno.setText("No");

        buttonGroup10.add(bulalarmyes);
        bulalarmyes.setText("Yes");

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(srcofDrinkin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(securityyes)
                        .addGap(18, 18, 18)
                        .addComponent(securityno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(srcoflight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(fireextinguisher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(swimmingyes)
                        .addGap(18, 18, 18)
                        .addComponent(swimmingno)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(bulalarmyes)
                        .addGap(18, 18, 18)
                        .addComponent(bulalarmno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(parkingyes)
                        .addGap(18, 18, 18)
                        .addComponent(parkingno)
                        .addGap(273, 273, 273)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(ipadress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(altsrcoflight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(155, 155, 155)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(firealarm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(wateryes)
                                .addGap(18, 18, 18)
                                .addComponent(waterno)
                                .addGap(194, 194, 194)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(privatesecguard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(helipad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(lift))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(escalator, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(227, 227, 227)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(srcofDrinkin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10))
                    .addComponent(securityyes)
                    .addComponent(securityno))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(srcoflight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(fireextinguisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(altsrcoflight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel12))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(firealarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wateryes)
                    .addComponent(waterno)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(privatesecguard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(swimmingyes)
                    .addComponent(swimmingno)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14))
                    .addComponent(bulalarmyes)
                    .addComponent(bulalarmno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(parkingyes)
                    .addComponent(parkingno)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ipadress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(escalator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(helipad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PBTMainSrcOfDrWater frame = new PBTMainSrcOfDrWater(houselistingdata, this);
        frame.setVisible(true);
        srcofDrinkin.setText(PBTUtilities.getMainSrcDrWater("" + houselistingdata.getMainsrcdrwater()));
        updatemap.put("Mainsrcdrwater", houselistingdata.getMainsrcdrwater());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PBTSrcOfLight frame = new PBTSrcOfLight(houselistingdata, this,PBTSrcOfLight.MAIN_SRC_OF_LIGHT);
        frame.setVisible(true);
        srcoflight.setText(PBTUtilities.getLight_source("" + houselistingdata.getMainsrclight()));
        updatemap.put("Mainsrclight", houselistingdata.getMainsrclight());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PBTSrcOfLight frame = new PBTSrcOfLight(houselistingdata, this,PBTSrcOfLight.ALT_SRC_OF_LIGHT);
        frame.setVisible(true);
        altsrcoflight.setText(PBTUtilities.getLight_source("" + houselistingdata.getAltsrcoflight()));
        updatemap.put("Altsrcoflight", houselistingdata.getAltsrcoflight());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println(houselistingdata.toUpdateQuery(updatemap));
        houselistingdata.update(houselistingdata.toUpdateQuery(updatemap));
        houselistingdata.getFromhlsno(houselistingdata.getHl_sno());
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altsrcoflight;
    private javax.swing.JRadioButton bulalarmno;
    private javax.swing.JRadioButton bulalarmyes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JTextField escalator;
    private javax.swing.JTextField firealarm;
    private javax.swing.JTextField fireextinguisher;
    private javax.swing.JTextField helipad;
    private javax.swing.JTextField ipadress;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lift;
    private javax.swing.JRadioButton parkingno;
    private javax.swing.JRadioButton parkingyes;
    private javax.swing.JTextField privatesecguard;
    private javax.swing.JRadioButton securityno;
    private javax.swing.JRadioButton securityyes;
    private javax.swing.JTextField srcofDrinkin;
    private javax.swing.JTextField srcoflight;
    private javax.swing.JRadioButton swimmingno;
    private javax.swing.JRadioButton swimmingyes;
    private javax.swing.JRadioButton waterno;
    private javax.swing.JRadioButton wateryes;
    // End of variables declaration//GEN-END:variables

    private void addtextWatchers() {
        textwathers.addYesNolistener(wateryes, waterno, updatemap, "Wtrharv");
        textwathers.addYesNolistener(swimmingyes, swimmingno, updatemap, "Swimmingpool");
        textwathers.addYesNolistener(parkingyes, parkingno, updatemap, "Parkingfact");
        textwathers.addNumberTextWatcher(escalator, updatemap, "Escalator");
        textwathers.addNumberTextWatcher(lift, updatemap, "Lift");
        textwathers.addNumberTextWatcher(helipad, updatemap, "Helipad");
        textwathers.addYesNolistener(securityyes, securityno, updatemap, "Smartsecuritysystem");
        textwathers.addNumberTextWatcher(firealarm, updatemap, "Firealarm");
        textwathers.addNumberTextWatcher(privatesecguard, updatemap, "Privatesecurityguard");
        textwathers.addYesNolistener(bulalarmyes, bulalarmno, updatemap, "Burglaralarm");
        textwathers.addNumberTextWatcher(fireextinguisher, updatemap, "Fireextinguisher");
        textwathers.addIpAdressTextWatcher(ipadress, updatemap, "Cctvipadress");
    }

    private void getAllInformation() {
        if(houselistingdata.getMainsrcdrwater()!=0){
            srcofDrinkin.setText(PBTUtilities.getMainSrcDrWater("" + houselistingdata.getMainsrcdrwater()));
        }
        if(houselistingdata.getMainsrclight()!=0){
            srcoflight.setText(PBTUtilities.getLight_source("" + houselistingdata.getMainsrclight()));
        }
        if(houselistingdata.getAltsrcoflight()!=0){
            altsrcoflight.setText(PBTUtilities.getLight_source("" + houselistingdata.getAltsrcoflight()));
        }
        if(houselistingdata.getWtrharv()!=null){
            if(houselistingdata.getWtrharv().equals("Y")){
                wateryes.setSelected(true);
            }else{
                waterno.setSelected(true);
            }
        }
        if(houselistingdata.getSwimmingpool()!=null){
            if(houselistingdata.getSwimmingpool().equals("Y")){
                swimmingyes.setSelected(true);
            }else{
                swimmingno.setSelected(true);
            }
        }
        if(houselistingdata.getParkingfact()!=null){
            if(houselistingdata.getParkingfact().equals("Y")){
                parkingyes.setSelected(true);
            }else{
                parkingno.setSelected(true);
            }
        }
        if(houselistingdata.getEscalator()!=null){
            escalator.setText(houselistingdata.getEscalator());
        }
        if(houselistingdata.getLift()!=null){
            lift.setText(houselistingdata.getLift());
        }
        if(houselistingdata.getHelipad()!=null){
            helipad.setText(houselistingdata.getHelipad());
        }
        if(houselistingdata.getSmartsecuritysystem()!=null){
            if(houselistingdata.getSmartsecuritysystem().equals("Y")){
                securityyes.setSelected(true);
            }else{
                securityno.setSelected(true);
            }
        }
        if(houselistingdata.getFireextinguisher()!=0){
            fireextinguisher.setText("" + houselistingdata.getFireextinguisher());
        }
        if(houselistingdata.getFirealarm()!=null){
            firealarm.setText(houselistingdata.getFirealarm());
        }
        if(houselistingdata.getPrivatesecurityguard()!=null){
            privatesecguard.setText(houselistingdata.getPrivatesecurityguard());
        }
        if(houselistingdata.getBurglaralarm()!=null){
            if(houselistingdata.getBurglaralarm().equals("Y")){
                bulalarmyes.setSelected(true);
            }else{
                bulalarmno.setSelected(true);
            }
        }
        if(houselistingdata.getCctvipadress()!=null){
            ipadress.setText(houselistingdata.getCctvipadress());
        }
    }
}
