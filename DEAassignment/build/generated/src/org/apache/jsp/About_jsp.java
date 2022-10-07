package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    h2{\n");
      out.write("            color: black;\n");
      out.write("            font-size: larger;\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            font-style: normal;\n");
      out.write("            text-align: start;\n");
      out.write("        }\n");
      out.write("        p{\n");
      out.write("            color: black;\n");
      out.write("            font-size: larger;\n");
      out.write("            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;\n");
      out.write("            font-style: normal;\n");
      out.write("            text-align: start;\n");
      out.write("        }\n");
      out.write("        nav{\n");
      out.write("    width: 100%;\n");
      out.write("    background:blanchedalmond;\n");
      out.write("    overflow: auto;\n");
      out.write("    \n");
      out.write("    \n");
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
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-family: 'Times New Roman', Times, serif;\n");
      out.write("  text-transform: none;\n");
      out.write("  text-shadow: #ddd;\n");
      out.write("  color: black;\n");
      out.write("  font-size: larger;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("  background-color:rgb(184, 236, 232);\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    margin: 0;\n");
      out.write("    padding:0;\n");
      out.write("\n");
      out.write("}\n");
      out.write("h2,h3{\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: larger;\n");
      out.write("    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("    color: rgb(212, 22, 22);\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: lightblue;\n");
      out.write("    background-image: url(about.jpg);\n");
      out.write("    margin: 0%;\n");
      out.write("    padding: 0%;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("\n");
      out.write("    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
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
      out.write("    <h2>About Us</h2>\n");
      out.write("    \n");
      out.write("    <p>Nurtured from the seed of a single great idea to empower the traveller. Phoenix a pioneer in worldwlide online travel industry. Phoenix came to life to empower the traveller with instant bookings and comprehensive choices. <p>\n");
      out.write("        <h3>Our Vision</h3>\n");
      out.write("        <p>We think everybody should be able to travel the world. Our vision is of a world where our differences are a source of inspiration and development, not intolerance and prejudice. Our purpose is to give courage and encourage each one of us to stay curious and be open-minded so we can all enjoy a better, more diversified world.</p>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
