<%-- 
    Document   : Hello
    Created on : Mar 14, 2019, 11:05:47 AM
    Author     : UCHE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home || Login</title>
        <style>
            
            body{
                margin: 0;
                padding: 0;
               
            }
            
            .background{
                 background-image: url("images/waterdrops.jpg");
            }
            .login-container{
                width: 50%;
                padding: 2%;
                margin-left: auto;
                margin-right: auto;
                margin-top: 5%;
                margin-bottom: auto;
                background-color: azure;
                box-shadow: 0px 30px 77px rgba(0, 0, 0, .175);
                border-radius: 50px 0px 50px 0px;
                -webkit-transition: all 0.2s ease;
                -moz-transition: all 0.2s ease;
                -o-transition: all 0.2s ease;
                transition: all 0.2s ease;
            }
            .login-container:hover {
                border-radius: 0px 50px 0px 50px;
            }
            .login-container form{
                margin-top: 5%;
                margin-bottom: 5%;
                text-align: center;
                margin-left: auto;
                margin-right: auto;
            }
            input{
                width: 80%;
                height: 3em;
                font-size: 0.9em;
                padding-left: 2%;
                padding-right: 2%;
                margin-bottom: 2%;
                text-align: center;
                background-color: transparent;
                border: 0px solid transparent;
                box-shadow: 0px 3px 20px rgba(0, 0, 0, .175);
                border-radius: 50px 50px 50px 50px;
                -webkit-transition: all 0.2s ease;
                -moz-transition: all 0.2s ease;
                -o-transition: all 0.2s ease;
                transition: all 0.2s ease;
            }
            input:hover{
                width: 85%;
                height: 3em;
            }
            .submitButton{
                width: 82%;
                height: 3em;
                padding: 2%; 
                color: white;
                font-size: 1em;
                font-weight: bold;
                border: 0px solid transparent;
                background-color: lightgreen;
                box-shadow: 0px 3px 20px rgba(0, 0, 0, .175);
                -webkit-transition: all 0.2s ease;
                -moz-transition: all 0.2s ease;
                -o-transition: all 0.2s ease;
                transition: all 0.2s ease;
                border-radius: 50px 50px 50px 50px;
            }
            .submitButton:hover{
                cursor: pointer;
                width: 86%;
                font-size: 1.1em;
                background-color: limegreen;
            }
        </style>
    </head>
    <body>
        
        <h1>Hey! ${head}</h1>
        <div class="background">
            <div class='login-container'>
                <h2>Hello world! ${name}</h2>
                <h2>Hey! ${message}</h2>
                <form action="/JavaMVC/welcomepage" method="post">
                    <input type="text" placeholder="Students' Name" name="studentName" value=""/><br/>
                    <input type="text" placeholder="Students' Location" name="studentLocation" value=""/><br/>
                    <p>
                        <h3> Courses :
                            <select name="studentCourses" multiple >
                                <option>JAVA</option>
                                <option>C#</option>
                                <option>PHP</option>
                                <option>SQL</option>
                            </select>
                        </h3>
                    </p>
                    <p>
                        <h3> Date of Birth :
                            <input type="date"/>
                        </h3>
                    </p>
                    <input type="password" placeholder="Password"value=""/><br/>
                    <input class="submitButton" type="submit" value="SUBMIT"/>
                    
                    
                </form>
            </div>
        </div>
    </body>
</html>
