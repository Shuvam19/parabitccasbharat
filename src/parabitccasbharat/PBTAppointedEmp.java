package parabitccasbharat;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PBTAppointedEmp extends javax.swing.JDialog {

    ParabitDBC db,db1;
    PBTDataOfEmployee data,transdata;
    int whichtype;
    PBTManageEmp parent;
    List<PBTDataOfEmployee> listofemp = new ArrayList<>();
    DefaultTableModel model;
    
    public PBTAppointedEmp(PBTDataOfEmployee data,PBTManageEmp parent,int whichtype) {
        super(parent,true);
        initComponents();
        this.data = data;
        this.parent = parent;
        this.whichtype = whichtype;
        db = new ParabitDBC();
        db1 = new ParabitDBC();
        fetchemployes();
        clicklisteners();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        appointedemp = new javax.swing.JTable();
        appemp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        appointedemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CEID", "GEID", "Name", "Grade", "MobileNo", "Email"
            }
        ));
        jScrollPane1.setViewportView(appointedemp);

        appemp.setText("Appointed Employee ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appemp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(appemp)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(582, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appemp;
    private javax.swing.JTable appointedemp;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void fetchemployes() {
        String query = "SELECT * FROM `pbtemployeetable2` where grade = '" + (data.getGrade()+1) + "' and status = 1";
        System.out.println(query);
        model = (DefaultTableModel) appointedemp.getModel();
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
                String crepempid = db.rs1.getString("CRepEmpId");
                String pincode = db.rs1.getString("PIN");
                String areacity = db.rs1.getString("AreaCity");
                String areadist = db.rs1.getString("AreaDist");
                String areastate = db.rs1.getString("AreaState");
                String mobno = db.rs1.getString("EmpOffMob");
                listofemp.add(new PBTDataOfEmployee(ceid, crepempid, name, grade, pincode, areacity, areadist, areastate, mobno));
                Object row[] = {ceid,geid,name,grade,mob,email};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void clicklisteners() {
                appointedemp.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = appointedemp.rowAtPoint(e.getPoint());
                    String ceid = appointedemp.getValueAt(row, 0).toString();
                    switch(whichtype)
                    {
                        case 2:
                        {
                            String options[] = {"Dismiss","Replace","Cancel"};
                            int ans = JOptionPane.showOptionDialog(null, "What Do Yo Wnat To Do...", "Select What You Want", 0, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                            switch(ans)
                            {
                                case 0:
                                    dismiss(ceid);
                                    break;
                                case 1:replace(ceid,row);
                                    break;
                            }
                        }
                            break;
                        case 3:
                        {
                            replaceperson(listofemp.get(row));
                        }
                            break;
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
    
    private void dismiss(String ceid)
    {
        String query = "UPDATE `pbtemployeetable2` SET Status = -1 WHERE CEID = '" + ceid + "'";
        String query2 = "UPDATE `pbtemployeetable2` SET CRepEmpId = 'T" + data.getCeid() + "' Where CRepEmpId = '" + ceid +"'";
        System.out.println(query2);
        try {
            db.stm.execute(query);
            db.stm2.execute(query2);
            fetchemployes();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        int ans = JOptionPane.showConfirmDialog(null, "Do You Want to Appoint new employee for ");
        if(ans == 0)
        {
            PBTNewAppointment newappoint = new PBTNewAppointment(data, this);
            newappoint.setVisible(true);
        }
    }
    
    private void replace(String ceid,int row)
    {
        String query = "Select * From `pbtemployeetable2` where ceid = '" + ceid + "'";
        try {
            db.rs2 = db.stm.executeQuery(query);
            if(db.rs2.next())
            {
                int grade = db.rs2.getInt("grade");
                String name = db.rs2.getString("EmpName").trim();
                String crepempid = db.rs2.getString("CRepEmpId").trim();
                String pincode = db.rs2.getString("PIN");
                String acity = db.rs2.getString("AreaCity");
                String adist = db.rs2.getString("AreaDist");
                String astate = db.rs2.getString("AreaState");
                String Mobno = db.rs2.getString("EmpOffMob");
                //System.out.println(ceid);
                PBTDataOfEmployee tansdata = new PBTDataOfEmployee(ceid, crepempid, name, grade, pincode, acity, adist, astate, Mobno);
                PBTAppointedEmp replaceemp = new PBTAppointedEmp(data, parent, 3);
                replaceemp.initialiseData(tansdata);
                replaceemp.model.removeRow(row);
                replaceemp.listofemp.remove(row);
                replaceemp.setVisible(true);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void initialiseData(PBTDataOfEmployee data)
    {
        this.transdata = data;
    }
    
    private void replaceperson(PBTDataOfEmployee empdata)
    {
        String query1 = "Update `pbtemployeetable2` set status = 2, note = '" + transdata.getCeid() + "', ";
        String query2 = "Update `pbtemployeetable2` set status = 2, note = '" + empdata.getCeid() + "', ";
        switch(data.getGrade())
        {
            case 1:
                query1 = query1 + " areastate = '" + transdata.getAreastate() + "'";
                query2 = query2 + " areastate = '" + empdata.getAreastate() + "'";
                break;
            case 2:
                query1 = query1 + " areadist = '" + transdata.getAreadist() + "'";
                query2 = query2 + " areadist = '" + empdata.getAreadist() + "'";
                break;
            case 3:
                query1 = query1 + " areacity = '" + transdata.getAreacity() + "'";
                query2 = query2 + " areacity = '" + empdata.getAreacity() + "'";
                break;
            case 4:
                query1 = query1 + " ";
                query2 = query2 + " ";
                break;
        }
        query1 = query1 + " where ceid = '" + empdata.getCeid() + "'";
        query2 = query2 + " where ceid = '" + transdata.getCeid() + "'";
        String query3 = "Update `pbtemployeetable2` set crepempid = 'R" + transdata.getCeid() + "' where crepempid = '" + transdata.getCeid() + "'";
        String query4 = "Update `pbtemployeetable2` set crepempid = 'R" + empdata.getCeid() + "' where crepempid = '" + empdata.getCeid() + "'";
        //System.out.println(query1);
        //System.out.println(query2);
        //System.out.println(query3);
        //System.out.println(query4);
        try {
            db.stm.execute(query1);
            db.stm2.execute(query2);
            db1.stm.execute(query3);
            db1.stm.execute(query4);
            sendNotification(empdata,transdata);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //sendNotification(empdata,transdata);
        this.dispose();
    }

    private void sendNotification(PBTDataOfEmployee empdata, PBTDataOfEmployee transdata) {
        String message1 = "Congratulation " + empdata.getName() + ". You are transferred From ";
        String message2 = "Congratulation " + transdata.getName() + ". You are transferred From ";
        switch(data.getGrade())
        {
            case 1:
                message1 = message1 + empdata.getAreastate() + " To " + transdata.getAreastate() + ".";
                message2 = message2 + transdata.getAreastate() + " To " + empdata.getAreastate() + ".";
                break;
            case 2:
                message1 = message1 + empdata.getAreadist() + " To " + transdata.getAreadist() + ".";
                message2 = message2 + transdata.getAreadist() + " To " + empdata.getAreadist() + ".";
                break;
            case 3:
                message1 = message1 + empdata.getAreacity() + " To " + transdata.getAreacity() + ".";
                message2 = message2 + transdata.getAreacity() + " To " + empdata.getAreacity() + ".";
                break;
            case 4:
                break;
        }
        //System.out.println(message1);
        //System.out.println(message2);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String query1 = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', '" + empdata.getCeid() +  "', '" + timestamp + "', '" + message1 + "', '0', NULL, NULL, '1');";
        String query2 = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "', '" + transdata.getCeid() +  "', '" + timestamp + "', '" + message2 + "', '0', NULL, NULL, '1');";
        //System.out.println(query1);
        //System.out.println(query2);
        try {
            db.stm.execute(query1);
            db.stm.execute(query2);
            sendNotificationToJuniours(empdata,transdata);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        //sendNotificationToJuniours(empdata,transdata);
    }

    private void sendNotificationToJuniours(PBTDataOfEmployee empdata, PBTDataOfEmployee transdata) {
        String query1 = "SELECT * FROM `pbtemployeetable2` where CRepEmpId = 'R" + empdata.getCeid() + "'";
        String query2 = "SELECT * FROM `pbtemployeetable2` where CRepEmpId = 'R" + transdata.getCeid() + "'";
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        try {
            db.rs1 = db.stm.executeQuery(query1);
            while(db.rs1.next())
            {
                String message = "Hello " + db.rs1.getString("EmpName") + ". Your Senior " + empdata.getName() + " Got Transfered. Now your new Senior Will be " + transdata.getName();
                String query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "' , '" + db.rs1.getString("CEID") + "', '" + timestamp + "', '" + message + "', '0', NULL, NULL, '1');";
                db.stm2.execute(query);
                //System.out.println(query);
                //System.out.println(message);
            }
            db.rs2 = db.stm.executeQuery(query2);
            while(db.rs2.next())
            {
                String message = "Hello " + db.rs2.getString("EmpName") + ". Your Senior " + transdata.getName() + " Got Transfered. Now your new Senior Will be " + empdata.getName();
                String query = "INSERT INTO `pbtnotification` VALUES ('" + data.getCeid() + "' , '" + db.rs2.getString("CEID") + "', '" + timestamp + "', '" + message + "', '0', NULL, NULL, '1');";
                db.stm2.execute(query);
                //System.out.println(query);
                //System.out.println(message);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
