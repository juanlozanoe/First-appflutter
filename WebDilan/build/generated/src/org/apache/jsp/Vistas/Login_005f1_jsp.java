package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login y Registro</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/CSS/login.css\">\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath() );
      out.write("/Css/Stylos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"../CSS/stile.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");

String Mensaje = "";
if (request.getParameter("fallo") != null) {
    int i = Integer.parseInt(request.getParameter("fallo"));
    if (i == 0) {
        Mensaje = "usuario y/o contraseña incorrecta";
    }
}

if (request.getParameter("mensaje") != null) {
    int i = Integer.parseInt(request.getParameter("mensaje"));
    if (i == 0) {
        Mensaje = "usuario creado , por favor inicie sesión";
    }
}

      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("            <div class=\"box\">\n");
      out.write("                <div class=\"form sign_in\">\n");
      out.write("\n");
      out.write("                    <img src=\"/ArtesaniasWeb/Imagenes/lo-removebg-preview.png\" alt=\"Logo\" class=\"logo\"/>\n");
      out.write("                    <h3>Iniciar sesión</h3>\n");
      out.write("\n");
      out.write("                    <form action=\"/ArtesaniasWeb/CtrValidarInfo\" id=\"form_input\" method=\"post\">\n");
      out.write("                        <div class=\"type\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Usuario\" id=\"email\" name=\"txtusu\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"type\">\n");
      out.write("                            <input type=\"password\" placeholder=\"Contraseña\" id=\"password\" name=\"txtpass\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"forgot\">\n");
      out.write("                            <span>¿Olvidó su contraseña?</span>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Ingresar\" class=\"btn bkg\">\n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
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
