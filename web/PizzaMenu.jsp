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
                        <div class="rightdiv">
                <h1>Your Order</h1>

                <table style="width: 300px;">
                    <tr>
                        <td>
                            Deluxe Veggie
                            <div style="float: right;" class="orders">
                                <p>Rs 570</p>
                                <p><img src="images/delete.png"/></p>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Deluxe Delight
                            <div style="float: right;" class="orders">
                                <p>Rs 70</p>
                                <p><img src="images/delete.png" /></p>
                            </div>
                        </td>
                    </tr>
                </table>
                <div class="coupon">
                    <input type="text" class="input" style="width: 120px; margin: auto" placeholder="Redeem Coupon"/>
                    <button class="button">Redeem</button>
                </div>
                <table class="price">
                    <tr>
                        <td>
                            Net Price 
                        </td>
                        <td>
                            Rs 570
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Tax (S.T + VAT)
                        </td>
                        <td>
                            Rs 70
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Grand Total
                        </td>
                        <td>
                            Rs 1070
                        </td>
                    </tr>
                </table>
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
                    <img src="images/T_slider-1.jpg" class="item" id="1"/><br/>extra<br/>
                    <img src="images/T_slider-2.jpg" /><br/>extra<br/>
                    <img src="images/T_slider-3.jpg" /><br/>extra<br/>
                </div>
                <div class="pizzaDetailsTab" id="pizzaDetailsTab"> 
                    <img src="images/slider-1.jpg" style="margin-left: 35px;" />
                    <div class="content" >
                        <h3>Name</h3>&nbsp;&nbsp;&nbsp;&nbsp;
                        falla dhekna hawa sabzi kofta<br/>
                        <div class="sizeTab" >Size :</div>
                        <div class="sizeTab" >
                            <input type="radio" name="size" value="small" />Small<br/>
                            <input type="radio" name="size" value="medium" />medium<br/>
                            <input type="radio" name="size" value="large" />large<br/>
                        </div>
                        <div class="sizeTab" ><button class="button"><img src="images/pizza_icon.png" /></button></div>
                    </div>
                </div>
            </div>

        </div>    
    </body>
</html>
