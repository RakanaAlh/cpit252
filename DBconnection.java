
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconnection {

    //this static variable will hold the object
    static Connection con = null;

    //private constructor to prevent unlimitied creation
    private DBconnection() throws ClassNotFoundException {
        try {
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String username = "scott";
            String password = "tiger";
            String url = "jdbc:oracle:thin:@localhost:1521:orcl";

            con = DriverManager.getConnection(url, username, password);

            System.out.println(" DB connected, Done.");

        } catch (ClassNotFoundException e) {
            System.out.println("Couldn't find DB driver" + e.getMessage());

        } catch (SQLException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Couldn't conncet to db" + ex.getMessage());
        }
    }

    //-------------------------------------------------------
    //this method will pass the database connection
    public static Connection getInstance() throws ClassNotFoundException {
        
        //if the connection is null it will call the constructor which is supposed to initiate a connection
        
        if (con == null) {
            new DBconnection();
        }
        return con;

    }

    //----------------------------------------------------
    //this method will be later used to create 
    public void create(DBconnection connection) {

    }

    //this method will be later used to add values to a table
    public void add(DBconnection connection) {

    }

    //this method will be later used to modify valuse in a table
    public void modify(DBconnection connection) {

    }
//this method will be later used to delete a table

    public void delete(DBconnection connection) {

    }
}
