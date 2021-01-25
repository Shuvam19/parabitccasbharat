/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat.FieldWork;

import Models.PBTDataScheduledToEmp;
import parabitccasbharat.OfficeWork.PBTNotifications;
import Models.PBTDataOfEmployee;
import parabitccasbharat.FieldWork.PBTFieldDashBoard;
import DB.ParabitDBC;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parabitccasbharat.PBTCurrentEmp;

/**
 *
 * @author acer
 */
public class PBTSelectAreaForEnum extends javax.swing.JFrame {

    PBTDataOfEmployee data;
    ParabitDBC db;
    PBTNotifications notify;
    List<PBTDataScheduledToEmp> arealist = new ArrayList<>();

    public PBTSelectAreaForEnum() {
        initComponents();
        this.data = PBTCurrentEmp.getEmployeeData();
        if(this.data==null){
            this.dispose();
            PBTCurrentEmp.newLoginEmployee();
        }
        this.db = new ParabitDBC();
        this.notify = new PBTNotifications(data);
        notify.fetchDataOfnotification(noitfications);
        notify.clickEvents(noitfications);
        fetchvillages();
        addClickListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        selectarea = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        noitfications = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
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

        jLabel1.setText("Select Area You Want To Continue :");

        noitfications.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "From", "MessageID", "time", "message", "type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(noitfications);
        if (noitfications.getColumnModel().getColumnCount() > 0) {
            noitfications.getColumnModel().getColumn(0).setMaxWidth(250);
            noitfications.getColumnModel().getColumn(1).setMaxWidth(250);
            noitfications.getColumnModel().getColumn(2).setMaxWidth(250);
            noitfications.getColumnModel().getColumn(4).setMaxWidth(250);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        data.logoutEnumerator();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable noitfications;
    private javax.swing.JTable selectarea;
    // End of variables declaration//GEN-END:variables

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
        selectarea.addMouseListener(new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = selectarea.rowAtPoint(e.getPoint());
                String areaname = selectarea.getValueAt(row, 0).toString();
                if(e.getClickCount()==2){
                    int ans = JOptionPane.showConfirmDialog(null, "Do You Want to Work in the Area " + areaname);
                    //Need To implement here
                    if(ans==0){
                        data.updateLoggedInPersonsArea(areaname);
                        PBTFieldDashBoard dashBoard = new PBTFieldDashBoard(arealist.get(row));
                        dispose();
                        dashBoard.setVisible(true);
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
}
