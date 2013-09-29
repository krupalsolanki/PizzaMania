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
        
                             ResultSet rs = db.getResultSet("Select * From CustomizeItem");
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

    public ItemSize getItemSize(int itemSizeId){
        
                   
        ResultSet rs = db.getResultSet("Select * From TrainMaster where ItemSizeId = "+itemSizeId);
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
