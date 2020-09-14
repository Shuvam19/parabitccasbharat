/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat.OfficeWork;

import Models.PBTDataOfEmployee;
import DB.ParabitDBC;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PBTNotifications {
    
    PBTDataOfEmployee data;
    ParabitDBC db;
    public PBTNotifications(PBTDataOfEmployee data) {
        this.data = data;
        this.db = new ParabitDBC();
    }
    
    
    public void fetchDataOfnotification(JTable tablenotify) {
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
        //System.out.println(query);
        String query2 = "SELECT * FROM `pbtnotification` WHERE MsgStatus = 0 and ((NotType = 1 and RecieverCeId = '" +  data.getCeid() + "') OR (NotType = 2 and SenderCeId IN (" + query3 + ") and RecieverCeId In (" + query3 + ")) OR (NotType = 3 and SenderCeId IN (" + query3 + ")))  ORDER BY Time DESC";
        //System.out.println(query2);
        DefaultTableModel model = (DefaultTableModel)tablenotify.getModel();
        model.setRowCount(0);
        try {
            db.rs1 = db.stm.executeQuery(query2);
            while(db.rs1.next())
            {
                String from = db.rs1.getString("SenderCeId");
                String time = db.rs1.getTimestamp("Time").toString();
                String message = db.rs1.getString("Message");
                String msgid = db.rs1.getString("NotId");
                Date Readtime = db.rs1.getDate("ReadTime");
                int nottype = db.rs1.getInt("NotType");
                String type;
                switch (nottype) {
                    case 1:
                        type = "Individual";
                        break;
                    case 2:
                        type = "Chain";
                        if(checkDate(Readtime))
                            continue;
                        break;
                    default:
                        type = "General";
                        if(checkDate(Readtime))
                            continue;
                        break;
                }
                Object row[] = {from, msgid, time, message, type};
                model.addRow(row);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean checkDate(Date date)
    {
        try {
            Date today = new Date(System.currentTimeMillis());
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date1 = format.parse(today.toString());
            java.util.Date date2 = format.parse(date.toString());
            //System.out.println(date1.toString() + " " + date2.toString());
            if(date1.compareTo(date2) >= 0)
                return true;
            else
                return false;
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return true;
    }
    
    public void clickEvents(JTable notifications) {
        notifications.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = notifications.rowAtPoint(e.getPoint());
                String messageid = notifications.getValueAt(row, 1).toString();
                String messagetype = notifications.getValueAt(row, 4).toString();
                System.out.println(messageid);
                if(messagetype.equals("Individual")){
                LocalDate localtime = LocalDate.now();
                String query = "UPDATE `pbtnotification` SET `MsgStatus` = 1 , `ReadTime` = '" + localtime + "' WHERE `NotId` = '" + messageid + "'";
                System.out.println(query);
                try {
                    db.stm.execute(query);
                    fetchDataOfnotification(notifications);
                } catch (SQLException ex) {
                    ex.printStackTrace();
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
