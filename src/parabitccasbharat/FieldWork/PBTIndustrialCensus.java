
package parabitccasbharat.FieldWork;

import Models.PBTIndustry;
import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import parabitccasbharat.QrCapture;
import parabitccasbharat.Utilities.PBTTextWatchers;
import parabitccasbharat.Utilities.PBTUtilities;


public class PBTIndustrialCensus<T> extends JDialog {

    private final PBTIndustry industryData;
    private final HashMap<String,Object> updateMap;
    private final PBTTextWatchers textWatchers;
    
    public PBTIndustrialCensus(T parent,PBTIndustry industryData) {
        super((JFrame)parent,true);
        initComponents();
        this.industryData = industryData;
        this.updateMap = new HashMap<>();
        this.textWatchers = new PBTTextWatchers();
        updateAllFields();
        addTextWatchers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comapnydetails = new javax.swing.JButton();
        compfinancialdetails = new javax.swing.JButton();
        compinfrastructure = new javax.swing.JButton();
        complocation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        icsno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fssaino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        envcertno = new javax.swing.JTextField();
        regwith = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        aadharno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comapnydetails.setText("Company Details");
        comapnydetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comapnydetailsActionPerformed(evt);
            }
        });

        compfinancialdetails.setText("Comapny Financial Details");
        compfinancialdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compfinancialdetailsActionPerformed(evt);
            }
        });

        compinfrastructure.setText("Infrastructure Details");
        compinfrastructure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compinfrastructureActionPerformed(evt);
            }
        });

        complocation.setText("Location Details");
        complocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complocationActionPerformed(evt);
            }
        });

        jLabel1.setText("ICS No :");

        jLabel2.setText("Reg with :");

        jLabel3.setText("Reg No :");

        jLabel4.setText("Fssai No :");

        jLabel5.setText("Env cert No :");

        envcertno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envcertnoActionPerformed(evt);
            }
        });

        regwith.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        regwith.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                regwithItemStateChanged(evt);
            }
        });

        jLabel6.setText("Adhar No :");

        jButton1.setText("Scan Adhaar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(icsno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(fssaino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(comapnydetails, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(compfinancialdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(compinfrastructure, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(complocation, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(regwith, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(envcertno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(aadharno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aadharno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(icsno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(fssaino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regwith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(envcertno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comapnydetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compfinancialdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compinfrastructure, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complocation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void envcertnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envcertnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_envcertnoActionPerformed

    private void comapnydetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comapnydetailsActionPerformed
        PBTCompDetailsFrame frame = new PBTCompDetailsFrame(this,industryData);
        frame.setVisible(true);
    }//GEN-LAST:event_comapnydetailsActionPerformed

    private void compfinancialdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compfinancialdetailsActionPerformed
        PBTCompFinancialDeailsFrame frame = new PBTCompFinancialDeailsFrame(this,industryData);
        frame.setVisible(true);
    }//GEN-LAST:event_compfinancialdetailsActionPerformed

    private void compinfrastructureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compinfrastructureActionPerformed
        PBTCompInfrastructureDetailsFrame frame = new PBTCompInfrastructureDetailsFrame(this,industryData);
        frame.setVisible(true);
    }//GEN-LAST:event_compinfrastructureActionPerformed

    private void complocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complocationActionPerformed
        PBTCompLocationDeatilsFrame frame = new PBTCompLocationDeatilsFrame(this,industryData);
        frame.setVisible(true);
    }//GEN-LAST:event_complocationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            startWebCam();
        } catch (InterruptedException ex) {
            Logger.getLogger(PBTIndustrialCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String query = industryData.toUpdateQuery(updateMap);
        industryData.update(query);
        this.dispose();
    }//GEN-LAST:event_saveActionPerformed

    private void regwithItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_regwithItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            updateMap.put("RegWith", regwith.getSelectedIndex());
        }
    }//GEN-LAST:event_regwithItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadharno;
    private javax.swing.JButton comapnydetails;
    private javax.swing.JButton compfinancialdetails;
    private javax.swing.JButton compinfrastructure;
    private javax.swing.JButton complocation;
    private javax.swing.JTextField envcertno;
    private javax.swing.JTextField fssaino;
    private javax.swing.JTextField icsno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField regno;
    private javax.swing.JComboBox<String> regwith;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

    public void startWebCam() throws InterruptedException {
        QrCapture frame = QrCapture.getInstance(this);
        final Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try{
                    frame.setVisible(true);
                    String result = frame.getResult();
                    aadharno.setText(result);
                    System.out.println(result);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            };
        });
    thread.start();
    }

    private void updateAllFields() {
        addFieldsToRegWith();
        if(industryData.getIcsno()!=null){
            icsno.setText("" + industryData.getIcsno());
        }
        if(industryData.getRegno()!=null){
            regno.setText(industryData.getRegno());
        }
        if(industryData.getFssaino()!=null){
            fssaino.setText(industryData.getFssaino());
        }
        if(industryData.getEnvcertno()!=null){
            envcertno.setText(industryData.getEnvcertno());
        }
        if(industryData.getRegwith()!=null){
            regwith.setSelectedIndex(industryData.getRegwith());
        }
    }

    private void addFieldsToRegWith() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) regwith.getModel();
        model.removeAllElements();
        for (int i = 1; i <= 6; i++) {
            model.addElement(PBTUtilities.getRegWith("" + i));
        }
    }

    private void addTextWatchers() {
        textWatchers.addNameNumberTextWatcher(icsno, updateMap, "");
        textWatchers.addNameNumberTextWatcher(regno, updateMap, "");
        textWatchers.addNameNumberTextWatcher(fssaino, updateMap, "");
        textWatchers.addNameNumberTextWatcher(envcertno, updateMap, "");
    }
}
