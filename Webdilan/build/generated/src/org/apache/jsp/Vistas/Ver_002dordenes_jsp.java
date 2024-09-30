package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ver_002dordenes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Ver Órdenes</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("    <link href=\"/Webdilan/CSS/Ver-ordenes.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\n");
      out.write("</head>\n");
      out.write("<header class=\"bg-success\">\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-success\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <!-- Logo o título -->\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("                <h1 class=\"mb-0 text-white\">Deco Artesanía</h1>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Toggle button for mobile view -->\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <!-- Navbar links and icons -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" href=\"/Webdilan/CtrProductos?accion=homeAdmin\">Productos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" href=\"Ver-ordenes.jsp\">Pedidos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" href=\"#\">Usuarios</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <!-- Button to add new products and icons -->\n");
      out.write("                <div class=\"d-flex align-items-center ms-auto\">\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle text-white\" href=\"#\" role=\"button\" id=\"userDropdown\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"bi bi-person-circle\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"userDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"#\">Admin</a></li>\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"/Webdilan/CtrProductos?accion=salir\">Salir</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Ver Órdenes</h1>\n");
      out.write("        <div class=\"filters\">\n");
      out.write("            <label for=\"sort\">Ordenar por:</label>\n");
      out.write("            <select id=\"sort\" name=\"sort\">\n");
      out.write("                <option value=\"price\">Valor</option>\n");
      out.write("                <option value=\"status\">Estado</option>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"text\" id=\"search\" name=\"search\" placeholder=\"Buscar...\">\n");
      out.write("        </div>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Id detalle</th>\n");
      out.write("                    <th>Id pedido</th>\n");
      out.write("                    <th>numero pedido</th>\n");
      out.write("                    <th>Id cliente</th>\n");
      out.write("                    <th>Nombre producto</th>\n");
      out.write("                     <th>Total pedido</th>\n");
      out.write("                      <th>Id producto</th>\n");
      out.write("                       <th>Editar/Eliminar</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>1</td>\n");
      out.write("                    <td>1</td>\n");
      out.write("                    <td>1</td>\n");
      out.write("                    <td>2</td>\n");
      out.write("                    <td>collar</td>\n");
      out.write("                    <td>300000</td>\n");
      out.write("                    <td>1</td>\n");
      out.write("                    <td>\n");
      out.write("                     <a href=\"/Webdilan/CtrProductos?accion=editar&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                    <button class=\"btn btn-primary w-10 mb-2\">\n");
      out.write("                                    <i class=\"bi bi-highlighter\"></i>\n");
      out.write("                                </button>\n");
      out.write("                                </a>\n");
      out.write("                                \n");
      out.write("                                    <a href=\"/Webdilan/CtrProductos?accion=eliminar&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <button class=\"btn btn-danger w-10\">\n");
      out.write("                                            <i class=\"bi bi-trash\"></i>\n");
      out.write("                                        </button>\n");
      out.write("                                    </a>\n");
      out.write("                                        </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("            </tbody>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("    </div>\n");
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
