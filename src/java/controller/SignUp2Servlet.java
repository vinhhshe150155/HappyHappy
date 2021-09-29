/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.MenteeDAO;
import dal.MentorDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserCommon;

/**
 *
 * @author Admin
 */
public class SignUp2Servlet extends HttpServlet {

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
            out.println("<title>Servlet SignUp2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SignUp2Servlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("SignUp2.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String e = request.getParameter("email");
        String p = request.getParameter("password");
        String n = request.getParameter("name");
        String dob = request.getParameter("dob");
        String ph = request.getParameter("phone");
        String s = request.getParameter("sex");
        String r = request.getParameter("role");
        UserDAO ud = new UserDAO();
        MenteeDAO ted = new MenteeDAO();
        MentorDAO tod = new MentorDAO();
        UserCommon a = ud.getEmail(e);
        UserCommon b = ud.getPhone(ph);
        if (a != null || b!=null) {
            request.setAttribute("error", "Email hoặc số điện thoại đã tồn tại");
            request.getRequestDispatcher("SignUp.jsp").forward(request, response);
        } else {
            UserCommon u = new UserCommon();
            u.setEmail(e);
            u.setPassword(p);
            u.setName(n);
            u.setDob(dob);
            u.setPhone(ph);
            u.setSex(Integer.parseInt(s));
            u.setRole(Integer.parseInt(r));
            ud.create(u);
            if(u.getRole()==1){
                tod.createMentor(u);
            }
            if(u.getRole()==2){
                ted.createMentee(u);
            }
            response.sendRedirect("signin");
        }
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
