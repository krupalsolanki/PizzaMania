/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DbClasses.OrderTable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public OrderTable createTempOrder(int userId)
    {
        OrderTable order = null;
        deleteTempOrder();
        try
        {
            order = new OrderTable();
            order.setOrderId(99);
            order.setUserid(userId);
            order.setTotalBill(0.00);
            order.setGrandTotal(0.00);
            order.setTax(0.00);
            order.setOrderStatus("temp");
            order.setDiscount(0.00);
            order.setOrderDate(" ");
            insertOrder(order);
        }
       catch(Exception e){e.printStackTrace();}
        return order;
    }



    public void deleteTempOrder()
    {
        deleteOrder(99);
    }

    public void deleteOrder(int orderId)
    {
        int rs = db.executeQuery("Delete from OrderTable Where OrderId = " + orderId);
    }

    public int ConfirmTempOrder(OrderTable otd)
    {
        
        ResultSet rs = db.getResultSet("Update OrderTable Set UserId = " + otd.getUserid() + ", TotalBill = " + otd.getTotalBill() + ", Tax = " + otd.getTax() + ", GrandTotal = " + otd.getGrandTotal() + ", Discount = " + otd.getDiscount() + ", OrderStatus = 'Placed', OrderId = " + otd.getOrderId() + " where OrderId = 99");
        otd.setOrderId(getNewOrderNo());
        return otd.getOrderId();
    }
    public int getNewOrderNo()
    {
        int count = 1;
        ResultSet rs = db.getResultSet("Select Count(OrderId) From OrderTable");
        try {
            while(rs.next()){
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderTableData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    public void insertOrder(OrderTable otd)
    {
        int rs = db.executeQuery("Insert into OrderTable Values(NULL, '" + otd.getUserid() + "', '" + otd.getTotalBill() + "', '" + otd.getTax() + "', '" + otd.getGrandTotal() + "', '" + otd.getDiscount() + "', '" + otd.getOrderDate() + "','" + otd.getOrderStatus() + "')");
        
    }
}
