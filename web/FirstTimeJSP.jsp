<%-- 
    Document   : FirstTimeJSP
    Created on : Sep 11, 2018, 4:44:18 PM
    Author     : Nuntuch  Thongyoo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
    <from action ="FirstTimeJSP.jsp" method="post">
        x = <input type="number" name="x"/><br>
        y = <input type="number" name="y"/><br>
        <input type="submit"/>
    </from>
        
        
        
        <%
        int x = 5;
        int y = 3;
        out.println(" x + y = "+(x+y));
        
        
        %>
        
    </body>
</html>
