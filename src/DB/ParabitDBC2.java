/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author acer
 */
public class ParabitDBC2 {

    private String DB_URL = "jdbc:mysql://IP_ADRESS:3306/parabitCCASbharat_util";

    Connection con;
    public Statement stm;
    public ResultSet rs1, rs2, rs3;

    public ParabitDBC2() {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
            String ip = socket.getLocalAddress().getHostAddress();
            DB_URL = DB_URL.replace("IP_ADRESS", ip);
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, "root", "password");
            stm = con.createStatement();
        } catch (Exception e) {
            System.out.println("" + e);
            e.printStackTrace();
        }
    }
}
