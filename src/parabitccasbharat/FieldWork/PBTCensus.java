package parabitccasbharat.FieldWork;

import DB.ParabitDBC;
import Models.PBTDataOfEmployee;
import Models.PBTDataScheduledToEmp;
import Models.PBTIndustry;
import java.awt.Color;
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
import parabitccasbharat.Custom.CustomTable;
import parabitccasbharat.Custom.RoundedPanel;
import parabitccasbharat.PBTCurrentEmp;


public class PBTCensus<T> extends RoundedPanel {

    private final T parent;
    private final PBTDataOfEmployee data;
    private final ParabitDBC db = new ParabitDBC();
    List<PBTDataScheduledToEmp> arealist = new ArrayList<>();
    private final ClickListener clickListener;
    
    public interface ClickListener<H> {
        public void onHouseListingCensus(H parent);
    }
    
    public PBTCensus(T parent,ClickListener clickListener) {
        super(15,Color.GREEN);
        initComponents();
        this.parent = parent;
        this.clickListener=clickListener;
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            PBTCurrentEmp.newLoginEmployee();
        }
        CustomTable.designTable(selectarea);
        fetchvillages();
        addClickListeners();
        jPanel1.setVisible(false);
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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(industrial)
                .addGap(43, 43, 43)
                .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(houselisting, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(industrial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(land, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void houselistingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houselistingActionPerformed
//        PBTTypeOfHome newhome = new PBTTypeOfHome(parent);
//        newhome.setVisible(true);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_houselistingActionPerformed

    private void industrialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_industrialActionPerformed
        String icsno = JOptionPane.showInputDialog("Enter ICSNo First");
        if(icsno!=null && !icsno.isEmpty()) {
            if(checkIsPresentPreviously(icsno)) {
                insertItAndSendToNextFrame(icsno);
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
                //JOptionPane.showMessageDialog(null, "This Company is Previously Registered \n Please Complete it in Incomplete Census Or It has been Completed Successfully");
                String sno = db.rs1.getString(1);
                makeObjectAndSendToNextFrame(sno);
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void insertItAndSendToNextFrame(String icsno) {
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
            Logger.getLogger(PBTCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void makeObjectAndSendToNextFrame(String sno) {
        try {
            String query = "SELECT * FROM `pbtindustry` where sno = '" + sno + "'";
            db.rs3 = db.stm2.executeQuery(query);
            if(db.rs3.next()){
                PBTIndustry industryData = new PBTIndustry();
                industryData.setIcsno(db.rs3.getInt(2));
                industryData.setRegwith(db.rs3.getInt(3));
                industryData.setRegno(db.rs3.getString(4));
                industryData.setNameofbusiness(db.rs3.getString(5));
                industryData.setCompano(db.rs3.getString(6));
                industryData.setCompownrano(db.rs3.getString(7));
                industryData.setCompregdate(db.rs3.getDate(8));
                industryData.setOfficetype(db.rs3.getInt(9));
                industryData.setFssaino(db.rs3.getString(10));
                industryData.setEnvcertno(db.rs3.getString(11));
                industryData.setAreaofcomp(db.rs3.getString(12));
                industryData.setTurnoverofcomp(db.rs3.getInt(13));
                industryData.setFnlprodofcomp(db.rs3.getString(14));
                industryData.setPrsntceoofcomp(db.rs3.getString(15));
                industryData.setNoofmaleemp(db.rs3.getInt(16));
                industryData.setNooffememp(db.rs3.getInt(17));
                industryData.setNoofotheremp(db.rs3.getInt(18));
                industryData.setMinsalofcomp(db.rs3.getInt(19));
                industryData.setMaxsalofcomp(db.rs3.getInt(20));
                industryData.setNoofshift(db.rs3.getInt(21));
                industryData.setExportprod(db.rs3.getString(22));
                industryData.setGstno(db.rs3.getString(23));
                industryData.setMainsrclight(db.rs3.getString(24));
                industryData.setMainsrc_watforindus(db.rs3.getString(25));
                industryData.setMainsrc_drnkwat_inindus(db.rs3.getString(26));
                industryData.setNoofwash_inindus(db.rs3.getInt(27));
                industryData.setAvbofcant(db.rs3.getString(28));
                industryData.setNearestps(db.rs3.getString(29));
                industryData.setNearesthsp(db.rs3.getString(30));
                industryData.setNearestfirebrgd(db.rs3.getString(31));
                industryData.setNearestrail(db.rs3.getString(32));
                industryData.setNearestbusstp(db.rs3.getString(33));
                industryData.setNearestarprt(db.rs3.getString(34));
                industryData.setNearesttrnsprtar(db.rs3.getString(35));
                industryData.setAvbofmedfac_insdcomp(db.rs3.getString(36));
                sendToNextFrame(industryData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PBTCensus.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void sendToNextFrame(PBTIndustry industryData) {
        PBTIndustrialCensus frame = new PBTIndustrialCensus(this,industryData);
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
                        clickListener.onHouseListingCensus(parent);
                    }
                }
            }

        });
    }
}
