/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.UserT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krupal
 */
public class UserTData {

    DatabaseHelper db;
    UserT user;

    public UserTData() {
        db = new DatabaseHelper();

    }

    public ArrayList<DbClasses.UserT> getUsers() {
        ArrayList<DbClasses.UserT> users = new ArrayList<UserT>();

        ResultSet rs = db.getResultSet("Select * From UserT");


        try {
            while (rs.next()) {
                user = new UserT();
                user.setUserid(rs.getInt("userid"));
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                user.setMobileno(rs.getInt(2));
                user.setCity(rs.getString(3));
                users.add(user);
            }
        } catch (SQLException se) {
        }
        return users;
    }

    public UserT getUser(String username, String password) {

        ResultSet rs = db.getResultSet("Select * From UserT Where Username = '" + username + "' and Password = '" + password + "'");
//        ResultSet rs = db.getResultSet("Select * From UserT");
        System.out.println(username + " & " + password);
        user = new UserT();
        try {
            if(rs.next()){
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                System.out.println("user created");
            }
            else{
                user.setUsername("");
                System.out.println("user creation failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    public boolean CheckifMobileExists() {
        ResultSet rs = db.getResultSet("select * from usert where mobileno = '" + user.getMobileno() + "'");
        try {
            if(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public UserT getUserID(String username){
         ResultSet rs = db.getResultSet("Select * From UserT Where Username = '" + username + "'");
        UserT user = new UserT();
        try {
            while(rs.next()){
                user.setUserid(rs.getInt("userid"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserTData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    public void insertUser(UserT user){
       ResultSet rs = db.getResultSet("Insert into UserT Values(NULL,'"+user.getUsername()+"','" + user.getMobileno() + "', '" + user.getCity() + "', '" + user.getArea() + "', '" + user.getBuilding() + "', '" + user.getHouse() + "', '" + user.getPassword() + "')");
    }
}
