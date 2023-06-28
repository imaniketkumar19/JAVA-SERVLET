/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/arithmatic"})
public class arithmatic extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            int a=Integer.valueOf(request.getParameter("m1"));
            int b=Integer.valueOf(request.getParameter("m2"));
            String c1=request.getParameter("m3");
            String c2=request.getParameter("m4");
            String c3=request.getParameter("m5");
            String c4=request.getParameter("m6");
            String c5=request.getParameter("m7");
             if(c2.equals("sub"))
            {
                           
            out.println("<h1>Subtract of two numbers:"+(a-b)+"</h1>");
            
            }else
            if(c1.equals("add"))
            {
                
            
            out.println("<h1>Additionof two numbers:"+(a+b)+"</h1>");
            }
             
             if(c3.equals("mul"))
            {
                
            
            out.println("<h1>Multiplication two numbers:"+(a*b)+"</h1>");
            }
             
             if(c4.equals("div"))
            {
                
            
            out.println("<h1>Division two numbers:"+(a/b)+"</h1>");
            }
             
           if(c4.equals("rem"))
            {
                
            
            out.println("<h1>Reminder two numbers:"+(a%b)+"</h1>");
            }
           
            
      
            
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
