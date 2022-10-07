package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FlightPrice_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("        table,th,td{\n");
      out.write("            width: 1200px ;\n");
      out.write("            border: 2px solid;\n");
      out.write("            text-align: left;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            padding:1% 2% 1% 2%;\n");
      out.write("            font-size: large;\n");
      out.write("            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\n");
      out.write("            font-style: oblique;\n");
      out.write("            margin: auto;\n");
      out.write("            background-color: white;\n");
      out.write("        }\n");
      out.write("        h4{\n");
      out.write("            color: black;\n");
      out.write("            font-size: larger;\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            font-style: normal;\n");
      out.write("            text-align: start;\n");
      out.write("        }\n");
      out.write("        a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: inline-block;\n");
      out.write("  padding: 10px 20px;\n");
      out.write("  font-size: x-large;\n");
      out.write("  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("  text-align: center;\n");
      out.write("  font-style: oblique;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".back {\n");
      out.write("  background-color:rgba(255, 47, 47, 0.459);\n");
      out.write("  color: black;\n");
      out.write("  font-size: large;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".next {\n");
      out.write("  background-color:rgb(161, 227, 231);\n");
      out.write("  color: white;\n");
      out.write("  font-size: large;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".round {\n");
      out.write("  border-radius: 50%;\n");
      out.write("}\n");
      out.write("nav{\n");
      out.write("    width: 100%;\n");
      out.write("    background:blanchedalmond;\n");
      out.write("    overflow: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color:white;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("  display: block;\n");
      out.write("  \n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-family: 'Times New Roman', Times, serif;\n");
      out.write("  text-transform: none;\n");
      out.write("  text-shadow: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("  background-color:rgb(184, 236, 232);\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: lightblue;\n");
      out.write("    background-image: url(Flight.jpeg);\n");
      out.write("    margin: 0%;\n");
      out.write("    padding: 0%;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".content{\n");
      out.write("    \n");
      out.write("    margin:1%;\n");
      out.write("    padding: 1%;\n");
      out.write("    \n");
      out.write("   \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"#home\">Home</a></li>\n");
      out.write("            <li><a href=\"#about\">About</a></li>\n");
      out.write("            <li><a href=\"#bookflight\">BookFlight</a></li>\n");
      out.write("            <li><a href=\"#phoenixclub\">PhoenixClub</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("\n");
      out.write("<h4>Confirm the price to contiune booking then, click \"Next\" to cotiune with the booking.</h4>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <th>Flight number</th>\n");
      out.write("        <th>Airport</th>\n");
      out.write("        <th>Date</th>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        \n");
      out.write("        <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("<h4>Air Fare Cost</h4>\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("        <th>Type</th>\n");
      out.write("        <th>Travellers</th>\n");
      out.write("        <th>Net</th>\n");
      out.write("        <th>Tax</th>\n");
      out.write("        <th>Total</th>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <th>Aduit</th>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <th>Children</th>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <th>infant</th>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("        <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <th colspan=\"4\">Total:</th>\n");
      out.write("    </tr>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("<a href=\"#\" class=\"back\">&laquo; Back</a>\n");
      out.write("<a href=\"#\" class=\"next\">Next &raquo;</a>\n");
      out.write("\n");
      out.write("</body>\n");
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
