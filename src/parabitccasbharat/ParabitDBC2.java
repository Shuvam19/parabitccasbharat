/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class ParabitDBC2 {
        Connection con;
    Statement stm;
    ResultSet rs1,rs2,rs3;
    public ParabitDBC2()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/parabitCCASbharat_util", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            System.out.println("" + e) ; 
        }
    }
}
