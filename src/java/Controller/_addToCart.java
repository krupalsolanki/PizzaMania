/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DbClasses.CustomizeItem;
import DbClasses.ItemSize;
import DbClasses.MenuItem;
import DbClasses.OrderTable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ItemSizeData;
import model.*;
import DbClasses.*;
import java.text.DecimalFormat;

/**
 *
 * @author Krupal
 */
@WebServlet(name = "_addToCart", urlPatterns = {"/_addToCart"})
public class _addToCart extends HttpServlet {
    ArrayList<CustomizeItem> shoppingCart;
    UserT user;
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            int menuItemId = Integer.parseInt(request.getParameter("itemID"));
            int itemQty = Integer.parseInt(request.getParameter("itemQty"));
            String itemSizeString = request.getParameter("itemSize");
//            MenuItem menuItemObj = new MenuItemData().getCustomizeItem(menuItemId);
            MenuItem menuItemObj = new MenuItemData().getCustomizeItem(menuItemId);
            
            ItemSize curItemSize = new ItemSizeData().getItemSizeString(itemSizeString);
            System.out.println("item price "+curItemSize.getItemSizePrice());
            HttpSession session = request.getSession();
            user = (UserT)session.getAttribute("User");
//            System.out.println(session.getAttribute(shoppingCart.get(2).toString()));
            
            System.out.println("user is "+user.getUsername());
            if(session.getAttribute("customizeItemCart") == null){
                shoppingCart = new ArrayList<CustomizeItem>();
            }
            else{
                shoppingCart = (ArrayList<CustomizeItem>)session.getAttribute("customizeItemCart");
            }
            addToCart(menuItemObj, itemQty, itemSizeString);
            session.setAttribute("customizeItemCart", shoppingCart);
            double netPrice=0;
            double tax = 0;
            double grandTotal = 0;
            out.print("\n" +
"                <h1>Your Order</h1>\n" +
"\n" +
"                <table style=\"width: 300px;\">\n" );
            for (CustomizeItem ci : shoppingCart) {
                out.print("<tr>");
                out.print("<td>");
                MenuItem mi = new MenuItemData().getCustomizeItem(ci.getMenuItemID());
                out.print(mi.getItemName());
                out.print("<div style=\"float: right;\" class=\"orders\">\n" +
"                                <p>"+ci.getQuantity()+"</p>&nbsp;&nbsp;&nbsp;<p>"+ci.getNetPrice()+"</p>\n" +
"                                <p><img src=\"images/delete.png\"/></p>\n" +
"                            </div>");
                out.print("</td>");
                out.print("</tr>");
                netPrice +=ci.getNetPrice();
            }
            tax = netPrice*0.7;
            float FTax = (float) Math.round(tax * 100) / 1000;
            grandTotal = FTax + netPrice;
                out.print("</table>\n" +
"                <div class=\"coupon\">\n" +
"                    <input type=\"text\" class=\"input\" style=\"width: 120px; margin: auto\" placeholder=\"Redeem Coupon\"/>\n" +
"                    <button class=\"button\">Redeem</button>\n" +
"                </div>\n" +
"                <table class=\"price\">\n" +
"                    <tr>\n" +
"                        <td>\n" +
"                            Net Price \n" +
"                        </td>\n" +
"                        <td>\n" +
"                            Rs. "+netPrice+"\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>\n" +
"                            Tax (S.T + VAT)\n" +
"                        </td>\n" +
"                        <td>\n" +
"                            Rs. "+FTax+"\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <td>\n" +
"                            Grand Total\n" +
"                        </td>\n" +
"                        <td>\n" +
"                          Rs. "+grandTotal+"\n" +
"                        </td>\n" +
"                    </tr>\n" +
"                </table>\n");
            out.print("<div style=\"width: 110px; margin: 10px auto;\"> <button class=\"button\" id=\"checkout\">Checkout</button></div>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void addToCart(MenuItem item, int qty, String size) {
        ItemSize curItemSize = new ItemSizeData().getItemSizeString(size);
        CustomizeItem CI = new CustomizeItem();
        CI.setItemSizeID(curItemSize.getItemSizeId());
        CI.setMenuItemID(item.getMenuItemId());
        CI.setQuantity(qty);
        CI.setNetPrice((item.getItemPrice() + curItemSize.getItemSizePrice()) * CI.getQuantity());
        System.out.println("added successfully");
//        OrderTable curOrder = new OrderTableData().createTempOrder(user.getUserid());
//        System.out.println("orderid "+curOrder.getOrderId());
//        CI.setOrderId(curOrder.getOrderId());
        System.out.println(CI.getOrderId());
        shoppingCart.add(CI);
        

    }
}
