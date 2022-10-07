package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SelectFlifgt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("  nav{\n");
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
      out.write("  background-color:rgb(63, 104, 216);\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("  background-color:white;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: lightcyan;\n");
      out.write("    margin: 0%;\n");
      out.write("    padding: 0%;\n");
      out.write("    background-image: url(selectflight.jpg);\n");
      out.write("   background-size: cover;\n");
      out.write("}\n");
      out.write("h2{\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("table, th, td {\n");
      out.write("  width: 1200px ;\n");
      out.write("  border: 2px solid;\n");
      out.write("  text-align: left;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  padding:1% 2% 1% 2%;\n");
      out.write("  font-size: large;\n");
      out.write("  font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\n");
      out.write("  font-style: oblique;\n");
      out.write("  margin: auto;\n");
      out.write("  background-color: none;\n");
      out.write("}\n");
      out.write("  header th{\n");
      out.write("    width: 30px;\n");
      out.write("  }\n");
      out.write("  .button {\n");
      out.write("    border-style: outset;\n");
      out.write("    color: white;\n");
      out.write("    padding: 15px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .button1 {background-color: Red;} \n");
      out.write("  .button2 {background-color: Blue;} \n");
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
      out.write("    <h2>Select your pereferred data and faare combination below and click\"Next\" to continue.</h2>\n");
      out.write("\n");
      out.write("<h2>*Select a date for your outbound journey.</h2>\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("      <div class=\"header\"><th>Date</th> </div>\n");
      out.write("        <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Time</th>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Fares Rate</th>  \n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("    <td></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <th>Select</th>\n");
      out.write("    <td><center><input type=\"radio\"</td>\n");
      out.write("    <td><center><input type=\"radio\"</td>\n");
      out.write("    <td><center><input type=\"radio\"</td>\n");
      out.write("    <td><center><input type=\"radio\"</td>\n");
      out.write("    <td><center><input type=\"radio\"</td>\n");
      out.write("    <td><center><input type=\"radio\"</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("<h2>*Select a date for your return journey.</h2>\n");
      out.write("<table>\n");
      out.write("    <tr>\n");
      out.write("      <th>Date</th>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th>Time</th>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th>Fares Rate</th>  \n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th>Select</th>\n");
      out.write("      <td><center><input type=\"radio\"</td>\n");
      out.write("      <td><center><input type=\"radio\"</td>\n");
      out.write("      <td><center><input type=\"radio\"</td>\n");
      out.write("      <td><center><input type=\"radio\"</td>\n");
      out.write("      <td><center><input type=\"radio\"</td>\n");
      out.write("      <td><center><input type=\"radio\"</td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("  <br></br>\n");
      out.write("<center>\n");
      out.write("<button class=\"button button1\"><b>New Search</button>\n");
      out.write("<button class=\"button button2\"><b>Next</button>\n");
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
