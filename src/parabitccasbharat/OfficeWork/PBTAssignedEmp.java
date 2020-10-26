
package parabitccasbharat.OfficeWork;

import parabitccasbharat.OfficeWork.PBTOfficeMainDashBoard;
import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parabitccasbharat.PBTCurrentEmp;

public class PBTAssignedEmp extends javax.swing.JFrame {

    PBTDataOfEmployee data;
    PBTOfficeMainDashBoard parent;
    DefaultTableModel assignedmodel;
    ParabitDBC db;
    int whichtype;
    public PBTAssignedEmp(PBTOfficeMainDashBoard parent,int whichtype) {
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.parent = parent;
        this.db = new ParabitDBC();
        this.whichtype = whichtype;
        assignedmodel = (DefaultTableModel)assignedemp.getModel();
        fetcassigntable(0);
        addListener();
        if(whichtype == 0)
            showdiss.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        assignedemp = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        citywise = new javax.swing.JTable();
        showdiss = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        assignedemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CEID", "GEID", "Name", "Email", "NoOfCity", "NoOfWards", "TotalPop"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(assignedemp);
        if (assignedemp.getColumnModel().getColumnCount() > 0) {
            assignedemp.getColumnModel().getColumn(3).setResizable(false);
        }

        citywise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Town_vill", "Ward", "PopAlloted"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(citywise);

        showdiss.setText("Show Dismissed Emp");
        showdiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdissActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showdiss)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showdiss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showdissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdissActionPerformed
        // TODO add your handling code here:
        fetcassigntable(1);
    }//GEN-LAST:event_showdissActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable assignedemp;
    private javax.swing.JTable citywise;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton showdiss;
    // End of variables declaration//GEN-END:variables

    private void fetcassigntable(int diss) {
        String query = "SELECT *, COUNT(DISTINCT a.city_vill) as city,COUNT(DISTINCT a.wardno) as ward,sum(TotalRes) as tot FROM `pbtempschecdule` as a JOIN `pbtemployeetable2` as b ON a.ceid = b.ceid WHERE a.CRepEmpID = '" + data.getCeid() + "'";
        if(diss == 1){
            query = query + " and status = -1";
        }
        query = query + " GROUP by a.CEID";
        assignedmodel.setRowCount(0);
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String ceid = db.rs1.getString("a.ceid");
                String geid = db.rs1.getString("b.geid");
                String name = db.rs1.getString("b.Empname");
                String email = db.rs1.getString("b.email");
                String noofcity = db.rs1.getString("city");
                String noofward = db.rs1.getString("ward");
                String totpop = db.rs1.getString("tot");
                Object row[] = {ceid,geid,name,email,noofcity,noofward,totpop};
               assignedmodel.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void addListener() {
        assignedemp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = assignedemp.rowAtPoint(e.getPoint());
                String ceid = assignedemp.getValueAt(row, 0).toString();
                switch(e.getClickCount())
                {
                    case 1:
                        fetchCityWise(ceid);
                        break;
                    case 2:{
                        switch(whichtype){
                            case 1:{
                                String options[] = {"Dismiss","Replace"};
                                int ans = JOptionPane.showOptionDialog(null, "What Do Yo Wnat To Do...", "Select What You Want", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                                switch(ans){
                                    case 0:{
                                        //Dissmiss
                                        int newass = JOptionPane.showConfirmDialog(null, "Do you want to assign\n new employee in this place");
                                        if(ans==0){
                                            //Yes
                                        }
                                    }break;
                                    case 1:{
                                        PBTAssignedEmp assigned = new PBTAssignedEmp( parent, 3);
                                        assigned.assignedmodel.removeRow(row);
                                        assigned.setVisible(true);
                                    }break;
                                }
                            }break;
                            case 3:{
                                //transfer the emp with previous employee
                            }break;
                        }
                    }break;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        citywise.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = citywise.rowAtPoint(e.getPoint());
                if(e.getClickCount()==2){
                    String options[] = {"Dismiss","Replace"};
                    int ans = JOptionPane.showOptionDialog(null, "What Do Yo Wnat To Do...", "Select What You Want", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                    switch(ans){
                        case 0:{
                            //Dissmiss
                        }break;
                        case 1:{
                            //Transfer
                        }break;
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    
    private void fetchCityWise(String ceid)
    {
        String query = "SELECT * FROM `pbtempschecdule` as sch join (SELECT a.*,b.name as distname FROM `pbtenum` as a left JOIN (SELECT DISTINCT Town_Vill,Name FROM `pbtenum` WHERE Level = 'town') as b on a.town_vill = b.town_vill ORDER BY `b`.`Name`  DESC) as c on sch.city_vill = c.town_vill OR (sch.city_vill = c.town_vill AND sch.wardno = c.ward) WHERE CEID = '" + ceid + "'";
        DefaultTableModel model = (DefaultTableModel)citywise.getModel();
        model.setRowCount(0);
        try {
            db.rs2 = db.stm.executeQuery(query);
            while(db.rs2.next())
            {
                String level = db.rs2.getString("c.level");
                String ward = "",town = "";
                if(level.equals("ward")){
                    ward = db.rs2.getString("c.name");
                    town = db.rs2.getString("c.distname");
                }
                else
                    town = db.rs2.getString("c.name");
                String popalloted = db.rs2.getString("sch.totalres");
                Object row[] = {town,ward,popalloted};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
