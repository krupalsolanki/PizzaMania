<%-- 
    Document   : PizzaMenu
    Created on : Sep 28, 2013, 7:09:42 PM
    Author     : Krupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Menu</title>
        <link rel="stylesheet" href="CSS/pizza.css" type="text/css" />
    </head>
    <body>
        <div class="center">
            <%@include file="includes/header.jsp" %>
            <div class="subMenuDiv" >
                <button class="subMenu" >Simply Veg</button>
                <button class="subMenu" >Veg Treat</button>
                <button class="subMenu" >Simply Non-Veg</button>
                <button class="subMenu" >Non-Veg Treat</button>
            </div>
            <div class="detailsTab">
                <div style="margin: 0px 0px 0px 133px; position: absolute;"><img src="images/line.png" /></div>
                <div class="menuImgTab">
                    <img src="images/T_slider-1.jpg" /><br/>extra<br/>
                    <img src="images/T_slider-2.jpg" /><br/>extra<br/>
                    <img src="images/T_slider-3.jpg" /><br/>extra<br/>
                </div>
                <div class="pizzaDetailsTab"> 
                    <img src="images/slider-1.jpg" style="margin-left: 35px;" />
                </div>
            </div>
        </div>    
    </body>
</html>