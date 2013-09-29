/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.ItemType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Dev
 */
public class ItemTypeData {
    DatabaseHelper db ;
    
    public ItemTypeData(){
        db = new DatabaseHelper();
    }
    
        public ArrayList<DbClasses.ItemType> getItemTypes(){
        ArrayList<DbClasses.ItemType> itemTypes = new ArrayList<ItemType>();
        
                             ResultSet rs = db.getResultSet("Select * From ItemType");
                         ItemType itemType;

                         try {
                             while (rs.next()) {
                                 itemType = new ItemType();
                                 itemType.setItemTypeId(rs.getInt("temTypeId"));
                                 itemType.setMenuTypeId(rs.getInt("MenuTypeId"));
                                 itemType.setItemTypeName(rs.getString("ItemTypeName"));
                                 

                                 itemTypes.add(itemType);
            }
        } catch (SQLException se) {
        }

        
        return itemTypes;
        
    }

         public ItemType getCustomizeItem(int ItemTypeId) {

           
        ResultSet rs = db.getResultSet("Select * From ItemType where ItemTypeId = "+ItemTypeId);
        ItemType itemType = new ItemType();

        try {
            while (rs.next()) {

                                
                                 itemType.setItemTypeId(rs.getInt("temTypeId"));
                                 itemType.setMenuTypeId(rs.getInt("MenuTypeId"));
                                 itemType.setItemTypeName(rs.getString("ItemTypeName"));
                                 
 
            }
        } catch (SQLException se) {
        }
        return itemType;
    }

    
        
        
        
        
}
