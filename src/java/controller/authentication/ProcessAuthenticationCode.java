package controller.authentication;

import dal.AuthenticationCodeDAO;
import dal.MenteeDAO;
import dal.MentorDAO;
import dal.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.AuthenticationCode;
import model.UserCommon;

@WebServlet(name = "ProcessAuthenticationCode", urlPatterns = {"/ProcessAuthenticationCode"})
public class ProcessAuthenticationCode extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserCommon u = (UserCommon) session.getAttribute("user");
        AuthenticationCodeDAO acd = new AuthenticationCodeDAO();
        String codeUserInput = request.getParameter("code");
        String email = u.getEmail();
        AuthenticationCode ac = acd.getAuthenCodeByEmail(email);
//        System.out.println(u.getEmail());
//        System.out.println(codeUserInput);
//        System.out.println(ac+" ");
        if (ac == null) {
            request.setAttribute("error", "Invalid code");
            request.getRequestDispatcher("CodeAuthenticationSignUp.jsp").forward(request, response);
        } else {
            if (!ac.getCode().equals(codeUserInput)) {
                request.setAttribute("error", "Invalid code");
                request.getRequestDispatcher("CodeAuthenticationSignUp.jsp").forward(request, response);
            } else {
                UserDAO ud = new UserDAO();
                ud.create(u);
                if(u.getRole() == 1){
                    MentorDAO md = new MentorDAO();
                    md.createMentor(u);
                    session.setAttribute("user", md.getMentorByEmail(u.getEmail()));
                    request.getRequestDispatcher("user/instructor-dashboard.jsp").forward(request, response);
                    
                }else{
                    MenteeDAO mtd = new MenteeDAO();
                    mtd.createMentee(u);
                    session.setAttribute("user", mtd.getMenteeByEmail(u.getEmail()));
                    request.getRequestDispatcher("user/student-dashboard.jsp").forward(request, response);
                }
                
            }

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
