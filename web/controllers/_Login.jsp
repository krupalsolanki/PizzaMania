<%@page import="java.sql.*" %>
<%@page import="java.util.*" %>
<%@page import="model.*"%>
<%@page import="DbClasses.*"%>
<%
    //DatabaseHelper dbHelper = new DatabaseHelper();
    String username = request.getParameter("txtUsername");
    String password = request.getParameter("txtPassword");
    
    UserT user = new UserTData().getTestUser();
    
    session.setAttribute("User", user);
    response.sendRedirect(request.getContextPath() + "/PlanTravel.jsp");

%>