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
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color:#f5f5ed;\n");
      out.write("            }\n");
      out.write("            .contenedor{\n");
      out.write("                background-color:white;\n");
      out.write("                width:80%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                position:relative;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                border: 1px Solid #f0f0f0;\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table th{\n");
      out.write("                background-color : #fcba03;\n");
      out.write("                padding:15px 60px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table td{\n");
      out.write("                padding: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            a.editar{\n");
      out.write("                background-color: #68ed8c;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius:10px;\n");
      out.write("                margin: 0 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            a.eliminar{\n");
      out.write("                background-color: #e85d5d;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius:10px;\n");
      out.write("                margin: 0 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .contenedor2{\n");
      out.write("                background-color:white;\n");
      out.write("                width:82.7%;\n");
      out.write("                margin: 0 auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                width:200px;\n");
      out.write("                background-color: #74f7ea;\n");
      out.write("                padding: 10px;\n");
      out.write("                border-radius:10px;\n");
      out.write("                margin: 0 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            \n");
      out.write("            h1{\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <h1>Actividad T1</h1>\n");
      out.write("        \n");
      out.write("        <a href=\"Controlador?accion=listar\">Comienzo de programa</a>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
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
