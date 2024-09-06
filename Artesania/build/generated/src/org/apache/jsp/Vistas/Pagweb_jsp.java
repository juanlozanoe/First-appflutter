package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pagweb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Deco-Artesanias</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Artesania/CSS/pagweb.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("  <header>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\" id=\"partesuperior\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\"><b>DECO Artesanias</b></a>\n");
      out.write("          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("          </button>\n");
      out.write("          <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavDropdown\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link active\" href=\"pqr.html\"><b>PQR</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link active\" href=\"inicio.html\"><b>Inicio</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"contacto.html\"><b>Contacto</b></a></li>\n");
      out.write("              <li class=\"nav-item\"><a class=\"nav-link\" href=\"novedades.html\"><b>Novedades</b></a></li>\n");
      out.write("              <a href=\"carrito.html\" class=\"nav-link\"><img src=\"imagenes\\carrito-de-compras.png\" alt=\"\" width=\"40px\"></a>\n");
      out.write("              <a href=\"#\" class=\"nav-link\"><img src=\"imagenes/person-circle.svg\" alt=\"Carrito de compras\" width=\"40px\"><b>Mi Cuenta</b></a>\n");
      out.write("            </ul>\n");
      out.write("          \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("  </header>\n");
      out.write("  \n");
      out.write("<div class=\"\">\n");
      out.write("  <div class=\"contenido\" id=\"fondo_negro\" >\n");
      out.write("    <div class=\"card mx-auto my-4\" style=\"width: 35rem; background: linear-gradient(white, grey); padding: 20px;\">\n");
      out.write("      <div class=\"card-body-b text-center\">\n");
      out.write("        <h5 class=\"card-title\">Productos de artesanías para tu hogar</h5>\n");
      out.write("        <p>Artesanías coloridas y diversas de la costa caribe. Reflejan cultura y tradición con tejidos, cerámicas y joyería de materiales naturales.</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"card-body-bot d-flex justify-content-center gap-3\" id=\"botones1\">\n");
      out.write("        <a href=\"novedades.html\" class=\"btn btn-success rounded-pill btn-lg\">Nuevos Productos</a>\n");
      out.write("        <a href=\"oferta_del_dia.html\" class=\"btn btn-success rounded-pill btn-lg\">Ofertas del dia</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<nav class=\"navbar bg-body-tertiary\">\n");
      out.write("  <div class=\"container search-container\">\n");
      out.write("      <form class=\"d-flex search-bar\" role=\"search\">\n");
      out.write("          <input class=\"form-control me-2\" type=\"search\" placeholder=\"Buscar\">\n");
      out.write("          <button class=\"btn btn-outline-success\" type=\"submit\">Buscar</button>\n");
      out.write("      </form>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("<div class=\"diseno1\">\n");
      out.write("<hr class=\"border-bottom border-success\">\n");
      out.write("    <h4 class=\"text-center\" style=\"color: white;\">Tenemos las artesanías que necesitas</h4>\n");
      out.write("    <p class=\"text-center\">Elige la que mejor se adapte a tu gusto</p>\n");
      out.write("    <hr class=\"border-bottom border-success\">\n");
      out.write("</div>\n");
      out.write("    <div class=\"carousel-container\">\n");
      out.write("        <button class=\"carousel-button prev\" onclick=\"moveCarousel(-1)\">&#10094;</button>\n");
      out.write("        <div class=\"carousel\">\n");
      out.write("            <div class=\"carousel-card\">\n");
      out.write("                <img src=\"https://vhlblog.vistahigherlearning.com/wp-content/uploads/2020/06/Artesani%CC%81a-Huichol.jpg\" alt=\"Carro de Artesanías\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Colgante de tigre</h5>\n");
      out.write("                    <p class=\"card-text\">Un carrito de artesanías es un puesto móvil lleno de color y variedad.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-card\">\n");
      out.write("                <img src=\"https://i.pinimg.com/736x/a5/28/7a/a5287a13fc7d9f6dfdfc55996397bf79.jpg\" alt=\"Sombrero Vueltiao\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Ventana del mundo</h5>\n");
      out.write("                    <p class=\"card-text\">El sombrero vueltiao es una emblemática pieza artesanal colombiana.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-card\">\n");
      out.write("                <img src=\"https://i.pinimg.com/236x/6c/0c/0e/6c0c0e8c8e515c0a45cfdffdc6ea3ddc.jpg\" alt=\"Hamaca\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Aretes de flores</h5>\n");
      out.write("                    <p class=\"card-text\">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-card\">\n");
      out.write("                <img src=\"https://mf.b37mrtl.ru/actualidad/public_images/2021.04/article/6082f4fe59bf5b17d11d19a9.jpg\" alt=\"Hamaca\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Sombrero vueltiao</h5>\n");
      out.write("                    <p class=\"card-text\">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-card\">\n");
      out.write("                <img src=\"https://artesaniasbatan.com.co/wp-content/uploads/2022/11/Mascara-Toro-Carnaval-de-Barranquilla.png\" alt=\"Hamaca\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Colgante de toro</h5>\n");
      out.write("                    <p class=\"card-text\">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"carousel-card\">\n");
      out.write("                <img src=\"https://www.bluelinemexico.com/acapulco/img/p/3/7/37-large_default.jpg\" alt=\"Hamaca\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Llavero de cangrejo</h5>\n");
      out.write("                    <p class=\"card-text\">Una hamaca artesanal es una tela tejida a mano, suspendida entre dos puntos.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"carousel-button next\" onclick=\"moveCarousel(1)\">&#10095;</button>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("   <div class=\"diseno1\">\n");
      out.write("    <hr class=\"border-bottom border-success\">\n");
      out.write("    <h4 class=\"text-center\" style=\"color: white;\">¿Quieres hacer una compra segura?</h4>\n");
      out.write("    <p class=\"text-center\">Cumple con los pasos que hay abajo</p>\n");
      out.write("    <hr class=\"border-bottom border-success\">\n");
      out.write("  </div>\n");
      out.write("    <div class=\"row row-cols-1 row-cols-md-3 g-4\">\n");
      out.write("      <div class=\"col\">\n");
      out.write("        <div class=\"card h-100 text-center\">\n");
      out.write("          <img src=\"imagenes/4782144.jpg\" class=\"card-img-top\" alt=\"Selecciona tu producto\">\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">Selecciona tu producto</h5>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col\">\n");
      out.write("        <div class=\"card h-100 text-center\">\n");
      out.write("          <img src=\"imagenes/5464287_Blog-post.jpg\" class=\"card-img-top\" alt=\"Contacta con nosotros\">\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">Contacta con nosotros</h5>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col\">\n");
      out.write("        <div class=\"card h-100 text-center\">\n");
      out.write("          <img src=\"imagenes/18407465_5995369.jpg\" class=\"card-img-top\" alt=\"Elige tu día y listo\">\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">Elige qué día y listo!</h5>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<br>\n");
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
      out.write("  \n");
      out.write("    <div class=\" py-3 footer-icons text-end\">\n");
      out.write("      <a href=\"#\" class=\"footer-icon\"><img src=\"imagenes/icons8-facebook-50 (1).png\" alt=\"Facebook\" width=\"40px\"></a>\n");
      out.write("      <a href=\"#\" class=\"footer-icon\"><img src=\"imagenes/icons8-instagram-50 (1).png\" alt=\"Instagram\" width=\"40px\"></a>\n");
      out.write("      <img src=\"descarga (1).png\" alt=\"Nequi\" class=\"footer-icon\" width=\"40px\">\n");
      out.write("      <img src=\"descarga (2).png\" alt=\"Visa\" class=\"footer-icon\" width=\"40px\">\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"/Artesania/JS/carrusel.js\"></script>\n");
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
