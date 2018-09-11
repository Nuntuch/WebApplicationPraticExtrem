/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import sit.int303.first.model.CheckUsers;
import sit.int303.first.obj.ProUser;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class CheckUserServlet extends HttpServlet {

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
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CheckUserServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CheckUserServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
        PrintWriter out = response.getWriter();
        try {

//            HttpSession session = request.getSession(true);
//            long id = Long.parseLong(request.getParameter("id"));
//            String ids = request.getParameter("id");
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
/////////////////////////////////////////////////////////////////////////////////////////
//            if (ids != null) {
//                long id = Long.parseLong(ids);
//                CheckUsers cu = (CheckUsers) session.getAttribute("cn");
//                ProUser pu = new ProUser();
//                if (cu == null) {
//                    pu.setId(id);
//                    pu.setUsername(username);
//                    pu.setPassword(password);
//                    cu.setPu(pu);
//                    session.setAttribute("checkuser", pu);
//                    
//                }
//                
//            }
////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////            
//if (ids != null && username != null && password != null) {
//                long id = Long.parseLong(ids);
//                CheckUsers cu = (CheckUsers)session.getAttribute("cu");
//   
//                ProUser pu = new ProUser();
//                    pu.setId(id);
//                    pu.setUsername(username);
//                    pu.setPassword(password);
//                    
//                if (cu == null) {
//                    cu = new CheckUsers(pu);
//                    session.setAttribute("checkuser", cu);
//                    
//                }
//                    cu.setPu(pu);
//                
//            }
////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////
//            if (ids != null) {
//                long id = Long.parseLong(ids);
//                CheckUsers cu = (CheckUsers) session.getAttribute("cu");
//                ProUser pu = new ProUser();
//                if (cu == null) {
//                    pu.setId(id);
//                    session.setAttribute("checkuser", pu);
//
//                }
//                    cu.setPu(pu);
//
//            }
//
//            if (username != null) {
//
//                CheckUsers cu = (CheckUsers) session.getAttribute("cu");
//                ProUser pu = new ProUser();
//                if (cu == null) {
//                    pu.setUsername(username);
//                    session.setAttribute("checkuser", pu);
//
//                }
//                    cu.setPu(pu);
//
//            }
//
//            if (password != null) {
//                CheckUsers cu = (CheckUsers) session.getAttribute("cu");
//                ProUser pu = new ProUser();
//                if (cu == null) {
//                    pu.setPassword(password);
//                    session.setAttribute("checkuser", pu);
//
//                }
//                    cu.setPu(pu);
//               
//            }
///////////////////////////////////////////////////////////////////////////////////////////
//            CheckUsers cu = new CheckUsers();
//            cu.CheckUser(id, username, password);
//            request.setAttribute("checkuser", cu);



            HttpSession session = request.getSession(true);



            String ids = request.getParameter("id");
            String username = request.getParameter("username");
            String password = request.getParameter("password");










            getServletContext().getRequestDispatcher("/checkuser.jsp").forward(request, response);

        } catch (Exception e) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckUserServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CheckUserServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>Servlet Error " + e + "</h1>");
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
