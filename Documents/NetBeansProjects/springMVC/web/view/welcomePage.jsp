<%-- 
    Document   : welcomePage
    Created on : Mar 26, 2019, 9:45:12 AM
    Author     : UCHE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home || Welcome ${name}</title>
        <style>
            body{
                margin: 0;
                padding: 0;
                background-image: url("images/waterdrops.jpg");
            }
        </style>
    </head>
    <body>
        <h1>Hey! ${head}</h1>
        <h1>Congratulation</h1>
        <h3>Details Submitted</h3>
        
        <table>
            <tr>
                <td>Student Name: </td>
                <td>${studentModel.studentName} </td>
            </tr>
            <tr>
                <td>Student Location: </td>
                <td>${studentModel.studentLocation} </td>
            </tr>
            <tr>
                <td>Student Courses: </td>
                <td>${studentModel.studentCourses} </td>
            </tr>
            <tr>
                <td>Student Date Of Birth </td>
                <td>${studentModel.studentDateOfBirth} </td>
            </tr>
        </table>
    </body>
</html>
