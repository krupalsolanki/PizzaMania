/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.OrderItem;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dev
 */
public class OrderItemData {
    DatabaseHelper db ;
    
    public OrderItemData(){
        db = new DatabaseHelper();
    }
    
    public ArrayList<DbClasses.OrderItem> getOrderItems(){
        ArrayList<DbClasses.OrderItem> orderItems = new ArrayList<OrderItem>();
        
                             ResultSet rs = db.getResultSet("Select * From OrderItem");
                         OrderItem orderItem;

                         try {
                             while (rs.next()) {
                                 orderItem = new OrderItem();
                                 orderItem.setCustomizeItemId(rs.getInt("CustomizeItemId"));
                                 orderItem.setOrderId(rs.getInt("OrderId"));
                                 orderItem.setOrderItemId(rs.getInt("OrderItemId"));
                                 
                                 

                                 orderItems.add(orderItem);
            }
        } catch (SQLException se) {
        }

        
        return orderItems;
        
    }
    
     public OrderItem getCustomizeItem(int OrderItemId) {

           
        ResultSet rs = db.getResultSet("Select * From OrderItem where OrderItemId = "+OrderItemId);
        OrderItem orderItem = new OrderItem();

        try {
            while (rs.next()) {

                                 orderItem.setCustomizeItemId(rs.getInt("CustomizeItemId"));
                                 orderItem.setOrderId(rs.getInt("OrderId"));
                                 orderItem.setOrderItemId(rs.getInt("OrderItemId"));
                
            }
        } catch (SQLException se) {
        }
        return orderItem;
    }

    
    
    
}
