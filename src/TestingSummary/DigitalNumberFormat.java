/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestingSummary;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author acer
 */
public class DigitalNumberFormat extends javax.swing.JPanel {

    /**
     * Creates new form DigitalNumberFormat
     */
    public DigitalNumberFormat() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopDigit9 = new javax.swing.JLabel();
        PopDigit8 = new javax.swing.JLabel();
        PopDigit7 = new javax.swing.JLabel();
        PopDigit6 = new javax.swing.JLabel();
        PopDigit5 = new javax.swing.JLabel();
        PopDigit4 = new javax.swing.JLabel();
        PopDigit3 = new javax.swing.JLabel();
        PopDigit2 = new javax.swing.JLabel();
        PopDigit1 = new javax.swing.JLabel();
        PopDigit11 = new javax.swing.JLabel();
        PopDigit10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));

        PopDigit9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit9.setText("0");
        PopDigit9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit8.setText("0");
        PopDigit8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit7.setText("0");
        PopDigit7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit6.setText("0");
        PopDigit6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit5.setText("0");
        PopDigit5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit4.setText("0");
        PopDigit4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit3.setText("0");
        PopDigit3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit2.setText("0");
        PopDigit2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit1.setText("0");
        PopDigit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        PopDigit11.setBackground(new java.awt.Color(255, 255, 255));
        PopDigit11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit11.setText("0");
        PopDigit11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PopDigit11.setIconTextGap(20);
        PopDigit11.setInheritsPopupMenu(false);

        PopDigit10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        PopDigit10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PopDigit10.setText("0");
        PopDigit10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PopDigit10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(PopDigit11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(PopDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PopDigit11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PopDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PopDigit1;
    private javax.swing.JLabel PopDigit10;
    private javax.swing.JLabel PopDigit11;
    private javax.swing.JLabel PopDigit2;
    private javax.swing.JLabel PopDigit3;
    private javax.swing.JLabel PopDigit4;
    private javax.swing.JLabel PopDigit5;
    private javax.swing.JLabel PopDigit6;
    private javax.swing.JLabel PopDigit7;
    private javax.swing.JLabel PopDigit8;
    private javax.swing.JLabel PopDigit9;
    // End of variables declaration//GEN-END:variables

    public void addAnimaton(final Long toValue) throws InterruptedException {
        ActionListener task = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] tovalueArray = toValue.toString().toCharArray();
                boolean isbreakable = false;
                for (int index = 0; index < 11; index++) {
                    if(index<tovalueArray.length){
                        isbreakable = changeChar((index + 1),Integer.parseInt("" + tovalueArray[index]));
                    }else{
                        isbreakable = changeChar((index + 1), 0);
                    }
                    if(isbreakable) break;
                }
                if(!isbreakable) ((Timer)e.getSource()).stop();
            }

            private boolean changeChar(int index, int toValue) {
                JLabel digit = getDigit(index);
                int from = Integer.parseInt(digit.getText());
                if(from==toValue) return false;
                if(from<toValue){
                    digit.setText("" + (from + 1));
                }else{
                    digit.setText("" + (from - 1));                    
                }
                return true;
            }

            private JLabel getDigit(int index) {
                switch(index){
                    case 1:return PopDigit1;
                    case 2:return PopDigit2;
                    case 3:return PopDigit3;
                    case 4:return PopDigit4;
                    case 5:return PopDigit5;
                    case 6:return PopDigit6;
                    case 7:return PopDigit7;
                    case 8:return PopDigit8;
                    case 9:return PopDigit9;
                    case 10:return PopDigit10;
                    default : return PopDigit11;
                }
            }
        };
        final Timer timer = new Timer(10,task);
        timer.setRepeats(true);
        timer.start();
    }
}
