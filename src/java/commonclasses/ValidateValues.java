package commonclasses;


import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class ValidateValues {

    private static boolean checkInt(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void validateInt(JTextField txt,int length) {
        try {
            String s = txt.getText();
            while (!checkInt(s)) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }
            if (s.length() > length) {
                String s1 = s.substring(0, length);
                txt.setText(s1);
            }
        } catch (Exception e) {
        }
    }

    public static void validateInt(JTextField txt) {
        try {
            String s = txt.getText();
            while (!checkInt(s)) {
                String s1 = s.substring(0, s.length() - 1);
                s = s1;
                txt.setText(s1);
            }
            
        } catch (Exception e) {
        }
    }



    public static boolean  validateEmail(String s){
         return   s.contains("@") && s.contains(".") ;
    }
}
