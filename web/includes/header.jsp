<%@page import="DbClasses.UserT"%>
<div class="header">
    <a href="<%=request.getContextPath() %>/PizzaMenu.jsp" ><img src="<%=request.getContextPath()%>/images/pizza-icon.png" style="height: 50px; float: left;" /></a>
                <div class="headline">
                    <h1>Pizza Mania</h1>
                </div>
</div>
<div class="menu">
    <ul>
        <li>
            <img src="<%=request.getContextPath()%>/images/pizza_icon.png" />
           <a href="#"><span class="menuTag">Pizza</span></a>
        </li>
        <li>
            <img src="<%=request.getContextPath()%>/images/dessert_icon.png" />
            <a href="#"><span class="menuTag">Desserts</span></a>
        </li>
    </ul>
    
</div>
            <hr/>