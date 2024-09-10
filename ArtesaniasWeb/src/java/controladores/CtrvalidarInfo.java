package controladores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Usuario;
import modelos.UsuarioDAO;




/**
 *
 * @author SENA
 */
public class CtrvalidarInfo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CtrValidarInfo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CtrValidarInfo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    UsuarioDAO usudao = new UsuarioDAO();
    Usuario us = new Usuario();
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
        
    
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    
    
    
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Ingresar")) {
            HttpSession sesion = request.getSession();
            String usu = request.getParameter("txtusu");
            String pas = request.getParameter("txtpass");
            us = usudao.validar(usu, pas);
            System.out.println("tipo : " + us.getRol());
            if (us.getUsuario()!= null) {
                System.out.println("usuario: "+us.getUsuario());
                System.out.println("contraseña: "+pas);
                    sesion.setAttribute("log", '1');
                    sesion.setAttribute("User", us.getUsuario());
                    sesion.setAttribute("tipo", us.getRol());
                    sesion.setAttribute("id", us.getId());
                    sesion.setAttribute("correo", us.getCorreo());
                    sesion.setAttribute("usuario", us);
                    if (us.getRol().equals("administrador")) {
                        response.sendRedirect("/Vistas/Home_cliente.jsp");
                    }
                    if (us.getRol().equals("usuario")) {
                        response.sendRedirect("/Vistas/Home_cliente.jsp");
                    }
                
            }else{
                response.sendRedirect("/Vistas/Login.jsp?fallo=0");
                
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
