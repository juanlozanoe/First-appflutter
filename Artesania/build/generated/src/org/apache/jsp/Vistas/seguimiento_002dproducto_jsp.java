package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class seguimiento_002dproducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Seguimiento del Producto - Paraiso del Artesano</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/Artesania/CSS/pagweb.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background: #56ab2f;\n");
      out.write("            background: -webkit-linear-gradient(to right, #a8e063, #56ab2f);\n");
      out.write("            background: linear-gradient(to right, #a8e063, #56ab2f);\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            font-style: italic;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        header {\n");
      out.write("            background: linear-gradient(45deg, #11998e, #38ef7d);\n");
      out.write("            padding: 10px;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .main-container {\n");
      out.write("            margin: 50px auto;\n");
      out.write("            max-width: 1200px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline {\n");
      out.write("            position: relative;\n");
      out.write("            max-width: 1000px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline::after {\n");
      out.write("            content: '';\n");
      out.write("            position: absolute;\n");
      out.write("            width: 6px;\n");
      out.write("            background-color: #56ab2f;\n");
      out.write("            top: 0;\n");
      out.write("            bottom: 0;\n");
      out.write("            left: 50%;\n");
      out.write("            margin-left: -3px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item {\n");
      out.write("            padding: 20px;\n");
      out.write("            position: relative;\n");
      out.write("            width: 50%;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item.left {\n");
      out.write("            left: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item.right {\n");
      out.write("            left: 50%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item::before {\n");
      out.write("            content: '';\n");
      out.write("            position: absolute;\n");
      out.write("            width: 25px;\n");
      out.write("            height: 25px;\n");
      out.write("            right: -12px;\n");
      out.write("            background-color: white;\n");
      out.write("            border: 4px solid #56ab2f;\n");
      out.write("            top: 15px;\n");
      out.write("            border-radius: 50%;\n");
      out.write("            z-index: 1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item.right::before {\n");
      out.write("            left: -12px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item-content {\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: white;\n");
      out.write("            position: relative;\n");
      out.write("            border-radius: 6px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .status {\n");
      out.write("            font-size: 18px;\n");
      out.write("            color: #38ef7d;\n");
      out.write("            font-weight: bold;\n");
      out.write("            text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item.right .status {\n");
      out.write("            text-align: right;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item-content p {\n");
      out.write("            margin: 0;\n");
      out.write("            font-size: 16px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .timeline-item-content span {\n");
      out.write("            display: block;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            font-size: 12px;\n");
      out.write("            color: #aaa;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Animación */\n");
      out.write("        .timeline-item-content {\n");
      out.write("            animation: fadeInUp 0.5s ease;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        @keyframes fadeInUp {\n");
      out.write("            from {\n");
      out.write("                opacity: 0;\n");
      out.write("                transform: translateY(20px);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            to {\n");
      out.write("                opacity: 1;\n");
      out.write("                transform: translateY(0);\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .current {\n");
      out.write("            background-color: #38ef7d !important;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\" id=\"partesuperior\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><b>Paraiso Del Artesano</b></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNavDropdown\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><b>PQR</b></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link active\" href=\"#\"><b>Inicio</b></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><b>Contacto</b></a></li>\n");
      out.write("                        <li class=\"nav-item\"><a class=\"nav-link\" href=\"novedades.html\"><b>Novedades</b></a></li>\n");
      out.write("                        <a href=\"carrito.html\" class=\"nav-link\"><img src=\"imagenes\\carrito-de-compras.png\" alt=\"\" width=\"40px\"></a>\n");
      out.write("                        <a href=\"#\" class=\"nav-link\"><img src=\"imagenes/person-circle.svg\" alt=\"Carrito de compras\"\n");
      out.write("                                width=\"40px\"><b>Mi Cuenta</b></a>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div class=\"main-container\">\n");
      out.write("        <h1>Seguimiento de tu Pedido</h1>\n");
      out.write("        <div class=\"timeline\">\n");
      out.write("            <div class=\"timeline-item left\">\n");
      out.write("                <div class=\"timeline-item-content\">\n");
      out.write("                    <div class=\"status\">Pedido Realizado</div>\n");
      out.write("                    <p>Tu pedido ha sido recibido y está en proceso.</p>\n");
      out.write("                    <span>14 Agosto 2024, 10:00 AM</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"timeline-item right\">\n");
      out.write("                <div class=\"timeline-item-content\">\n");
      out.write("                    <div class=\"status\">Pedido Empaquetado</div>\n");
      out.write("                    <p>El pedido ha sido empaquetado y está listo para ser enviado.</p>\n");
      out.write("                    <span>14 Agosto 2024, 2:00 PM</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"timeline-item left current\">\n");
      out.write("                <div class=\"timeline-item-content\">\n");
      out.write("                    <div class=\"status\">En Tránsito</div>\n");
      out.write("                    <p>Tu pedido está en camino.</p>\n");
      out.write("                    <span>15 Agosto 2024, 9:00 AM</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"timeline-item right\">\n");
      out.write("                <div class=\"timeline-item-content\">\n");
      out.write("                    <div class=\"status\">Entregado</div>\n");
      out.write("                    <p>Tu pedido ha sido entregado.</p>\n");
      out.write("                    <span>15 Agosto 2024, 1:00 PM</span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
