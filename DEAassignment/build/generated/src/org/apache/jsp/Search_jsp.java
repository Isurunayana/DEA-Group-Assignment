package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>search form</title>\n");
      out.write("   <style>\n");
      out.write("   *{\n");
      out.write("\t margin:0;\n");
      out.write("\t padding:0;\n");
      out.write("\t font-family:'poppins',sans-serif;\n");
      out.write("\t box-sizing:border-box;\n");
      out.write("\t \n");
      out.write(" }\n");
      out.write("\t.hero{\n");
      out.write("\t width: 100%;\n");
      out.write("\t height:100vh;\n");
      out.write("\t background-image:url(Search.jpeg);\n");
      out.write("\t background-position:center;\n");
      out.write("\t background-size:cover;\n");
      out.write("\t display:flex;\n");
      out.write("\t align-items:center;\n");
      out.write("\t justify-content:center;\n");
      out.write("\t font-size:23px;\n");
      out.write(" }\n");
      out.write("\tform{\n");
      out.write("\t\twidth:90%;\n");
      out.write("\t\tmax-width:600px;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t.input-group{\n");
      out.write("\t\tmargin-bottom:30px;\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t.button{\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t\twidth:100px;\n");
      out.write("\t\t\t\theight:30px;\n");
      out.write("\t\t\t\tbackground:red;\n");
      out.write("\t\t\t\tcolor:white;\n");
      out.write("\t\t\t\tborder:none;\n");
      out.write("\t\t\t\tallign:center;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t.sbutton{\n");
      out.write("\t\t\t\twidth:100px;\n");
      out.write("\t\t\t\theight:30px;\n");
      out.write("\t\t\t\tbackground:blue;\n");
      out.write("\t\t\t\tcolor:white;\n");
      out.write("\t\t\t\tborder:none; \n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\n");
      out.write("\tnav{\n");
      out.write("    width: 100%;\n");
      out.write("    background:blanchedalmond;\n");
      out.write("    overflow: auto;\n");
      out.write("}\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  color: black;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("  text-transform: none;\n");
      out.write("  text-shadow: #ddd;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\t\n");
      out.write("\t<nav>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#home\">Home</a></li>\n");
      out.write("                <li><a href=\"#about\">About</a></li>\n");
      out.write("                <li><a href=\"#bookflight\">BookFlight</a></li>\n");
      out.write("                <li><a href=\"#phoenixclub\">PhoenixClub</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"hero\">\n");
      out.write("<form>\n");
      out.write("\t<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<h2>\n");
      out.write("\t\t<strong>Search for one way or return flight below:</strong>\n");
      out.write("\t</h2>\n");
      out.write("\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"select\" ><strong>One Way</strong>\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"select\"><strong>Return</strong>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t</br><strong>From :</strong>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t</br><input type=\"text\" name=\"\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<strong>To :</strong>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<strong>Depart :</strong>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<input type=\"date\" placeholder=\"MM/DD/YY\" name=\"\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr></br>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<strong>Return :</strong>\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t\t<td>\n");
      out.write("\t\t\t\t<input type=\"date\" placeholder=\"MM/DD/YY\" name=\"\">\n");
      out.write("\t\t\t</td>\n");
      out.write("\t\t</tr>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t<form class=\"form-inline\" action=\"/action_page.php\">\n");
      out.write("  <label for=\"email\"><strong>Adult:</strong></label>\n");
      out.write("  <input type=\"text\" id=\"email\"  name=\"email\">\n");
      out.write("  <label for=\"pwd\" ><strong>Children:</strong></label>\n");
      out.write("  <input type=\"password\" id=\"pwd\"  name=\"pswd\">\n");
      out.write("  <label for=\"email\"><strong>Infant:</strong></label>\n");
      out.write("  <input type=\"email\" id=\"email\"  name=\"email\">\n");
      out.write("  <label for=\"pwd\"><strong>Classe:</strong></label>\n");
      out.write("  <input type=\"password\" id=\"pwd\"  name=\"pswd\">\n");
      out.write("  \n");
      out.write(" </br>\n");
      out.write(" </br><button type=\"button\" class=\"button\">Reset</button>  <button type=\"button\" class=\"sbutton\">Search</button> \n");
      out.write("                \n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write(" <td>\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
