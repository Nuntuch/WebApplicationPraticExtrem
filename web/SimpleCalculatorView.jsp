<%-- 
    Document   : SimpleCalculatorView
    Created on : Aug 22, 2018, 1:53:54 PM
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
        <h1>This is SimpleCalculatorView.jsp</h1>
        <h1>Hello World!</h1>
        <h1>Result :: </h1><hr>
        <table>
            <tr>
                <td>x</td>
                <td>=</td>
                <td>${calculator.x}</td>
            </tr>
            <tr>
                <td>y</td>
                <td>=</td>
                <td>${calculator.y}</td>
            </tr>
            <tr>
                <td>Operator</td>
                <td>=</td>
                <td>${calculator.operator}</td>
            </tr>
            <tr>
                <td>Result</td>
                <td>=</td>
                <td>${calculator.result}</td>
            </tr>
        </table>
    </body>
</html>