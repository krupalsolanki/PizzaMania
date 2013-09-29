/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.CustomizeItem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Dev
 */
public class CustomizeItemData {

    DatabaseHelper db;
    
    public CustomizeItemData(){
        
        db = new DatabaseHelper();
        
}
    public ArrayList<DbClasses.CustomizeItem> getCutomizeItems(){
        ArrayList<DbClasses.CustomizeItem> customizeItems = new ArrayList<CustomizeItem>();
        
                             ResultSet rs = db.getResultSet("Select * From CustomizeItem");
                         CustomizeItem customizeItem;

                         try {
                             while (rs.next()) {
                                 customizeItem = new CustomizeItem();
                                 customizeItem.setCustomizeItemID(rs.getInt("CustomizeItemID"));
                                 customizeItem.setExtraToppingsPrice(rs.getInt("ExtraToppingsPrice"));
                                 customizeItem.setItemSizeID(rs.getInt("ItemSizeID"));
                                 customizeItem.setMenuItemID(rs.getInt("MenuItemID"));
                                 customizeItem.setNetPrice(rs.getInt("NetPrice"));
                                 customizeItem.setOrderId(rs.getInt("OrderId"));
                                 customizeItem.setQuantity(rs.getInt("Quantity"));
                                 customizeItem.setTotalPrice(rs.getInt("TotalPrice"));
                                 

                                 customizeItems.add(customizeItem);
            }
        } catch (SQLException se) {
        }

        
        return customizeItems;
        
    }
    
    public CustomizeItem getCustomizeItem(int customizeItemId) {

           
        ResultSet rs = db.getResultSet("Select * From CustomizeItem where CustomizeItemId = "+customizeItemId);
        CustomizeItem customizeItem = new CustomizeItem();

        try {
            while (rs.next()) {

                                 
                                 customizeItem.setCustomizeItemID(rs.getInt("CustomizeItemID"));
                                 customizeItem.setExtraToppingsPrice(rs.getInt("ExtraToppingsPrice"));
                                 customizeItem.setItemSizeID(rs.getInt("ItemSizeID"));
                                 customizeItem.setMenuItemID(rs.getInt("MenuItemID"));
                                 customizeItem.setNetPrice(rs.getInt("NetPrice"));
                                 customizeItem.setOrderId(rs.getInt("OrderId"));
                                 customizeItem.setQuantity(rs.getInt("Quantity"));
                                 customizeItem.setTotalPrice(rs.getInt("TotalPrice"));
                                 
 
            }
        } catch (SQLException se) {
        }
        return customizeItem;
    }

    
    
}
