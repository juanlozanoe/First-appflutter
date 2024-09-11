package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_005fadministrador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Deco Artesanía - Administrador</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/admin.css\">\n");
      out.write("    <link href=\"../Css/Homeadmincss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\" id=\"partesuperior\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><b>Deco Artesanía - Admin</b></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavDropdown\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\"><b>Agregar Producto+</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\"><b>Editar Producto</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\"><b>Eliminar Producto</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\"><b>Ver Órdenes</b></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\"><b>Inicio</b></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"d-flex align-items-center\">\n");
      out.write("                        <a href=\"#\" class=\"nav-link\"><img src=\"imagenes/person-circle.svg\" alt=\"Admin\" width=\"40px\"><b>Admin</b></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <div class=\"card mx-auto\" style=\"width: 35rem;\">\n");
      out.write("            <div class=\"card-body text-center\">\n");
      out.write("                <h5 class=\"card-title\">Panel de Administrador</h5>\n");
      out.write("                <p>Gestiona los productos y las órdenes de tu tienda en línea.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-body d-flex justify-content-center gap-3\">\n");
      out.write("                <a href=\"#\" class=\"btn btn-success rounded-pill btn-lg\">Agregar Producto</a>\n");
      out.write("                <a href=\"#\" class=\"btn btn-warning rounded-pill btn-lg\">Editar Producto</a>\n");
      out.write("                <a href=\"#\" class=\"btn btn-danger rounded-pill btn-lg\">Eliminar Producto</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row row-cols-1 row-cols-md-3 g-4 mt-5\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"card h-100 text-center\">\n");
      out.write("                    <img src=\"imagenes/producto1.jpg\" class=\"card-img-top\" alt=\"Producto 1\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Producto 1</h5>\n");
      out.write("                        <p class=\"card-text\">Descripción breve del producto 1.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\">Editar</a>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-danger\">Eliminar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"card h-100 text-center\">\n");
      out.write("                    <img src=\"imagenes/producto2.jpg\" class=\"card-img-top\" alt=\"Producto 2\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Producto 2</h5>\n");
      out.write("                        <p class=\"card-text\">Descripción breve del producto 2.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\">Editar</a>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-danger\">Eliminar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"card h-100 text-center\">\n");
      out.write("                    <img src=\"imagenes/producto3.jpg\" class=\"card-img-top\" alt=\"Producto 3\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Producto 3</h5>\n");
      out.write("                        <p class=\"card-text\">Descripción breve del producto 3.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary\">Editar</a>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-danger\">Eliminar</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container mt-5 text-center\">\n");
      out.write("            <p>&copy; 2024 Deco Artesanía. Todos los derechos reservados.</p>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
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
