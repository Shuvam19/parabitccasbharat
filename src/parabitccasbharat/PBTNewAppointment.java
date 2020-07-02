package parabitccasbharat;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PBTNewAppointment extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    ParabitDBC db;
    public PBTNewAppointment(PBTDataOfEmployee data,PBTOfficeMainDashBoard parent) {
        super(parent , true);
        initComponents();
        this.data = data;
        db = new ParabitDBC();
        switch (data.getGrade()) {
            case 1:fetchStates();
            districts.setVisible(false);
            tehsils.setVisible(false);
                break;
            case 2:fetchDist(data.getAreastate());
            tehsils.setVisible(false);
                break;
            case 3:fetchTehsil(data.getAreastate(),data.getAreadist());
                break;
            default:closeAll(data);
                break;
        }
        fetchempdata();
        clickListeners();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        states = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        districts = new javax.swing.JComboBox<>();
        tehsils = new javax.swing.JComboBox<>();
        popu = new javax.swing.JLabel();
        population = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEID", "GEID", "Name", "Grade", "MobileNo", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(emptable);

        states.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Select State");

        districts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tehsils.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        popu.setText("Population :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(districts, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tehsils, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(popu)
                                .addGap(18, 18, 18)
                                .addComponent(population)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(districts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tehsils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(popu)
                    .addComponent(population))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        setSize(new java.awt.Dimension(627, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> districts;
    private javax.swing.JTable emptable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel popu;
    private javax.swing.JLabel population;
    private javax.swing.JComboBox<String> states;
    private javax.swing.JComboBox<String> tehsils;
    // End of variables declaration//GEN-END:variables

    private void fetchempdata() {
        DefaultTableModel model = (DefaultTableModel)emptable.getModel();
        String query = "SELECT * FROM `pbtemployeetable2` WHERE Grade = '" + (data.getGrade()+1) + "'";
        /*switch(data.getGrade())
        {
            case 1:
                break;
            case 4:
                query = query + " and  AreaCity = '" + data.getAreacity() + "'";
            case 3:
                query = query + " and  AreaDist = '" + data.getAreadist() + "'";
            case 2:
                query = query + " and  AreaState = '" + data.getAreastate() + "'";
                break;
            default:
                break;
        }*/
        query = query + "and Status = 0;";
        model.setRowCount(0);
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String ceid = db.rs1.getString("CEID");
                String geid = db.rs1.getString("GEID");
                String name = db.rs1.getString("EmpName");
                int grade = db.rs1.getInt("Grade");
                String email = db.rs1.getString("Email");
                String mob = db.rs1.getString("EmpOffMob");
                Object row[] = {ceid,geid,name,grade,mob,email};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clickListeners() {
        emptable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(states.getSelectedItem().equals("--select--") || districts.getSelectedItem().equals("--select--") || tehsils.getSelectedItem().equals("--select--"))
                {
                    switch(data.getGrade())
                    {
                        case 1:
                            JOptionPane.showMessageDialog(null,"Select the State Please");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,"Select the District Please");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,"Select the Sub-District Please");
                            break;
                    }
                }
                else
                {
                    int row = emptable.rowAtPoint(e.getPoint());
                    String geid = emptable.getValueAt(row, 1).toString();
                    String ceid = (data.getGrade()+1) + "" + geid;
                    String name = emptable.getValueAt(row, 2).toString();
                    addEmployee(ceid,name,geid);
                    
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
        states.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String state = e.getItem().toString();
                if(!state.equals("--select--"))
                {
                String query = "Select Sum(tpopulation) as pop from `pbtstates5` where states = '" + state + "' group by states";
                try {
                    db.rs3 = db.stm.executeQuery(query);
                    if(db.rs3.next()){
                    String pop = db.rs3.getString("pop");
                    System.out.println(pop);
                    population.setText(pop);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            }
        });
        
        districts.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String district = e.getItem().toString();
                if(!district.equals("--select--"))
                {
                String query = "Select Sum(tpopulation) as pop from `pbtstates5` where District = '" + district + "' group by District";
                try {
                    db.rs3 = db.stm.executeQuery(query);
                    if(db.rs3.next()){
                    String pop = db.rs3.getString("pop");
                    System.out.println(pop);
                    population.setText(pop);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            }
        });
        
        tehsils.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String subdistrict = e.getItem().toString();
                if(subdistrict.equals("--select--")){
                String query = "Select Sum(tpopulation) as pop from `pbtstates5` where SubDist = '" + subdistrict + "' group by SubDist";
                try {
                    db.rs3 = db.stm.executeQuery(query);
                    if(db.rs3.next()){
                    String pop = db.rs3.getString("pop");
                    System.out.println(pop);
                    population.setText(pop);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                }
            }
        });
    }
    
    private void fetchStates() {
        String query = "SELECT DISTINCT states FROM `pbtstates5` WHERE states NOT IN (SELECT DISTINCT AreaState FROM `pbtemployeetable2` WHERE Status = 1)";
        DefaultComboBoxModel model = (DefaultComboBoxModel)states.getModel();
        model.removeAllElements();
        System.out.println(query);
        model.addElement("--select--");
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String state = db.rs1.getString("states");
                model.addElement(state);
            }
            model.setSelectedItem("--select--");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchDist(String areastate) {
        String query = "SELECT DISTINCT District FROM `pbtstates5`WHERE District NOT IN (SELECT DISTINCT AreaDist FROM `pbtemployeetable2` WHERE Status = 1 and AreaState = '" + data.getAreastate() + "' and  Grade > " + data.getGrade() + ") AND States = '" + data.getAreastate() + "'";
        DefaultComboBoxModel model = (DefaultComboBoxModel)districts.getModel();
        DefaultComboBoxModel statemodel  = (DefaultComboBoxModel) states.getModel();
        statemodel.removeAllElements();
        statemodel.addElement(areastate);
        model.removeAllElements();
        model.addElement("--select--");
        try {
            db.rs2 = db.stm.executeQuery(query);
            while(db.rs2.next())
            {
                String district = db.rs2.getString("district");
                model.addElement(district);
            }
            model.setSelectedItem("--select--");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchTehsil(String areastate, String areadist) {
        String query = "SELECT DISTINCT SubDist FROM `pbtstates5`WHERE SubDist NOT IN (SELECT DISTINCT Areacity FROM `pbtemployeetable2` WHERE Status = 1 and AreaState = '" + data.getAreastate() + "' and AreaDist = '" + data.getAreadist() + "' and  Grade > " + data.getGrade() + ") AND States = '" + data.getAreastate() + "' and District = '" + data.getAreadist() + "'" ;
        System.out.println(query);
        DefaultComboBoxModel statemodel = (DefaultComboBoxModel)states.getModel();
        DefaultComboBoxModel distmodel = (DefaultComboBoxModel)districts.getModel();
        DefaultComboBoxModel model = (DefaultComboBoxModel)tehsils.getModel();
        statemodel.removeAllElements();
        statemodel.addElement(areastate);
        statemodel.setSelectedItem(areastate);
        distmodel.removeAllElements();
        distmodel.addElement(areadist);
        distmodel.setSelectedItem(areadist);
        model.removeAllElements();
        model.addElement("--select--");
        try {
            db.rs3 = db.stm.executeQuery(query);
            while(db.rs3.next())
            {
                String tehsil = db.rs3.getString("SubDist");
                model.addElement(tehsil);
            }
            model.setSelectedItem("--select--");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void closeAll(PBTDataOfEmployee data1) {
        DefaultComboBoxModel statemodel = (DefaultComboBoxModel)states.getModel();
        DefaultComboBoxModel distmodel = (DefaultComboBoxModel)districts.getModel();
        DefaultComboBoxModel tehsilmodel = (DefaultComboBoxModel)tehsils.getModel();
        System.out.println(data1.getAreacity());
        statemodel.removeAllElements();
        distmodel.removeAllElements();
        tehsilmodel.removeAllElements();
        statemodel.addElement(data1.getAreastate());
        statemodel.setSelectedItem(data1.getAreastate());
        distmodel.addElement(data1.getAreadist());
        distmodel.setSelectedItem(data1.getAreadist());
        tehsilmodel.addElement(data1.getAreacity());
        tehsilmodel.setSelectedItem(data1.getAreacity());
    }
    
    private void sendNotification(String ceid,String name)
    {
        String message = "Hello " + name + ". Welcome to CCASBHARAT ";
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
        String query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', '" + ceid +  "', '" + timestamp + "', '" + message + "', '0', NULL, NULL, '1');";
        try {
            db.stm2.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void addEmployee(String ceid,String name,String geid)
    {
        String state,dist,subdist,query1 = "UPDATE `pbtemployeetable2` SET Status = 1, CEID = '" + ceid +"' , CRepEmpId = '" + data.getCeid() + "'";
        String query2 = "UPDATE `pbtemployeetable2` SET CRepEmpId = '" + ceid + "' WHERE";
        switch(data.getGrade())
        {
            case 3:
                subdist = tehsils.getSelectedItem().toString();
                query2 = query2 + " AreaCity = '" + subdist + "' and";
                query1 = query1 + " , AreaCity = '" + subdist + "'";
            case 2:
                dist = districts.getSelectedItem().toString();
                query2 = query2 + " AreaDist = '" + dist + "' and";
                query1 = query1 + ", AreaDist = '" + dist + "'";
            case 1:
                state = states.getSelectedItem().toString();
                query2 = query2 + " AreaState = '" + state + "' and";
                query1 = query1 + " , AreaState = '" + state + "'";
                break;
            default:
                break;
        }
        query1 = query1 + "  WHERE GEID = '" + geid + "';";
        query2 = query2 + " CRepEmpId = 'T" + data.getCeid() + "'";
        //System.out.println(query1);
        //System.out.println(query2);
        int ans = JOptionPane.showConfirmDialog(null, "Do You Want to add this person");
        if(ans==0)
        {
            try {
                db.stm.execute(query1);
                sendNotification(ceid,name);
                db.stm2.execute(query2);
                fetchempdata();
                switch(data.getGrade())
                {
                    case 1:
                        fetchStates();
                        break;
                    case 2:
                        fetchDist(states.getSelectedItem().toString());
                        break;
                    case 3:
                        fetchTehsil(states.getSelectedItem().toString(), districts.getSelectedItem().toString());
                        break;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else
        {
            System.err.println("Not Done");
        }
    }
}
