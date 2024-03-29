/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestingSummary;

import DB.ParabitDBC;
import java.awt.BorderLayout;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author acer
 */
public class PieChartPanel extends javax.swing.JPanel {
    private static final ParabitDBC db = new ParabitDBC();
    private static final DefaultPieDataset piedataset = new DefaultPieDataset();
    private static ItemName namefunction;
    private PiePlot chartplot;
    
    private String tableName;
    private String columnName;
    
    public interface ItemName{
        public String getName(String index);
    }
    
    public PieChartPanel(String tableName,String columnName,ItemName namefunction) {
        this.tableName = tableName;
        this.columnName = columnName;
        this.namefunction = namefunction;
        initEverything();
    }

    private void initEverything() {
        initComponents();
        ChartPanel panel = new ChartPanel(getChart());
        add(panel,BorderLayout.CENTER);
        addValuesOfDB();
        designChart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    private JFreeChart getChart() {
        JFreeChart chart = ChartFactory.createPieChart("PieChart", piedataset, true, true, false);
        chartplot = (PiePlot) chart.getPlot();
        return chart;
    }

    private void addValuesOfDB() {
        piedataset.clear();
        String query = getQuery();
        System.out.println(query);
        try {
            db.rs1 = db.stm.executeQuery(query);
            while(db.rs1.next()){
                String key = db.rs1.getString(1);
                Long count = db.rs1.getLong(2);
                if(key != null && !key.isEmpty()){
                    piedataset.setValue( namefunction.getName(key) , count );
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void designChart() {
        chartplot.setBackgroundAlpha(0);
    }
    
    private String getQuery() {
        return "SELECT " + columnName + ", count(*) FROM " + tableName + " GROUP BY " + columnName;
    }
}
