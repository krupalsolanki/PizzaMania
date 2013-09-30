<%-- 
    Document   : Register
    Created on : Sep 28, 2013, 7:10:59 PM
    Author     : Krupal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Registration</title>
        <link rel="stylesheet" href="CSS/pizza.css" type="text/css" />
    </head>
    <body>
        <div class="center">
            <%@include file="includes/header.jsp" %>
            <div class="registerTab">
                <form method="post" action="controller/_Login.jsp">
                    <h2 style="font-family: calibri">Login</h2>
                    <input type="text" name="txtUsername" style="width: 100%;" class="input" placeholder="Username"/><br/>
                    <input type="text" name="txtHouse" style="width: 100%;" class="input" placeholder="Society / House No"/><br/>
                    <input type="text" name="txtCity" style="width: 100%;" class="input" placeholder="City"/><br/>
                    <input type="text" name="txtArea" style="width: 100%;" class="input" placeholder="Area"/><br/>
                    <input type="password" name="txtPass" style="width: 100%;" class="input" placeholder="Password"/><br/>
                    <input type="password" name="txtPass" style="width: 100%;" class="input" placeholder="Confirm Password"/><br/>
                    <br/>

                    <div style="height: 45px; width: 300px;">
                        <input type="submit" name="Login" style="width: 35%" class="button" />
                        <input type="reset" name="Cancel" style="width: 35%" class="button" />
                    </div>
                </form>
            </div>
        </div> 
    </body>
</html>
