<%@page import="model.MenuItemData"%>
<%@page import="DbClasses.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Menu</title>
        <link rel="stylesheet" href="CSS/pizza.css" type="text/css" />
        <script type="text/javascript" src="includes/jquery-1.10.2.min.js" ></script>
        <script type="text/javascript" src="includes/pizza.js" ></script>
    </head>
    <body>
        <div class="center">
            <%@include file="includes/header.jsp" %>
            <div class="rightdiv" id="cart">
                <h1>Your Order</h1>
                <div class="coupon">
                    <input type="text" class="input" style="width: 120px; margin: auto" placeholder="Redeem Coupon"/>
                    <button class="button">Redeem</button>
                </div>
                
               
            </div> 




            <div class="subMenuDiv" id="subMenuImages" >
                <button class="subMenu" id="1">Simply Veg</button>
                <button class="subMenu" id="2" >Veg Treat</button>
                <button class="subMenu" id="3" >Simply Non-Veg</button>
                <button class="subMenu" id="4" >Non-Veg Treat</button>
            </div>
            <div class="detailsTab">
                <div style="margin: 0px 0px 0px 133px; position: absolute;"><img src="images/line.png" /></div>
                <div class="menuImgTab" id="menuImgTab">
                    <img src="images/T_slider-1.jpg" class="item" id="1" onclick="loadDetails(this.id);"/><br/>extra<br/>
                    <img src="images/T_slider-2.jpg" /><br/>extra<br/>
                    <img src="images/T_slider-3.jpg" /><br/>extra<br/>
                </div>
                <div class="pizzaDetailsTab" id="pizzaDetailsTab"> 
                    <img src="images/<% MenuItem menuItemObj = new MenuItemData().getCustomizeItem(3);
                    out.print(menuItemObj.getImageSource()); %>" style="margin-left: 35px; height: 250px;" />
                    <div class="content" >
                        <h3><% 
                        out.print(menuItemObj.getItemName());
                        %></h3>&nbsp;&nbsp;&nbsp;&nbsp;
                        <% out.print(menuItemObj.getItemToppings()); %><br/>
                        <div class="sizeTab" >Size :<br/>
                            <input type="radio" name="size" value="small" checked="true" id="small"/>Small<br/>
                            <input type="radio" name="size" value="medium" id="medium"/>medium<br/>
                            <input type="radio" name="size" value="large" id="large" />large<br/></div>
                        <div class="sizeTab" >
                            Quantity : <input type="text" value="1" id="txtQty" name="txtQty" style="width: 20px;" />
                        </div>
                        <div class="sizeTab" ><button class="button" id="<% out.print(menuItemObj.getItemTypeId());%>" onclick="addToCart(this.id);"><img src="images/empty-cart-dark.png" /></button></div>
                    </div>
                </div>
            </div>

        </div>    
    </body>
</html>
