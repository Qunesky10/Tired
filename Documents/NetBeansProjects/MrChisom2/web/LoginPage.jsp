<%-- 
    Document   : LoginPage
    Created on : Feb 7, 2018, 2:19:35 AM
    Author     : kG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        
    <center><h1>Login Page</h1></center>
         <form name="form2" method="post" action="Lcontroller">
             <table cellspacing='10' align='center'>
                 <tr>
                     <th> 
                    UserName: 
                     </th>
                     <td>
                         <Input type="text" placeholder="Enter Your UserName" id="username" name="usrname" size="20" maxlength="30" required >
                     </td>
                 </tr>
            <tr>
                     <th> 
                    Password: 
                     </th>
                     <td>
                         <Input type="password" placeholder="Enter Your Password" id="password" name="pass" size="20" maxlength="30" required >
                     </td>     
            </tr>
            <tr>
                <td>
                         <Input type="submit" id="submit" name="Submit" >
                </td>
            </tr>
        </form>
    </body>
</html>
