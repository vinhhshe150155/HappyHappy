package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ShareData.FileHandling;
import dal.MentorDAO;
import javax.servlet.annotation.MultipartConfig;
@MultipartConfig(fileSizeThreshold=1024*1024, 
    maxFileSize=1024*1024*5, maxRequestSize=1024*1024*5*5)
@WebServlet(name = "MentorAuthentication", urlPatterns = {"/mentorAuthen"})
public class MentorAuthentication extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String userID = request.getParameter("userID");
        String img1Name = "imgAuthen1_" + userID;
        String img2Name = "imgAuthen2_" + userID;
        FileHandling fh = new FileHandling();
        String img1Path =  fh.uploadFile(request, response, "img1", img1Name);
        String img2Path = fh.uploadFile(request, response, "img2", img2Name);
        MentorDAO md = new MentorDAO();
        md.updateImageAuthenMentor(Integer.parseInt(userID), img1Path, img2Path);
        request.setAttribute("img1", img1Path);
        request.setAttribute("img2", img2Path);
        request.getRequestDispatcher("test.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
