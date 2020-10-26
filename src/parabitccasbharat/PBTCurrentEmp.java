/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

import Models.PBTDataOfEmployee;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class PBTCurrentEmp {
    
    static PBTDataOfEmployee dataOfEmployee;
    
    public static PBTDataOfEmployee getEmployeeData(){
        return dataOfEmployee;
    }

    public static void newLoginEmployee() {
        new PBTLogin().setVisible(true);
    }
    
    public static PBTDataOfEmployee addEmployee(ResultSet rs1) throws SQLException {
        int grade = rs1.getInt("grade");
        String ceid = rs1.getString("CEID");
        String name = rs1.getString("EmpName").trim();
        String crepempid = rs1.getString("CRepEmpId").trim();
        String pincode = rs1.getString("PIN");
        String acity = rs1.getString("AreaCity");
        String adist = rs1.getString("AreaDist");
        String astate = rs1.getString("AreaState");
        String Mobno = rs1.getString("EmpOffMob");
        return dataOfEmployee = new PBTDataOfEmployee(ceid, crepempid, name, grade, pincode, acity, adist, astate, Mobno);
    }
}
