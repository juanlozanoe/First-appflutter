package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Home - Deco-Artesanías</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Home_cliente.jsp.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"../Css/Homeusuariocss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">DECO Artesanías</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\">Inicio</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Novedades</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Ofertas</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Contacto</a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><img src=\"cart-icon.png\" alt=\"Carrito\" width=\"30\"></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><img src=\"user-icon.png\" alt=\"Mi Cuenta\" width=\"30\"> Mi Cuenta</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("    <!-- Main Content -->\n");
      out.write("    <main>\n");
      out.write("        <!-- Hero Section -->\n");
      out.write("        <section class=\"hero bg-light text-center py-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 class=\"display-4\">Descubre nuestras artesanías únicas</h1>\n");
      out.write("                <p class=\"lead\">Artículos hechos a mano que reflejan la riqueza cultural de nuestra región.</p>\n");
      out.write("                <a href=\"#\" class=\"btn btn-primary\">Ver Novedades</a>\n");
      out.write("                <a href=\"#\" class=\"btn btn-secondary\">Ofertas Especiales</a>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Product Grid -->\n");
      out.write("        <section class=\"products py-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2 class=\"text-center mb-4\">Nuestros Productos</h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <img src=\"product1.jpg\" class=\"card-img-top\" alt=\"Producto 1\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Producto 1</h5>\n");
      out.write("                                <p class=\"card-text\">$20.00</p>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <img src=\"product2.jpg\" class=\"card-img-top\" alt=\"Producto 2\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Producto 2</h5>\n");
      out.write("                                <p class=\"card-text\">$30.00</p>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <div class=\"card mb-4\">\n");
      out.write("                            <img src=\"product3.jpg\" class=\"card-img-top\" alt=\"Producto 3\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h5 class=\"card-title\">Producto 3</h5>\n");
      out.write("                                <p class=\"card-text\">$25.00</p>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-primary\">Comprar</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"bg-dark text-white text-center py-3\">\n");
      out.write("            <p>&copy; 2024 DECO Artesanías. Todos los derechos reservados.</p>\n");
      out.write("            <div class=\"footer-icons\">\n");
      out.write("                <a href=\"#\" class=\"text-white me-2\"><img src=\"facebook-icon.png\" alt=\"Facebook\" width=\"30\"></a>\n");
      out.write("                <a href=\"#\" class=\"text-white\"><img src=\"instagram-icon.png\" alt=\"Instagram\" width=\"30\"></a>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
