/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Configuracion.Conectar;
import Modelo.DetallePedido;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Usuario;
import Modelo.UsuarioDAO;
import Modelo.carrito;
import Modelo.productoDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Maiyer
 */
@WebServlet(name = "CtrProductos", urlPatterns = {"/CtrProductos"})
@MultipartConfig
public class CtrProductos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String FechaActual;
    Date d = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    int subtotal, idDetalle;
    int cantidad, idp, prep, catp, stocp, prove;
    int cantidadUsuarios, cantidadPedidos, cantidadProductos;
    int totalpagar;
    int idUser;
    String ultimoP, nomp, descp, fotop;
    productoDAO pdao = new productoDAO();
    List<carrito> listacarrito = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        String nombre, descripcion, fotos;
        int precio, stock;
        List<Producto> productos = pdao.obtenerProductos();
        Producto p = new Producto();
        Producto pro = new Producto();
        System.out.println("accion= " + accion);
        HttpSession sesion = request.getSession(false);
        try {

            switch (accion) {
                case "home":
                    idUser = Integer.parseInt(request.getParameter("id"));
                    request.setAttribute("Productos", productos);
                    System.out.println("Entro A enviar los Productos");
                    request.setAttribute("contador", listacarrito.size());
                    request.setAttribute("idUser", idUser);
                    request.getRequestDispatcher("/Vistas/InicioCliente.jsp").forward(request, response);
                    break;
                case "Agregar":
                    try {
                        // Obtener parámetros del formulario
                        System.out.println("nombre: " + request.getParameter("name"));
                        nombre = request.getParameter("name");
                        System.out.println("descripcion: " + request.getParameter("description"));   
                        descripcion = request.getParameter("description");
                        System.out.println("precio: " + request.getParameter("price"));
                        precio = Integer.parseInt(request.getParameter("price"));
                        System.out.println("stock: " + request.getParameter("stock"));
                        System.out.println("foto " + request.getParameter("foto"));
                        fotos = "Imagenes/" + request.getParameter("foto");
                        stock = Integer.parseInt(request.getParameter("stock"));

                        // Crear el producto
                        pro.setNombre(nombre);
                        pro.setDescripcion(descripcion);
                        pro.setPrecio(precio);
                        pro.setFoto(fotos);
                        pro.setStock(stock);

                        // Guardar en la base de datos
                        if (pdao.crear(pro)) {
                            System.out.println("Se creó el producto");
                            request.getRequestDispatcher("CtrProductos?accion=homeAdmin").forward(request, response);
                        } else {
                            System.out.println("Error al crear el producto");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        
                        System.out.println("error a la hora de crear el producto " + e);
                    }
                    break;
                case "salir":
                    sesion.invalidate();
                    request.getRequestDispatcher("Vistas/login.jsp").forward(request, response);
                    break;

                case "homeAdmin":
                    productos = pdao.obtenerProductos();
                    request.setAttribute("Productos", productos);
                    System.out.println("Entro A enviar los Productos " + productos);
                    request.getRequestDispatcher("/Vistas/productos.jsp").forward(request, response);
                    break;
                case "agregarCarrito":
                    int idProducto = Integer.parseInt(request.getParameter("idProducto"));
                    cantidad = 1;
                    int posicion = 0;
                    int item = 0;
                    p = pdao.obtenerProducto(idProducto);
                    if (listacarrito.size() > 0) {
                        for (int i = 0; i > listacarrito.size(); i++) {
                            if (idProducto == listacarrito.get(i).getIdProducto()) {
                                posicion = i;
                            }
                        }
                        if (idProducto == listacarrito.get(posicion).getIdProducto()) {
                            cantidad = cantidad + listacarrito.get(posicion).getCantidad();
                            int total = cantidad * p.getPrecio();
                            System.out.println("producto que ya exite en el carrito: " + total);
                            listacarrito.get(posicion).setCantidad(cantidad);
                            listacarrito.get(posicion).setTotal(total);
                            totalpagar = totalpagar + p.getPrecio();
                        } else {
                            item++;
                            carrito car = new carrito();
                            car.setId(item);
                            car.setFotoProducto(p.getFoto());
                            car.setNombreProducto(p.getNombre());
                            car.setPrecioProducto(p.getPrecio());
                            car.setCantidad(cantidad);
                            car.setTotal(p.getPrecio() * cantidad);
                            totalpagar = totalpagar + car.getTotal();
                            listacarrito.add(car);
                        }
                    } else {
                        item++;
                        carrito car = new carrito();
                        car.setId(item);
                        car.setFotoProducto(p.getFoto());
                        car.setNombreProducto(p.getNombre());
                        car.setPrecioProducto(p.getPrecio());
                        car.setCantidad(cantidad);
                        car.setTotal(p.getPrecio() * cantidad);
                        totalpagar = totalpagar + car.getTotal();
                        listacarrito.add(car);
                    }
                    request.setAttribute("contador", listacarrito.size());
                    request.getRequestDispatcher("CtrProductos?accion=home&id=" + idUser).forward(request, response);
                    break;
                case "Carrito":
                    idUser = Integer.parseInt(request.getParameter("idUser"));
                    System.out.println("entro al carrito");
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("contador", listacarrito.size());
                    System.out.println(listacarrito);
                    request.setAttribute("ListaCarrito", listacarrito);
                    request.setAttribute("idUser", idUser);
                    request.getRequestDispatcher("/Vistas/Carrito.jsp").forward(request, response);
                    
                    break;
                case "eliminar":
                    int idP = Integer.parseInt(request.getParameter("id"));
                    pdao.eliminar(idP);
                    request.getRequestDispatcher("CtrProductos?accion=homeAdmin").forward(request, response);
                    break;
                case "editar":
                    idP = Integer.parseInt(request.getParameter("id"));
                    p = pdao.obtenerProducto(idP);
                    request.setAttribute("pro", p);
                    request.getRequestDispatcher("/Vistas/editarProducto.jsp").forward(request, response);
                    break;
                case "editarProducto":
                    idP = Integer.parseInt(request.getParameter("id"));
                    p = pdao.obtenerProducto(idP);
                    pdao.actualizarProducto(p);
                    request.getRequestDispatcher("CtrProductos?accion=homeAdmin").forward(request, response);
                    break;
                case "EliminarDeCarrito":
                    idProducto = Integer.parseInt(request.getParameter("id"));
                    System.out.println(idProducto);
                    System.out.println(listacarrito.size());
                    for (int i = 0; i < listacarrito.size(); i++) {
                        System.out.println("entro a for");
                        if (idProducto == listacarrito.get(i).getIdProducto()) {
                            System.out.println("entro a eliminar el producto");
                            totalpagar = totalpagar - listacarrito.get(i).getTotal();
                            listacarrito.remove(i);
                        }
                    }
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("contador", listacarrito.size());
                    request.setAttribute("ListaCarrito", listacarrito);
                    request.getRequestDispatcher("/Vistas/Carrito.jsp").forward(request, response);
                    break;
                case "SumarCantidad":
                    idProducto = Integer.parseInt(request.getParameter("id"));
                    p = pdao.obtenerProducto(idProducto);
                    for (int i = 0; i < listacarrito.size(); i++) {
                        System.out.println("entro a for");
                        if (idProducto == listacarrito.get(i).getIdProducto()) {
                            System.out.println("entro a sumar cantidad");
                            totalpagar = totalpagar + listacarrito.get(i).getPrecioProducto();
                            listacarrito.get(i).setCantidad(listacarrito.get(i).getCantidad() + 1);
                            listacarrito.get(i).setTotal(listacarrito.get(i).getTotal() + p.getPrecio());

                        }
                    }
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("contador", listacarrito.size());
                    request.setAttribute("ListaCarrito", listacarrito);
                    request.getRequestDispatcher("/Vistas/Carrito.jsp").forward(request, response);
                    break;
                case "RestarCantidad":
                    idProducto = Integer.parseInt(request.getParameter("id"));
                    for (int i = 0; i < listacarrito.size(); i++) {
                        System.out.println("entro a for");
                        if (idProducto == listacarrito.get(i).getIdProducto()) {
                            System.out.println("entro a sumar cantidad");
                            totalpagar = totalpagar - listacarrito.get(i).getPrecioProducto();
                            listacarrito.get(i).setCantidad(listacarrito.get(i).getCantidad() - 1);
                            listacarrito.get(i).setTotal(listacarrito.get(i).getTotal() - p.getPrecio());
                        }
                    }
                    request.setAttribute("totalpagar", totalpagar);
                    request.setAttribute("contador", listacarrito.size());
                    request.setAttribute("ListaCarrito", listacarrito);
                    request.getRequestDispatcher("/Vistas/Carrito.jsp").forward(request, response);
                    break;
                case "confirmarCompra":
                    System.out.println("el valor de id user es " + idUser);
                    int u = Integer.parseInt(request.getParameter("idUser"));
                    
                    
                    String FechaActual = formato.format(d);
                    
                    
                    Pedido ped = new Pedido();
                    System.out.println("id del usuario: " + u);
                    ped.setIdUsuario(idUser);
                    ped.setFechaCreacion(FechaActual);
                    ped.setTotal(totalpagar);
                    ped.setEstado("Espera");
                    System.out.println("pedido: " + ped.getIdUsuario() +" "+ ped.getTotal() +" "+ ped.getEstado() +" "+ ped.getFechaCreacion());
                    pdao.crearPedido(ped);
                    Pedido pedidoObtenido = new Pedido();
                    pedidoObtenido = pdao.obtenerPedido(u);
                    System.out.println("lista: " + listacarrito.size());
                    for (int a = 0; a < listacarrito.size(); a++) {
                        System.out.println("entro a agregar detalle :" + (a+1) );
                        DetallePedido dp = new DetallePedido();
                        dp.setIdPedido(pedidoObtenido.getId());
                        dp.setCantidad(listacarrito.get(a).getCantidad());
                        dp.setTotal(listacarrito.get(a).getTotal());
                        dp.setIdProducto(listacarrito.get(a).getIdProducto());

                        pdao.crearDetalle(dp);
                    }
                    for (int i = listacarrito.size() - 1; i >= 0; i--) {
                        listacarrito.remove(i);
                    }
                    request.setAttribute("contador", listacarrito.size());
                    request.getRequestDispatcher("CtrProductos?accion=home&id=" + idUser).forward(request, response);
                    break;
                    
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error en el procesamiento de la solicitud");
        }
    }

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
        processRequest(request, response);
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

    private String getFileName(Part part) {
        String contentDisposition = part.getHeader("content-disposition");
        for (String token : contentDisposition.split(";")) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf('=') + 2, token.length() - 1).replace("\"", "");
            }
        }
        return null;
    }

}
