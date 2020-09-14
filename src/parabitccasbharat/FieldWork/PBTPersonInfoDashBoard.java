package parabitccasbharat.FieldWork;

import parabitccasbharat.FieldWork.PBTOthersFrame;
import parabitccasbharat.FieldWork.PBTMedicalDetailsFrame;
import parabitccasbharat.FieldWork.PBTEducationDetailsFrame;
import parabitccasbharat.FieldWork.PBTBasicDetailsFrame;
import parabitccasbharat.FieldWork.PBTBankDetailsFrame;
import DB.ParabitDBC2;
import Models.PBTAadhar;
import Models.PBTHouseHoldModel;
import Models.PBTHouseListingModel;
import parabitccasbharat.Utilities.PBTTextWatchers;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import parabitccasbharat.Utilities.PBTQRCode;
import parabitccasbharat.QrCapture;


public class PBTPersonInfoDashBoard extends javax.swing.JFrame {

    PBTAadhar aadhar;
    PBTHouseHoldModel persondata;
    PBTHouseListingModel personlistingdata;
    PBTQRCode scanner;
    PBTTextWatchers textwatcher;
    ParabitDBC2 db2;
    QrCapture frame;
    HashMap<String, Object> updatemap = new HashMap<>();
    
    public PBTPersonInfoDashBoard(PBTHouseHoldModel persondata,PBTHouseListingModel personlistingdata) {
        initComponents();
        textwatcher = new PBTTextWatchers();
        this.db2 = new ParabitDBC2();
        this.persondata = persondata;
        this.personlistingdata = personlistingdata;
        this.persondata.setHl_sno(personlistingdata.getHl_sno());
        addTextWatchers();
        setAllTnformation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        aadharno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        scanbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passport = new javax.swing.JTextField();
        basicdetails = new javax.swing.JButton();
        eductiondetails = new javax.swing.JButton();
        medicaldetails = new javax.swing.JButton();
        workdetails = new javax.swing.JButton();
        bankdetails = new javax.swing.JButton();
        others = new javax.swing.JButton();
        save = new javax.swing.JButton();
        saveproceed = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        dl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pension = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        armsno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rationcardno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        gasconno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sssmidno = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        policeverno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        birthno = new javax.swing.JTextField();
        marriageno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        disabilityno = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        rationcardtype = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name : ");

        jLabel2.setText("Aadhar : ");

        scanbutton.setText("Scan");
        scanbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanbuttonActionPerformed(evt);
            }
        });

        jLabel3.setText("Pan No :");

        jLabel4.setText("PassPort No : ");

        basicdetails.setText("Basic Details");
        basicdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basicdetailsActionPerformed(evt);
            }
        });

        eductiondetails.setText("Educational Detail ");
        eductiondetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eductiondetailsActionPerformed(evt);
            }
        });

        medicaldetails.setText("Medical Details");
        medicaldetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicaldetailsActionPerformed(evt);
            }
        });

        workdetails.setText("Work Details");
        workdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workdetailsActionPerformed(evt);
            }
        });

        bankdetails.setText("Bank Details");
        bankdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankdetailsActionPerformed(evt);
            }
        });

        others.setText("Others");
        others.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        saveproceed.setText("Save and Proceed");

        jLabel5.setText("Driving Lic No :");

        jLabel6.setText("VoterCard No:");

        jLabel7.setText("PensionId No :");

        jLabel9.setText("Arms and lic no.");

        jLabel10.setText("Ration Cardno :");

        jLabel11.setText("Gas Cons No :");

        jLabel12.setText("SSSMID :");

        jLabel13.setText("Police Ver No :");

        jLabel14.setText("Birth certificate :");

        jLabel15.setText("Marriage certificate :");

        jLabel16.setText("Disability Number :");

        jLabel19.setText("Ration Card Type :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vid, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rationcardno, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sssmidno, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthno, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disabilityno, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(pension, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(armsno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gasconno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(policeverno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marriageno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rationcardtype, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(aadharno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(scanbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(passport, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(dl, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(basicdetails)
                        .addGap(48, 48, 48)
                        .addComponent(eductiondetails)
                        .addGap(39, 39, 39)
                        .addComponent(medicaldetails, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(workdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(bankdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(others, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(saveproceed, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(aadharno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scanbutton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(armsno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(rationcardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel11))
                            .addComponent(gasconno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(sssmidno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(policeverno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(rationcardtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(disabilityno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(marriageno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(basicdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eductiondetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medicaldetails, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(workdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(others, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveproceed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void medicaldetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicaldetailsActionPerformed
        PBTMedicalDetailsFrame frame = new PBTMedicalDetailsFrame(persondata,this);
        frame.setVisible(true);
    }//GEN-LAST:event_medicaldetailsActionPerformed

    private void basicdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basicdetailsActionPerformed
        PBTBasicDetailsFrame frame = new PBTBasicDetailsFrame(persondata,this);
        frame.setVisible(true);
    }//GEN-LAST:event_basicdetailsActionPerformed

    private void scanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanbuttonActionPerformed
        String uid = "";
        System.out.println(updatemap.get("marstatus"));
        if(aadharno.getText().isEmpty()){
            try {
                startWebCam();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }else{
            uid = aadharno.getText();
            persondata.setUid(uid);
            getAllInformation(uid);
            setAllTnformation();
            persondata.insert();
            System.out.println(persondata.toString());
        }
    }//GEN-LAST:event_scanbuttonActionPerformed

    private void eductiondetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eductiondetailsActionPerformed
        PBTEducationDetailsFrame frame = new PBTEducationDetailsFrame(persondata,this);
        frame.setVisible(true);
    }//GEN-LAST:event_eductiondetailsActionPerformed

    private void workdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workdetailsActionPerformed
        PBTWorkDetailsFrame frame = new PBTWorkDetailsFrame(persondata,this);
        frame.setVisible(true);
    }//GEN-LAST:event_workdetailsActionPerformed

    private void bankdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankdetailsActionPerformed
        PBTBankDetailsFrame frame = new PBTBankDetailsFrame(persondata,this);
        frame.setVisible(true);
    }//GEN-LAST:event_bankdetailsActionPerformed

    private void othersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersActionPerformed
        PBTOthersFrame frame = new PBTOthersFrame(persondata, this);
        frame.setVisible(true);
    }//GEN-LAST:event_othersActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        System.out.println(persondata.toUpdateQuery(updatemap));
        persondata.update(persondata.toUpdateQuery(updatemap));
        persondata.getDataFromAadhar(persondata.getUid());
        System.out.println(persondata.toString());
        System.out.println(personlistingdata.toString());
    }//GEN-LAST:event_saveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadharno;
    private javax.swing.JTextField armsno;
    private javax.swing.JButton bankdetails;
    private javax.swing.JButton basicdetails;
    private javax.swing.JTextField birthno;
    private javax.swing.JTextField disabilityno;
    private javax.swing.JTextField dl;
    private javax.swing.JButton eductiondetails;
    private javax.swing.JTextField gasconno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField marriageno;
    private javax.swing.JButton medicaldetails;
    private javax.swing.JTextField name;
    private javax.swing.JButton others;
    private javax.swing.JTextField pan;
    private javax.swing.JTextField passport;
    private javax.swing.JTextField pension;
    private javax.swing.JTextField policeverno;
    private javax.swing.JTextField rationcardno;
    private javax.swing.JTextField rationcardtype;
    private javax.swing.JButton save;
    private javax.swing.JButton saveproceed;
    private javax.swing.JButton scanbutton;
    private javax.swing.JTextField sssmidno;
    private javax.swing.JTextField vid;
    private javax.swing.JButton workdetails;
    // End of variables declaration//GEN-END:variables

    private void getAllInformation(String uid) {
        String query = "select * from pbtaadhar as aadhar LEFT JOIN pbt_itr as itr on aadhar.ANo = itr.ano LEFT JOIN pbtdisability disabity on aadhar.ANo = disabity.Ano LEFT JOIN pbtpass passport on aadhar.ANo = passport.ANo LEFT JOIN pbtpension pension on aadhar.ANo = pension.ANo LEFT JOIN pbt_police_ver police ON aadhar.ANo = police.AadNo LEFT JOIN pbt_rationcarddata ration ON aadhar.ANo = ration.AdhrNo LEFT JOIN pbtarmslicense arms on aadhar.Ano = arms.AadhNo LEFT JOIN pbtdl dl on aadhar.ANo = dl.AdhrNo LEFT JOIN pbtgas gas on aadhar.ANo = gas.AadNo LEFT JOIN pbtmarriage marriage on (aadhar.ANo = marriage.HbAadNo or aadhar.ANo = marriage.WfAadNo) LEFT JOIN pbtpan pan on aadhar.ANo = pan.AdhrNO where aadhar.ANo = '" + uid + "'";
        try {
            db2.rs1 = db2.stm.executeQuery(query);
            if(db2.rs1.next()){
                 String dist = db2.rs1.getString("aadhar.district");
                 personlistingdata.setDist(dist);
                 String tehsil = db2.rs1.getString("aadhar.tehsil");
                 personlistingdata.setTehsil(tehsil);
                 String townvillage = db2.rs1.getString("aadhar.vtc");
                 personlistingdata.setTownvillage(townvillage);
                 String wardno;
                 String hnoadd;
                 String pincode = db2.rs1.getString("aadhar.pin");
                 personlistingdata.setPincode(pincode);
                 String rcardno = db2.rs1.getString("ration.rtnid");
                 persondata.setRcardno(rcardno);
                 String rcardtype = db2.rs1.getString("ration.typeofcard");
                 persondata.setRcardtype(rcardtype);
                 String gconsumerno;
                 String drivlicno = db2.rs1.getString("dl.dlnumber");
                 persondata.setDrivlicno(drivlicno);
                 String armsuino = db2.rs1.getString("arms.lno");////Doubt what is lno in arms and license
                 persondata.setArmsuino(armsuino);
                 String birthcertno;
                 String marrcertno  = db2.rs1.getString("marriage.mrgcno");
                 persondata.setMarrcertno(marrcertno);
                 String policeverno = db2.rs1.getString("police.polvernu");
                 persondata.setPoliceverno(policeverno);
                 String sssmid;
                 String name = db2.rs1.getString("aadhar.fstname") + " " + db2.rs1.getString("aadhar.midname") + " " + db2.rs1.getString("aadhar.lstname");
                 persondata.setName(name);
                 String mobno = db2.rs1.getString("aadhar.mobno");
                 persondata.setMobno(mobno);
                 String altphoneno;
                 String email = db2.rs1.getString("aadhar.email");
                 persondata.setEmail(email);
                 String gender = db2.rs1.getString("aadhar.gender");
                 persondata.setGender(gender);
                 String dob = db2.rs1.getString("aadhar.DOB");
                 persondata.setDob(dob);
                 String age = calculateAge(dob);
                 persondata.setAge(age);
                 String wt;
                 String ht;
                 String veg;
                 String sleephrs;
                 String health_checkup;
                 String bmi;
                 String stem_cell_id;
                 String bgroup = db2.rs1.getString("disabity.bg");
                 persondata.setBgroup(bgroup);
                 String vid;///ye database me nhi hai
                 String passport = db2.rs1.getString("passport.passno");
                 persondata.setPassport(passport);
                 String pancardno = db2.rs1.getString("pan.panno");
                 persondata.setPancardno(pancardno);
                 String ifsc;
                 String bankaccno;
                 String netbank;
                 String mobbank;
                 String pensionid = db2.rs1.getString("pension.pidno");
                 persondata.setPensionid(pensionid);
                 String religion;
                 String community;
                 String category;
                 String cast;
                 String marstatus;
                 String marriagedate = db2.rs1.getString("marriage.dom");
                 String apromarriageage = calculateAge(marriagedate);
                 persondata.setApromarriageage(apromarriageage);
                 String pwd;
                 String pwdid;
                 String mtongue;
                 String rwlang;
                 String homelang;
                 String litstatus;
                 String cedustatus;
                 String cinstnmcity;
                 String cinsttype;
                 String techdeg;
                 String nontechdeg;
                 String nccnss;
                 String jobseek;
                 String cworkstat;
                 String workcategory;
                 String workingsector;
                 String natureofwork;
                 String icsno;
                 String occupation;
                 String workexp;
                 String specdescription;
                 String specexp;
                 String proflicno;
                 String busiregno;
                 String income = db2.rs1.getString("itr.total_income");
                 persondata.setIncome(Integer.parseInt(income));
                 String itr;/////database me nhi mila ye wala
            }
            //System.out.println(persondata.toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void setAllTnformation() {
        if(persondata.getUid()!=null){
            aadharno.setText(persondata.getUid());
        }
        if(persondata.getName()!=null) {
            name.setText(persondata.getName());
        }
        if(persondata.getPancardno()!=null) {
            pan.setText(persondata.getPancardno());
        }
        if(persondata.getVid()!=null) {
            vid.setText(persondata.getVid());
        }
        if(persondata.getPassport()!=null){
            passport.setText(persondata.getPassport());
        }
        if(persondata.getDrivlicno()!=null) {
            dl.setText(persondata.getDrivlicno());
        }
        if(persondata.getPensionid()!=null) {
            pension.setText(persondata.getPensionid());
        }
        if(persondata.getRcardno()!=null) {
            rationcardno.setText(persondata.getRcardno());
        }
        if(persondata.getArmsuino()!=null){
            armsno.setText(persondata.getArmsuino());
        }
        if(persondata.getSssmid()!=null){
            sssmidno.setText(persondata.getSssmid());
        }
        if(persondata.getGconsumerno()!=null){
            gasconno.setText(persondata.getGconsumerno());
        }
        if(persondata.getBirthcertno()!=null){
            birthno.setText(persondata.getBirthcertno());
        }
        if(persondata.getPoliceverno()!=null){
            policeverno.setText(persondata.getPoliceverno());
        }
        if(persondata.getPwdid()!=null){
            disabilityno.setText(persondata.getPwdid());
        }
        if(persondata.getMarrcertno()!=null){
            marriageno.setText(persondata.getMarrcertno());
        }
        if(persondata.getRcardtype()!=null){
            rationcardtype.setText(persondata.getRcardtype());
        }
    }
    
    public void startWebCam() throws InterruptedException {
        frame = new QrCapture();
        final Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try{
                    frame.setVisible(true);
                    String result = frame.getResult();
                    getAadhar(result);
                    persondata.setUid(result);
                    getAllInformation(result);
                    setAllTnformation();
                    persondata.insert();
                    System.out.println(persondata.toString());
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            };
        });
    thread.start();
    }
        
    public void getAadhar(String result){
        String uid,name,gender,dateofbirth,careof,building,street,landmark,vtcame,popname,distname,subdistname,statename,pincode;
        uid = getValues("uid",result);
        name = getValues("name",result);
        gender = getValues("gender",result);
        dateofbirth = getValues("dateofbirth",result);
        careof = getValues("careof",result);
        building = getValues("building",result);
        street = getValues("street",result);
        landmark = getValues("landmark",result);
        vtcame = getValues("vtcame",result);
        popname = getValues("popname",result);
        distname = getValues("distname",result);
        subdistname = getValues("subdistname",result);
        statename = getValues("statename",result);
        pincode = getValues("pincode",result);
        aadhar = new PBTAadhar(uid, name, gender, dateofbirth, careof, building, street, landmark, vtcame, popname, distname, subdistname, statename, pincode);
    }
    
    private String getValues(String valueOf,String text){
        Pattern pattern = Pattern.compile(valueOf + "=\"(.[^\"]*)\"");
        Matcher matcher = pattern.matcher(text);
        if(matcher.find()){
            System.out.println(matcher.group(1));
            return matcher.group(1);
        }
        return null;
    }

    private void addTextWatchers() {
        textwatcher.addNameTextWatcher(name,updatemap,"Name");
        textwatcher.addNameNumberTextWatcher(vid,updatemap,"Vid");
        textwatcher.addNumberTextWatcher(aadharno,updatemap,"Uid");
        textwatcher.addPanTextWatcher(pan,updatemap,"Pancardno");
        textwatcher.addNameNumberTextWatcher(passport,updatemap,"Passport");
        textwatcher.addNameNumberTextWatcher(dl,updatemap,"Drivlicno");
        textwatcher.addNameNumberTextWatcher(pension,updatemap,"Pensionid");
        textwatcher.addNameNumberTextWatcher(rationcardno, updatemap, "Rcardno");
        textwatcher.addNameNumberTextWatcher(armsno, updatemap, "Armsuino");
        textwatcher.addNameNumberTextWatcher(sssmidno, updatemap, "Sssmid");
        textwatcher.addNameNumberTextWatcher(gasconno, updatemap, "Gconsumerno");
        textwatcher.addNameNumberTextWatcher(birthno, updatemap, "Birthcertno");
        textwatcher.addNameNumberTextWatcher(policeverno, updatemap, "Policeverno");
        textwatcher.addNameNumberTextWatcher(disabilityno, updatemap, "Pwdid");
        textwatcher.addNameNumberTextWatcher(marriageno, updatemap, "Marrcertno");
        textwatcher.addNameTextWatcher(rationcardtype, updatemap, "Rcardtype");
    }

    public static String calculateAge(String date) {
        if(date==null){return null;}
        String dates[] = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int todayyear = LocalDate.now().getYear();
        return "" + (todayyear-year);
    }

}
