/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kG
 */
@WebServlet(name = "Lcontroller", urlPatterns = {"/Lcontroller"})
public class Lcontroller extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            db database=new db();
            database.connect();
            database.createTable();

            /* TODO output your page here. You may use following sample code. */
            String username=request.getParameter("usrname");
            String password=request.getParameter("pass");
            
            if(database.search(username))
            {
                database.insert(username, password);
                response.sendRedirect("index.html");
            }
            else
            {
                out.println("Invalid Input || try again");
            }
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}

   