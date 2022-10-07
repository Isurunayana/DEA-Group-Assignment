package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Register</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            background-image: url(background.jpg);\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .div1 {\n");
      out.write("            height: 450px;\n");
      out.write("            width: 400px;\n");
      out.write("            border: 2px solid rgb(217, 214, 214);\n");
      out.write("            border-radius: 9px;\n");
      out.write("            margin-left: 500px;\n");
      out.write("            margin-top: 100px;\n");
      out.write("            background-color: rgb(17, 121, 121);\n");
      out.write("        }\n");
      out.write("        .rr{\n");
      out.write("            text-align: center;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .tab {\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right: auto;\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .td1 {\n");
      out.write("            padding-right: 15px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .td2 {\n");
      out.write("            padding-right: 15px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .input {\n");
      out.write("            background-color: rgb(231, 229, 229);\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .reg {\n");
      out.write("            background-color: chartreuse;\n");
      out.write("            border: 1px solid rgb(4, 154, 4);\n");
      out.write("            border-radius: 10px;\n");
      out.write("            height: 30px;\n");
      out.write("            margin-left: 150px;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .aa{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .form {\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .span {\n");
      out.write("            color: rgb(236, 0, 0);\n");
      out.write("            margin-left: 100px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            font-weight: 600;\n");
      out.write("        }\n");
      out.write("            </style>\n");
      out.write("    <div class=\"div1\">\n");
      out.write("        <h2 class=\"rr\">Register Form</h2>\n");
      out.write("        <form action=\"\" method=\"POST\" class=\"form\">\n");
      out.write("            <table class=\"tab\">\n");
      out.write("                <tr>\n");
      out.write("                    <td class=\"td1\">\n");
      out.write("                        <label>user name</label><br>\n");
      out.write("                        <input type=\"text\" name=\"a\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("                        <label>email</label><br>\n");
      out.write("                        <input type=\"email\" name=\"b\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("                        <label>country</label><br>\n");
      out.write("                        <input type=\"text\" name=\"c\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("                        <label style=\"display:inline;\">NIC</label><br>\n");
      out.write("                        <input type=\"text\" name=\"d\" class=\"input\"><br><br>\n");
      out.write("                    </td>\n");
      out.write("                    <td class=\"td2\">\n");
      out.write("                        <label>user type</label>\n");
      out.write("                        <select name=\"e\">\n");
      out.write("                <option value=\"\">Normal User</option>\n");
      out.write("                <option value=\"\">Staff A</option>\n");
      out.write("                <option value=\"\">Staff B</option>\n");
      out.write("                <option value=\"\">Admin</option>\n");
      out.write("            </select><br><br>\n");
      out.write("\n");
      out.write("                        <label>pin code</label><br>\n");
      out.write("                        <input type=\"text\" name=\"f\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("                        <label>password</label><br>\n");
      out.write("                        <input type=\"password\" name=\"g\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("                        <label>confirm password</label><br>\n");
      out.write("                        <input type=\"password\" name=\"h\" class=\"input\"><br>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("           <button type=\"submit\" class=\"reg\"> <a href=\"login.html\" class=\"aa\">Register</a></button>\n");
      out.write("        </form><br><br><br>\n");
      out.write("        <span class=\"span\">Already registered  </span><a class=\"a\" href=\"login.html\">Sign in</a>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
