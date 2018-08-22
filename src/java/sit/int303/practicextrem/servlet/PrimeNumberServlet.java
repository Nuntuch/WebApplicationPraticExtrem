/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.practicextrem.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import sit.int303.practicextream.model.PrimeNumber;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class PrimeNumberServlet extends HttpServlet {

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
            try {

//        request.getSession(); จะมีค่าเริ่มต้นเป็น true
//        request.getSession(Boolean); ถ้าเป็นt แล้วไม่เคยมีเชตชั่นจะสรัางให้ แต่ถ้า f แล้วไม่มีเชตชั่นจะreturn null
                HttpSession session = request.getSession(true);

                String n = request.getParameter("number");

                if (n != null) {
                    int number = Integer.valueOf(n);
                    PrimeNumber pn = (PrimeNumber) session.getAttribute("pn");
                        
                    if(pn == null ){
                        pn = new PrimeNumber(number);
                        session.setAttribute("pn", pn);
                    }
                pn.setNumber(number);
                }
                getServletContext().getRequestDispatcher("/PrimeNumberView.jsp").forward(request, response);

            } catch (Exception e) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet PrimeNumberServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>This is PrimeNumberServlet.java </h1>");
                out.println("<h1>Servlet Error!!! " + e + "</h1>");
                out.println("<h1>Servlet PrimeNumberServlet at " + request.getContextPath() + "</h1>");
                out.println("</body>");
                out.println("</html>");
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
