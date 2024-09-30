package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Iniciar Sesión / Registrarse</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("        <link href=\"/Webdilan/CSS/Inicio-de-session.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"user\">\n");
      out.write("            <div class=\"user_options-container\">\n");
      out.write("                <div class=\"user_options-text\">\n");
      out.write("                    <div class=\"user_options-unregistered\">\n");
      out.write("                        <h2 class=\"user_unregistered-title\">No tienes una cuenta?</h2>\n");
      out.write("                        <p class=\"user_unregistered-text\">Regístrate para obtener acceso a miles de artículos.</p>\n");
      out.write("                        <button class=\"user_unregistered-signup\" id=\"signup-button\">Registrarse</button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"user_options-registered\">\n");
      out.write("                        <h2 class=\"user_registered-title\">Ya tienes una cuenta?</h2>\n");
      out.write("                        <p class=\"user_registered-text\">Inicia sesión con tus datos y sigue disfrutando de todos nuestros beneficios.</p>\n");
      out.write("                        <button class=\"user_registered-login\" id=\"login-button\">Iniciar</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"user_options-forms\" id=\"user_options-forms\">\n");
      out.write("                    <div class=\"user_forms-login\">\n");
      out.write("                        <h3 class=\"forms_title\"><center>Iniciar sesión</center></h3>\n");
      out.write("                        <div class=\"deco\">\n");
      out.write("                            <h2>Bienvenidos a Deco Artesanías</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <form class=\"forms_form\" action=\"/Webdilan/CtrValidar?accion=ingresar\" method=\"POST\">\n");
      out.write("                            <fieldset class=\"forms_fieldset\">\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"text\" name=\"usuario\" placeholder=\"Usuario\" class=\"forms_field-input\" required autofocus />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"password\" name=\"contrasena\" placeholder=\"Contraseña\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <div class=\"forms_buttons\">\n");
      out.write("                                <button type=\"button\" class=\"forms_buttons-forgot\">Olvidó su contraseña?</button>\n");
      out.write("                                <input type=\"submit\" value=\"Iniciar sesión\" class=\"forms_buttons-action\">\n");
      out.write("                            </div>\n");
      out.write("                            <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <p style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </c:if>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Formulario de registro -->\n");
      out.write("                    <div class=\"user_forms-signup\">\n");
      out.write("                        <h3 class=\"forms_title\"><center>Registrarse</center></h3>\n");
      out.write("                        <form class=\"forms_form\" action=\"/Webdilan/CtrUsuario\" method=\"POST\">\n");
      out.write("                            <input type=\"hidden\" name=\"accion\" value=\"crear\">\n");
      out.write("                            <fieldset class=\"forms_fieldset\">\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"text\" name=\"nombre\" placeholder=\"Nombre\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"text\" name=\"apellido\" placeholder=\"Apellido\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"text\" name=\"direccion\" placeholder=\"Dirección\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"text\" name=\"telefono\" placeholder=\"Teléfono\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"email\" name=\"correo\" placeholder=\"Correo\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"text\" name=\"usuario\" placeholder=\"Usuario\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"password\" name=\"contrasena\" placeholder=\"Contraseña\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"forms_field\">\n");
      out.write("                                    <input type=\"text\" name=\"rol\" placeholder=\"Rol\" class=\"forms_field-input\" required />\n");
      out.write("                                </div>\n");
      out.write("                            </fieldset>\n");
      out.write("                            <div class=\"forms_buttons\">\n");
      out.write("                                <input type=\"submit\" value=\"Registrar\" class=\"forms_buttons-action\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <script src=\"/Webdilan/JS/Inicio-de-session.js\" type=\"text/javascript\"></script>\n");
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
