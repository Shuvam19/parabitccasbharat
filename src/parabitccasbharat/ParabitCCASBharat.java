package parabitccasbharat;

import parabitccasbharat.Utilities.PBTTypeOfHouse;

public class ParabitCCASBharat {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PBTLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        new PBTLogin().setVisible(true);
        //new PBTTypeOfHouse("1").setVisible(true);
    }
}
