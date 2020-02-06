<%-- 
    Document   : calculation
    Created on : Feb 7, 2018, 3:14:05 AM
    Author     : kG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation</title>
    </head>
    <body>
         <form name="form2" method="post" action="Ccontroller">
             <table cellspacing='10' align='center'>
                 <tr>
                     <th> 
                    Input 1: 
                     </th>
                     <td>
                         <Input type="text"  id="input1" name="input1" size="20" maxlength="30" required >
                     </td>
                 </tr>
            <tr>
                     <th> 
                    input 2: 
                     </th>
                     <td>
                         <Input type="text"  id="input2" name="input2" size="20" maxlength="30" required >
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
