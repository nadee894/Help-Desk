/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import connection.DBConnector;
import connection.DBHandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Customer.Customer;

/**
 *
 * @author dpl
 */
//this methord is to pass the values that we add through interface to the attributes.
//(supplier model 1ka atule haduva attributes valata getters haraha values atul kirima)
public class CustomerController {

    static ArrayList<Customer> customerList;

    public static int insertCustomer(Customer s) throws ClassNotFoundException, SQLException {
        String query = "insert into customer values('" + s.getCustomerID()+ "','" + s.getCustomerName()+ "','" + s.getGender()+ "','" + s.getNic()+"','" + s.getDateOfBirth() + "')";
        int d = DBHandler.setData(DBConnector.getConnectionToDB(), query);
        return d;
    }

//    public static int updateCustomer(Customer s) throws SQLException, ClassNotFoundException {
//        String query = "update supplier set name='" + s.getName() + "',contactPerson='" + s.getContactPerson() + "',contactNo='" + s.getContactNo() + "' where  supplierID='" + s.getCustomerID() + "'";
//        int d = DBHandler.setData(DBConnector.getConnectionToDB(), query);
//        return d;
//    }
//
//    public static int deleteCustomer(Customer s) throws ClassNotFoundException, SQLException {
//        String query = "delete from supplier where supplierID='" + s.getCustomerID() + "'";
//        int d = DBHandler.setData(DBConnector.getConnectionToDB(), query);
//        return d;
//    }
//
//    public static Customer searchCustomer(String ID) throws SQLException, ClassNotFoundException {
//        String query = "select* from Customer  where supplierID='" + ID + "'";
//        ResultSet rslt = DBHandler.getData(DBConnector.getConnectionToDB(), query);
//        Customer s = null;
//        while (rslt.next()) {
//            s = new Customer();
//            s.setCustomerID(rslt.getString("supplierID"));
//            s.setName(rslt.getString("name"));
//            s.setContactPerson(rslt.getString("contactPerson"));
//            s.setContactNo(rslt.getString("contactNo"));
//        }
//        return s;
//    }
//
//    public static Customer getId(String name) throws ClassNotFoundException, SQLException {
//        String query = "select supplierID from Customer where name='" + name + "'";
//        ResultSet rslt = DBHandler.getData(DBConnector.getConnectionToDB(), query);
//        Customer s = null;
//        while (rslt.next()) {
//            s = new Customer();
//            s.setCustomerID(rslt.getString("supplierID"));
//
//        }
//        return s;
//    }
//
//    public static ArrayList<Customer> viewAllCustomers() throws SQLException, ClassNotFoundException {
//        supplierList = new ArrayList<Customer>();
//        String query = "select * from Customer";
//        ResultSet rslt = DBHandler.getData(DBConnector.getConnectionToDB(), query);
//        Customer s = null;
//        while (rslt.next()) {
//            s = new Customer();
//            s.setCustomerID(rslt.getString("supplierID"));
//            s.setName(rslt.getString("name"));
//            s.setContactPerson(rslt.getString("contactPerson"));
//            s.setContactNo(rslt.getString("contactNo"));
//            supplierList.add(s);
//        }
//        return supplierList;
//    }
}
