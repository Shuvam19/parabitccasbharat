
package parabitccasbharat.OfficeWork;

import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import parabitccasbharat.PBTCurrentEmp;


public class PBTEmpSummary<T> extends javax.swing.JDialog {

    PBTDataOfEmployee data;
    ParabitDBC db;
    List<String> ceidlist = new ArrayList<>();
    List<String> childceidlist = new ArrayList<>();
    List<String> seniourceidlist = new ArrayList<>();
    int whichtype;
    T parent;
    
    public PBTEmpSummary(T parent,int whichtype) {
        super((JFrame)parent,true);
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.parent = parent;
        this.db = new ParabitDBC();
        this.whichtype = whichtype;
        String query = "SELECT * FROM `PBTEmployeeTable2` as a JOIN `pbtempschecdule` as b ON a.CEID = b.CEID WHERE a.grade = " + (data.getGrade()+1) + " and a.status = 1";
        switch(whichtype)
        {
            case 1:sendtoparent.setVisible(false);
                break;
            case 2:
                switch(data.getGrade())
                {
                    case 3:
                    case 4:
                    case 5:
                        fetchsendtoparent();
                        break;
                    default:
                        sendtoparent.setVisible(false);
                        break;
                }
                break;
        }
        fetchdatatable(parentemp , query,1);
        clicklisteners();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        parentemp = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        juniouremp = new javax.swing.JTable();
        sendtoparent = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        sendtoparent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sendtoparent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendtoparentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendtoparent, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(sendtoparent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sendtoparentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendtoparentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendtoparentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable juniouremp;
    private javax.swing.JTable parentemp;
    private javax.swing.JComboBox<String> sendtoparent;
    // End of variables declaration//GEN-END:variables

    private void fetchdatatable(JTable table ,String query,int whattype) {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next())
            {
                String name = db.rs1.getString("a.EmpName");
                String mobno = db.rs1.getString("a.EmpMob");
                String ceid = db.rs1.getString("a.CEID");
                if(whattype == 1)
                    ceidlist.add(ceid);
                else
                    childceidlist.add(ceid);
                String workd = db.rs1.getString("b.workdone");
                String worka = db.rs1.getString("b.totalres");
                String workp = "" + (Long.parseLong(worka) - Long.parseLong(worka));
                String nores = "0";
                Object row[] = {name, mobno, workd, worka, workp, nores};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clicklisteners() {
        parentemp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = parentemp.rowAtPoint(e.getPoint());
                String ceid = ceidlist.get(row);
                switch(e.getClickCount())
                {
                    case 1:
                        String query = "SELECT * FROM `PBTEmployeeTable2` as a JOIN `pbtempschecdule` as b ON a.CEID = b.CEID WHERE a.CRepEmpId = '" + ceid + "' and a.status = 1";
                        fetchdatatable(juniouremp, query,2);
                        break;
                    case 2:
                        if(whichtype == 2){
                            PBTSendMessage sendmessage = new PBTSendMessage( parent, 1, ceid);
                            sendmessage.setVisible(true);
                            break;
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
        juniouremp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = juniouremp.rowAtPoint(e.getPoint());
                String ceid = childceidlist.get(row);
                if(whichtype == 2)
                {
                    PBTSendMessage sendMessage = new PBTSendMessage( parent, 1, ceid);
                    sendMessage.setVisible(true);
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
        sendtoparent.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println(sendtoparent.getSelectedItem());
                    String ceid = seniourceidlist.get(sendtoparent.getSelectedIndex()-1);
                    System.out.println(ceid);
                    int ans = JOptionPane.showConfirmDialog(null, "Do you Want to send message to " + sendtoparent.getSelectedItem());
                    if(ans == 0)
                    {
                        PBTSendMessage sendmessage = new PBTSendMessage( parent, 1, ceid);
                        sendmessage.setVisible(true);
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
            while(db.rs1.next())
            {
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
}
