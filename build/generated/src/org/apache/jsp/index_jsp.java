package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dream Team</title>\n");
      out.write("        <link href=\"css/jquerysctipttop.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("          <style>\n");
      out.write("              body { background-color:#434A53;}\n");
      out.write("              h2 { color:#fff; margin-top:20px;}\n");
      out.write("              .form-control { display:inline; float:left; margin-right:20px;}\n");
      out.write("              .container { margin-top:150px;}\n");
      out.write("              h1 { color:#fff;}\n");
      out.write("          </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--TODO: Cambiar el nombre del servlet -->\n");
      out.write("        <form method=\"post\" action=\"Servlet\">\n");
      out.write("             <div class=\"container\">\n");
      out.write("                <h1>Bienvenido</h1>\n");
      out.write("                <h2>Ingresa La fecha :)</h2>\n");
      out.write("                <input type=\"text\" id=\"date\" data-format=\"DD-MM-YYYY\" data-template=\"D MMM YYYY\" name=\"date\" value=\"28-02-2016\" class=\"form-control\">\n");
      out.write("                <input type=\"submit\"  class=\"btn \" value=\"Procesar\"/>\n");
      out.write("             </div>\n");
      out.write("            <script src=\"js/jquery-1.12.1.min.js\"></script>\n");
      out.write("            <script src=\"js/moment.min.js\"></script>\n");
      out.write("            <script src=\"js/combodate.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                <!--not using datetime nor time, only date-->\n");
      out.write("            $(function(){\n");
      out.write("                $('#date').combodate({customClass: 'form-control'});    \n");
      out.write("                  $('#datetime').combodate(); \n");
      out.write("                  $('#time').combodate({\n");
      out.write("                    firstItem: 'name', //show 'hour' and 'minute' string at first item of dropdown\n");
      out.write("                    minuteStep: 1,\n");
      out.write("                          customClass: 'form-control'\n");
      out.write("                });   \n");
      out.write("            });\n");
      out.write("            </script>\n");
      out.write("           \n");
      out.write("        </form>\n");
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
