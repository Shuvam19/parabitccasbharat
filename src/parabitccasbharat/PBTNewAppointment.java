package parabitccasbharat;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PBTNewAppointment extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    ParabitDBC db;
    public PBTNewAppointment(PBTDataOfEmployee data,PBTManageEmp parent) {
        super(parent , true);
        initComponents();
        this.data = data;
        db = new ParabitDBC();
        switch (data.getGrade()) {
            case 1:fetchStates();
            districts.setVisible(false);
            tehsils.setVisible(false);
                break;
            case 2:fetchdist(data.getAreastate());
            tehsils.setVisible(false);
                break;
            case 3:fetchtehsil(data.getAreastate(),data.getAreadist());
                break;
            default:closeall(data);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(states, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(districts, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tehsils, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> districts;
    private javax.swing.JTable emptable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
                if(states.getSelectedItem() == null)
                {
                    JOptionPane.showMessageDialog(null,"Select the State Please");
                }
                else
                {
                    int row = emptable.rowAtPoint(e.getPoint());
                    String geid = emptable.getValueAt(row, 1).toString();
                    String ceid = "" + new Random().nextInt(100000);
                    String state,dist,tehsil,query1 = "UPDATE `pbtemployeetable2` SET Status = 1, CEID = '" + ceid +"' , CRepEmpId = '" + data.getCeid() + "'";
                    switch(data.getGrade())
                    {
                        case 3:
                            tehsil = tehsils.getSelectedItem().toString();
                            query1 = query1 + " , AreaCity = '" + tehsil + "'";
                        case 2:
                            dist = districts.getSelectedItem().toString();
                            query1 = query1 + ", AreaDist = '" + dist + "'";
                        case 1:
                            state = states.getSelectedItem().toString();
                            query1 = query1 + " , AreaState = '" + state + "'";
                            break;
                        default:
                            break;
                    }
                    query1 = query1 + "  WHERE GEID = '" + geid + "';";
                    System.out.println(query1);
                    int ans = JOptionPane.showConfirmDialog(null, "Do You Want to add this person");
                    if(ans==0)
                    {
                        System.err.println("Done");
                        try {
                            db.stm.execute(query1);
                            fetchempdata();
                            switch(data.getGrade())
                            {
                                case 1:
                                    DefaultComboBoxModel model = (DefaultComboBoxModel)states.getModel();
                                    model.setSelectedItem(null);
                                    break;
                                case 2:
                                    DefaultComboBoxModel model2 = (DefaultComboBoxModel)districts.getModel();
                                    model2.setSelectedItem(null);
                                    break;
                                case 3:
                                    DefaultComboBoxModel model3 = (DefaultComboBoxModel)tehsils.getModel();
                                    model3.setSelectedItem(null);
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
    
    private void fetchStates() {
        String query = "SELECT DISTINCT sate FROM `states`";
        //String query = "SELECT sate FROM (SELECT DISTINCT sate FROM `states`) as t1 , (SELECT AreaState FROM `pbtemployeetable2` WHERE Status = 1) as t2 WHERE t1.sate != t2.AreaState";
        DefaultComboBoxModel model = (DefaultComboBoxModel)states.getModel();
        model.removeAllElements();
        model.addElement(null);
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String state = db.rs1.getString("sate");
                model.addElement(state);
            }
            model.setSelectedItem(null);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchdist(String areastate) {
        String query = "SELECT DISTINCT District FROM `states` WHERE sate = '" + areastate + "'";
        //String query = "SELECT * FROM (SELECT DISTINCT District FROM `states`) as t1 , (SELECT AreaDist,AreaState FROM `pbtemployeetable2` WHERE Status = 1) as t2 WHERE t1.district != t2.AreaDist AND t2.AreaState = '" + areastate + "'";
        DefaultComboBoxModel model = (DefaultComboBoxModel)districts.getModel();
        DefaultComboBoxModel statemodel  = (DefaultComboBoxModel) states.getModel();
        statemodel.removeAllElements();
        statemodel.addElement(areastate);
        model.removeAllElements();
        model.addElement(null);
        try {
            db.rs2 = db.stm.executeQuery(query);
            while(db.rs2.next())
            {
                String district = db.rs2.getString("district");
                model.addElement(district);
            }
            model.setSelectedItem(null);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchtehsil(String areastate, String areadist) {
        //String query = "SELECT * FROM (SELECT DISTINCT tehsil FROM `states`) as t1 , (SELECT AreaDist,AreaState,AreaCity FROM `pbtemployeetable2` WHERE Status = 1) as t2 WHERE t1.tehsil != t2.AreaCity AND t2.AreaState = '" + areastate + "' AND t2.AreaDist = '" + areadist + "'" ;
        String query = "SELECT DISTINCT tehsil FROM `states` Where `sate` = '" + areastate + "' and `district` = '" + areadist + "'" ;
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
        model.addElement(null);
        try {
            db.rs3 = db.stm.executeQuery(query);
            while(db.rs3.next())
            {
                String tehsil = db.rs3.getString("tehsil");
                model.addElement(tehsil);
            }
            model.setSelectedItem(null);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void closeall(PBTDataOfEmployee data1) {
        DefaultComboBoxModel statemodel = (DefaultComboBoxModel)states.getModel();
        DefaultComboBoxModel distmodel = (DefaultComboBoxModel)districts.getModel();
        DefaultComboBoxModel tehsilmodel = (DefaultComboBoxModel)tehsils.getModel();
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
}
