package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editarProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Editar Producto</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("    <link href=\"/Webdilan/CSS/Editar-producto.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Editar Producto</h1>\n");
      out.write("        <form action=\"/edit-product\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <label for=\"id\">ID:</label>\n");
      out.write("            <input type=\"text\" id=\"id\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("            \n");
      out.write("            <label for=\"name\">Nombre:</label>\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"photo\">Foto:</label>\n");
      out.write("            <input type=\"file\" id=\"photo\" name=\"photo\" accept=\"image/*\">\n");
      out.write("            <img id=\"preview\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getFoto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"Vista Previa\">\n");
      out.write("            \n");
      out.write("            <label for=\"description\">Descripción:</label>\n");
      out.write("            <textarea id=\"description\" name=\"description\" required>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("            \n");
      out.write("            <label for=\"price\">Precio:</label>\n");
      out.write("            <input type=\"number\" id=\"price\" name=\"price\" step=\"0.01\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("            \n");
      out.write("            <label for=\"stock\">Stock:</label>\n");
      out.write("            <input type=\"number\" id=\"stock\" name=\"stock\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getStock()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("            \n");
      out.write("            <a href=\"/Webdilan/CtrProductos?accion=editarProducto&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><button type=\"submit\">Actualizar Producto</button></a>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        document.getElementById('photo').addEventListener('change', function(event) {\n");
      out.write("            const reader = new FileReader();\n");
      out.write("            reader.onload = function() {\n");
      out.write("                const preview = document.getElementById('preview');\n");
      out.write("                preview.src = reader.result;\n");
      out.write("                preview.style.display = 'block';\n");
      out.write("            }\n");
      out.write("            reader.readAsDataURL(event.target.files[0]);\n");
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
