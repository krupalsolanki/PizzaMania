<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="CSS/pizza.css" type="text/css" />
    </head>
    <body>
        <div class="center">
            <%@include file="includes/header.jsp" %>
            <div class="loginTab">
                <!--<form method="post" action="controller/_Login.jsp">-->
                <form method="post" action="PizzaMenu.jsp">
                    <h2 style="font-family: calibri">Login</h2>
                    <input type="text" name="txtUsername" style="width: 88%;" class="input" placeholder="Username"/><br/><br/>
                    <input type="password" name="txtPass" style="width: 88%;" class="input" placeholder="Password"/><br/>
                    <br/>

                    <div style="height: 45px; width: 300px;">
                        <input type="submit" name="Login" style="width: 35%" class="button" />
                        <input type="reset" name="Cancel" style="width: 35%" class="button" />
                    </div>
                    <div style="padding: 16px; font-size: 12px;">
                        <a href="#" >Forgot Password?</a>&nbsp;|&nbsp;
                        <a href="Register.jsp" >New Registration</a>    
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
