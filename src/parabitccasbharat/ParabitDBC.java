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
import java.util.logging.Level;
import java.util.logging.Logger;


public class ParabitDBC {
    Connection con;
    Statement stm,stm2;
    ResultSet rs1,rs2,rs3;
    public ParabitDBC()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/parabitCCASbharat", "root", "");
            stm = con.createStatement();
            stm2 = con.createStatement();
        } catch (Exception e) {
            System.out.println("" + e) ; 
        }
    }
}
