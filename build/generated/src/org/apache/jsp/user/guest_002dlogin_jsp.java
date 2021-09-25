package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guest_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\"\n");
      out.write("              content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\"\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("        <!-- Prevent the demo from appearing in search engines (REMOVE THIS) -->\n");
      out.write("        <meta name=\"robots\"\n");
      out.write("              content=\"noindex\">\n");
      out.write("\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500%7CRoboto:400,500&amp;display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Perfect Scrollbar -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"assets/vendor/perfect-scrollbar.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Material Design Icons -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"assets/css/material-icons.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome Icons -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"assets/css/fontawesome.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Preloader -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"assets/vendor/spinkit.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- App CSS -->\n");
      out.write("        <link type=\"text/css\"\n");
      out.write("              href=\"assets/css/app.css\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body class=\"login\">\n");
      out.write("\n");
      out.write("        <div class=\"d-flex align-items-center\"\n");
      out.write("             style=\"min-height: 100vh\">\n");
      out.write("            <div class=\"col-sm-8 col-md-6 col-lg-4 mx-auto\"\n");
      out.write("                 style=\"min-width: 300px;\">\n");
      out.write("                <div class=\"text-center mt-5 mb-1\">\n");
      out.write("                    <div class=\"avatar avatar-lg\">\n");
      out.write("                        <img src=\"assets/images/logo/primary.svg\"\n");
      out.write("                             class=\"avatar-img rounded-circle\"\n");
      out.write("                             alt=\"LearnPlus\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"d-flex justify-content-center mb-5 navbar-light\">\n");
      out.write("                    <a href=\"student-dashboard.html\"\n");
      out.write("                       class=\"navbar-brand m-0\">HappyHappy</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card navbar-shadow\">\n");
      out.write("                    <div class=\"card-header text-center\">\n");
      out.write("                        <h4 class=\"card-title\">Login</h4>\n");
      out.write("                        <p class=\"card-subtitle\">Access your account</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                        <form action=\"https://learnplus.demo.frontendmatter.com/student-dashboard.html\"\n");
      out.write("                              novalidate\n");
      out.write("                              method=\"get\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-label\"\n");
      out.write("                                       for=\"email\">Your email address:</label>\n");
      out.write("                                <div class=\"input-group input-group-merge\">\n");
      out.write("                                    <input id=\"email\"\n");
      out.write("                                           type=\"email\"\n");
      out.write("                                           name=\"email\"\n");
      out.write("                                           required=\"\"\n");
      out.write("                                           class=\"form-control form-control-prepended\"\n");
      out.write("                                           placeholder=\"Your email address\">\n");
      out.write("                                    <div class=\"input-group-prepend\">\n");
      out.write("                                        <div class=\"input-group-text\">\n");
      out.write("                                            <span class=\"far fa-envelope\"></span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label class=\"form-label\"\n");
      out.write("                                       for=\"password\">Your password:</label>\n");
      out.write("                                <div class=\"input-group input-group-merge\">\n");
      out.write("                                    <input id=\"password\"\n");
      out.write("                                           type=\"password\"\n");
      out.write("                                           name=\"password\"\n");
      out.write("                                           required=\"\"\n");
      out.write("                                           class=\"form-control form-control-prepended\"\n");
      out.write("                                           placeholder=\"Your password\">\n");
      out.write("                                    <div class=\"input-group-prepend\">\n");
      out.write("                                        <div class=\"input-group-text\">\n");
      out.write("                                            <span class=\"far fa-key\"></span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group \">\n");
      out.write("                                <button type=\"submit\"\n");
      out.write("                                        class=\"btn btn-primary btn-block\">Login</button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <a href=\"guest-forgot-password.html\"\n");
      out.write("                                   class=\"text-black-70\"\n");
      out.write("                                   style=\"text-decoration: underline;\">Forgot Password?</a>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer text-center text-black-50\">\n");
      out.write("                        Not yet a student? <a href=\"signup\">Sign Up</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"assets/vendor/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"assets/vendor/popper.min.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Perfect Scrollbar -->\n");
      out.write("        <script src=\"assets/vendor/perfect-scrollbar.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- MDK -->\n");
      out.write("        <script src=\"assets/vendor/dom-factory.js\"></script>\n");
      out.write("        <script src=\"assets/vendor/material-design-kit.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- App JS -->\n");
      out.write("        <script src=\"assets/js/app.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Highlight.js -->\n");
      out.write("        <script src=\"assets/js/hljs.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- App Settings (safe to remove) -->\n");
      out.write("        <script src=\"assets/js/app-settings.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
