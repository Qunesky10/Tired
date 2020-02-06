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
import javax.servlet.http.HttpSession;

/**
 *
 * @author UCHE
 */
public class Login extends HttpServlet {

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
            String uname = request.getParameter("username");                    
            String upass = request.getParameter("userpassword");
            
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");   
            out.println("<style>");
            out.println("p{color:white;font-family:'Open Sans', sans-serif;text-align:center;font-size: 0.9em;};");
            out.println("</style>");
            out.println("</head>");
            out.println("<body style=padding:0;margin:0;>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("<div style=text-align:center;background:lightgreen;height:230px;padding-top:20px;>");
            out.println("<form action=welcome method=POST>");
            out.println("<p>Username</p>");
            out.println("<input type=text name=username />"+"</br>");
            out.println("<p>Password</p>");
            out.println("<input type=password name=userpassword />"+"</br>"+"</br>");
            out.println("<input type=submit value=Login />");
            String a = "";
            
             if((!(uname.equals("admin"))) || (upass.equals("admin"))){
                 if((upass.equals("admin"))){
                HttpSession session = request.getSession();
                session.setAttribute("username",uname);
                request.getRequestDispatcher("/welcome").forward(request, response);
                }else{
                a = "<div style=padding-left:43%;padding-left:-44%;align-content:center;padding-top:-10%;><p style=color:yellow;width:170px;padding:8px;background:red;height:100>Incorrect password...</p></div>";
                }
             }else if((uname.equals("")) || (upass.equals(""))){
                a = "<div style=padding-left:43%;padding-left:-44%;align-content:center;padding-top:-10%;><p style=color:yellow;width:170px;padding:8px;background:red;height:100>Please fill-in all fields...</p></div>";
            }
            out.println(a);
            out.println("</form>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
        
            
            //request.getRequestDispatcher("/customerManagement.jsp").forward(request, response);
        
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
