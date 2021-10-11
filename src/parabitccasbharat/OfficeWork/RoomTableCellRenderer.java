/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat.OfficeWork;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author acer
 */
public class RoomTableCellRenderer extends DefaultTableCellRenderer {

    private Color BOOKED_COLOR = Color.RED;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        setBackground(BOOKED_COLOR);
        setBorder(new LineBorder(Color.black, 2, true));
//        setForeground(Color.blue);
        setHorizontalAlignment(JLabel.CENTER);
//        setFont(getFont().deriveFont(50f));
        return this;
    }

}
