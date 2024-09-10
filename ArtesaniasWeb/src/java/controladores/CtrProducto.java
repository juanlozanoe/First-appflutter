/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelos.Producto;
import modelos.ProductoDAO;

/**
 *
 * @author Jashir
 */
@WebServlet(name = "Ctr", urlPatterns = {"/Ctr"})
public class CtrProducto extends HttpServlet {
    ProductoDAO pdao = new ProductoDAO();
    List<Producto> productos = new ArrayList();

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
        String accion = request.getParameter("accion");
        HttpSession sesion = request.getSession();
        productos = pdao.listar();
        switch(accion){
            case "pantalla":
                //request.setAttribute("categoria", categorias);
                request.setAttribute("productos", productos);
                if (sesion.getAttribute("Rol") != null) {
                    System.out.println("Tipo en sesión: " + sesion.getAttribute("Rol"));
                    if (sesion.getAttribute("Rol").equals("usuario")) {
                        System.out.println("Redireccionando a la vista del cliente");
                        request.getRequestDispatcher("/Vistas/Home_cliente.jsp").forward(request, response);
                    }else if(sesion.getAttribute("Rol").equals("administrador")){
                        System.out.println("Redireccionando a la vista del Administrador");
                        request.getRequestDispatcher("/Vistas/Home_administrador.jsp").forward(request, response);
                    }
                } else {
                    System.out.println("Atributo Tipo es null, redirigiendo a inicio");
                    request.getRequestDispatcher("/Vistas/Pantallainicialjsp.jsp").forward(request, response);
                }
                break;
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

}
