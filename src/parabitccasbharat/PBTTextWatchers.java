package parabitccasbharat;

import com.sun.java.swing.plaf.motif.MotifBorders;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class PBTTextWatchers {
    public void addNameTextWatcher(JTextField field,HashMap<String,Object> map,String key){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isOnlyString(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
                map.put(key, field.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isOnlyString(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
                map.put(key, field.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
    
    public void addNumberTextWatcher(JTextField field,HashMap<String,Object> map,String key){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isNumerical(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
                map.put(key, field.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isNumerical(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
                map.put(key, field.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
        
    public void addPanTextWatcher(JTextField field, HashMap<String, Object> updatemap, String key){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isValidPan(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
                updatemap.put(key, field.getText());
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
        
    public void addYesNolistener(JRadioButton buttonyes,JRadioButton buttonno, HashMap<String, Object> updatemap, String key) {
        buttonyes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Yes");
                updatemap.put(key, "Y");
            }
        });
        buttonno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("No");
                updatemap.put(key, "N");
            }
        });
    }
    
    public void addJSliderListener(JSlider slider, HashMap<String, Object> updatemap, String key) {
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updatemap.put(key, slider.getValue());
            }
        });
    }
        
    public void addEmailTextWatcher(JTextField field,HashMap<String, Object> updatemap, String key){
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isEmail(field.getText())){
                    showRight(field);
                    updatemap.put(key, field.getText());
                } else {
                    showError(field);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isEmail(field.getText())){
                    showRight(field);
                    updatemap.put(key, field.getText());
                } else {
                    showError(field);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
    
    public static boolean isNumerical(String text) {
        Pattern pattern = Pattern.compile("^[1-9]\\d*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static boolean isOnlyString(String text) {
        Pattern pattern = Pattern.compile("^[A-Za-z ]*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    public static boolean isValidPan(String text) {
        Pattern pattern = Pattern.compile("^[1-9]{1}[0-9]{4}[A-Za-z]{4}[0-9]{1}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    public static boolean isNameNumber(String text) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9\\-]*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    public static boolean isEmail(String text) {
        Pattern pattern = Pattern.compile("^.[^@]*@.[^\\.]*\\..*");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
    
    public static void showError(JTextField textarea){
        textarea.setBorder(new MotifBorders.BevelBorder(true, Color.RED, Color.RED));
    }
    public static void showRight(JTextField textarea){
        textarea.setBorder(new MotifBorders.BevelBorder(true, Color.GREEN, Color.GREEN));
    }

    void addNameNumberTextWatcher(JTextField field, HashMap<String, Object> map, String key) {
        field.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(isNameNumber(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
                map.put(key, field.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(isNameNumber(field.getText())){
                    showRight(field);
                } else {
                    showError(field);
                }
                map.put(key, field.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
    }
}
