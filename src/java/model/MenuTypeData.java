/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.MenuType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Dev
 */
public class MenuTypeData {
    DatabaseHelper db ;
    
    public MenuTypeData(){
        db = new DatabaseHelper();
    }
    
     public ArrayList<DbClasses.MenuType> getMenuTypes(){
        ArrayList<DbClasses.MenuType> menuTypes = new ArrayList<MenuType>();
        
                             ResultSet rs = db.getResultSet("Select * From MenuType");
                         MenuType menuType;

                         try {
                             while (rs.next()) {
                                 menuType = new MenuType();
                                 menuType.setMenuTypeID(rs.getInt("MenuTypeID"));
                                 menuType.setMenuName(rs.getString("MenuName"));
                                 

                                 menuTypes.add(menuType);
            }
        } catch (SQLException se) {
        }

        
        return menuTypes;
        
    }
    
      public MenuType getCustomizeItem(int MenuTypeId) {

           
        ResultSet rs = db.getResultSet("Select * From MenuType where MenuTypeId = "+MenuTypeId);
        MenuType menuType = new MenuType();

        try {
            while (rs.next()) {
                                 menuType.setMenuTypeID(rs.getInt("MenuTypeID"));
                                 menuType.setMenuName(rs.getString("MenuName"));
                
            }
        } catch (SQLException se) {
        }
        return menuType;
    }

    
    
}
