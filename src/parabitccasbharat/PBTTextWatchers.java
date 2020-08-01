package parabitccasbharat;

import com.sun.java.swing.plaf.motif.MotifBorders;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PBTTextWatchers {
    public void addNameTextWatcher(JTextField field){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isOnlyString(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isOnlyString(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
    
        public void addNumberTextWatcher(JTextField field){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isNumerical(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isNumerical(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
        
        public void addPanTextWatcher(JTextField field){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isValidPan(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isValidPan(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
        
    public void addEmailTextWatcher(JTextField field){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isEmail(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isEmail(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
    
    private boolean isNumerical(String text) {
        Pattern pattern = Pattern.compile("^[1-9]\\d*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    private boolean isOnlyString(String text) {
        Pattern pattern = Pattern.compile("^[A-Za-z ]*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    private boolean isValidPan(String text) {
        Pattern pattern = Pattern.compile("((https?://|ftp://|www\\.|[^\\s:=]+@www\\.).*?[a-z_\\/0-9\\-\\#=&])(?=(\\.|,|;|\\?|\\!)?(\"|'|«|»|\\[|\\s|\\r|\\n|$))");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    private boolean isEmail(String text) {
        Pattern pattern = Pattern.compile("^.[^@]*@.[^\\.]*\\..*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    public void showError(JTextField textarea){
        textarea.setBorder(new MotifBorders.BevelBorder(true, Color.RED, Color.RED));
    }
    public void showRight(JTextField textarea){
        textarea.setBorder(new MotifBorders.BevelBorder(true, Color.GREEN, Color.GREEN));
    }
}
