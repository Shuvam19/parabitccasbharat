/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parabitccasbharat.Custom;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author acer
 */
public class CustomJTable extends JTable {

    private Color backgroundColor;
    private int cornerRadius = 15;

    public CustomJTable() {
        backgroundColor = Color.BLUE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
//        int width = getWidth();
//        int height = getHeight();
//        Graphics2D graphics = (Graphics2D) g;
//        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
    }
}
