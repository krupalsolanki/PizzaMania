/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import DbClasses.*;
import java.util.ArrayList;

/**
 *
 * @author Krupal
 */
@WebServlet(name = "_subMenuImages", urlPatterns = {"/_subMenuImages"})
public class _subMenuImages extends HttpServlet {

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
            int selectedBtn = Integer.parseInt(request.getParameter("selectedBtn"));
//            MenuType menuTypeObj = new MenuTypeData().getCustomizeItem(selectedBtn);
//            MenuItem menuItemObj = new MenuItemData().getCustomizeItem(selectedBtn);
            ArrayList<MenuItem> menuItemObj = new MenuItemData().getMenuItemByType(selectedBtn);
//            System.out.println(menuItemObj.size());
            for(int i=0; i < 3; i++){
//                 MenuItem menuItemContent = new MenuItemData().getCustomizeItem(selectedBtn);
//                menuItemObj.get(i * selectedBtn);
                out.println("<img src=\"images/T_" + menuItemObj.get(i).getImageSource() + "\" class=\"item\" onclick=\"loadDetails(this.id);\" id=\"" + menuItemObj.get(i).getMenuItemId() + "\"/><br/>" + menuItemObj.get(i).getItemName()+ "<br/>");
            }
            
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
