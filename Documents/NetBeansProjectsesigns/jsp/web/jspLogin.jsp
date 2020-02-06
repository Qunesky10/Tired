<%-- 
    Document   : jspLogin
    Created on : May 31, 2018, 6:25:55 AM
    Author     : UCHE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <script>
                   body{
                       margin: 0;
                       padding: 0;
                   }
                   
                   .formbody{
                        background-color: lightblue;
                        text-align: center;
                   }
                   
            .formbody form{
                text-align: center;
                   }
                   
                   form label{
                       text-align: center;
                   }
        </script>
        
        <%
         %>
        
        <h1>Hello World!</h1>
        <div class="formbody">
            <form style="text-align: center" name="myform" action="Beans" method="POST">
                <label>Username</label><br>
                <input style="text-align: center;margin-bottom:0.5%;" type="text" name="username" value="" size="20" placeholder="enter your name" /><br>
                <label>Password</label><br>
                <input style="text-align: center;margin-bottom:0.5%;" type="password" name="password" value="" size="20" placeholder="enter your name" /><br>
                <input style="text-align: center;margin-bottom:0.5%;" type="submit" name="password" value="Login" />
            </form>
        </div>
    </body>
</html>
