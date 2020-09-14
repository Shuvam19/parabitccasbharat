package parabitccasbharat.FieldWork;

import Models.PBTHouseHoldModel;
import parabitccasbharat.Utilities.PBTTextWatchers;
import parabitccasbharat.Utilities.PBTCategory;
import parabitccasbharat.Utilities.PBTReligion;
import parabitccasbharat.Utilities.PBTUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PBTBasicDetailsFrame<T> extends javax.swing.JDialog {

    PBTHouseHoldModel persondata;
    PBTTextWatchers textWatchers;
    HashMap<String, Object> updatemap = new HashMap<>();
    public PBTBasicDetailsFrame(PBTHouseHoldModel persondata,T parent) {
        super((JFrame)parent,true);
        initComponents();
        this.persondata = persondata;
        textWatchers = new PBTTextWatchers();
        addTextWatchers();
        getAllLabels();
        /*String s = "uid";
        try {
            Method m = persondata.getClass().getMethod("set" +s, String.class);
            m.invoke(persondata, "shuvam");
            System.out.println(persondata.getUid());
        } catch (SecurityException | NoSuchMethodException | IllegalArgumentException | IllegalAccessException | InvocationTargetException ex) {
            Logger.getLogger(PBTBasicDetailsFrame.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matialstatus = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        mobno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        altmobno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        community = new javax.swing.JTextField();
        category = new javax.swing.JTextField();
        religion = new javax.swing.JTextField();
        reltohead = new javax.swing.JTextField();
        cast = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        aprxmarage = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        chldevrborn = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        noofchldalive = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        married = new javax.swing.JRadioButton();
        unmarried = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        headuid = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        headmobno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        mothertongue = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        readwritelang = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        homelang = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Mobile No : ");

        mobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Alternate Mob No:");

        jLabel3.setText("Date of Birth :");

        dob.setMaxSelectableDate(new Date(System.currentTimeMillis()));

        jLabel4.setText("Gender : ");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        buttonGroup1.add(others);
        others.setText("Others");

        jLabel5.setText("Email : ");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel6.setText("Community :");

        jLabel7.setText("Category :");

        jLabel8.setText("Religion :");

        jLabel9.setText("Relation To Head :");

        jLabel10.setText("Cast :");

        jLabel12.setText("Martial Status :");

        jLabel13.setText("Approx Marriage Age :");

        aprxmarage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprxmarageActionPerformed(evt);
            }
        });

        jLabel14.setText("Child Ever Born :");

        jLabel15.setText("No of Child alive :");

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        matialstatus.add(married);
        married.setText("Married");

        matialstatus.add(unmarried);
        unmarried.setText("Unmarried");

        jLabel16.setText("Head Uid :");

        jLabel17.setText("Head Registered Mobile No :");

        jLabel18.setText("Age :");

        jLabel19.setText("Mother Tongue :");

        jLabel20.setText("Read Write Language :");

        jLabel21.setText("Home Languague :");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(headuid, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jLabel6)
                        .addGap(44, 44, 44)
                        .addComponent(community))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(mobno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel10)
                        .addGap(44, 44, 44)
                        .addComponent(cast))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(altmobno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel19)
                        .addGap(44, 44, 44)
                        .addComponent(mothertongue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addGap(10, 10, 10)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel20)
                        .addGap(44, 44, 44)
                        .addComponent(readwritelang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(male)
                        .addGap(0, 0, 0)
                        .addComponent(female)
                        .addGap(2, 2, 2)
                        .addComponent(others)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel21)
                        .addGap(44, 44, 44)
                        .addComponent(homelang))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel14)
                        .addGap(44, 44, 44)
                        .addComponent(chldevrborn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel12)
                        .addGap(29, 29, 29)
                        .addComponent(married)
                        .addGap(18, 18, 18)
                        .addComponent(unmarried)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel15)
                        .addGap(44, 44, 44)
                        .addComponent(noofchldalive))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(reltohead, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel8)
                                .addGap(44, 44, 44)
                                .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(headmobno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel7)
                                .addGap(44, 44, 44)
                                .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(aprxmarage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(324, 324, 324)
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9))
                    .addComponent(reltohead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(religion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headmobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel7))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altmobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mothertongue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readwritelang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(male)
                            .addComponent(female)
                            .addComponent(others)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel21)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(homelang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chldevrborn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14))))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(married))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(unmarried))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel15))
                    .addComponent(noofchldalive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(aprxmarage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void mobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobnoActionPerformed

    private void aprxmarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprxmarageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aprxmarageActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        System.out.println(persondata.toUpdateQuery(updatemap));
        persondata.update(persondata.toUpdateQuery(updatemap));
        persondata.getDataFromAadhar(persondata.getUid());
        this.dispose();
    }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PBTReligion frame = new PBTReligion(persondata,this);
        frame.setVisible(true);
        religion.setText(PBTUtilities.getReligion(persondata.getReligion()));
        updatemap.put("Religion", persondata.getReligion());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PBTCategory frame = new PBTCategory(persondata, this);
        frame.setVisible(true);
        category.setText(PBTUtilities.getCategory(persondata.getCategory()));
        updatemap.put("Category", persondata.getCategory());
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField altmobno;
    private javax.swing.JTextField aprxmarage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cast;
    private javax.swing.JTextField category;
    private javax.swing.JTextField chldevrborn;
    private javax.swing.JTextField community;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField headmobno;
    private javax.swing.JTextField headuid;
    private javax.swing.JTextField homelang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton married;
    private javax.swing.ButtonGroup matialstatus;
    private javax.swing.JTextField mobno;
    private javax.swing.JTextField mothertongue;
    private javax.swing.JTextField noofchldalive;
    private javax.swing.JRadioButton others;
    private javax.swing.JTextField readwritelang;
    private javax.swing.JTextField religion;
    private javax.swing.JTextField reltohead;
    private javax.swing.JButton save;
    private javax.swing.JRadioButton unmarried;
    // End of variables declaration//GEN-END:variables

    private void getAllLabels() {
        if(persondata.getMobno()!=null){
            mobno.setText(persondata.getMobno());
        }
        if(persondata.getAltphoneno()!=null){
            altmobno.setText(persondata.getAltphoneno());
        }
        if(persondata.getDob()!=null){
            //dob.setDate();
        }
        if(persondata.getEmail()!=null){
            email.setText(persondata.getEmail());
        }
        if(persondata.getDob()!=null){
            try {
                dob.setDate(new SimpleDateFormat("yyyy-dd-MM").parse(persondata.getDob()));
            } catch (ParseException ex) {
                Logger.getLogger(PBTBasicDetailsFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(persondata.getCommunity()!=null){
            community.setText(persondata.getCommunity());
        }
        if(persondata.getCategory()!=null){
            category.setText(PBTUtilities.getCategory(persondata.getCategory()));
        }
        if(persondata.getReligion()!=null){
            religion.setText(PBTUtilities.getReligion(persondata.getReligion()));
        }
        if(persondata.getReltohead()!=null){
            reltohead.setText(persondata.getReltohead());
        }
        if(persondata.getCast()!=null){
            cast.setText(persondata.getCast());
        }
        if(persondata.getMarstatus()!=null){
            if(persondata.getMarstatus().equals("Y")){
                married.setSelected(true);
                marriedParts(true);
            }else {
                unmarried.setSelected(true);
                marriedParts(false);
            }
        }
        if(persondata.getApromarriageage()!=null){
            aprxmarage.setText(persondata.getApromarriageage());
        }
        if(persondata.getChdnevenborn()!=null){
            chldevrborn.setText(persondata.getChdnevenborn());
        }
        if(persondata.getNoofchdnalivelastyr()!=null){
            noofchldalive.setText(persondata.getNoofchdnalivelastyr());
        }
        if(persondata.getGender()!=null){
            switch (persondata.getGender()) {
                case "M":
                    male.setSelected(true);
                    FemaleParts(false);
                    break;
                case "F":
                    female.setSelected(true);
                    FemaleParts(true);
                    break;
                default:
                    others.setSelected(true);
                    break;
            }
        }
        if(persondata.getHeaduid()!=null){
            headuid.setText(persondata.getHeaduid());
        }
        if(persondata.getHeadregmobno()!=null){
            headmobno.setText(persondata.getHeadregmobno());
        }
        if(persondata.getAge()!=null){
            age.setText(persondata.getAge());
        }
        if(persondata.getMtongue()!=null){
            mothertongue.setText(persondata.getMtongue());
        }
        if(persondata.getRwlang()!=null){
            readwritelang.setText(persondata.getRwlang());
        }
        if(persondata.getHomelang()!=null){
            homelang.setText(persondata.getHomelang());
        }
        if(persondata.getEmail()!=null){
            email.setText(persondata.getEmail());
        }
    }

    private void addTextWatchers() {
        textWatchers.addNumberTextWatcher(mobno,updatemap,"Mobno");
        textWatchers.addNumberTextWatcher(noofchldalive,updatemap,"Noofchdnalivelastyr");
        textWatchers.addNameTextWatcher(reltohead,updatemap,"Reltohead");
        textWatchers.addEmailTextWatcher(email,updatemap,"Email");
        textWatchers.addNumberTextWatcher(altmobno,updatemap,"Altphoneno");
        textWatchers.addNameTextWatcher(cast,updatemap,"Cast");
        textWatchers.addNumberTextWatcher(chldevrborn,updatemap,"Chdnevenborn");
        textWatchers.addNameTextWatcher(community,updatemap,"Community");
        textWatchers.addNumberTextWatcher(aprxmarage,updatemap,"Apromarriageage");
        textWatchers.addNameTextWatcher(mothertongue,updatemap,"Mtongue");
        textWatchers.addNameTextWatcher(readwritelang,updatemap,"Rwlang");
        textWatchers.addNameTextWatcher(homelang,updatemap,"Homelang");
        textWatchers.addNumberTextWatcher(age, updatemap, "Age");
        textWatchers.addNumberTextWatcher(headuid, updatemap, "Headuid");
        textWatchers.addNumberTextWatcher(headmobno, updatemap, "Headregmobno");
        dob.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if("date".equals(evt.getPropertyName())){
                    String date = new SimpleDateFormat("yyyy-mm-dd").format(evt.getNewValue());
                    String agestr = PBTPersonInfoDashBoard.calculateAge(date);
                    try {
                        updatemap.put("DOB", new SimpleDateFormat("yyyy-dd-MM").format(new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",Locale.US).parse(evt.getNewValue().toString())));
                    } catch (ParseException ex) {
                        Logger.getLogger(PBTBasicDetailsFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    age.setText(agestr);
                }
            }
        });
        male.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatemap.put("Gender", "M");
                FemaleParts(false);
            }
        });
        female.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatemap.put("Gender", "F");
                FemaleParts(true);
            }
        });
        others.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatemap.put("Gender", "O");
            }
        });
        married.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatemap.put("Marstatus", "Y");
                marriedParts(true);
            }
        });
        unmarried.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updatemap.put("Marstatus", "N");
                marriedParts(false);
            }
        });
        age.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(textWatchers.isNumerical(age.getText())){
                    textWatchers.showRight(age);
                } else {
                    textWatchers.showError(age);
                }
                if(Integer.parseInt(age.getText()) <= 21 && male.isSelected()){
                    isChild(false);
                }else if(Integer.parseInt(age.getText()) <= 18 && female.isSelected()){
                    isChild(false);
                }else if(Integer.parseInt(age.getText()) > 21 && male.isSelected()){
                    isChild(true);
                }else if(Integer.parseInt(age.getText()) > 18 && female.isSelected()){
                    isChild(true);
                }
                updatemap.put("Age", age.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(textWatchers.isNumerical(age.getText())){
                    textWatchers.showRight(age);
                } else {
                    textWatchers.showError(age);
                }
                updatemap.put("Age", age.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
    
    private void FemaleParts(Boolean visibility) {
        if(!unmarried.isSelected()){
            jLabel14.setVisible(visibility);
            jLabel15.setVisible(visibility);
            chldevrborn.setVisible(visibility);
            noofchldalive.setVisible(visibility);
            if(!visibility){
                updatemap.remove("Chdnevenborn");
                updatemap.remove("Noofchdnalivelastyr");
            }
        }
    }
    
    private void marriedParts(Boolean visibility) {
        if(female.isSelected()){
            jLabel14.setVisible(visibility);
            jLabel15.setVisible(visibility);
            chldevrborn.setVisible(visibility);
            noofchldalive.setVisible(visibility);
            if(!visibility){
                updatemap.remove("Chdnevenborn");
                updatemap.remove("Noofchdnalivelastyr");
            }
        }
        jLabel13.setVisible(visibility);
        aprxmarage.setVisible(visibility);
        if(!visibility){
            updatemap.remove("Apromarriageage");
        }
    }

    private void isChild(Boolean visibility){
        jLabel12.setVisible(visibility);
        married.setVisible(visibility);
        unmarried.setVisible(visibility);
        marriedParts(visibility);
        if(!visibility){
            updatemap.remove("Marstatus");
            FemaleParts(visibility);
        }
    }
}