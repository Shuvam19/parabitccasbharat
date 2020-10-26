package parabitccasbharat.FieldWork;

import Models.PBTDataOfEmployee;
import parabitccasbharat.Utilities.PBTTypeOfHouse;
import DB.ParabitDBC;
import Models.PBTHouseListingModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import parabitccasbharat.PBTCurrentEmp;

public class PBTTypeOfHome<T> extends javax.swing.JFrame {

    T parent;
    PBTDataOfEmployee data;
    PBTHouseListingModel dataofhome;
    ParabitDBC db;
    public PBTTypeOfHome(T parent) {
        initComponents();
        this.parent = parent;
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.db = new ParabitDBC();
        this.dataofhome = new PBTHouseListingModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        residence = new javax.swing.JToggleButton();
        residencecumotheruse = new javax.swing.JToggleButton();
        shopoffice = new javax.swing.JToggleButton();
        vacant = new javax.swing.JToggleButton();
        guesthouse = new javax.swing.JToggleButton();
        hospital = new javax.swing.JToggleButton();
        schoolcollege = new javax.swing.JToggleButton();
        factory = new javax.swing.JToggleButton();
        placeofworship = new javax.swing.JToggleButton();
        otheruse = new javax.swing.JToggleButton();
        saveexit = new javax.swing.JButton();
        saveproceed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        latitude = new javax.swing.JTextField();
        Longitute = new javax.swing.JTextField();
        mobno = new javax.swing.JTextField();
        landmark = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        adress = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(residence);
        residence.setText("Residence");

        buttonGroup1.add(residencecumotheruse);
        residencecumotheruse.setText("Residence Cum Other Use");

        buttonGroup1.add(shopoffice);
        shopoffice.setText("Shop / Office");

        buttonGroup1.add(vacant);
        vacant.setText("Vacant");

        buttonGroup1.add(guesthouse);
        guesthouse.setText("Home / Lodge / Guest House");

        buttonGroup1.add(hospital);
        hospital.setText("Hospital / Dispensary");

        buttonGroup1.add(schoolcollege);
        schoolcollege.setText("School / College");

        buttonGroup1.add(factory);
        factory.setText("Factory / WorkShop / WorkShed");

        buttonGroup1.add(placeofworship);
        placeofworship.setText("Place Of Worship");

        buttonGroup1.add(otheruse);
        otheruse.setText("Other Non - Residental Use");

        saveexit.setText("Save And Exit");
        saveexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveexitActionPerformed(evt);
            }
        });

        saveproceed.setText("Save And Proceed");
        saveproceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveproceedActionPerformed(evt);
            }
        });

        jLabel1.setText("Latitude : ");

        jLabel2.setText("Address :");

        jLabel3.setText("Mobile No :");

        jLabel4.setText("Longitude : ");

        jLabel5.setText("Land Mark : ");

        jLabel6.setText("Comments : ");

        latitude.setText("23.4567");

        Longitute.setText("21.7246");

        comment.setColumns(20);
        comment.setRows(5);
        comment.setToolTipText("");
        comment.setAutoscrolls(false);
        jScrollPane1.setViewportView(comment);

        adress.setColumns(20);
        adress.setRows(5);
        jScrollPane2.setViewportView(adress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(latitude, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Longitute, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(hospital)
                        .addGap(17, 17, 17)
                        .addComponent(guesthouse)
                        .addGap(21, 21, 21)
                        .addComponent(factory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(otheruse)
                        .addGap(17, 17, 17)
                        .addComponent(residencecumotheruse))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(saveexit)
                        .addGap(31, 31, 31)
                        .addComponent(saveproceed)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(vacant)
                .addGap(25, 25, 25)
                .addComponent(residence)
                .addGap(19, 19, 19)
                .addComponent(shopoffice)
                .addGap(15, 15, 15)
                .addComponent(schoolcollege)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(placeofworship)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mobno)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(landmark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(latitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Longitute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(landmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mobno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vacant, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residence, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shopoffice, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(schoolcollege, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(placeofworship, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hospital, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guesthouse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factory, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otheruse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(residencecumotheruse, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveexit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveproceed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveproceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveproceedActionPerformed
        getAllInFields();
        insertIt();
        addToEnumLogin();
        String hlsno = getHlSno();
        PBTTypeOfHouse frame = new PBTTypeOfHouse(hlsno);
        frame.setVisible(true);
    }//GEN-LAST:event_saveproceedActionPerformed

    private void saveexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveexitActionPerformed
        // TODO add your handling code here:
        getAllInFields();
        insertIt();
        addToEnumLogin();
        this.dispose();
    }//GEN-LAST:event_saveexitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Longitute;
    private javax.swing.JTextArea adress;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea comment;
    private javax.swing.JToggleButton factory;
    private javax.swing.JToggleButton guesthouse;
    private javax.swing.JToggleButton hospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField landmark;
    private javax.swing.JTextField latitude;
    private javax.swing.JTextField mobno;
    private javax.swing.JToggleButton otheruse;
    private javax.swing.JToggleButton placeofworship;
    private javax.swing.JToggleButton residence;
    private javax.swing.JToggleButton residencecumotheruse;
    private javax.swing.JButton saveexit;
    private javax.swing.JButton saveproceed;
    private javax.swing.JToggleButton schoolcollege;
    private javax.swing.JToggleButton shopoffice;
    private javax.swing.JToggleButton vacant;
    // End of variables declaration//GEN-END:variables

    private void getAllInFields() {
        dataofhome.setLatilongi(""  + latitude.getText() + "," + Longitute.getText());
        dataofhome.setHnoadd(adress.getText());
        dataofhome.setMob(mobno.getText());
        dataofhome.setComment(comment.getText());
        if(schoolcollege.isSelected()){
            dataofhome.setUseofhouse("4");
        }
        if(shopoffice.isSelected()){
            dataofhome.setUseofhouse("3");
        }
        if(vacant.isSelected()){
            dataofhome.setUseofhouse("10");
        }
        if(residencecumotheruse.isSelected()){
            dataofhome.setUseofhouse("2");
        }
        if(residence.isSelected()){
            dataofhome.setUseofhouse("1");
        }
        if(otheruse.isSelected()){
            dataofhome.setUseofhouse("9");
        }
        if(hospital.isSelected()){
            dataofhome.setUseofhouse("6");
        }
        if(guesthouse.isSelected()){
            dataofhome.setUseofhouse("5");
        }
        if(factory.isSelected()){
            dataofhome.setUseofhouse("7");
        }
        if(placeofworship.isSelected()){
            dataofhome.setUseofhouse("8");
        }
    }

    private void insertIt() {
        String query = dataofhome.toInsertQuery();
        try {
            db.stm.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private String getHlSno() {
        String query = "Select hl_sno from `pbtcensus_houselisting` where hnoadd = '" + dataofhome.getHnoadd() + "'";
        try {
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next()){
                String hlsno = db.rs1.getString(1);
                return hlsno;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void addToEnumLogin() {
        String query = "UPDATE `pbtempdailylog` SET NoOfResidVisited = NoOfResidVisited + 1 WHERE CEID = '" + data.getCeid() + "' AND LogOutTime IS NULL;";
        try {
            db.stm2.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
