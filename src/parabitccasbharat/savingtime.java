/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat;

import DB.ParabitDBC;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class savingtime {
    
    public static void main(String[] args) {
        String table[] = {"useofhouse","tv","tvsig","coolheatfact","pc","telebroadband","phone","typesofgeneticdisease"};
        String table2[] = {"Accessof_l","Typeof_l","Bathfact","Kitchen","Cookfuel"};
        for(int i=0;i<table2.length;i++){
            solve(table[i]);
            //solve2(table2[i]);
        }
    }
    public static void solve(String table){
        ParabitDBC db = new ParabitDBC();
        String query = "Select * From `" + table + "`";
        System.out.println("\n    static String get" + tofirst(table) + "(String " + table +") {");
        try {
            db.rs1 = db.stm.executeQuery(query);
            System.out.println("        switch("+table+"){");
            while(db.rs1.next()){
                String key = db.rs1.getString(1);
                String value = db.rs1.getString(2);
                String ans = "            case \""+ key + "\": return \"" + value + "\";";
                System.out.println(ans);
            }
            System.out.println("        }\n" + "    }");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static String tofirst(String table) {
        return table.substring(0, 1).toUpperCase() + table.substring(1);
    }

    private static void solve2(String s) {
        String s2 = "        PBT" + s + " frame = new PBT" +s + "(houselistingdata);\n" +
"        frame.setVisible(true);\n" +
"        this.condnofhouse.setText(PBTUtilities.get" +s + "(houselistingdata.get" + s+ "()));\n" +
"        updatemap.put(\"" + s+ "\", houselistingdata.get" +s + "());";
        System.out.println(s2);
    }
    
}
