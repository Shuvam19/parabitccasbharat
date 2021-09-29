
package parabitccasbharat.OfficeWork;

import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import parabitccasbharat.PBTCurrentEmp;


public class PBTEmpSummary<T> extends javax.swing.JDialog {

    public static final String NOTIFICATION = "Notification";
    public static final String SUMMAERY = "Summary";
    private final PBTDataOfEmployee data;
    private final ParabitDBC db;
    private final List<String> ceidlist = new ArrayList<>();
    private final List<String> childceidlist = new ArrayList<>();
    private final List<String> seniourceidlist = new ArrayList<>();
    private static String whichtype;
    T parent;

    public PBTEmpSummary(T parent) {
        super((JFrame)parent,true);
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            this.setVisible(false);
            PBTCurrentEmp.newLoginEmployee();
        }
        this.parent = parent;
        this.db = new ParabitDBC();
        String finalQuery = getFinalQuery(data.getCeid(),data.getGrade());
        if(!data.isEnumerator()){
            fetchDataTable(parentemp , finalQuery,ceidlist);
        }
        System.out.println("final Query is " + finalQuery);
        clicklisteners();

    }
    
    public PBTEmpSummary addNotificationPart(){
        whichtype = NOTIFICATION;
        switch (data.getGrade()){
            case 1 : 
                sendtoparent.setVisible(false);
                break;
            case 2 : 
                fetchsendtoparent();
               break;
            case 3 : 
                fetchsendtoparent();
                break;
            case 4 : 
                fetchsendtoparent();
                junioremppanel.setVisible(false);
                break;
            case 5 : 
                fetchsendtoparent();
                junioremppanel.setVisible(false);
                parentempanel.setVisible(false);
                break;
        }
        pack();
        setLocationRelativeTo(null);
        return this;
    }
    
    public PBTEmpSummary addSummaryPart(){
        whichtype = SUMMAERY;
        sendtoparent.setVisible(false);
        if(data.getGrade()==4){
            junioremppanel.setVisible(false);
        }
        pack();
        setLocationRelativeTo(null);
        return this;
    }
      
    public static <K> PBTEmpSummary getNotificationInstance(K parent){
        return new PBTEmpSummary(parent).addNotificationPart();
    }
    
    public static <K> PBTEmpSummary getSummaryInstance(K parent){
        return new PBTEmpSummary(parent).addSummaryPart();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendtoparent = new javax.swing.JComboBox<>();
        parentempanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        parentemp = new javax.swing.JTable();
        junioremppanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        juniouremp = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sendtoparent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        parentemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Mobile No", "Work Done", "Work Alloted", "Work Pending", "Not Responding"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(parentemp);

        javax.swing.GroupLayout parentempanelLayout = new javax.swing.GroupLayout(parentempanel);
        parentempanel.setLayout(parentempanelLayout);
        parentempanelLayout.setHorizontalGroup(
            parentempanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentempanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        parentempanelLayout.setVerticalGroup(
            parentempanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentempanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );

        juniouremp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Mobille No", "Work Done", "Work Alloted", "Work Pending", "Not Responding"
            }
        ));
        jScrollPane2.setViewportView(juniouremp);

        javax.swing.GroupLayout junioremppanelLayout = new javax.swing.GroupLayout(junioremppanel);
        junioremppanel.setLayout(junioremppanelLayout);
        junioremppanelLayout.setHorizontalGroup(
            junioremppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(junioremppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        junioremppanelLayout.setVerticalGroup(
            junioremppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(junioremppanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parentempanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(junioremppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(sendtoparent, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendtoparent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parentempanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(junioremppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel junioremppanel;
    private javax.swing.JTable juniouremp;
    private javax.swing.JTable parentemp;
    private javax.swing.JPanel parentempanel;
    private javax.swing.JComboBox<String> sendtoparent;
    // End of variables declaration//GEN-END:variables

    private void fetchDataTable(JTable table ,String query,List listToAdd) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        try {
            System.out.println(query);
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String name = db.rs1.getString("emptable.EmpName");
                String mobno = db.rs1.getString("emptable.EmpMob");
                String ceid = db.rs1.getString("emptable.CEID");
                listToAdd.add(ceid);
                String workd = db.rs1.getString("totworkdone");
                String worka = db.rs1.getString("totalresident");
                String workp = "" + (Long.parseLong(worka) - Long.parseLong(workd));
                String nores = "0";
                Object row[] = {name, mobno, workd, worka, workp, nores};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clicklisteners() {
        parentemp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = parentemp.rowAtPoint(e.getPoint());
                String ceid = ceidlist.get(row);
                switch(e.getClickCount()) {
                    case 1: parentFirstClickCount(ceid,data.getGrade()+1);
                        break;
                    case 2: sendMessage(ceid);
                        break;
                }
            }
        });
        juniouremp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = juniouremp.rowAtPoint(e.getPoint());
                String ceid = childceidlist.get(row);
                sendMessage(ceid);
            }
        });
        sendtoparent.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println(sendtoparent.getSelectedItem());
                    if(sendtoparent.getSelectedIndex() > 0){
                        String ceid = seniourceidlist.get(sendtoparent.getSelectedIndex()-1);
                        System.out.println(ceid);
                        int ans = JOptionPane.showConfirmDialog(null, "Do you Want to send message to " + sendtoparent.getSelectedItem());
                        if(ans == 0) {
                            PBTSendMessage sendmessage = new PBTSendMessage( parent, 1, ceid);
                            sendmessage.setVisible(true);
                        }
                    }
                }
            }
        });
    }

    private void fetchsendtoparent() {
        String query4 = "SELECT CRepEmpID FROM `pbtemployeetable2`  WHERE CEID = (";
        String query = "SELECT CRepEmpID FROM `pbtemployeetable2`  WHERE CEID = '" + data.getCeid() + "'";
        String query3 = query;
        switch(data.getGrade())
        {
            case 5:
                query3 = query3 + "or CEID = (" + query + ")";
                query = query4 + query + ")";
            case 4:
                query3 = query3 + "or CEID = (" + query + ")";
                query = query4 + query + ")";
            case 3:
                query3 = query3 + "or CEID = (" + query + ")";
                break;
        }
        System.out.println(query);
        String query2 = "SELECT * FROM `pbtemployeetable2` WHERE CEID IN (" + query3 + ")";
        System.out.println(query2);
        try {
            //System.out.println(query2);
            DefaultComboBoxModel model = (DefaultComboBoxModel)sendtoparent.getModel();
            model.removeAllElements();
            model.addElement("--select--");
            db.rs1 = db.stm.executeQuery(query2);
            while(db.rs1.next()) {
                String name = db.rs1.getString("EmpName");
                String design = db.rs1.getString("EmpDesig");
                String ceid = db.rs1.getString("CEID");
                String seniourname = design + " -- " + name;
                model.addElement(seniourname);
                seniourceidlist.add(ceid);
            }
            model.setSelectedItem("--select--");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void sendMessage(String ceid) {
        if(isNotificationFrame()){
            PBTSendMessage sendmessage = new PBTSendMessage( parent, 1, ceid);
            sendmessage.setVisible(true);
        }
    }
    
    private boolean isNotificationFrame() {
        return whichtype.equals(NOTIFICATION);
    }

    private void parentFirstClickCount(String ceid,int grade) {
        String finalQuery = getFinalQuery(ceid, grade);
        fetchDataTable(juniouremp, finalQuery ,childceidlist);
    }

    private String getFinalQuery(String ceid, int grade) {
        String finalQuery;
        String queryofEmployessUnderME = getQueryOfEployessWithWorkUnderMe(ceid,grade+1);
        if(grade == 4){
            finalQuery = getQueryOfEnumerator(queryofEmployessUnderME);
        }else {
            String queryofEmployessWithCode = getQueryOfJoinedEmployessAndStatesCode(queryofEmployessUnderME,grade);
            finalQuery = getQueryOfEmpAndSchedule(queryofEmployessWithCode,grade);
        }
        return finalQuery;
    }
    
    private String getQueryOfEployessWithWorkUnderMe(String ceid,int grade) {
        return "SELECT * from `pbtemployeetable2` Where grade = '" + grade + "' AND status = 1 AND CrepEmpId = '" + ceid + "'";
    }
    
    private String getQueryOfEnumerator(String queryofEmployessUnderME) {
        return "SELECT *,SUM(empsched.workdone) as totworkdone,SUM(empsched.totalres) as totalresident FROM (" + queryofEmployessUnderME + ") as emptable JOIN `pbtempschecdule` as empsched ON (emptable.ceid=empsched.ceid) GROUP BY empsched.ceid";
    }
    
    private String getQueryOfJoinedEmployessAndStatesCode(String queryofEmployessUnderME, int grade) {
        String query = "SELECT * FROM (" + queryofEmployessUnderME + ") as emp JOIN `pbtstates5` as st ON (";
        switch(grade){
            case 3: query += "emp.areacity = st.subdist AND ";
            case 2: query += "emp.areadist = st.district AND ";
            case 1: query += "emp.areastate = st.state";
        }
        return query + ") GROUP BY " + getGroupByOfstates(grade);
    }
    
    private String getQueryOfEmpAndSchedule(String queryofEmployessWithCode,int grade) {
        String finalQuery = "SELECT *,SUM(empsched.workdone) as totworkdone,SUM(empsched.totalres) as totalresident FROM (" + queryofEmployessWithCode + ") as emptable JOIN `pbtempschecdule` as empsched ON (";
        switch(grade){
            case 3 : finalQuery += "emptable.subdistcode = empsched.tehsil AND ";
            case 2 : finalQuery += "emptable.distcode = empsched.dist AND ";
            case 1 : finalQuery += "emptable.statecode = empsched.state";
        }
        finalQuery += ") GROUP BY " + getGroupBy(grade);
        return finalQuery;
    }

    private String getGroupByOfstates(int grade) {
        switch (grade) {
            case 1 : return "states";
            case 2 : return "district";
            default: return "subdist";
        }
    }
    
    private String getGroupBy(int grade) {
        switch (grade) {
            case 1 : return "state";
            case 2 : return "dist";
            case 3 : return "tehsil";
            default: return "city_vill";
        }
    }
}
