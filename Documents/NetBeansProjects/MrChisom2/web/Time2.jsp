<%-- 
    Document   : Time2
    Created on : Feb 28, 2018, 11:06:17 AM
    Author     : kG
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form2" method="post">
             <table cellspacing='10' align='center'>
                 <tr>
                     <th> 
                    Beginning Time: 
                     </th>
                     <td>
                         <Input type="time"  id="t1" name="t1" >
                     </td>
                 </tr>
            <tr>
                     <th> 
                    End Time: 
                     </th>
                     <td>
                         <Input type="time"  id="t2" name="t2" >
                     </td>     
            </tr>
            <tr>
                <td>
                         <Input type="submit" id="submit" name="Submit" >
                </td>
            </tr>
        </form>
        <%
        if(request.getParameter("t1")!=null && request.getParameter("t2")!=null)
        {
            SimpleDateFormat formatter=new SimpleDateFormat("h:mm");
Date d1=formatter.parse(request.getParameter("t1"));
Date d2=formatter.parse(request.getParameter("t2"));
long timediff=d2.getHours()-d1.getHours();
out.println("The time Difference is: "+timediff+" hours");
        }
        
        %>
    </body>
</html>
