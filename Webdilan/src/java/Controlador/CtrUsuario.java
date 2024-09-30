package Controlador;

import Modelo.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;

@WebServlet(name = "CtrUsuario", urlPatterns = {"/CtrUsuario"})
public class CtrUsuario extends HttpServlet {

    UsuarioDAO usuarioDAO = new UsuarioDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if ("crear".equalsIgnoreCase(accion)) {
            registrarUsuario(request, response);
        } else {
            request.setAttribute("error", "Acción no válida");
            request.getRequestDispatcher("/Vistas/login.jsp").forward(request, response);
        }
    }
    
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if ("listarUsers".equalsIgnoreCase(accion)) {
            listarUsuarios(request, response);
        } else {
            request.setAttribute("error", "Acción no válida");
            request.getRequestDispatcher("/Vistas/login.jsp").forward(request, response);
        }
    }
    
    private void listarUsuarios(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
     try{
        List<Usuario> usuarios = usuarioDAO.listar();
         System.out.println("Usuarios obtenidos: " + usuarios);

         if (usuarios.isEmpty()) {
            System.out.println("No se encontraron usuarios.");
         }
         request.setAttribute("usuarios", usuarios);
         request.getRequestDispatcher("/Vistas/usuarios.jsp").forward(request, response);
        } catch (Exception e) {
         System.out.println("error al obtener todos los usuarios" + e);
         request.setAttribute("error", "Ocurrió un error al obtener los usuarios.");
         request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
        }
    }    
    
//accion doPost para registrar usuarios

    private void registrarUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            System.out.print("");
            // Obtener los datos del formulario
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String correo = request.getParameter("correo");
            String usuario = request.getParameter("usuario");
            String contrasena = request.getParameter("contrasena");
            String rol = request.getParameter("rol");

            // Encriptar la contraseña con BCrypt
            String contrasenaEncriptada = BCrypt.hashpw(contrasena, BCrypt.gensalt());

            // Crear el objeto Usuario
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setNombre(nombre);
            nuevoUsuario.setApellido(apellido);
            nuevoUsuario.setDireccion(direccion);
            nuevoUsuario.setTelefono(telefono);
            nuevoUsuario.setCorreo(correo);
            nuevoUsuario.setUsuario(usuario);
            nuevoUsuario.setContrasena(contrasenaEncriptada);
            nuevoUsuario.setRol(rol);

            // Insertar el usuario en la base de datos
            boolean registrado = usuarioDAO.insertar(nuevoUsuario);

            if (registrado) {
                request.setAttribute("mensaje", "Usuario registrado exitosamente.");
                request.getRequestDispatcher("/Vistas/login.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "No se pudo registrar el usuario.");
                request.getRequestDispatcher("/Vistas/login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            System.out.println("ocurrioa un error al registrar un usuario " + e);
            request.setAttribute("error", "Ocurrió un error durante el registro.");
            request.getRequestDispatcher("/Vistas/login.jsp").forward(request, response);
        }
    }

}

