
package parabitccasbharat.OfficeWork;

import parabitccasbharat.OfficeWork.PBTSendMessage;
import parabitccasbharat.OfficeWork.PBTOfficeMainDashBoard;
import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PBTWorkAssignment extends javax.swing.JFrame {

    PBTDataOfEmployee data;
    PBTOfficeMainDashBoard parent;
    ParabitDBC db;
    int statecode,distcode,subdistcode,sumofpop,extraemp=0;
    boolean isclickable = false;
    List<Integer> townlist = new ArrayList<>();
    public PBTWorkAssignment(PBTDataOfEmployee data,PBTOfficeMainDashBoard parent) {
        initComponents();
        this.data = data;
        this.parent = parent;
        db = new ParabitDBC();
        selecttown.setVisible(false);
        getCode();
        fetcharea();
        clickListeners();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectarea = new javax.swing.JComboBox<>();
        selecttown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        enumtable = new javax.swing.JTable();
        population = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        empdata = new javax.swing.JTable();
        appointemp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enumrequire = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        popperarea = new javax.swing.JLabel();
        pop = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        whentostart = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        selectarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        selecttown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        enumtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Level", "town/village", "Code", "Name", "Type", "No. Of HouseHold", "Tottal population", "Remaining"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enumtable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(enumtable);
        if (enumtable.getColumnModel().getColumnCount() > 0) {
            enumtable.getColumnModel().getColumn(0).setMaxWidth(300);
            enumtable.getColumnModel().getColumn(1).setMaxWidth(350);
            enumtable.getColumnModel().getColumn(2).setMaxWidth(300);
            enumtable.getColumnModel().getColumn(4).setMaxWidth(300);
            enumtable.getColumnModel().getColumn(5).setMaxWidth(400);
            enumtable.getColumnModel().getColumn(6).setMaxWidth(300);
            enumtable.getColumnModel().getColumn(7).setMaxWidth(300);
        }

        population.setText("        ");

        jLabel1.setText("Population :");

        empdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CEID", "GEID", "Name", "Grade", "Email", "PopAlloted"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(empdata);

        appointemp.setText("Appoint Emp");
        appointemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointempActionPerformed(evt);
            }
        });

        jLabel2.setText("Enumerators Required :");

        enumrequire.setText("       ");

        jLabel3.setText("population per Area :");

        popperarea.setText("                  ");

        pop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                popKeyReleased(evt);
            }
        });

        jLabel4.setText("Enter Population :");

        whentostart.setMinSelectableDate(new Date(System.currentTimeMillis()));

        jLabel5.setText("Choose when to start :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(selectarea, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selecttown, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(enumrequire)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(population, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(popperarea)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(whentostart, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(appointemp)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(enumrequire)
                    .addComponent(jLabel2)
                    .addComponent(selecttown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(population))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(popperarea)
                        .addComponent(pop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(whentostart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointemp, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void appointempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointempActionPerformed
        int enumtrow[] = enumtable.getSelectedRows();
        int emp = empdata.getSelectedRow();
        if(emp!=-1){
            String popl = this.pop.getText();
            int poptogive = 0;
            if(sumofpop > 1500 && popl.equals("") && extraemp==0)
                JOptionPane.showMessageDialog(null, "please select population to given to the employee");
            else {
                if(!popl.equals(""))
                    poptogive = Integer.parseInt(pop.getText());
                String ceid = empdata.getValueAt(emp, 0).toString();
                if(whentostart.getDate() != null){
                    for(int i=0;i<enumtrow.length;i++)
                    {
                        int popofarea = Integer.parseInt(enumtable.getValueAt(enumtrow[i], 7).toString());
                        int popgiven = popofarea;
                        if(popofarea > 1500 && extraemp!=0) {
                            popgiven = extraemp;
                        }
                        if(!popl.equals(""))
                            popgiven = Integer.min(poptogive , popofarea);
                        String villcode = enumtable.getValueAt(enumtrow[i], 1).toString();
                        String wardcode = enumtable.getValueAt(enumtrow[i], 2).toString();
                        String startdate = PBTSendMessage.toDate(whentostart.getDate().toString());
                        String currdate = new Date(System.currentTimeMillis()).toString();
                        String query = "Insert Into `pbtempschecdule` values (null,'" + ceid + "','" + data.getCeid() + "'";
                        switch(selectarea.getSelectedIndex())
                        {
                            case 2:
                                query = query + ",null,null,'" + villcode + "'";
                                break;
                            case 1:
                                query = query + ",'" + wardcode + "',null,'" + villcode + "'";
                        }
                        query = query + ",'" + subdistcode + "','" + distcode + "','" + statecode + "','" + currdate + "','" + startdate + "','45',null,'" + popgiven + "','0',null,null,null)";
                        try {
                            //System.out.println(query);
                            db.stm.execute(query);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        String query2 = "Update `pbtenum` set remainingpop = '" + (popofarea-popgiven) + "' where ward = '" + wardcode + "' and town_vill = '"  + villcode +"' and distcode='" + distcode + "'";
                        try {
                            //System.out.println(query2);
                            db.stm2.execute(query2);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                    String query3 = "Update `pbtemployeetable2` set percommt=1 where ceid = '" + ceid + "'";
                    sumofpop = sumofpop + Integer.parseInt(empdata.getValueAt(emp, 5).toString());
                    if(sumofpop>1000 && sumofpop<1200)
                    {
                        int ans = JOptionPane.showConfirmDialog(this, "You have given sufficient population to the employee \n Do you want to appoint more population to this employee");
                        if(ans == 1)
                        {
                            try {
                                //System.out.println(query3);
                                db.stm.execute(query3);
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                    else if (sumofpop>=1200)
                    {
                        try {
                            //System.out.println(query3);
                            db.stm.execute(query3);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                    refreshAllFields();
                }
                else
                    JOptionPane.showMessageDialog(null, "please select date to start");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "please select any employee");
        }
    }//GEN-LAST:event_appointempActionPerformed

    private void popKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_popKeyReleased
        //System.out.println(pop.getText());
    }//GEN-LAST:event_popKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointemp;
    private javax.swing.JTable empdata;
    private javax.swing.JLabel enumrequire;
    private javax.swing.JTable enumtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pop;
    private javax.swing.JLabel popperarea;
    private javax.swing.JLabel population;
    private javax.swing.JComboBox<String> selectarea;
    private javax.swing.JComboBox<String> selecttown;
    private com.toedter.calendar.JDateChooser whentostart;
    // End of variables declaration//GEN-END:variables

    private void fetchTown() {
        String query = "select * from pbtenum where statecode =" + statecode + " and distcode = " + distcode + " and subdistCode = " + subdistcode + " and level = 'Town'";
        try {
            System.out.println(query);
            db.rs2 = db.stm2.executeQuery(query);
            DefaultComboBoxModel model = (DefaultComboBoxModel)selecttown.getModel();
            model.removeAllElements();
            isclickable = false;
            townlist.clear();
            while(db.rs2.next())
            {
                String town = db.rs2.getString("Name");
                Integer towncode = db.rs2.getInt("Town_Vill");
                System.out.println(town);
                model.addElement(town);
                townlist.add(towncode);
            }
            isclickable = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void getCode() {
        String query = "Select * from `pbtstates5` where states = '" + data.getAreastate() + "' and district = '" + data.getAreadist() + "' and subDist = '" + data.getAreacity() + "'";
        try {
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next())
            {
                statecode = db.rs1.getInt("StateCode");
                distcode = db.rs1.getInt("DistCode");
                subdistcode = db.rs1.getInt("SubDistCode");
                System.out.println(statecode + " " + distcode + " " + subdistcode);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetcharea() {
        DefaultComboBoxModel model = (DefaultComboBoxModel)selectarea.getModel();
        model.removeAllElements();
        model.addElement("--select--");
        model.addElement("Town");
        model.addElement("Village");
        model.setSelectedItem("--select--");
    }
    private int selectedArea()
    {
        return selectarea.getSelectedIndex();
    }

    private void clickListeners() {
        selectarea.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
                {
                    switch(selectedArea())
                    {
                        case 1:
                            ((DefaultTableModel)enumtable.getModel()).setRowCount(0);
                            fetchTown();
                            selecttown.setVisible(true);
                            break;
                        case 2:
                            selecttown.setVisible(false);
                            fetchEnumTable(0);
                            break;
                    }
                }
            }
        });
        
        selecttown.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED && isclickable)
                {
                    fetchEnumTable(1);
                }
            }
        });
        
        enumtable.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = enumtable.rowAtPoint(e.getPoint());
                int arr[] = enumtable.getSelectedRows();
                sumofpop=0;
                for(int i=0;i<arr.length;i++)
                {
                    int popu = Integer.parseInt(enumtable.getValueAt(arr[i], 7).toString());
                    sumofpop = sumofpop + popu;
                }
                if(sumofpop>1300 && arr.length!=1)
                {
                    String ans = JOptionPane.showInputDialog("You had appointed second emp of larger population. \n Enter population of second area");
                    if(ans!=null)
                        extraemp = Integer.parseInt(ans);
                    else
                        enumtable.removeRowSelectionInterval(row, row);
                }
                population.setText(""+sumofpop);
                int required = sumofpop/1200;
                enumrequire.setText("" + (required + 1));
                int perp = sumofpop/(required + 1);
                popperarea.setText("" + perp);
                fetchEmployees();
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
    
    private void fetchEnumTable(int whichtype){
        String query = "Select * from pbtenum where statecode =" + statecode + " and distcode = " + distcode + " and subdistCode = " + subdistcode;
        switch(whichtype)
        {
            case 1:
                query = query + " and town_vill = " + townlist.get(selecttown.getSelectedIndex()) + " and Level = 'Ward'";
                break;
            case 0:
                query = query + " and level ='village'";
                break;
        }
        DefaultTableModel model = (DefaultTableModel)enumtable.getModel();
        model.setRowCount(0);
        try 
        {
            db.rs3 = db.stm2.executeQuery(query);
            while(db.rs3.next())
            {
                String level = db.rs3.getString("Level");
                String name = db.rs3.getString("Name");
                String type = db.rs3.getString("Rural_urban");
                String hh = db.rs3.getString("No_HH");
                String totpop = db.rs3.getString("TotPoulation");
                String remainingpop = db.rs3.getString("Remainingpop");
                if(remainingpop.equals("0"))
                    continue;
                String wardcode = "0000",villagecode = "";
                switch(whichtype)
                {
                    case 1:
                        wardcode = db.rs3.getString("ward");
                    case 0:
                        villagecode = db.rs3.getString("town_vill");
                        break;
                }
                Object row[] = {level,villagecode,wardcode,name,type,hh,totpop,remainingpop};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchEmployees() {
        int selected[] = enumtable.getSelectedRows();
        String condition = "(";
        for(int i=0;i<selected.length;i++)
        {
            String code = enumtable.getValueAt(selected[i], 1).toString();
            if(i==selected.length-1)
                condition = condition + "Preference LIKE '%" + code + "%')";
            else
                condition = condition + "Preference LIKE '%" + code + "%' Or ";
        }
        if(selected.length == 0)
        {
            condition = condition + "status =1 )";
        }
        String query = "Select a.*,IF(" + condition + ",1,2) as pref,b.popalloted from `PBTEmployeetable2` as a left JOIN (SELECT CEID,sum(TotalRes) as popalloted FROM `pbtempschecdule` GROUP BY CEID) as b on a.ceid=b.ceid where (a.grade = 5 and a.cRepEmpID ='" + data.getCeid() + "' and a.percommt != 1) order by pref";
        DefaultTableModel model = (DefaultTableModel) empdata.getModel();
        model.setRowCount(0);
        //System.out.println(query);
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String ceid = db.rs1.getString("CEID");
                String geid = db.rs1.getString("GEID");
                String name = db.rs1.getString("EmpName");
                String grade = "5";
                String email = db.rs1.getString("Email");
                String popall = db.rs1.getString("popalloted");
                if(popall==null)
                    popall="0";
                Object row[] = {ceid,geid,name,grade,email,popall};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void refreshAllFields() {
        ((DefaultTableModel)enumtable.getModel()).setRowCount(0);
        ((DefaultTableModel)empdata.getModel()).setRowCount(0);
        selectarea.setSelectedIndex(0);
        selecttown.setVisible(false);
        enumrequire.setText("");
        population.setText("");
        popperarea.setText("");
        pop.setText("");
        whentostart.setCalendar(null);
        sumofpop = 0;
        extraemp = 0;
    }
}
