/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import DB.ParabitDBC;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PBTDataOfEmployee {
    String ceid;
    String crepempid;
    String name;
    int grade;
    String pincode;
    String areacity;
    String areadist;
    String areastate;
    String mobno;
    String areacitycode;
    String areadistcode;
    String areastatecode;
    
    public PBTDataOfEmployee(String ceid, String crepempid, String name, int grade, String pincode, String areacity, String areadist, String areastate, String mobno) {
        this.ceid = ceid;
        this.crepempid = crepempid;
        this.name = name;
        this.grade = grade;
        this.pincode = pincode;
        this.areacity = areacity;
        this.areadist = areadist;
        this.areastate = areastate;
        this.mobno = mobno;
    }

    public String getCeid() {
        return ceid;
    }

    public void setCeid(String ceid) {
        this.ceid = ceid;
    }

    public String getCrepempid() {
        return crepempid;
    }

    public void setCrepempid(String crepempid) {
        this.crepempid = crepempid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAreacity() {
        return areacity;
    }

    public void setAreacity(String areacity) {
        this.areacity = areacity;
    }

    public String getAreadist() {
        return areadist;
    }

    public void setAreadist(String areadist) {
        this.areadist = areadist;
    }

    public String getAreastate() {
        return areastate;
    }

    public void setAreastate(String areastate) {
        this.areastate = areastate;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }    

    public String getAreacitycode() {
        return areacitycode;
    }

    public void setAreacitycode(ParabitDBC db) {
        String query = "Select * from `pbtstates5` where subDist = '" + this.getAreacity() + "'";
        try {
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next()) {
                this.areacitycode = db.rs1.getString("SubDistCode");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String getAreadistcode() {
        return areadistcode;
    }

    public void setAreadistcode(ParabitDBC db) {
        String query = "Select * from `pbtstates5` where district = '" + this.getAreadist() + "'";
        try {
            db.rs1 = db.stm.executeQuery(query);
            if(db.rs1.next()) {
                this.areadistcode = db.rs1.getString("DistCode");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public String getAreastatecode() {
        return areastatecode;
    }

    public void setAreastatecode(ParabitDBC db) {
        String query = "Select * from `pbtstates5` where states = '" + this.getAreastate() + "'";
        try {
            db.rs1 = db.stm.executeQuery(query);
            System.out.println(query);
            if(db.rs1.next()) {
                this.areastatecode = db.rs1.getString("StateCode");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setAllCodeAccordingToStates(){
        ParabitDBC db = new ParabitDBC();
        this.setAreacitycode(db);
        this.setAreadistcode(db);
        this.setAreastatecode(db);
        System.out.println(this.areastatecode + " " + this.areadistcode + " " + this.areacitycode);
    }
    
    
    public void logoutEnumerator(){
        if(isEnumerator()){
            ParabitDBC db = new ParabitDBC();
            String query = "UPDATE `pbtempdailylog` SET LogOutTime = CURRENT_TIME() WHERE CEID = '" + getCeid() + "' AND LogOutTime IS NULL;";
            try {
                db.stm.execute(query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void loginEnumerator() {
        if(isEnumerator()){
            ParabitDBC db = new ParabitDBC();
            String Query = "INSERT INTO `pbtempdailylog` VALUES (NULL, " + getCeid() + ", CURDATE(), CURRENT_TIME(), NULL, 0, 0, NULL, NULL, NULL, NULL);";
            try {
                db.stm2.execute(Query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void updateLoggedInPersonsArea(String areaName) {
        if(isEnumerator()){
            ParabitDBC db = new ParabitDBC();
            String query = "UPDATE `pbtempdailylog` SET AreaVisited = '" + areaName + "' WHERE CEID = '" + getCeid() + "' AND LogOutTime IS NULL;";
            try {
                db.stm.execute(query);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean isEnumerator() {
        return grade==5;
    }
}
