/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DbClasses.MenuItem;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import DbClasses.*;

/**
 *
 * @author Krupal
 */
@WebServlet(name = "_pizzaDetails", urlPatterns = {"/_pizzaDetails"})
public class _pizzaDetails extends HttpServlet {

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
            if (request.getParameter("itemID") == null) {
                MenuItemId = 1;
            } else {
                MenuItemId = Integer.parseInt(request.getParameter("itemID"));
            }
            MenuItem menuItemObj = new MenuItemData().getCustomizeItem(MenuItemId);
            out.println("<img src=\"images/" + menuItemObj.getImageSource() + "\" style=\"margin-left: 35px; height: 250px;\" />");
            out.println("<div class=\"content\" >");
            out.println("<h3>" + menuItemObj.getItemName() + "</h3>&nbsp;&nbsp;&nbsp;&nbsp;");
            out.println(menuItemObj.getItemToppings() + "<br/>");
            out.println("                        <div class=\"sizeTab\" >Size :<br/>\n"
                    + "                        <input type=\"radio\" name=\"size\" value=\"small\" checked=\"true\" id=\"small\"/>Small<br/>\n"
                    + "                            <input type=\"radio\" name=\"size\" value=\"medium\" id=\"medium\"/>medium<br/>\n"
                    + "                            <input type=\"radio\" name=\"size\" value=\"large\" id=\"large\" />large<br/></div>\n"
                    + "                        <div class=\"sizeTab\" >\n"
                    + "                            Quantity : <input type=\"text\" value=\"1\" id=\"txtQty\" name=\"txtQty\" style=\"width: 20px;\" />\n"
                    + "                        </div>");
            out.println("<div class=\"sizeTab\" ><button class=\"button\" onclick=\"addToCart(this.id);\" id=\"" + menuItemObj.getMenuItemId() + "\"><img src=\"images/empty-cart-dark.png\" /></button></div>");
            out.println("</div>");
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
}
