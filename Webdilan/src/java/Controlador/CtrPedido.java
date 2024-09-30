package Controlador;

import Modelo.Pedido;
import Modelo.PedidoDAO;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CtrPedido", urlPatterns = {"/CtrPedido"})
public class CtrPedido extends HttpServlet {

    private PedidoDAO pedidoDAO = new PedidoDAO();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        System.out.println("accion " + accion);    
        if (accion == null || accion.isEmpty()) {
            accion = request.getParameter("listar");
        }

        if (accion == null || accion.isEmpty()) {
            request.setAttribute("error", "Acción no definida.");
            request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
            return;
        }
         System.out.println("accion1 " + accion);  
        switch (accion) {
            case "crear":
                crearPedido(request, response);
                break;
            case "actualizar":
                actualizarPedido(request, response);
                break;
            default:
                request.setAttribute("error", "Acción no válida");
                request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
                break;
        }
    }
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion){
            case "listarPedido":
                listarPedidos(request, response);              
            break;
            case "listarPedidoUser":
                listarPedidoUser(request,response);
            default:
                request.setAttribute("error", "Acción no válida");
                request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
                break;    
        }
        
        

    }

    

    private void listarPedidos(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<Pedido> pedidos = pedidoDAO.obtenerTodos();
            System.out.println("Pedidos obtenidos: " + pedidos); // Depuración: Imprime los pedidos obtenidos
            if (pedidos.isEmpty()) {
                System.out.println("No se encontraron pedidos.");
            }
            request.setAttribute("pedidos", pedidos);
            request.getRequestDispatcher("/Vistas/Ver-ordenes.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("ocurrio un error al listar los pedidos " + e);
            request.setAttribute("error", "Ocurrió un error al obtener los pedidos.");
            request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
        }
    }
    

    private void listarPedidoUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("entro a listar pedidos user");
        try {
            int idJ = Integer.parseInt(request.getParameter("idUser"));
            System.out.println("id " + idJ);
            List<Pedido> pedidos = pedidoDAO.obtenerByIdUser(idJ);
            System.out.println("Pedidos obtenidos: " + pedidos); // Depuración: Imprime los pedidos obtenidos
            if (pedidos.isEmpty()) {
                System.out.println("No se encontraron pedidos.");
            }
            request.setAttribute("pedidos", pedidos);
            request.setAttribute("idJ", idJ);
            request.getRequestDispatcher("/Vistas/Ver-ordenesCliente.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("error al listar pedidos del usuario " + e);
            request.setAttribute("error", "Ocurrió un error al obtener los pedidos.");
            request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
        }
    }    
    

    private void crearPedido(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            int total = Integer.parseInt(request.getParameter("total"));
            String estado = request.getParameter("estado");
            String fechaCreacion = request.getParameter("fechaCreacion");

            if (estado == null || estado.isEmpty()) {
                estado = "Pendiente"; // Estado predeterminado
            }

            Pedido nuevoPedido = new Pedido();
            nuevoPedido.setIdUsuario(idUsuario);
            nuevoPedido.setTotal(total);
            nuevoPedido.setEstado(estado);
            nuevoPedido.setFechaCreacion(fechaCreacion);
            boolean creado = pedidoDAO.insertar(nuevoPedido);

            if (creado) {
                request.setAttribute("mensaje", "Pedido creado exitosamente.");
                request.getRequestDispatcher("/Vistas/Ver-ordenesCLiente.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "No se pudo crear el pedido.");
                request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
            }
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Datos inválidos proporcionados.");
            request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("error al hacer un nuevo pedido" + e);
            request.setAttribute("error", "Ocurrió un error durante la creación del pedido.");
            request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
        }
    }
    
    

    private void actualizarPedido(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String estado = request.getParameter("estado");

            if (estado == null || estado.isEmpty()) {
                request.setAttribute("error", "Estado inválido.");
                request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
                return;
            }

            Pedido pedido = new Pedido();
            pedido.setId(id);
            pedido.setEstado(estado);

            boolean actualizado = pedidoDAO.actualizar(pedido);

            if (actualizado) {
                request.setAttribute("mensaje", "Pedido actualizado exitosamente.");
                request.getRequestDispatcher("/Vistas/Ver-ordenesCLiente.jsp").forward(request, response);
            } else {
                request.setAttribute("error", "No se pudo actualizar el pedido.");
                request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
            }
        } catch (NumberFormatException e) {
            request.setAttribute("error", "ID inválido.");
            request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Ocurrió un error durante la actualización del pedido.");
            request.getRequestDispatcher("/Vistas/error.jsp").forward(request, response);
        }
    }
}
