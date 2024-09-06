package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Artesania/CSS/login.css\">\n");
      out.write("</head>\n");
      out.write("    ");
String Mensaje = "";
    if (request.getParameter("ingreso")!= null){
        int i = Integer.parseInt(request.getParameter("ingreso"));
        if (i == 0){
            Mensaje = "Error: Datos Incorectos";
        }
    }
    
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"card-switch\">\n");
      out.write("            <label class=\"switch\">\n");
      out.write("               <input type=\"checkbox\" class=\"toggle\">\n");
      out.write("               <span class=\"slider\"></span>\n");
      out.write("               <span class=\"card-side\"></span>\n");
      out.write("               <div class=\"flip-card__inner\">\n");
      out.write("                  <div class=\"flip-card__front\">\n");
      out.write("                     <div class=\"title\">Iniciar Sesion</div>\n");
      out.write("                     <form class=\"flip-card__form\" action=\"\">\n");
      out.write("                        <input class=\"flip-card__input\" name=\"email\" placeholder=\"Usuario\" type=\"email\">\n");
      out.write("                        <input class=\"flip-card__input\" name=\"password\" placeholder=\"Contraseña\" type=\"password\">\n");
      out.write("                        <button class=\"flip-card__btn\" ><a href=\"pagweb.html\" style=\"color: white;\">Log in</a></button>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"flip-card__back\">\n");
      out.write("                     <div class=\"title\">Registro</div>\n");
      out.write("                     <form class=\"flip-card__form\" action=\"\">\n");
      out.write("                        <input class=\"flip-card__input\" placeholder=\"Id\" type=\"id\">\n");
      out.write("                        <input class=\"flip-card__input\" placeholder=\"Nombre\" type=\"name\">\n");
      out.write("                        <input class=\"flip-card__input\" placeholder=\"Apellido\" type=\"name\">\n");
      out.write("                        <input class=\"flip-card__input\" placeholder=\"Direccion\" type=\"name\">           \n");
      out.write("                        <input class=\"flip-card__input\" placeholder=\"Telefono\" type=\"name\">\n");
      out.write("                        <input class=\"flip-card__input\" placeholder=\"Usuario\" type=\"name\">\n");
      out.write("                        <input class=\"flip-card__input\" name=\"email\" placeholder=\"Correo\" type=\"email\">\n");
      out.write("                        <input class=\"flip-card__input\" name=\"password\" placeholder=\"Contraseña\" type=\"password\">\n");
      out.write("                        <input class=\"flip-card__input\" placeholder=\"Tipo\" type=\"name\">\n");
      out.write("                        <button class=\"flip-card__btn\" style=\"color: white;\">Confirmar</button>\n");
      out.write("                     </form>\n");
      out.write("                  </div>\n");
      out.write("               </div>\n");
      out.write("            </label>\n");
      out.write("        </div>   \n");
      out.write("   </div>\n");
      out.write("    \n");
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
