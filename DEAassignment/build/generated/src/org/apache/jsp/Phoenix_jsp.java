package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Phoenix_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"HomePage.css\">\n");
      out.write("\t<meta name=\"viewport\" content=\"with=device-width, initial-scal=1.0\">\n");
      out.write("\t<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;600;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css\">\n");
      out.write("\t<title> Phoenix Airline design</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<style>\n");
      out.write("\t\t*{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-family: 'Poppins', sans-serif;\n");
      out.write("}\n");
      out.write(".header{\n");
      out.write("\tmin-height: 100vh;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tbackground-image: linear-gradient(rgba(4, 9, 30, 0.7),rgba(4, 9, 30, 0.7)),url(Home.jpeg);\n");
      out.write("\tbackground-position: center;\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tpadding: 2% 6%;\n");
      out.write("\tjustify-content: space-between;\n");
      out.write("\talign-items: center;\n");
      out.write("}\n");
      out.write("nav img{\n");
      out.write("\twidth: 100px;\n");
      out.write("}\n");
      out.write(".nav-links{\n");
      out.write("\tflex: 1;\n");
      out.write("\ttext-align: right;\n");
      out.write("}\n");
      out.write(".nav-links ul li{\n");
      out.write("\tlist-style: none;\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\tpadding: 8px 12px;\n");
      out.write("\tposition: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-links ul li a{\n");
      out.write("\tcolor: white;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tfont-size: 17px;\n");
      out.write("}\n");
      out.write(".nav-links ul li ::after{\n");
      out.write("\tcontent: '';\n");
      out.write("\twidth: 0%;\n");
      out.write("\theight: 2px;\n");
      out.write("\tbackground: #f44336;\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin: auto;\n");
      out.write("\ttransition: 0.5s;\n");
      out.write("}\n");
      out.write(".nav-links ul li : hover :: after{\n");
      out.write("\twidth:100% ;\n");
      out.write("}\n");
      out.write(".text-box{\n");
      out.write("\twidth: 90%;\n");
      out.write("\tcolor: white;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttransform: translate(-50%,-50%);\n");
      out.write("\ttext-align: center;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".text-box h1{\n");
      out.write("\tfont-size: 60px;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".text-box p{\n");
      out.write("\tmargin: 10px 0 40px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tcolor: white;\n");
      out.write("}\n");
      out.write(".hero-btn{\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\tcolor: white;\n");
      out.write("\tborder: 1px solid white;\n");
      out.write("\tpadding: 12px 34px;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\tposition: relative;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write(".hero-btn:hover{\n");
      out.write("\tborder: 1px solid darkblue;\n");
      out.write("\tbackground: darkblue;\n");
      out.write("\ttransition: 1s;\n");
      out.write("}\n");
      out.write("nav.fa{\n");
      out.write("\tdisplay: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media(max-width: 700px){\n");
      out.write("\t.text-box h1{\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t}\n");
      out.write("\t.nav-links ul li{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t}\n");
      out.write("\t.nav-links {\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tbackground: darkblue;\n");
      out.write("\t\theight: 100vh;\n");
      out.write("\t\twidth: 200px;\n");
      out.write("\t\ttop: 0;\n");
      out.write("\t\tright: -200px;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\tz-index: 2;\n");
      out.write("\t\ttransition: 1s;\n");
      out.write("\t}\n");
      out.write("\tnav.fa{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tmargin: 10px;\n");
      out.write("\t\tfont-size: 22px;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t}\n");
      out.write("\t.nav-links ul{\n");
      out.write("\t\tpadding: 30px;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("\t<section class=\"header\">\n");
      out.write("\t\t\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<a href=\"\"><img src=\"logoo.jpg\"></a>\n");
      out.write("\t\t\t<div class=\"nav-links\" id=\"navLinks\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-times\" onclick=\"hideMenu()\" ></i>\n");
      out.write("\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">About</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Book Flight</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Phoenix Club</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Login</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"\">Contact Us</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<i class=\"fa fa-bars\" onclick=\"showMenu()\" ></i>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t<div class=\"text-box\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<h1>Phoenix Airline</h1>\n");
      out.write("\t\t\t<p>World Best Airline Services</p>\n");
      out.write("\t\t\t<a href=\"visit.html\" class=\"hero-btn\">Booking Now</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
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
