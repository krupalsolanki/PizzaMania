/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.ItemSize;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Dev
 */
public class ItemSizeData {
    
    DatabaseHelper db ;
    
    
    public ItemSizeData(){
        db = new DatabaseHelper();
    }
    
    public ArrayList<DbClasses.ItemSize> getItemSizes(){
        ArrayList<DbClasses.ItemSize> itemSizes = new ArrayList<ItemSize>();
        
                             ResultSet rs = db.getResultSet("Select * From ItemSize");
                         ItemSize itemSize;

                         try {
                             while (rs.next()) {
                                 itemSize = new ItemSize();
                                 itemSize.setItemSizeId(rs.getInt("ItemSizeId"));
                                 itemSize.setItemSizePrice(rs.getInt("ItemSizePrice"));
                                 itemSize.setItemSizeString(rs.getString("ItemSize"));
                                
                                 

                                 itemSizes.add(itemSize);
            }
        } catch (SQLException se) {
        }

        
                         
        return itemSizes;
        
    }

    public ItemSize getItemSizeString(String itemSizeString){
        ResultSet rs = db.getResultSet("Select * From ItemSize where itemsize = '"+itemSizeString+"'");
        ItemSize itemSize = new ItemSize();

        try {
            while (rs.next()) {
                
                                 itemSize.setItemSizeId(rs.getInt("ItemSizeId"));
                                 itemSize.setItemSizePrice(rs.getInt("ItemSizePrice"));
                                 itemSize.setItemSizeString(rs.getString("ItemSize"));
                      }
        } catch (SQLException se) {
        }
        return itemSize;
        
    }
    public ItemSize getItemSize(int itemSizeId){
        
                   
        ResultSet rs = db.getResultSet("Select * From ItemSize where ItemSizeId = '"+itemSizeId+"'");
        ItemSize itemSize = new ItemSize();

        try {
            while (rs.next()) {
                
                                 itemSize.setItemSizeId(rs.getInt("ItemSizeId"));
                                 itemSize.setItemSizeString(rs.getString("ItemSize"));
                                 itemSize.setItemSizePrice(rs.getInt("ItemSizePrice"));
                
                
                
                      }
        } catch (SQLException se) {
        }

        
        return itemSize;
    }
            
    
}
