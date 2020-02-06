<%-- 
    Document   : calculator
    Created on : Apr 10, 2018, 6:42:24 AM
    Author     : UCHE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator</h1>
        <%!
            public int add(int a , int b ,int c){
            int d = a + b + c;
            return d;
        }
        
        %>
        <h2> the answer = <% out.println(add(2,5,7)); %></h2>
        
    </body>
</html>
