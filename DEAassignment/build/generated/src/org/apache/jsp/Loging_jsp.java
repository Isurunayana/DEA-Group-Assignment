package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Loging_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Log In</title>\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"style.css\"> -->\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url(image.jpg );\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .h1 {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .div1 {\n");
      out.write("            border-radius: 20px;\n");
      out.write("            background-color: rgb(155, 207, 232);\n");
      out.write("            text-align: center;\n");
      out.write("            height: 400px;\n");
      out.write("            width: 400px;\n");
      out.write("            margin-top: 100px;\n");
      out.write("            /* border: 3px solid rgb(26, 26, 26); */\n");
      out.write("            margin-left: auto;\n");
      out.write("            margin-right: auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .input {\n");
      out.write("            border-radius: 5px;\n");
      out.write("            border: none;\n");
      out.write("            background-color: rgb(230, 230, 225);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        .gg{\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .ff{\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"div1\">\n");
      out.write("        <h1 class=\"h1\">Login</h1>\n");
      out.write("        <form action=\"\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <label>UsernName</label><br>\n");
      out.write("            <input type=\"text\" name=\"a\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("            <label>Email</label><br>\n");
      out.write("            <input type=\"email\" name=\"b\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("            <label>UserType</label><br>\n");
      out.write("            <select class=\"input\" name=\"c\">\n");
      out.write("                <option>Normal User</option>\n");
      out.write("                <option>Admin</option>\n");
      out.write("                <option>Staff A</option>\n");
      out.write("                <option>Staff B</option>s\n");
      out.write("            </select><br><br>\n");
      out.write("\n");
      out.write("            <label>Password</label><br>\n");
      out.write("            <input type=\"password\" name=\"d\" class=\"input\"><br><br>\n");
      out.write("\n");
      out.write("            <button type=\"submit\" class=\"ff\"><a href=\"Search.html\" class=\"gg\">submit</a></button>\n");
      out.write("        </form> <br>\n");
      out.write("        <a href=\"register.html\" class=\"a\">Create an account</a>\n");
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
