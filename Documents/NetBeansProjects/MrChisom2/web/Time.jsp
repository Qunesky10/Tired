<%-- 
    Document   : Time
    Created on : Feb 28, 2018, 8:54:14 AM
    Author     : kG
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <% String t1="1:00 PM";
        String t2="5:00 PM";
        
SimpleDateFormat formatter=new SimpleDateFormat("h:mm");
Date d1=formatter.parse(t1);
Date d2=formatter.parse(t2);
long timediff=d2.getHours()-d1.getHours();
out.println("The time Difference is: "+timediff+" hours");
      %>
    </body>
</html>
