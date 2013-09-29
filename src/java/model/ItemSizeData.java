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
                                 itemSize.setItemSize(rs.getString("ItemSize"));
                                
                                 

                                 itemSizes.add(itemSize);
            }
        } catch (SQLException se) {
        }

        
                         
        return itemSizes;
        
    }

    public ItemSize getItemSize(String itemSize){
        ResultSet rs = db.getResultSet("Select * From ItemSize where ItemSizeId = "+itemSize);
        ItemSize itemSize1 = new ItemSize();

        try {
            while (rs.next()) {
                
                                 itemSize1.setItemSizeId(rs.getInt("ItemSizeId"));
                                 itemSize1.setItemSizePrice(rs.getInt("ItemSizePrice"));
                                 itemSize1.setItemSize(rs.getString("ItemSize"));
                      }
        } catch (SQLException se) {
        }
        return null;
        
    }
    public ItemSize getItemSize(int itemSizeId){
        
                   
        ResultSet rs = db.getResultSet("Select * From ItemSize where ItemSizeId = "+itemSizeId);
        ItemSize itemSize = new ItemSize();

        try {
            while (rs.next()) {
                
                                 itemSize.setItemSizeId(rs.getInt("ItemSizeId"));
                                 itemSize.setItemSizePrice(rs.getInt("ItemSizePrice"));
                                 itemSize.setItemSize(rs.getString("ItemSize"));
                
                
                
                      }
        } catch (SQLException se) {
        }

        
        return null;
    }
            
    
}
