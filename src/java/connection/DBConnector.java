/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nadeesha
 */
public class DBConnector {
    private static final String URL="jdbc:mysql://localhost/Inventory";
    private static final String USER="root";
    private static final String PASSWORD="1234";
    private static DBConnector dbConnector = null;
    private Connection con = null;

    public DBConnector() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(URL, USER, PASSWORD);

    }

    public static DBConnector getDBConnector() throws ClassNotFoundException, SQLException {
        if (dbConnector == null) {
            dbConnector = new DBConnector();
        }
        return dbConnector;
    }

    public static Connection getConnectionToDB() throws ClassNotFoundException, SQLException {
        return getDBConnector().con;
    }
}
