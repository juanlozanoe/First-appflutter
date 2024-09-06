package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class categoria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Agregar Categoría - Paraíso del Artesano</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/categoria.css\">\n");
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
      out.write("  <div class=\"mt-5\">\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("      <center>\n");
      out.write("        <h2 >Agregar Categoría</h2>\n");
      out.write("        <form id=\"agregarCategoriaForm\">\n");
      out.write("          <div class=\"mb-3\">\n");
      out.write("            <label for=\"nombreCategoria\" class=\"form-label\">Nombre de la Categoría</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"nombreCategoria\" placeholder=\"Ingrese el nombre de la categoría\" required>\n");
      out.write("          </div>\n");
      out.write("          <button type=\"submit\" class=\"button\">Agregar Categoría</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <div id=\"mensaje\" class=\"alert mt-3\" role=\"alert\" style=\"display:none;\"></div>\n");
      out.write("\n");
      out.write("        <h3 class=\"mt-5\" >Categorías Agregadas</h3>\n");
      out.write("        <table class=\"table\">\n");
      out.write("          <thead>\n");
      out.write("            <tr>\n");
      out.write("              <th>#</th>\n");
      out.write("              <th>Nombre de la Categoría</th>\n");
      out.write("              <th>Acciones</th>\n");
      out.write("            </tr>\n");
      out.write("          </thead>\n");
      out.write("          <tbody id=\"categoriasList\">\n");
      out.write("            <!-- Aquí se agregarán las categorías -->\n");
      out.write("          </tbody>\n");
      out.write("        </table>\n");
      out.write("      </center>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <footer>\n");
      out.write("<div class=\"container1\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"text-center\">&copy; 2023 Paraíso del Artesano. Todos los derechos reservados.</p>\n");
      out.write("    </div>\n");
      out.write("    <center>\n");
      out.write("      <div class=\"instagramSVG\">\n");
      out.write("        <div class=\"tooltip-container\">\n");
      out.write("          <div class=\"tooltip\">\n");
      out.write("            <div class=\"profile\">\n");
      out.write("              <div class=\"user\">\n");
      out.write("                <div class=\"img\">Ui</div>\n");
      out.write("                <div class=\"details\">\n");
      out.write("                  <div class=\"name\">User</div>\n");
      out.write("                  <div class=\"username\">@username</div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"about\">800+ Followers</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"text\">\n");
      out.write("            <a class=\"icon\" href=\"#\">\n");
      out.write("              <div class=\"layer\">\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span></span>\n");
      out.write("                <span class=\"instagramSVG\">\n");
      out.write("                  <svg\n");
      out.write("                    fill=\"white\"\n");
      out.write("                    class=\"svgIcon\"\n");
      out.write("                    viewBox=\"0 0 448 512\"\n");
      out.write("                    height=\"1.5em\"\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                  >\n");
      out.write("                    <path\n");
      out.write("                      d=\"M224.1 141c-63.6 0-114.9 51.3-114.9 114.9s51.3 114.9 114.9 114.9S339 319.5 339 255.9 287.7 141 224.1 141zm0 189.6c-41.1 0-74.7-33.5-74.7-74.7s33.5-74.7 74.7-74.7 74.7 33.5 74.7 74.7-33.6 74.7-74.7 74.7zm146.4-194.3c0 14.9-12 26.8-26.8 26.8-14.9 0-26.8-12-26.8-26.8s12-26.8 26.8-26.8 26.8 12 26.8 26.8zm76.1 27.2c-1.7-35.9-9.9-67.7-36.2-93.9-26.2-26.2-58-34.4-93.9-36.2-37-2.1-147.9-2.1-184.9 0-35.8 1.7-67.6 9.9-93.9 36.1s-34.4 58-36.2 93.9c-2.1 37-2.1 147.9 0 184.9 1.7 35.9 9.9 67.7 36.2 93.9s58 34.4 93.9 36.2c37 2.1 147.9 2.1 184.9 0 35.9-1.7 67.7-9.9 93.9-36.2 26.2-26.2 34.4-58 36.2-93.9 2.1-37 2.1-147.8 0-184.8zM398.8 388c-7.8 19.6-22.9 34.7-42.6 42.6-29.5 11.7-99.5 9-132.1 9s-102.7 2.6-132.1-9c-19.6-7.8-34.7-22.9-42.6-42.6-11.7-29.5-9-99.5-9-132.1s-2.6-102.7 9-132.1c7.8-19.6 22.9-34.7 42.6-42.6 29.5-11.7 99.5-9 132.1-9s102.7-2.6 132.1 9c19.6 7.8 34.7 22.9 42.6 42.6 11.7 29.5 9 99.5 9 132.1s2.6 102.7-9 132.1z\"\n");
      out.write("                    />\n");
      out.write("                  </svg>\n");
      out.write("                </span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </center>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("  <script src=\"categoria.js\"></script>\n");
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
