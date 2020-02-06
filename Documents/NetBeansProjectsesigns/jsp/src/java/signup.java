/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UCHE
 */
public class signup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet sign_up</title>");            
            out.println("</head>");
            out.println("<body style=margin:0;padding:0;>");
            out.println("<style>");
            out.println("p{color:white;font-family:'Open Sans', sans-serif;text-align:center;font-size: 0.9em;};");
            out.println("</style>");
            out.println("<h1>Servlet sign_up at " + request.getContextPath() + "</h1>");
            out.println("<div style=background-color:lightblue;height:350px;text-align:center;padding-top:20px;>");
            out.println("<form action=signup method=POST>");
            out.println("<p>Name</P>");
            out.println("<input type=text name=name />");
            out.println("<p>E-mail</p>");
            out.println("<input type=text name=email />");
            out.println("<p>Password</p>");
            out.println("<input type=password name=password />");
            out.println("<p>Confirm Password</p>");
            out.println("<input type=password name=confirmpassword />"+"</br>"+"</br>");
            out.println("<input type=submit value=\"Sign up\" name=submit >");
            String a = "";
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String pass = request.getParameter("password");
            String cpass = request.getParameter("confirmpassword");
            if((name.equals("")) || (email.equals("")) || (pass.equals("")) || (cpass.equals(""))){
                a = "<div style=padding-left:44%;padding-top:-10%;><p style=color:yellow;width:170px;background:red;height:100>Please fill-in all fields...</p></div>";
            }else{
                if(!(pass.equals(cpass))){
                a = "<div style=padding-left:42%;padding-top:-10%;><p style=color:yellow;width:244px;background-color:#00BFF0;padding:7px;>Your password those not match...</p></div>";
                }else{
                request.getRequestDispatcher("/Login").forward(request, response);
                }
            }
            //out.println("<p style=color:yellow;>"+ a +"</p>");
            out.println(a);
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
