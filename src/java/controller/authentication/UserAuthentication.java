package controller.authentication;
import ShareData.Mailer;
import dal.AuthenticationCodeDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UserCommon;
@WebServlet(name = "UserAuthentication", urlPatterns = {"/UserAuthentication"})
public class UserAuthentication extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                       HttpSession session = request.getSession();
        UserCommon u = (UserCommon) session.getAttribute("user");
        String email = u.getEmail();
//        String email = "vinhhshe150155@fpt.edu.vn";
        String code = getRandomString(6);
        AuthenticationCodeDAO acd = new AuthenticationCodeDAO();
        acd.insertCodeAuthentication(email, code);
        Mailer.send(email, "Code Authentication", code);
        request.getRequestDispatcher("CodeAuthenticationSignUp.jsp").forward(request, response);
    }

    private String getRandomString(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length()* Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
