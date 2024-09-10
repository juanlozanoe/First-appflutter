package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pagousuariojsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Proceder al Pago - Paraíso del Artesano</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Artesania/CSS/pagweb.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../Css/pagoscss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <header>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\" id=\"partesuperior\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\"><b>DECO Artesanias</b></a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavDropdown\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><b>PQR</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><b>Inicio</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><b>Contacto</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"novedades.html\"><b>Novedades</b></a></li>\n");
      out.write("              <a href=\"carrito.html\" class=\"nav-link\"><img src=\"imagenes\\carrito-de-compras.png\" alt=\"Carrito de compras\" width=\"40px\"></a>\n");
      out.write("              <a href=\"#\" class=\"nav-link\"><img src=\"imagenes/person-circle.svg\" alt=\"Mi Cuenta\" width=\"40px\"><b>Mi Cuenta</b></a>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <main class=\"container mt-5\">\n");
      out.write("    <h1 class=\"mb-4\" style=\"color: #333;\"><center>Proceder al Pago</center></h1>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-md-8\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <div class=\"card-header\">\n");
      out.write("            <h3>Detalles de Facturación</h3>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <form>\n");
      out.write("              <div class=\"mb-3\">\n");
      out.write("                <label for=\"nombreCompleto\" class=\"form-label\">Nombre Completo</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"nombreCompleto\" placeholder=\"Ingresa tu nombre completo\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mb-3\">\n");
      out.write("                <label for=\"direccion\" class=\"form-label\">Dirección</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"direccion\" placeholder=\"Ingresa tu dirección de envío\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mb-3\">\n");
      out.write("                <label for=\"telefono\" class=\"form-label\">Teléfono</label>\n");
      out.write("                <input type=\"tel\" class=\"form-control\" id=\"telefono\" placeholder=\"Ingresa tu número de teléfono\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mb-3\">\n");
      out.write("                <label for=\"email\" class=\"form-label\">Correo Electrónico</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Ingresa tu correo electrónico\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"mb-3\">\n");
      out.write("                <label for=\"metodoPago\" class=\"form-label\">Método de Pago</label>\n");
      out.write("                <select class=\"form-select\" id=\"metodoPago\">\n");
      out.write("                  <option selected>Selecciona un método de pago</option>\n");
      out.write("                  <option value=\"tarjeta\">Tarjeta de Crédito/Débito</option>\n");
      out.write("                  <option value=\"paypal\">PayPal</option>\n");
      out.write("                  <option value=\"transferencia\">Transferencia Bancaria</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary\">Confirmar Pago</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("          <div class=\"card-header\">\n");
      out.write("            <h3>Resumen de la Orden</h3>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <ul class=\"list-group mb-3\">\n");
      out.write("              <li class=\"list-group-item d-flex justify-content-between\">\n");
      out.write("                <span>Subtotal</span>\n");
      out.write("                <strong>$10.00</strong>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-group-item d-flex justify-content-between\">\n");
      out.write("                <span>Envío</span>\n");
      out.write("                <strong>$5.00</strong>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-group-item d-flex justify-content-between\">\n");
      out.write("                <span>Total</span>\n");
      out.write("                <strong>$15.00</strong>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <a href=\"carrito.html\" class=\"btn btn-secondary w-100\">Volver al Carrito</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("\n");
      out.write("  <br>\n");
      out.write("\n");
      out.write("  <footer> \n");
      out.write("    <div class=\"container\">\n");
      out.write("      <table class=\"table table-borderless text-center\">\n");
      out.write("        <tbody>\n");
      out.write("          <tr>\n");
      out.write("            <td>&copy; 2024 DECO Artesanias</td>\n");
      out.write("            <td>Todos los derechos reservados</td>\n");
      out.write("            <td>Teléfono: +57 300 5361916</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td>Artesanías: Descubre nuestra amplia gama de productos hechos a mano.</td>\n");
      out.write("            <td>Tradiciones: Nos inspiramos en la cultura local para cada diseño único.</td>\n");
      out.write("            <td>Calidad: Garantizamos la excelencia en cada pieza que creamos.</td>\n");
      out.write("          </tr>\n");
      out.write("        </tbody>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"bg-white py-3 footer-icons text-end\">\n");
      out.write("      <a href=\"#\" class=\"footer-icon\"><img src=\"imagenes/icons8-facebook-50 (1).png\" alt=\"Facebook\" width=\"40px\"></a>\n");
      out.write("      <a href=\"#\" class=\"footer-icon\"><img src=\"imagenes/icons8-instagram-50 (1).png\" alt=\"Instagram\" width=\"40px\"></a>\n");
      out.write("      <img src=\"descarga (1).png\" alt=\"Certificado\" width=\"50px\">\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
