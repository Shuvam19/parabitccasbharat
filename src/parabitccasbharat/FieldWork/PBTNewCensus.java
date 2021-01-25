package parabitccasbharat.FieldWork;

import DB.ParabitDBC;
import Models.PBTDataOfEmployee;
import Models.PBTDataScheduledToEmp;
import Models.PBTIndustry;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parabitccasbharat.PBTCurrentEmp;


public class PBTNewCensus<T> extends javax.swing.JFrame {

    private final T parent;
    private final PBTDataOfEmployee data;
    private final ParabitDBC db = new ParabitDBC();
    List<PBTDataScheduledToEmp> arealist = new ArrayList<>();
    
    public PBTNewCensus(T parent) {
        initComponents();
        this.parent = parent;
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        fetchvillages();
        addClickListeners();
        jPanel1.setVisible(false);
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        houselisting = new javax.swing.JButton();
        industrial = new javax.swing.JButton();
        land = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectarea = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        houselisting.setText("House Listing");
        houselisting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houselistingActionPerformed(evt);
            }
        });

        industrial.setText("Industrial Census");
        industrial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                industrialActionPerformed(evt);
            }
        });

        land.setText("Land");
        land.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landActionPerformed(evt);
            }
        });

        selectarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Area Name", "Tot Pop", "Work Done", "Remaining Pop"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(selectarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(industrial)
                        .addGap(64, 64, 64)
                        .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(industrial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void houselistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houselistingActionPerformed
//        PBTTypeOfHome newhome = new PBTTypeOfHome(parent);
//        newhome.setVisible(true);
        jPanel1.setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_houselistingActionPerformed

    private void industrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_industrialActionPerformed
        String icsno = JOptionPane.showInputDialog("Enter ICSNo First");
        if(icsno!=null && !icsno.isEmpty()) {
            if(checkIsPresentPreviously(icsno)){
                InsertItAndSendToNextFrame(icsno);
            }
        } else {
            JOptionPane.showMessageDialog(null,"Please Enter ICSNo First");
            industrialActionPerformed(evt);
        }
    }//GEN-LAST:event_industrialActionPerformed

    private void landActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_landActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton houselisting;
    private javax.swing.JButton industrial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton land;
    private javax.swing.JTable selectarea;
    // End of variables declaration//GEN-END:variables

    private boolean checkIsPresentPreviously(String icsno) {
        try {
            String query = "SELECT * From `pbtindustry` where icsno ='" + icsno + "'";
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next()){
                JOptionPane.showMessageDialog(null, "This Company is Previously Registered \n Please Complete it in Incomplete Census Or It has been Completed Successfully");
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTNewCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void InsertItAndSendToNextFrame(String icsno) {
        try {
            String query = "INSERT INTO `pbtindustry` (`SNo`, `ICSNo`, `RegWith`, `RegNo`, `NameOfBusiness`, `CompANo`, `CompOwnrANo`, `CompRegDate`, `OfficeType`, `FSSAINo`, `EnvCertNo`, `AreaOfComp`, `TurnOverOfComp`, `FnlProdOfComp`, `PrsntCEOofComp`, `NoOfMaleEmp`, `NoOfFemEMp`, `NoOfOtherEmp`, `MinSalOfComp`, `MaxSalOfComp`, `NoOfShift`, `ExportProd`, `GSTNo`, `MainSrcLight`, `MainSrc_WatForIndus`, `MainSrc_DrnkWat_inIndus`, `NoOfWash_inIndus`, `AvbOfCant`, `NearestPS`, `NearestHsp`, `NearestFireBrgd`, `NearestRail`, `NearestBusStp`, `NearestArprt`, `NearestTrnsprtAr`, `AvbOfMedFac_InsdComp`) VALUES (NULL, ?, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)";
            PreparedStatement stmt = db.con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, icsno);
            int isUpdated = stmt.executeUpdate();
            System.out.println(isUpdated);
            if (isUpdated == 1) {
                db.rs2 = stmt.getGeneratedKeys();
                if(db.rs2.next()){
                    String sno = db.rs2.getString(1);
                    makeObjectAndSendToNextFrame(sno);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTNewCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void makeObjectAndSendToNextFrame(String sno) {
        try {
            String query = "SELECT * FROM `pbtindustry` where sno = '" + sno + "'";
            db.rs3 = db.stm2.executeQuery(query);
            if(db.rs3.next()){
                PBTIndustry industryData = new PBTIndustry();
                industryData.setIcsno(db.rs3.getInt(2));
                sendToNextFrame(industryData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTNewCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendToNextFrame(PBTIndustry industryData) {
        PBTIndustrialCensus frame = new PBTIndustrialCensus(this,industryData);
        this.dispose();
        frame.setVisible(true);
    }
    
    private void fetchvillages() {
        String query = "SELECT a.*,b.name FROM `pbtempschecdule` as a JOIN `pbtenum` as b on (a.state=b.statecode and a.dist=b.distcode and a.tehsil=b.subdistcode and (a.city_vill = b.town_vill or (a.city_vill = b.town_vill and a.wardno=b.ward))) where a.ceid = '" + data.getCeid() + "'";
        DefaultTableModel model = (DefaultTableModel)selectarea.getModel();
        model.setRowCount(0);
        arealist.clear();
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next()){
                String sno = db.rs1.getString("a.sno");
                String ward = db.rs1.getString("a.wardno");
                String cityvill = db.rs1.getString("a.city_vill");
                String subdist = db.rs1.getString("a.tehsil");
                String dist = db.rs1.getString("a.dist");
                String state = db.rs1.getString("a.state");
                String areaname = db.rs1.getString("b.name");
                String totpop = db.rs1.getString("TotalRes");
                String workdone = db.rs1.getString("workdone");
                String remaining  = "0";
                PBTDataScheduledToEmp schedule = new PBTDataScheduledToEmp(Integer.parseInt(sno), ward, remaining, ward, cityvill, subdist, dist, state, workdone, totpop);
                arealist.add(schedule);
                Object row[] = {areaname,totpop,workdone,remaining};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void addClickListeners() {
        selectarea.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = selectarea.rowAtPoint(e.getPoint());
                String areaname = selectarea.getValueAt(row, 0).toString();
                if(e.getClickCount()==2){
                    int ans = JOptionPane.showConfirmDialog(null, "Do You Want to Work in the Area " + areaname);
                    //Need To implement here
                    if(ans==0){
                        //updateLoggedInPersonsArea(areaname);
//                        PBTFieldDashBoard dashBoard = new PBTFieldDashBoard(arealist.get(row));
//                        dispose();
//                        dashBoard.setVisible(true);
                        PBTTypeOfHome newhome = new PBTTypeOfHome(parent);
                        newhome.setVisible(true);
                    }
                }
            }

        });
    }
}
