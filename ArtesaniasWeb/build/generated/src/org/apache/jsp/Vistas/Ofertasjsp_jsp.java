package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ofertasjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Ofertas del Día - Paraíso del Artesano</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Artesania/CSS/pagweb.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        /* Estilos para el header */\n");
      out.write("        #partesuperior {\n");
      out.write("            background-color: #4CAF50; /* Verde claro */\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #partesuperior .navbar-brand,\n");
      out.write("        #partesuperior .navbar-nav .nav-link {\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #partesuperior .navbar-nav .nav-link.active {\n");
      out.write("            color: #ffc107;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card {\n");
      out.write("            transition: transform 0.3s ease-in-out;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .card:hover {\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-custom {\n");
      out.write("            background-color: #4CAF50; /* Verde claro */\n");
      out.write("            color: white;\n");
      out.write("            border-radius: 50px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-custom:hover {\n");
      out.write("            background-color: #388E3C; /* Verde más oscuro */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        #fondo_negro {\n");
      out.write("            background-color: #333; /* Gris oscuro */\n");
      out.write("            color: white;\n");
      out.write("            padding: 40px 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer {\n");
      out.write("            background-color: #4CAF50; /* Verde claro */\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\" id=\"partesuperior\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><b>Paraíso Del Artesano</b></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavDropdown\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"index.html\"><b>Inicio</b></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"contacto.html\"><b>Contacto</b></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"novedades.html\"><img src=\"icons8-marca-de-verificación-48.png\" alt=\"\"><b>Novedades</b></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><img src=\"icons8-dólar-estadounidense-en-círculo-100.png\" alt=\"\" width=\"50px\"><b>Ofertas del Día</b></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <div class=\"d-flex align-items-center\">\n");
      out.write("                        <a href=\"carrito.html\" class=\"nav-link\"><img src=\"icons8-carrito-de-compras-64.png\" alt=\"\" width=\"40px\"></a>\n");
      out.write("                        <a href=\"mi_cuenta.html\" class=\"nav-link\"><b>Mi Cuenta</b></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"contenido\" id=\"fondo_negro\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"text-center my-5\">Ofertas del Día</h1>\n");
      out.write("            <div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("                <!-- Aquí puedes agregar las tarjetas de ofertas -->\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card h-100 text-center\">\n");
      out.write("                        <img src=\"oferta1.png\" class=\"card-img-top\" alt=\"Oferta 1\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Oferta 1</h5>\n");
      out.write("                            <p class=\"card-text\">Descripción de la oferta 1.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-custom btn-lg\">Ver ></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Repetir para más ofertas -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer> \n");
      out.write("        <p>&copy; 2024 Paraíso del Artesano. Todos los derechos reservados.</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        // Animación de scroll suave para los enlaces de navegación\n");
      out.write("        document.querySelectorAll('a.nav-link').forEach(anchor => {\n");
      out.write("            anchor.addEventListener('click', function (e) {\n");
      out.write("                e.preventDefault();\n");
      out.write("                document.querySelector(this.getAttribute('href')).scrollIntoView({\n");
      out.write("                    behavior: 'smooth'\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
