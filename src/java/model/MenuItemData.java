/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.MenuItem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dev
 */
public class MenuItemData {
    DatabaseHelper db ;
    
    public MenuItemData(){
        db = new DatabaseHelper();
    }
    
    
     public ArrayList<DbClasses.MenuItem> getMenuItems(){
        ArrayList<DbClasses.MenuItem> menuItems = new ArrayList<MenuItem>();
        
                             ResultSet rs = db.getResultSet("Select * From MenuItem");
                         MenuItem menuItem;

                         try {
                             while (rs.next()) {
                                 menuItem = new MenuItem();
                                 menuItem.setImageSource(rs.getString("ImageSource"));
                                 menuItem.setItemPrice(rs.getInt("ItemPrice"));
                                 menuItem.setItemToppings(rs.getString("ItemToppings"));
                                 menuItem.setItemTypeId(rs.getInt("ItemTypeId"));
                                 menuItem.setMenuItemId(rs.getInt("MenuItemId"));
                                 

                                 menuItems.add(menuItem);
            }
        } catch (SQLException se) {
        }

        
        return menuItems;
        
    }
     
     public ArrayList<DbClasses.MenuItem> getMenuItemByType(int type){
        ArrayList<DbClasses.MenuItem> menuItems = new ArrayList<MenuItem>();
        
                             ResultSet rs = db.getResultSet("Select * From MenuItem where itemtypeid = "+type);
                         MenuItem menuItem;

                         try {
                             while (rs.next()) {
                                 menuItem = new MenuItem();
                                 menuItem.setImageSource(rs.getString("ImageSource"));
                                 menuItem.setItemName(rs.getString("ItemName"));
                                 menuItem.setItemPrice(rs.getInt("ItemPrice"));
                                 menuItem.setItemToppings(rs.getString("ItemToppings"));
                                 menuItem.setItemTypeId(rs.getInt("ItemTypeId"));
                                 menuItem.setMenuItemId(rs.getInt("MenuItemId"));
                                 

                                 menuItems.add(menuItem);
            }
        } catch (SQLException se) {
        }

        
        return menuItems;
        
    }
    
      public MenuItem getCustomizeItem(int MenuItemId) {

           
        ResultSet rs = db.getResultSet("Select * From MenuItem where MenuItemId = "+ MenuItemId);
        MenuItem menuItem = new MenuItem();

        try {
            while (rs.next()) {
                                
                                 menuItem.setImageSource(rs.getString("ImageSource"));
                                 menuItem.setItemName(rs.getString("ItemName"));
                                 menuItem.setItemPrice(rs.getInt("ItemPrice"));
                                 menuItem.setItemToppings(rs.getString("ItemToppings"));
                                 menuItem.setItemTypeId(rs.getInt("ItemTypeId"));
                                 menuItem.setMenuItemId(rs.getInt("MenuItemId"));
                                 
 
            }
        } catch (SQLException se) {
        }
        return menuItem;
    }

    
    
    
    
    
    
}
