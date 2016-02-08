package commonclasses;

import connection.DBConnector;
import connection.DBHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.NumberFormat;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class IDGen {

    public static void getNextID(JTextField txtID, String prefix, String column, String table) {
        try {
            Connection con = DBConnector.getConnectionToDB();
            ResultSet rst = DBHandler.getData(con, "SELECT " + column + " FROM " + table + " ORDER BY 1 DESC LIMIT 1");
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(3);
            String current = prefix + "000";
            while (rst.next()) {
                current = rst.getString(1);
            }
            ////////////////////////////
            int index = current.length();
            for (int i = current.length() - 1; i >= 0; i--) {
                String part = current.substring(i, current.length());
                try {
                    Integer.parseInt(part);
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String s = current.substring(index);
            int i = Integer.parseInt(s);
            i++;
            txtID.setText(current.substring(0, index) + nf.format(i));

        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }

    public static String getNextID( String prefix, String column, String table) {
        String txtID="";
        try {
            Connection con = DBConnector.getConnectionToDB();
            ResultSet rst = DBHandler.getData(con, "SELECT " + column + " FROM " + table + " ORDER BY 1 DESC LIMIT 1");
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(3);
            String current = prefix + "000";
            while (rst.next()) {
                current = rst.getString(1);
            }
            ////////////////////////////
            int index = current.length();
            for (int i = current.length() - 1; i >= 0; i--) {
                String part = current.substring(i, current.length());
                try {
                    Integer.parseInt(part);
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String s = current.substring(index);
            int i = Integer.parseInt(s);
            i++;
            txtID = current.substring(0, index) + nf.format(i);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return txtID;
    }

}
