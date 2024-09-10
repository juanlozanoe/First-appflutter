package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AgregarPrtAdmijsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Agregar Producto - Paraíso del Artesano</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"pagweb.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <header>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\" id=\"partesuperior\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\"><b>Paraiso Del Artesano</b></a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavDropdown\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><b>PQR</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><b>Inicio</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><b>Contacto</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"novedades.html\"><b>Novedades</b></a></li>\n");
      out.write("              <a href=\"carrito.html\" class=\"nav-link\"><img src=\"imagenes\\carrito-de-compras.png\" alt=\"\" width=\"40px\"></a>\n");
      out.write("              <a href=\"#\" class=\"nav-link\"><img src=\"imagenes/person-circle.svg\" alt=\"Carrito de compras\" width=\"40px\"><b>Mi Cuenta</b></a>\n");
      out.write("            </ul>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <div class=\"container mt-5\">\n");
      out.write("    <h2>Agregar Producto</h2>\n");
      out.write("    <form>\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"titulo\" class=\"form-label\">Título del Producto</label>\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"titulo\" placeholder=\"Ingrese el título del producto\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"descripcion\" class=\"form-label\">Descripción</label>\n");
      out.write("        <textarea class=\"form-control\" id=\"descripcion\" rows=\"3\" placeholder=\"Ingrese la descripción\" required></textarea>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"precio\" class=\"form-label\">Precio</label>\n");
      out.write("        <input type=\"number\" class=\"form-control\" id=\"precio\" placeholder=\"Ingrese el precio\" required>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"categoria\" class=\"form-label\">Categoría</label>\n");
      out.write("        <select class=\"form-select\" id=\"categoria\" required>\n");
      out.write("          <option value=\"\" disabled selected>Seleccione una categoría</option>\n");
      out.write("          <option value=\"artesanias\">Artesanías</option>\n");
      out.write("          <option value=\"decoracion\">Decoración</option>\n");
      out.write("          <option value=\"accesorios\">Accesorios</option>\n");
      out.write("        </select>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"mb-3\">\n");
      out.write("        <label for=\"imagen\" class=\"form-label\">Imagen del Producto</label>\n");
      out.write("        <input type=\"file\" class=\"form-control\" id=\"imagen\" accept=\"image/*\" required>\n");
      out.write("      </div>\n");
      out.write("      <button type=\"submit\" class=\"btn btn-success\">Agregar Producto</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <div class=\"mt-5\">\n");
      out.write("      <h3>Productos Agregados</h3>\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <h5 class=\"card-title\">Producto 1</h5>\n");
      out.write("          <p class=\"card-text\">Descripción breve del producto 1.</p>\n");
      out.write("          <a href=\"#\" class=\"btn btn-primary\">Ver Detalles</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card mt-2\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <h5 class=\"card-title\">Producto 2</h5>\n");
      out.write("          <p class=\"card-text\">Descripción breve del producto 2.</p>\n");
      out.write("          <a href=\"#\" class=\"btn btn-primary\">Ver Detalles</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<br>\n");
      out.write("  <footer>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"text-center\">&copy; 2023 Paraíso del Artesano. Todos los derechos reservados.</p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</body>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
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
