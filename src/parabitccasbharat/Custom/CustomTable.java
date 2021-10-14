/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat.Custom;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTable;

/**
 *
 * @author acer
 */
public class CustomTable {
    
    public static void designTable(JTable table) {
        table.setDefaultRenderer(Object.class, new CustomCellRenderer());
        table.setIntercellSpacing(new Dimension(5, 5));
        table.setRowHeight(40);
        table.getTableHeader().setOpaque(true);
//        notificationtable.getTableHeader().setForeground(Color.red);
        table.getTableHeader().setBackground(Color.red);
    }
    
}
