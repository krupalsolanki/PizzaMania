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
import java.util.List;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ItemSizeData;
import model.MenuItemData;

/**
 *
 * @author Krupal
 */
@WebServlet(name = "_addToCart", urlPatterns = {"/_addToCart"})
public class _addToCart extends HttpServlet {

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
            int MenuItemId;
            if(request.getParameter("itemID") == null){
                MenuItemId = 1;
            }
            else{
                MenuItemId = Integer.parseInt(request.getParameter("itemID"));
            }
            MenuItem menuItemObj = new MenuItemData().getCustomizeItem(MenuItemId);

            
            
            request.getSession().setAttribute("", out);
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
    
    public void addToCart(MenuItem item, int qty, String size){
        ItemSize curItemSize = new ItemSizeData().getItemSize(size);
        CustomizeItem CI = new CustomizeItem();
        CI.setItemSizeID(curItemSize.getItemSizeId());
        CI.setMenuItemID(item.getMenuItemId());
        CI.setQuantity(qty);
        CI.setNetPrice((item.getItemPrice() + curItemSize.getItemSizePrice()) * CI.getQuantity());
        
    }
}
