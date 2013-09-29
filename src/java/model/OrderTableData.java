/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.OrderTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dev
 */
public class OrderTableData {
    DatabaseHelper db ;
    
    public OrderTableData(){
        db = new DatabaseHelper();
    }
    
    public ArrayList<DbClasses.OrderTable> getOrders(){
        ArrayList<DbClasses.OrderTable> orders = new ArrayList<OrderTable>();
        
                             ResultSet rs = db.getResultSet("Select * From OrderTable");
                         OrderTable order;

                         try {
                             while (rs.next()) {
                                 order = new OrderTable();
                                 order.setDiscount(rs.getDouble("Discount"));
                                 order.setGrandTotal(rs.getDouble("GrandTotal"));
                                 order.setOrderDate(rs.getString("OrderDate"));
                                 order.setOrderId(rs.getInt("OrderId"));
                                 order.setOrderStatus(rs.getString("OrderStatus"));
                                 order.setTax(rs.getDouble("Tax"));
                                 order.setTotalBill(rs.getDouble("TotalBill"));
                                 order.setUserid(rs.getInt("Userid"));
                                 

                                 orders.add(order);
            }
        } catch (SQLException se) {
        }

        
        return orders;
        
    }
    
     public OrderTable getCustomizeItem(int OrderId) {

           
        ResultSet rs = db.getResultSet("Select * From OrderTable where OrderId = "+OrderId);
        OrderTable order = new OrderTable();

        try {
            while (rs.next()) {

                                 order.setDiscount(rs.getDouble("Discount"));
                                 order.setGrandTotal(rs.getDouble("GrandTotal"));
                                 order.setOrderDate(rs.getString("OrderDate"));
                                 order.setOrderId(rs.getInt("OrderId"));
                                 order.setOrderStatus(rs.getString("OrderStatus"));
                                 order.setTax(rs.getDouble("Tax"));
                                 order.setTotalBill(rs.getDouble("TotalBill"));
                                 order.setUserid(rs.getInt("Userid"));
            
            }
        } catch (SQLException se) {
        }
        return order;
    }

    
}
