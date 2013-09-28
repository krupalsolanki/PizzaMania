/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krupal
 */
public class DatabaseHelper {

    Connection con = null;
    ResultSet rs = null;

    public DatabaseHelper() {
    }

    public String getDbDriverName() {
        return "jdbc:odbc:account64";
        //get from web.config
    }

    public ResultSet getResultSet(String sqlQuery) {

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("after conn = ");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzadb?user=root&password=root");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzadb?", "root", "");
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sqlQuery);
            stmt.executeQuery(sqlQuery);

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }
}
